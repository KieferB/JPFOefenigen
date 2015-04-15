/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public abstract class Boek implements Voorwerp {
    
    public Boek(){
        setTitel("geen titel");
        setAuteur("geen auteur");
        setAankoopPrijs(0.0);
        setGenre("geen genre");
    }
    
    public Boek(String titel, String auteur, double aankoopPrijs, String genre){
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
    }
    
    private String titel;
    public String getTitel(){
        return titel;
    }
    
   public void setTitel(String titel){
       this.titel=titel;
   }
   
   private String auteur;
   public String getAuteur(){
       return auteur;
   }
   public void setAuteur(String auteur){
       this.auteur=auteur;
   }
   
   private static String eigenaar = "VDAB";
   public String getEigenaar(){
       return eigenaar;
   }
   
   private double aankoopPrijs;
   public double getAankoopPrijs(){
       return this.aankoopPrijs;
   }
   public void setAankoopPrijs(double aankoopPrijs){
       this.aankoopPrijs=aankoopPrijs;
   }
   
   private String genre;
   public String getGenre(){
       return genre;
   }
   public void setGenre(String genre){
       this.genre=genre;
   }
      
   @Override
   public void gegevensTonen(){
       System.out.println(this.toString());
       }
   
   @Override
   public String toString(){
       return titel + ", " + auteur +", " + aankoopPrijs + ", " + genre +", " + eigenaar;
   }

}
