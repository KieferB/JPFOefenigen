/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Personenwagen extends Voertuig {
    
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;
    
    
    public Personenwagen(){
            }
    
    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int deuren, int passagiers) {
        super(polishouder , kostprijs , pk , gemVerbruik , nummerplaat);
        setAantalDeuren(deuren);
        setAantalPassagiers(passagiers);
         }
    
    public final void setAantalDeuren(int aantalDeuren){
        if (aantalDeuren>2)
            this.aantalDeuren=aantalDeuren;
    }
    public int getAantalDeuren(){
        return aantalDeuren;
    }
    
    public final void setAantalPassagiers(int aantalPassagiers){
        if (aantalPassagiers > 0)
            this.aantalPassagiers=aantalPassagiers;
    }
    public int getAantalPassagiers(){
        return aantalPassagiers;
    }
    
    @Override
    public String toString(){
        return super.toString() + ";" + aantalDeuren + ";" + aantalPassagiers;
    }
    
    @Override
    public void toon(){
        System.out.println("\n PERSONENWAGEN");
        super.toon();
        System.out.println("deuren : " + aantalDeuren + "\n" + "passagiers : " + aantalPassagiers);
    }
    
    @Override
    public double getKyotoScore(){
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }
}
