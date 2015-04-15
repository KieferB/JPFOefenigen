
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD =  "cursist";
    private static final String SQLStatement = "insert into soorten(naam) values (?)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> namen = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Geef soortnamen in, tik stop in na de laatste naam");
            for (String naam; ! "stop".equalsIgnoreCase(naam = scanner.nextLine());
                    namen.add(naam));
        }
        
        try( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(SQLStatement)){
            
            for ( String naam: namen){
                statement.setString(1,naam);
                statement.addBatch();
                }
            
            int[] aantalToegevoegdeRecordsPerInsert = statement.executeBatch();
            int aantalToegevoegdeSoorten = 0;
            for (int aantalToegevoegdeRecords : aantalToegevoegdeRecordsPerInsert){
                aantalToegevoegdeSoorten += aantalToegevoegdeRecords;
            }
            System.out.println(aantalToegevoegdeSoorten);
            
            
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
}
