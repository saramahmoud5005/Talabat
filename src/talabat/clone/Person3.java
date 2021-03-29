/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class Person3 extends Design {
    
   
    JButton Owner=new JButton("1. Owner");
    JButton Customer=new JButton("2. Customer");
    JButton EXIT=new JButton("E X I T");
    JLabel l2 =new JLabel (" Who are you ? ");
    MouseLesiner x=new MouseLesiner();
    CustomerMouse y=new CustomerMouse();
    ExitMouse z=new ExitMouse();
    
    public static Color darkOrange=new Color(255,90,0);
    
    public Person3()
    {
        
        Owner.setBounds(120, 400, 180, 35);
        background.add(Owner);
        Customer.setBounds(120, 480, 180, 35);
        background.add(Customer);
        EXIT.setBounds(120, 570, 180, 35);
        background.add(EXIT);
        l2.setBounds(70, 280, 290, 70);
        background.add(l2);
        
        
        background.setBackground(Color.white);
        background.setBorder(new javax.swing.border.LineBorder(darkOrange, 8, true));
        
       
        l2.setForeground(darkOrange);
        l2.setBorder(new javax.swing.border.LineBorder(darkOrange, 2, true));
        l2.setBackground(Color.white);
        l2.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //l2.setForeground(new java.awt.Color(255, 255, 255));
        //Owner.setBackground(Color.white);
       // Customer.setBackground(Color.white);
        //EXIT.setBackground(Color.white);
        
        Owner.setBackground(darkOrange);
        Owner.setForeground(Color.white);
        Owner.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Owner.setFont(new java.awt.Font("Calibri", 0, 18));
        Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Owner.addMouseListener(x);
        Owner.setFocusable(false);
        
        Customer.setBackground(darkOrange);
        Customer.setForeground(Color.white);
        Customer.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Customer.setFont(new java.awt.Font("Calibri", 0, 18));
        Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Customer.addMouseListener(y);
        Customer.setFocusable(false);
        
        EXIT.setBackground(darkOrange);
        EXIT.setForeground(Color.white);
        EXIT.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        EXIT.setFont(new java.awt.Font("Calibri", 0, 18));
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.addMouseListener(z);
        EXIT.setFocusable(false);
        
        
      
    }

   
    
   
      public class MouseLesiner implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(darkOrange);
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(darkOrange,1,true));
            LogIn_Owner2 x=new LogIn_Owner2();
            dispose();
        }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(darkOrange);
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(darkOrange);
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(darkOrange,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(darkOrange);
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setBackground(darkOrange);
            Owner.setForeground(Color.white);
            Owner.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
          
      }
      
      public class CustomerMouse implements MouseListener
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(darkOrange);
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(darkOrange,1,true));
            Login_Coustomer x=new Login_Coustomer();
            dispose();
        }
            //Login_Coustomer x=new Login_Coustomer();
            //dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(darkOrange);
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(darkOrange,1,true));
           // Login_Coustomer x=new Login_Coustomer();
        }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(darkOrange);
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(darkOrange,1,true));
            //Login_Coustomer x=new Login_Coustomer();
        }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(darkOrange);
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(darkOrange,1,true));
        }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setBackground(darkOrange);
            Customer.setForeground(Color.white);
            Customer.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }
          
      }
      
      public class ExitMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(darkOrange);
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(darkOrange,1,true));
            talabat t=new talabat();
            dispose();
        }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(darkOrange);
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(darkOrange,1,true));
        }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(darkOrange);
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(darkOrange,1,true));
        }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(darkOrange);
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setBackground(darkOrange);
            EXIT.setForeground(Color.white);
            EXIT.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
      }
}


