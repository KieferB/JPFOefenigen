/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */

import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String bewerking = scan.nextLine();
        
        String[] delen = bewerking.split(" ");
        
        int getal = 0;
        
        int uitkomst;
        
        if (!delen[0].isEmpty())
            uitkomst = Integer.parseInt(delen[0]); 
        
        else {
            uitkomst =0;
        }
        
        int i = 1;
        while (i != delen.length){
            char bewTeken = delen[i++].charAt(0);
            if (i != delen.length) {
                getal = Integer.parseInt(delen[i]);
                switch (bewTeken) {
                    case '+':
                        uitkomst += getal;
                        break;
                    case '-':
                        uitkomst -=getal;
                        break;
                    case '*':
                        uitkomst *= getal;
                        break;
                    case '/':
                        uitkomst /= getal;
                        break;
                }
                i++;
            }
            }
        System.out.println(bewerking + " = " + uitkomst);
    } 
}