
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Waarnemer w = new Waarnemer();
        
        System.out.println("Geef een temperatuur in :");
        int ingelezenTemperatuur = sc.nextInt();
        
        while (ingelezenTemperatuur != 999) {
            w.nieuweRegistratie(ingelezenTemperatuur);
            System.out.println("Geef een nieuwe temperatuur in : ");
            ingelezenTemperatuur = sc.nextInt();
        }
       
        System.out.println("Het resultaat van " + w.getAantalWaarnemingen() + " waarnemingen:");
        System.out.println("Minimum : " + w.getMinimumTemp());
        System.out.println("Maximum : " + w.getMaximumTemp());
        System.out.println("Gemiddelde : " + w.getGemiddeldeTemp());
        
    }
    
}
