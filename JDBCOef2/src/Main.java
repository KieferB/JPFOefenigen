
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

    final private static String URL = "jdbc:mysql://localhost/bieren";
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY = "select brouwers.brnaam, count(*) as aantal from brouwers inner join bieren on brouwers.brouwernr=bieren.brouwernr" +
            " group by brouwers.brouwernr, brouwers.brnaam order by brouwers.brnaam";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY)){
        while (resultSet.next()){
            System.out.println(resultSet.getString("brnaam")+ ' ' + resultSet.getInt("aantal"));
        }
    } catch (SQLException ex){
        System.out.println(ex);
    }
        
    
    }
    
}
