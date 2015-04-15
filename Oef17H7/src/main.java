/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
import java.util.*;

public class main {

    private static final String KLINKERS = "aeiou" ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String zin = scan.nextLine().toLowerCase();
        
        int teller = 0;
        for( int i=0 ; i != zin.length(); i ++) {
            if (KLINKERS.indexOf(zin.charAt(i)) >= 0) 
                teller++;
        }
        
        System.out.println("Er zitten " + teller + " klinkers in de zin: ");
        System.out.println(zin);
    }
    
}
