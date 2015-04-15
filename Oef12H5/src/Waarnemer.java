/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Waarnemer {
    
    private int minimumTemp;
    private int maximumTemp;
    private double gemiddeldeTemp;
    private int aantalWaarnemingen = 0;
    
    public void nieuweRegistratie (int temperatuur) {
        double som = gemiddeldeTemp * aantalWaarnemingen + temperatuur;
        aantalWaarnemingen++;
        gemiddeldeTemp = som / aantalWaarnemingen;
        
        if (temperatuur < minimumTemp ) {
            minimumTemp = temperatuur;
        }
        
        if (temperatuur > maximumTemp ) {
            maximumTemp = temperatuur;
        }
        
    }
    
    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }
    public int getMinimumTemp() {
        return minimumTemp;
    }
    public int getMaximumTemp() {
        return maximumTemp;
    }
    public double getGemiddeldeTemp() {
        return gemiddeldeTemp;
    }
}
