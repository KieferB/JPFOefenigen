/*
 * Change header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class BankBediende {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SpaarRekening spaar = new SpaarRekening ("BE12 3456 7890 1234", 2.5);
        ZichtRekening zicht = new ZichtRekening ("Be98 7654 3210 9876", 1000);
        spaar.storten(100.0);
        zicht.storten(200.0);
        zicht.afhalen(50.0);
        System.out.println("Saldo van de spaarrekening : " + spaar.geefSaldo());
        System.out.println("Saldo van de zichtrekening : " + zicht.geefSaldo());
        zicht.afhalen(2000);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 2000) : " + zicht.geefSaldo());
    }
    
}
