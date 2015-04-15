/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
    public class ZichtRekening extends Rekening {
        final private int maxKrediet;
        
        public ZichtRekening(String rnr, int bedrag) {
            super(rnr);
            maxKrediet = bedrag;
        }
        public void afhalen(double bedrag){
            double testSaldo = geefSaldo() - bedrag + maxKrediet;
            if (testSaldo > 0) super.afhalen(bedrag);
        }
    }
