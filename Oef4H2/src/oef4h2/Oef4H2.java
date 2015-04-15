/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef4h2;

import java.util.Scanner;
/**
 *
 * @author kiefer.beernaert
 */
public class Oef4H2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Geef het aantal seconden in : ");
        Scanner sc = new Scanner (System.in);
        int tijd = sc.nextInt();
        
        int seconden = tijd % 60;
        
        int totaalminuten = (tijd - seconden)/60;
        
        int restminuten = totaalminuten % 60;
        
        int uren = (totaalminuten-restminuten) /60;
        
        System.out.print("Het aantal uren bedraagt : " + uren);
        System.out.print("Het aantal minuten bedraagt : " + restminuten);
        System.out.print("Het aantal seconden bedraagt : " + seconden);              
      
    }
    
}
