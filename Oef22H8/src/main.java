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
        
        Voorwerp voorwerpen[] = new Voorwerp[6];
        voorwerpen[0] = new LeesBoek();
        voorwerpen[1] = new LeesBoek("Java","J.P. Dupont", 18.85,"Informatica","Java");
        voorwerpen[2] = new WoordenBoek();
        voorwerpen[3] = new WoordenBoek("Wolters N-F","A.D.P. Vandervoort",25.50,"Naslagwerken", "N-F");
        voorwerpen[4] = new BoekenRek();
        voorwerpen[5] = new BoekenRek(200.0F, 75.5F, 75.0);
        
        double totaleWinst = 0.0;
        for (Voorwerp eenVoorwerp:voorwerpen){
            totaleWinst += eenVoorwerp.winstBerekenen();
            eenVoorwerp.gegevensTonen();
        }
        
        System.out.println("Totale winst : " + totaleWinst);
    }
    
}
