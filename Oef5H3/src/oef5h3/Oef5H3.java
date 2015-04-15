/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef5h3;

/**
 *
 * @author kiefer.beernaert
 */
public class Oef5H3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array;
        array = new int [5];
        
        
        int getal1 = (int)(Math.random()*100 + 1);
        array[0]= (getal1);
        
        int getal2 = (int)(Math.random()*100 + 1);
        array[1]=(getal2);
        
        int getal3 = (int)(Math.random()*100 + 1);
        array[2]=(getal3);
        
        int getal4 = (int)(Math.random()*100 + 1);
        array[3]=(getal4);
        
        int getal5 = (int)(Math.random()*100 + 1);
        array[4]=getal5;
        
        System.out.print("Getal 1 : " + getal1);
        System.out.print("Getal 2 : " + getal2);
        System.out.print("Getal 3 : " + getal3);
        System.out.print("Getal 4 : " + getal4);
        System.out.print("Getal 5 : " + getal5);
        
        int som = getal1 +getal2 + getal3 + getal4 + getal5;
        
        System.out.print("De som van deze getallen bedraagt : " + som);
        
        int gemiddelde = som/5;
        
        System.out.print("Het gemiddelde van deze getallen bedraagt : " + gemiddelde);
           
                
    }
    
}
