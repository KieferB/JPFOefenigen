/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kaart eersteKaart = new Kaart();
        eersteKaart.printKaart();
        System.out.println();
        
        Kaart tweedeKaart = new Kaart();
        tweedeKaart.printKaart();
        System.out.println();
        
        eersteKaart.printKaart();
        System.out.println(" is");
        if (! eersteKaart.isHogerDan(tweedeKaart))
            System.out.print(" niet");
        System.out.print(" groter dan ");
        tweedeKaart.printKaart();
    }
    
}
