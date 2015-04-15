/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class BoekenRek implements Voorwerp {
    
    public BoekenRek(){
        setHoogte(0.0F);
        setBreedte(0.0F);
        setAankoopPrijs(0.0);
    }
    
    public BoekenRek(float hoogte, float breedte, double aankoopPrijs){
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopPrijs(aankoopPrijs);
    }
    
    private float hoogte;
    public float getHoogte(){
        return this.hoogte;
    }
    public final void setHoogte(float hoogte){
        this.hoogte=hoogte;
    }
    
    private float breedte;
    public float getBreedte() {
        return this.breedte;
    }
    public final void setBreedte(float breedte){
        this.breedte=breedte;
    }
    
    private double aankoopPrijs;
    public double getAankoopPrijs(){
        return this.aankoopPrijs;
    }
    public final void setAankoopPrijs(double aankoopPrijs){
        this.aankoopPrijs=aankoopPrijs;
    }
    @Override
    public double winstBerekenen(){
        return this.getAankoopPrijs()*2.0;
    }
    
    @Override
    public void gegevensTonen(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return hoogte + " ; " + breedte + " ; " + aankoopPrijs;
    }
    
}
