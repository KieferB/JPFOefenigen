/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef6h4;

/**
 *
 * @author kiefer.beernaert
 */
public class Oef6H4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] array;
        array = new int [5];
        
        int getal;
        
        for (int j=0; j<=4; j++){
        
        getal = (int)(Math.random()*100 + 1);
        array[j]= getal;
        System.out.print("Getal : " + array[j]);
        }
        
        int som = 0;
        for (int i=0; i<=4; i++) {
        
        som = som + array[i];
        }
        
        System.out.print("De som van deze getallen bedraagt : " + som);
        
        float gemiddelde = som/5;
        
        System.out.print("Het gemiddelde van deze getallen bedraagt : " + gemiddelde);
    }
    
}
