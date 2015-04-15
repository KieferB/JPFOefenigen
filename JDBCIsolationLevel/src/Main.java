
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

    final private static String URL = "jdbc:mysql://localhost/tuincentrum";
    final private static String USER = "cursist";
    final private static String PASSWORD = "cursist";
    final private static String QUERY1 = "select verkoopprijs from planten where id=? ";
    final private static String QUERY2 = "update planten set verkoopprijs=? where id=?";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    try (Scanner scanner = new Scanner(System.in)){
        System.out.println("ID: ");
        int id= scanner.nextInt();
        System.out.println("Verkoopprijs: ");
        BigDecimal nieuwePrijs = scanner.nextBigDecimal();
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement statementSelect = connection.prepareStatement(QUERY1);
                PreparedStatement statementUpdate = connection.prepareStatement(QUERY2)){
            
        
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            
            statementSelect.setInt(1, id);
            try ( ResultSet resultSet = statementSelect.executeQuery()){
                if (resultSet.next()){
                    BigDecimal oudePrijs = resultSet.getBigDecimal("verkoopprijs");
                    if (nieuwePrijs.compareTo(oudePrijs.multiply(new BigDecimal("1.1"))) <= 0){
                        statementUpdate.setBigDecimal(1, nieuwePrijs);
                        statementUpdate.setInt(2, id);
                        statementUpdate.executeUpdate();
                        connection.commit();
                    } else { System.out.println("Nieuwe verkoopprijs te hoog");
                           }
            } else { System.out.println("Plant niet gevonden");
                   }
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    } 
}
}
