/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiefer.beernaert
 */
public class Student {
    
    public Student (String naam, int score){
        setNaam(naam);
        setScore(score);
        }
    public Student (String naam) {
        setNaam(naam);
        setScore(0);
    }
    
    private String naam;
    private int score;
    
    public String getNaam(){
        return naam;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setNaam(String naam){
        this.naam = naam;
    }
    public void setScore(int score){
        this.score = score;
    }
}
