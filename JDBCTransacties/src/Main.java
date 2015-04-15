
import java.sql.Connection;
import java.sql.DriverManager;
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

    final private static String URL = "jdbc:mysql://localhost/tuincentrum";
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY1 = "update planten set verkoopprijs = verkoopprijs /1.1 where verkoopprijs >= 100";
    final private static String QUERY2 = "update planten set verkoopprijs = verkoopprijs /1.05 where verkoopprijs < 100";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try ( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()){
            connection.setAutoCommit(false);
            statement.addBatch(QUERY1);
            statement.addBatch(QUERY2);
            statement.executeBatch();
            connection.commit();
        } catch (SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
