/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef3h2;

import java.util.Scanner;

/**
 *
 * @author kiefer.beernaert
 */
public class Oef3H2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    final int wisselstuk100=1;
    final double wisselstuk50=0.5;
    final double wisselstuk20=0.2;
    final double wisselstuk10=0.1;
    final double wisselstuk5=0.05;
    final double wisselstuk2=0.02;
    final double wisselstuk1=0.01;
    
    System.out.print("Geef het te betalen bedrag in : ");
    Scanner sc = new Scanner(System.in);
    double bedrag = sc.nextDouble();
    
    bedrag = 2 - bedrag;
    
    double restbedrag= bedrag % 1;
    int aantal1= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 1 euro bedraagt : " + aantal1);
    
    restbedrag= bedrag % 0.5;
    int aantal2= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 0.50euro bedraagt : " + aantal2);
    
    restbedrag= bedrag % 0.2;
    int aantal3= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 0.20euro bedraagt : " + aantal3);
    
    restbedrag= bedrag % 0.1;
    int aantal4= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 0.10euro bedraagt : " + aantal4);
    
      restbedrag= bedrag % 0.05;
    int aantal5= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 0.05euro bedraagt : " + aantal5);
    
    restbedrag= bedrag % 0.02;
    int aantal6= (int)(bedrag-restbedrag);
    bedrag = restbedrag;
    System.out.print("Het aantal stukken van 0.02euro bedraagt : " + aantal6);
    
    restbedrag= bedrag % 0.01;
    int aantal7= (int)(bedrag-restbedrag);
    System.out.print("Het aantal stukken van 0.50euro bedraagt : " + aantal7);
    
    }
    
}
