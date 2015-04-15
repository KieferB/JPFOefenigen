/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptryout;

/**
 *
 * @author kiefer.beernaert
 */
public class ExcepTryout {
    
    public ExcepTryout() {}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        int[] lijst = { 2, 1, 3, 0, 5};
        
        
        try { 
            int hoeveelste = Integer.parseInt(args[0]);
            
            try { 
                System.out.println(lijst[hoeveelste]);
                }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println ("Foutieve arrayindex: " + hoeveelste);
            }
            
            try {
                for (int i=0; i<lijst.length ; i++)
                System.out.println(hoeveelste/lijst[i]);
                }
            catch (ArithmeticException e) {
                System.out.println ("Deling door 0 kan niet.");
                }
            }
        
        catch (NumberFormatException e) 
            {
            System.out.println(e.getMessage());
            }
    }
    
}
