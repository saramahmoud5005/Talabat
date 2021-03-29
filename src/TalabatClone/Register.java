/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import static talabat.clone.Login_Coustomer.darkOrange;

/**
 *
 * @author Aya
 */
public class Register extends Name_X  {

    JLabel l6 =new JLabel (" Address: ");
    JTextField  Address=new JTextField();
    JLabel l8 =new JLabel (" Confirm Password: ");
     JPasswordField ConfirmPassword=new JPasswordField();
    JLabel l7 =new JLabel (" Mobile: ");
    JTextField  Mobile=new JTextField();
    JButton Submit=new JButton("Submit");
    JButton Signin=new JButton("SIGNIN");
    SubmitMouse Submitmouse=new SubmitMouse();
    RestMouse restMouse =new RestMouse();
    
    JLabel switch_to_owner=new JLabel("Switch to owner");
    
    public Register()
    {
        //updated 23/3/2021
        switch_to_owner.setForeground(darkOrange);
        switch_to_owner.setBounds(165, 600, 150,100);
        switch_to_owner.setFont(new java.awt.Font("Calibri", 0, 17));
        switch_to_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(switch_to_owner);
        switch_to_owner.addMouseListener(restMouse);
        
        background1.setBounds(-170, 0, 780, 300);
        
        l1.setBounds(50, 320, 100, 25);
        background.add(l1);
        UserName.setBounds(210, 320, 180, 25);
        background.add(UserName);
        l2.setBounds(50, 360, 100, 25);
        background.add(l2);
        Password.setBounds(210, 360, 180, 25);
        background.add(Password);
        
        l8.setBounds(20, 400, 180, 25);
        background.add(l8);
        ConfirmPassword.setBounds(210, 400, 180, 25);
        background.add(ConfirmPassword);
        
        l6.setBounds(10, 440, 180, 25);
        background.add(l6);
        Address.setBounds(210, 440, 180, 25);
        background.add(Address);
        
        l7.setBounds(10, 480, 180, 25);
        background.add(l7);
        Mobile.setBounds(210, 480, 180, 25);
        background.add(Mobile);
        
        Submit.setBounds(40, 560, 150, 34);
        background.add(Submit);
        
        Signin.setBounds(250, 560, 150, 34);
        background.add(Signin);
        
        l6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 90, 0));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBackground(Color.white);
        
        l7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 90, 0));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setBackground(Color.white);
        
        l8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 90, 0));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setBackground(Color.white);
        
        Address.setForeground(new java.awt.Color(255, 90, 0));
        Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Address.setFont(new java.awt.Font("Calibri", 0, 18));
        Address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        ConfirmPassword.setForeground(new java.awt.Color(255, 90, 0));
        ConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmPassword.setFont(new java.awt.Font("Calibri", 0, 18));
        ConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        Mobile.setForeground(new java.awt.Color(255, 90, 0));
        Mobile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mobile.setFont(new java.awt.Font("Calibri", 0, 18));
        Mobile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        
        Submit.setBackground(new java.awt.Color(255, 90, 0));
        Submit.setForeground(Color.white);
        Submit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        Submit.setFont(new java.awt.Font("Calibri", 0, 18));
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //Submit.addMouseListener(signMouse);
        Submit.addMouseListener(Submitmouse);
        
        Signin.setBackground(new java.awt.Color(255, 90, 0));
        Signin.setForeground(Color.white);
        Signin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        Signin.setFont(new java.awt.Font("Calibri", 0, 18));
        Signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signin.addMouseListener(restMouse);
    } 
  
    public class SubmitMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Submit) 
            {
                String username=UserName.getText();
                String password=Password.getText();
                int pass=Password.getPassword().length;
                String confirmpassword=new String(ConfirmPassword.getPassword());
                int confirm=ConfirmPassword.getText().length();
                String address=Address.getText();
                String Mobilenumber=Mobile.getText();
                int mobileNumber=Mobile.getText().length();
                
                
                if (username.isEmpty()||password.isEmpty()||confirmpassword.isEmpty()||address.isEmpty()||Mobilenumber.isEmpty()) 
                {
                    JOptionPane.showConfirmDialog(null,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if (!Pattern.matches("[a-zA-Z]+", username))
                {
                     JOptionPane.showConfirmDialog(null,"Tha name is Invalid","Error",JOptionPane.ERROR_MESSAGE);
                     UserName.setText("");
                }else if (pass<6) 
                {
                    JOptionPane.showConfirmDialog(null,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
                    Password.setText("");
                }else if (!(password.equals(confirmpassword))) 
                {
                    JOptionPane.showConfirmDialog(null,"Password confitmation is wrong","Error",JOptionPane.ERROR_MESSAGE);
                    Password.setText("");
                    ConfirmPassword.setText("");
                }else if (!(mobileNumber==11))
                {
                    JOptionPane.showConfirmDialog(null,"Mobile Number must contain 11 numbers","Error",JOptionPane.ERROR_MESSAGE);
                    Mobile.setText("");
                }
            else if(!Pattern.matches("^[0-9]+$", Mobilenumber))
            {

                JOptionPane.showConfirmDialog(null,"Mobile Number must contain numbers only","Error",JOptionPane.ERROR_MESSAGE);
                Mobile.setText("");
            }
                else
                {
                    //Data.data.numberOfUsers++;
                    /*Data.data.user_name[Data.data.numberOfUsers]=username;
                    Data.data.user_password[Data.data.numberOfUsers]=password;
                    Data.data.user_address[Data.data.numberOfUsers]=address;
                    Data.data.user_mobile_number[Data.data.numberOfUsers]=Mobilenumber;*/
                    
                    checkData(address, username, Mobilenumber, password);
                    //restaurants_page obj=new restaurants_page();
                    Submit.setForeground(new Color(255,90,0));
                    Submit.setBackground(Color.white);
                    Submit.setBorder(new LineBorder(new Color(255,90,0),1,true));
                    
                }
            
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
             if(e.getSource()==Submit)
            {
                Submit.setForeground(new Color(255,90,0));
                Submit.setBackground(Color.white);
                Submit.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Submit)
            {
                Submit.setBackground(new Color(255,90,0));
                Submit.setForeground(Color.white);
                Submit.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }
        
    }
    
    public class RestMouse implements MouseListener 
     {

        @Override
        public void mouseClicked(MouseEvent e) {
            
            if(e.getSource()==switch_to_owner)
            {
                LogIn_Owner2 o=new LogIn_Owner2();
                dispose();
            }
             if (e.getSource()==Signin) 
            {
                Login_Coustomer o=new Login_Coustomer();
                dispose();
                /*UserName.setText("");
                Password.setText("");
                ConfirmPassword.setText("");
                Address.setText("");
                Mobile.setText("");*/
                
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Signin)
            {
                Signin.setForeground(new Color(255,90,0));
                Signin.setBackground(Color.white);
                Signin.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Signin)
            {
                Signin.setBackground(new Color(255,90,0));
                Signin.setForeground(Color.white);
                Signin.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }
        
    }
    
    public void checkData(String address,String UserName,String mobile,String pass)
    {
        
        boolean flag=false;
        for (int i = 0; i <= Data.data.numberOfUsers; i++) {
            
            if (UserName.equals(Data.data.user_name[i])&&address.equals(Data.data.user_address[i])&&mobile.equals(Data.data.user_mobile_number[i])) 
            {
                JOptionPane.showConfirmDialog(null,"This account is already exist","Error",JOptionPane.ERROR_MESSAGE);
                flag=false;
                break;
            }
            else if (UserName.equals(Data.data.user_name[i])) 
            {
                JOptionPane.showConfirmDialog(null,"User name already exist","Error",JOptionPane.ERROR_MESSAGE);
                flag=false;
                break;
            }
            
            else if (mobile.equals(Data.data.user_mobile_number[i])) 
            {
                JOptionPane.showConfirmDialog(null,"Mobile number already exist","Error",JOptionPane.ERROR_MESSAGE);
                flag=false;
                break;
                
            }
            else if(!(UserName.equals(Data.data.user_name[i]))&&!(address.equals(Data.data.user_address[i]))&&!(mobile.equals(Data.data.user_mobile_number[i])))
            {
                flag=true;
            }
        }
        
        if(flag==true)
        {
            
            JOptionPane.showConfirmDialog(null,"Successfully registered. ","Error",JOptionPane.ERROR_MESSAGE);
            saveData(UserName,pass,address,mobile);
               Login_Coustomer y=new Login_Coustomer();
               dispose();
        }
        
        
          
    }
     
     public void saveData(String name,String pass,String Address,String Mobile)
     {
         Data.data.numberOfUsers++;
         Data.data.user_name[Data.data.numberOfUsers]=name;
         Data.data.user_password[Data.data.numberOfUsers]=pass;
         Data.data.user_address[Data.data.numberOfUsers]=Address;
         Data.data.user_mobile_number[Data.data.numberOfUsers]=Mobile;
      
     }
}
