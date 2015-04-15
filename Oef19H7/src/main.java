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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PalindroomTester palin = new PalindroomTester();
        Scanner scan = new Scanner(System.in);
        String tekst = scan.next();
        
        if (palin.isPalindroom(tekst,true)) {
            System.out.println("Het woord is een zuiver palindroom.");
        }
        else {
              System.out.print("Het woord is, los van de hoofdletters");
              
            if (palin.isPalindroom(tekst, false)) {
                System.out.println(", een palindroom");
                            }
            else {
                System.out.println(", geen palindroom! ");
                }
            }
        }  
}
