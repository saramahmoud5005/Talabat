/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Owner
 */
import java.io.*;
import java.util.Vector;
import javafx.util.Pair;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener
public class Testing extends JPanel{
    
    
    public Testing()
    {
        
    }
    
    
    private static final long serialVersionUID = 1L;  
  
    /*private static void createAndShowGUI() {  
  
        // Create and set up the window.  
        final JFrame frame = new JFrame("Scroll Pane Example");  
  
        // Display the window.  
        frame.setSize(500, 500);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // set flow layout for the frame  
        frame.getContentPane().setLayout(new FlowLayout());  
  
        JTextArea textArea = new JTextArea(20, 20);  
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frame.add(scrollableTextArea); 
        
        //Vector<Pair<String,double> >v=new Vector<Pair<String,double> >();
    }  */
    public void paintComponent(Graphics g) {
           g.drawOval(5,5,50,50);
           g.setColor(Color.white);
           g.fillOval(5, 5, 50, 50);
        }
     
}
