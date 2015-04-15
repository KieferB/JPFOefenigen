/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Kaart {
    
    private int kleur, rang;
    private static String[] kleuren = {"harten","ruiten","klaveren","schoppen"};
    private static String[] rangen = {"2","3","4","5","6","7","8","9","10","boer","vrouw","heer","aas"};
    
    public Kaart() {
        kleur = (int)(Math.random()*4);
        rang = (int)(Math.random()*13);
    }
    
    public String getKleur(){
        return kleuren[kleur];
    }
    public String getRang(){
        return rangen[rang];
    }
    public void printKaart(){
        System.out.println("Kleur = " + getKleur() + " \t Rang= " + getRang());
        }
    public boolean isHogerDan( Kaart k2){
        if( (kleur >= k2.kleur) && (rang > k2.rang))
            return true;
        else
            return false;
    }
    
}
