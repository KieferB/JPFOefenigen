
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
    // datum  {d 'yyyy-mm-dd'} ; tijd  {t 'hh:mm:ss'} ; datum + tijd  {ts 'yyyy-mm-dd hh:mm:ss'}
    private static final String SQLStatement = "select indienst, voornaam, familienaam from werknemers where indienst >= {d '2000-1-1'} order by indienst";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try ( Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SQLStatement)){
            while (resultSet.next()){
                System.out.println(resultSet.getDate("indienst") + " " + resultSet.getString("voornaam") + " " + resultSet.getString("familienaam"));
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
}
