/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class Password2 extends Design{
    
    JButton Confirm=new JButton("OK");
    JButton Cancel=new JButton("CANCEL");
    JLabel l1=new JLabel ("Password: ");
    JLabel l2 =new JLabel ("Confirm Password: ");
    
    JPasswordField Password=new JPasswordField();
    JPasswordField ConfirmPassword=new JPasswordField();
   
    Password2.ConfirmMouseLesiner comfirmMouse=new Password2.ConfirmMouseLesiner();
    Password2.CancelMouse cancelMouse=new Password2.CancelMouse();
   
    public static Color darkOrange=new Color(255,90,0);
    


public Password2()
{
   
        
        l1.setBounds(50, 350, 100, 25);
        background.add(l1);
        Password.setBounds(210, 350, 180, 25);
        background.add(Password);
        l2.setBounds(10, 420, 200, 25);
        background.add(l2);
        ConfirmPassword.setBounds(210, 420, 180, 25);
        background.add(ConfirmPassword);
        
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
        Confirm.setFocusable(false);
        
        Cancel.setBackground(darkOrange);
        Cancel.setForeground(Color.white);
        Cancel.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Cancel.setFont(new java.awt.Font("Calibri", 0, 18));
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addMouseListener(cancelMouse);
        Cancel.setFocusable(false);
        
        
        l1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l1.setForeground(darkOrange);
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBackground(Color.white);
        l1.setForeground(darkOrange);
        
        Password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Password.setForeground(darkOrange);
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setBackground(Color.white);
        Password.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
       
        
        l2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l2.setForeground(darkOrange);
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBackground(Color.white);
        l2.setForeground(darkOrange);
        
        ConfirmPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ConfirmPassword.setForeground(darkOrange);
        ConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmPassword.setBackground(Color.white);
        ConfirmPassword.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        
        
        
       
    }

   
     public class ConfirmMouseLesiner implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Confirm)
            {
                String password=new String(Password.getText());
        String confirmpassword=new String(ConfirmPassword.getPassword());
        int pass=Password.getPassword().length;
        int confirm=ConfirmPassword.getText().length();
 
        if (password.isEmpty()||confirmpassword.isEmpty()) 
        {
            JOptionPane.showConfirmDialog(null,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        else if (!(password.equals(confirmpassword))) 
        {
            JOptionPane.showConfirmDialog(null,"Password confitmation is wrong","Error",JOptionPane.ERROR_MESSAGE);
            Password.setText("");
            ConfirmPassword.setText("");
        }else if ((pass<6)) 
        {
            JOptionPane.showConfirmDialog(null,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
            Password.setText("");
            ConfirmPassword.setText("");
        }
        else{
            Person3 x=new Person3();
            dispose();
        }
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

