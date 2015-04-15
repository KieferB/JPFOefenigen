
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
    final private static String QUERY = "select VerkochtSinds, Naam from bieren where {fn month(VerkochtSinds)} = ? order by VerkochtSinds";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    try ( Scanner scanner = new Scanner(System.in)){
        System.out.println("Maandnummer: ");
        int maand = scanner.nextInt();
        if (maand >=1 && maand<= 12){
            
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    PreparedStatement statement = connection.prepareStatement(QUERY)){
                
                statement.setInt(1,maand);
                try (ResultSet resultSet = statement.executeQuery()){
                    while (resultSet.next()){
                        System.out.println(resultSet.getDate("VerkochtSinds") + " " + resultSet.getString("Naam"));
                    }
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
        } else {
            System.out.println("Tik een getal tussen 1 en 12 in. ");
        }
    }
        
    }
    
}
