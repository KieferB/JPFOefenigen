/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public abstract class Voertuig {
    
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;
    
    
    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat){
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }
    
    public Voertuig(){
    }
    
    public final void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }
    public String getPolishouder(){
        return polishouder;
    }
    
    public final void setKostprijs(float kostprijs) {
        if (kostprijs>0)
            this.kostprijs=kostprijs;
    }
    public float getKostprijs(){
        return kostprijs;
    }
    
    public final void setPk(int pk){
        if (pk > 0)
            this.pk=pk;
    }
    public int getPk(){
        return pk;
    }
    
    public final void setGemVerbruik( float gemVerbruik){
        if(gemVerbruik>0)
            this.gemVerbruik=gemVerbruik;
    }
    public float getGemVerbruik(){
        return gemVerbruik;
    }
    
    public final void setNummerplaat( String nummerplaat) {
        this.nummerplaat=nummerplaat;
    }
    public String getNummerplaat(){
        return nummerplaat;
    }
    
    @Override
    public String toString(){
        return polishouder + ";" + kostprijs +";" + pk + ";" + gemVerbruik + ";" + nummerplaat;
    }
    
    public void toon(){
        System.out.println("Polishouder : " + polishouder);
        System.out.println("Kostprijs : " + kostprijs);
        System.out.println("Pk : " + pk);
        System.out.println("Gemiddelde verbruik : " + gemVerbruik);
        System.out.println("Nummerplaat : " + nummerplaat);
    }
    
    public abstract double getKyotoScore();
            
}
