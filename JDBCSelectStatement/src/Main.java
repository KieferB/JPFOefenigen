
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
    /**private static final String SELECT_SQL = "select id, naam from leveranciers order by id";
    **/
    private static final String SELECT_SQL = "select avg(verkoopprijs) as gemiddelde from planten";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)){
           /** while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("naam"));
            **/
                if (resultSet.next()){
                    System.out.println(resultSet.getBigDecimal("gemiddelde"));
            
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
}
