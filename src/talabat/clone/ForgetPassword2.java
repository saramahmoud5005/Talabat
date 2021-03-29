/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class ForgetPassword2 extends Design
{
    JButton Confirm=new JButton("OK");
    JButton Cancel=new JButton("CANCEL");
    JLabel l1=new JLabel ("Email: ");
    JTextField Email=new JTextField();
    
    public static Color darkOrange=new Color(255,90,0);
   
    ConfirmMouseLesiner comfirmMouse=new ConfirmMouseLesiner();
    CancelMouse cancelMouse=new CancelMouse();
   
   
   public ForgetPassword2()
   {
       l1.setBounds(50, 350, 100, 25);
        background.add(l1);
        Email.setBounds(210, 350, 180, 25);
        background.add(Email);
        
        Confirm.setBounds(50, 530, 140, 32);
        background.add(Confirm);
        Cancel.setBounds(250, 530, 140, 32);
        background.add(Cancel);
       
        
        Confirm.setBackground(darkOrange);
        Confirm.setForeground(Color.white);
        Confirm.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Confirm.setFont(new java.awt.Font("Calibri", 0, 18));
        Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirm.addMouseListener(comfirmMouse);
        Confirm.setFocusable(false); //updated 17/2/2021
        
        Cancel.setBackground(darkOrange);
        Cancel.setForeground(Color.white);
        Cancel.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Cancel.setFont(new java.awt.Font("Calibri", 0, 18));
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addMouseListener(cancelMouse);
        Cancel.setFocusable(false); //updated 17/2/2021
        
        
        l1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l1.setForeground(darkOrange);
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBackground(Color.white);
        l1.setForeground(darkOrange);
        
        Email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Email.setForeground(darkOrange);
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setBackground(Color.white);
        Email.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
       
    }

   
     public class ConfirmMouseLesiner implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            String email=Email.getText();
            String emailRegex= "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
            Pattern emailPat=Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
            Matcher matcher;
            matcher = emailPat.matcher(email);
            if (email.isEmpty())
            {
                 JOptionPane.showConfirmDialog(null,"You must enter Your email","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (!(matcher.find())) 
            {
               JOptionPane.showConfirmDialog(null,"You must enter an email containing '@' and '.'","Error",JOptionPane.ERROR_MESSAGE);
               Email.setText("");
            }else
            {

                 Password2 x=new Password2();
                dispose();
            }
        
                Confirm.setForeground(darkOrange);
                Confirm.setBackground(Color.white);
                Confirm.setBorder(new LineBorder(darkOrange,1,true));
        }
            

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Confirm)
            {
            Confirm.setForeground(darkOrange);
            Confirm.setBackground(Color.white);
            Confirm.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Confirm)
            {
            Confirm.setForeground(darkOrange);
            Confirm.setBackground(Color.white);
            Confirm.setBorder(new LineBorder(darkOrange,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Confirm)
            {
            Confirm.setForeground(darkOrange);
            Confirm.setBackground(Color.white);
            Confirm.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Confirm)
            {
            Confirm.setBackground(darkOrange);
            Confirm.setForeground(Color.white);
            Confirm.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
          
      }
     
     
      public class CancelMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Cancel)
            {
                
                Cancel.setForeground(darkOrange);
                Cancel.setBackground(Color.white);
                Cancel.setBorder(new LineBorder(darkOrange,1,true));
                
                Person3 x=new Person3();
            dispose();
            
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Cancel)
            {
            Cancel.setForeground(darkOrange);
            Cancel.setBackground(Color.white);
            Cancel.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Cancel)
            {
            Cancel.setForeground(darkOrange);
            Cancel.setBackground(Color.white);
            Cancel.setBorder(new LineBorder(darkOrange,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Cancel)
            {
            Cancel.setForeground(darkOrange);
            Cancel.setBackground(Color.white);
            Cancel.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Cancel)
            {
            Cancel.setBackground(darkOrange);
            Cancel.setForeground(Color.white);
            Cancel.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        
      }
} 

   
    

