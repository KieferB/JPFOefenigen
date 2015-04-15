/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamstryout;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kiefer.beernaert
 */
public class StreamsTryout {

    public StreamsTryout() {}
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte [] lottocijfers = {2, 13, 14, 22, 29, 32};
        FileOutputStream deLijst = null;
        
        try {
            deLijst = new FileOutputStream("lotto.dat");
            
            for (byte lottocijfer:lottocijfers) {
                deLijst.write(lottocijfer);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (deLijst != null)
                try {
                    deLijst.close();
                }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
                }
        }
    }
    
