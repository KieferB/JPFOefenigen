/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author kiefer.beernaert
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Collection coll = new HashSet();
    coll.add( new Persoon("Jan", new BigDecimal ("2100.85")));
    coll.add( new Persoon("Jos", new BigDecimal ("1890.10")));
    coll.add( new Persoon("Jef", new BigDecimal ("2400.55")));
    
    BigDecimal somLoon = BigDecimal.ZERO;
    
    Iterator i = coll.iterator();
    while (i.hasNext()){
        Object o = i.next();
        if ( o instanceof Persoon) {
            Persoon p = (Persoon) o;
            somLoon = somLoon.add(p.getLoon());
        }
    }
        
    
    }
    
    
}
