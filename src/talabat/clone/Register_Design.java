/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Aya
 */
public class Register_Design extends Name_X 
{
    
    JLabel l8 =new JLabel (" Confirm Password: ");
    JPasswordField ConfirmPassword=new JPasswordField();
    JButton Submit=new JButton("Submit");
    JButton SignIn=new JButton("SignIn");
    
     public Register_Design()
     {
         
        background1.setBounds(-170, 0, 780, 250);
        
        l1.setBounds(50, 300, 100, 25);
        background.add(l1);
        UserName.setBounds(210, 300, 180, 25);
        background.add(UserName);
        l2.setBounds(50, 350, 100, 25);
        background.add(l2);
        Password.setBounds(210, 350, 180, 25);
        background.add(Password);
         
        l8.setBounds(20, 390, 180, 25);
        background.add(l8);
        ConfirmPassword.setBounds(210, 390, 180, 25);
        background.add(ConfirmPassword);
        
        Submit.setBounds(40, 560, 150, 34);
        background.add(Submit);
        
        SignIn.setBounds(250, 560, 150, 34);
        background.add(SignIn);
        
        l8.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 90, 0));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setBackground(Color.white);
        l8.setForeground(new java.awt.Color(255, 90, 0));
        
        ConfirmPassword.setForeground(new java.awt.Color(255, 90, 0));
        ConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmPassword.setFont(new java.awt.Font("Gadugi", 1, 18));
        ConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        Submit.setBackground(new java.awt.Color(255, 90, 0));
        Submit.setForeground(Color.white);
        Submit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        Submit.setFont(new java.awt.Font("Gadugi", 1, 18));
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        SignIn.setBackground(new java.awt.Color(255, 90, 0));
        SignIn.setForeground(Color.white);
        SignIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        SignIn.setFont(new java.awt.Font("Gadugi", 1, 18));
        SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
     }
    
}

