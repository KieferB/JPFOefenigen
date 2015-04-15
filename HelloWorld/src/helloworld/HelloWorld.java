/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author kiefer.beernaert
 */
public class HelloWorld extends JFrame {

    private JLabel label;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorld frame = new HelloWorld();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label = new JLabel("Hello World!");
        add(label);
    }
    
    
}
