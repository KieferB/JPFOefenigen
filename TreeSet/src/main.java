
import java.util.Set;
import java.util.TreeSet;

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
        
        Set cursussen = new TreeSet();
        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 90));
        cursussen.add(new Cursus(4, "Acces", 120));
        cursussen.add(new Cursus(2, "Powerpoint",80));
        
        for ( Object obj : cursussen) {
            Cursus eenCursus = (Cursus) obj;
            System.out.println(eenCursus);
        }
    }
    
}
