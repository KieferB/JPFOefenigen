/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Stookketel implements Vervuiler {
    private float CONorm;
    
    public Stookketel(){
            }
    
    public Stookketel(float CONorm){
        setCONorm(CONorm);
    }
    
    public final void setCONorm(float CONorm) {
        this.CONorm=CONorm;
    }
    
    public float getCONorm(){
       return this.CONorm;
    }
    
    @Override
    public double geefVervuiling(){
        return getCONorm()*100;
    }
}
