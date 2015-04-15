/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class WoordenBoek extends Boek {
    
    public WoordenBoek() {
        super();
        setTaal("geen taal");
    }
    
    public WoordenBoek(String titel, String auteur, double aankoopPrijs, String genre, String taal){
        super(titel, auteur, aankoopPrijs, genre);
        setTaal(taal);
    }
    
    private String taal;
    public final void setTaal(String taal){
        this.taal=taal;
    }
    public String getTaal(){
        return taal;
    }
    
    @Override
    public double winstBerekenen(){
        return this.getAankoopPrijs()*1.75;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + taal;
    }
}
