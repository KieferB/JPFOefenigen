/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class TestProgramma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voertuig opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);
    
        Vrachtwagen volvo1= new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);
        
        Personenwagen opel2 = new Personenwagen("Jan Klaasen", 145990F, 105, 6.8F, "KLM099" , 5, 5);
        opel2.toon();
        System.out.println(opel2);
        
        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2); //Gegevens gewijzigd?
        
        Vrachtwagen volvo2= new Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);
        
        System.out.println();
        System.out.println("Kyotoscore personenwagen 1 : " + opel1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2 : " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1 : " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2 : " + volvo2.getKyotoScore());
        
    
    }
    
    
}
