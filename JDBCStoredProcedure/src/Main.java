
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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

    final private static String URL = "jdbc:mysql://localhost/tuincentrum?noAccesToProcedureBodies=true";
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY = "{call PlantenMetEenWoord(?)}";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try (Scanner scanner = new Scanner (System.in)){
        System.out.println("Woord: ");
        String woord = scanner.nextLine();
        try ( Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                CallableStatement statement = connection.prepareCall(QUERY)) {
            statement.setString(1, "%" + woord + "%");
            try (ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()){
                    System.out.println(resultSet.getString("naam"));
                }
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    }
}
