/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef7h4;

/**
 *
 * @author kiefer.beernaert
 */
public class Oef7H4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array;
        array = new int [101];
         
        for (int i=0 ; i<10000 ; i++){
        
           int getal = (int) (Math.floor((Math.random()*100)+1));
           array[getal] = array[getal]+1;
        }
        
        for (int i=0 ; i < 101 ; i++){
            System.out.print("Het getal " +i);
            System.out.print(" komt aantal keer voor: " + array[i]);
            System.out.println();
        }   
 
    }
    
}
