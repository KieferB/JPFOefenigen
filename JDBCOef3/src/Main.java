
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Main {

    final private static String URL = "jdbc:mysql://localhost/bieren";
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY = " select alcohol, naam from bieren where alcohol between ? and ? order by alcohol,naam";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Minimum alcoholpercentage: ");
            BigDecimal minimum = scanner.nextBigDecimal();
            System.out.println("Maximum alcoholpercentage: ");
            BigDecimal maximum = scanner.nextBigDecimal();
            
            try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                    PreparedStatement statement = connection.prepareStatement(QUERY)){
                statement.setBigDecimal(1, minimum);
                statement.setBigDecimal(2, maximum);
                try (ResultSet resultSet = statement.executeQuery()){
                    while ( resultSet.next()){
                        System.out.println(resultSet.getBigDecimal("alcohol") + " " + resultSet.getString("naam"));
                    }
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }
}
