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
        Student Ruben = new Student("Ruben", 85);
        Student Freya = new Student("Freya", 75);
        
        System.out.println("Eerste student : " + Ruben.getNaam() +", score= " + Ruben.getScore());
        System.out.println("Tweede student : " + Freya.getNaam() +", score= " + Freya.getScore());
    }
    
}
