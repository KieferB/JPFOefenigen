
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

    final private static String URL = "jdbc:mysql://localhost/bieren" ;
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY1 = "update bieren set brouwerid=2 where brouwerid=1 and alcohol >= 8.5";
    final private static String QUERY2 = "update bieren set brouwerid=3 where brouwerid=1";
    final private static String QUERY3 = "delete from brouwers where id=1";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try ( Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement statement = connection.createStatement()){
            
            connection.setAutoCommit(false);
            statement.addBatch(QUERY1);
            statement.addBatch(QUERY2);
            statement.addBatch(QUERY3);
            statement.executeBatch();
            connection.commit();
        } catch (SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
