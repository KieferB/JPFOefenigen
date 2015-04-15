/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Rekening {
    private String rekeningNr;
    private double saldo;
    
    public Rekening(String rnr){
        rekeningNr = rnr;
        saldo=0;
    }
    public void storten (double bedrag){
        saldo += bedrag;
    }
    public void afhalen (double bedrag) {
        saldo -= bedrag;
    }
    public void overschrijven(Rekening rek, double bedrag){
        saldo -= bedrag;
        rek.storten(bedrag);
    }
    public double geefSaldo(){
        return saldo;
    }
}
