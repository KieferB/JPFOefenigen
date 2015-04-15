
import kost.Kost;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class KostProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kost[] kosten = new Kost[4];
        
        kosten[0] = new Werknemer("Edde",2000.0);
        kosten[1] = new Werknemer("Marva",1500.0);
        kosten[2] = new Vrachtwagen("DAF", 0.35, 25000, 150000.0, 8);
        kosten[3] = new Kopieermachine("Konica", 0.02, 9000);
        
        double mensKosten=0.0;
        double andereKosten=0.0;
        
        for (Kost eenKost:kosten)
            if (eenKost.personeelsKost())
                mensKosten += eenKost.bedragKost();
            else 
                andereKosten += eenKost.bedragKost();
        
        System.out.println("Mens kosten: " + mensKosten);
        System.out.println("Andere kosten: " + andereKosten);
        
    }
    
}
