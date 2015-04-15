
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SQLStatement = "select naam, aantalkinderen from leveranciers order by naam";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try ( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SQLStatement)) {
            while (resultSet.next()){
                System.out.println(resultSet.getString("naam") + " ");
                int aantalKinderen = resultSet.getInt("aantalkinderen");
                System.out.println(resultSet.wasNull()?"onbekend":aantalKinderen);
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
}
