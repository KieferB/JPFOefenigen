/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author kiefer.beernaert
 */
public class SpaarRekening extends Rekening {
    
       private static double intrest;
       private double saldo;
       
    
    /** Creates a new instance of SpaarRekening */
    public SpaarRekening(String rnr, double intrest) {
        super(rnr);
        SpaarRekening.intrest = intrest;
    }
     public double geefSaldo(){
         double rente = berekenRente();
         storten(rente);
         return super.geefSaldo();
     }
     private double berekenRente(){
         double saldo = super.geefSaldo();
         return saldo * intrest / 100.0;
     }
    
    
    private static boolean checkNummer (String reknr){
          //rekeningnummer in de vorm xxx-xxxxxxx-xx
          int d1=Integer.parseInt(reknr.substring(0,3));
          int d2=Integer.parseInt(reknr.substring(4,11));
          int d3=Integer.parseInt(reknr.substring(12,14));
          
          long deeltal= d1 * 10000000L + d2;
          int rest=(int)(deeltal % 97);
          if (rest==0) rest=97;
          return (rest==d3);
      }
    public static double getIntrest(){
          return intrest;
      }
    public void storten (double bedrag) {
        saldo += bedrag;
    }
    public void afhalen (double bedrag) {
        saldo-=bedrag;
    }
    public void overschrijven(SpaarRekening spaarRek, double bedrag, Date datum) {
        saldo -= bedrag;
        spaarRek.storten(bedrag);
    }
    public void overschrijven(SpaarRekening spaarRek, double bedrag) {
        saldo -= bedrag;
        spaarRek.storten(bedrag);
    }
    
}
