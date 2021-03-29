/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import static talabat.clone.LogIn_Owner2.darkOrange;
//import static talabat.clone.owner.anyres;

/**
 *
 * @author Aya
 */
public class RegisterOwner extends Register_Design
{
    JLabel l6 =new JLabel (" Restaurant Name: ");
    JTextField  ResturantName=new JTextField();
    JTextField  PictureOfRestaurant=new JTextField();
    JButton pictureOfRestaurant=new JButton("Choose");
    PicturMouse Picturemouse=new PicturMouse();
    SubmitMouse Submitmouse=new SubmitMouse();
    RestMouse SignInMouse =new RestMouse();
    
    
    //updated 23/3/2021
    JLabel switch_to_user=new JLabel("Switch to user");
    
    ImageIcon ima;
    
    
    public RegisterOwner()
    {
        
        ////////////////////////////
        //updated 23/3/2021
        switch_to_user.setForeground(darkOrange);
        switch_to_user.setBounds(165, 600, 150,100);
        switch_to_user.setFont(new java.awt.Font("Calibri", 0, 17));
        switch_to_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(switch_to_user);
        switch_to_user.addMouseListener(Submitmouse);
        
        
        
        ///////////////////////////////
        
        l1.setBounds(50, 300, 100, 25);
        background.add(l1);
        UserName.setBounds(210, 300, 180, 25);
        background.add(UserName);
        l2.setBounds(50, 350, 100, 25);
        background.add(l2);
        Password.setBounds(210, 350, 180, 25);
        background.add(Password);
        
        l8.setBounds(10, 400, 180, 25);
        background.add(l8);
        ConfirmPassword.setBounds(210, 400, 180, 25);
        background.add(ConfirmPassword);
        
        l6.setBounds(10, 450, 180, 25);
        background.add(l6);
        ResturantName.setBounds(210, 450, 180, 25);
        background.add(ResturantName);
        
        pictureOfRestaurant.setBounds(20, 500, 160, 30);
        background.add(pictureOfRestaurant);
        
        PictureOfRestaurant.setBounds(210, 500, 180, 30);
        background.add(PictureOfRestaurant);
        
        Submit.setBounds(40, 580, 150, 34);
        background.add(Submit);
        
        SignIn.setBounds(250, 580, 150, 34);
        background.add(SignIn);
        
        l6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 90, 0));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBackground(Color.white);
        l6.setForeground(new java.awt.Color(255, 90, 0));
        
        
        
        ResturantName.setForeground(new java.awt.Color(255, 90, 0));
        ResturantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResturantName.setFont(new java.awt.Font("Calibri", 0, 18));
        ResturantName.setForeground(new java.awt.Color(255, 90, 0));
        ResturantName.setBackground(Color.white);
        ResturantName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        ConfirmPassword.setForeground(new java.awt.Color(255, 90, 0));
        ConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmPassword.setFont(new java.awt.Font("Calibri", 0, 18));
        ConfirmPassword.setForeground(new java.awt.Color(255, 90, 0));
        ConfirmPassword.setBackground(Color.white);
        ConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        
        PictureOfRestaurant.setForeground(new java.awt.Color(255, 90, 0));
        PictureOfRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureOfRestaurant.setFont(new java.awt.Font("Calibri", 0, 11));
        PictureOfRestaurant.setForeground(new java.awt.Color(255, 90, 0));
        PictureOfRestaurant.setBackground(Color.white);
        PictureOfRestaurant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        PictureOfRestaurant.setText(" Choose picture of resturant");
        
        pictureOfRestaurant.setBackground(new java.awt.Color(255, 90, 0));
        pictureOfRestaurant.setForeground(Color.white);
        pictureOfRestaurant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 0), 1, true));
        pictureOfRestaurant.setFont(new java.awt.Font("Calibri", 0, 15));
        pictureOfRestaurant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
        pictureOfRestaurant.addMouseListener(Picturemouse);
        Submit.addMouseListener(Submitmouse);
        SignIn.addMouseListener(SignInMouse);
        
    }
    
    public class PicturMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e)
        {
            if(e.getSource()==pictureOfRestaurant)
            {
                get_image_res();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) 
        {
            if(e.getSource()==pictureOfRestaurant)
            {
                pictureOfRestaurant.setForeground(new Color(255,90,0));
                pictureOfRestaurant.setBackground(Color.white);
                pictureOfRestaurant.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            if(e.getSource()==pictureOfRestaurant)
            {
                pictureOfRestaurant.setBackground(new Color(255,90,0));
                pictureOfRestaurant.setForeground(Color.white);
                pictureOfRestaurant.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
            
        }
        
    }
    
     public class SubmitMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            if(e.getSource()==switch_to_user)
            {
                Login_Coustomer o=new Login_Coustomer();
                dispose();
            }
            if (e.getSource()==Submit) 
            {
                String username=UserName.getText();
                String password=Password.getText();
                int pass=Password.getPassword().length;
                String confirmpassword=new String(ConfirmPassword.getPassword());
                int confirm=ConfirmPassword.getText().length();
                String resturant=ResturantName.getText();
                
                
                
                if (username.isEmpty()||password.isEmpty()||confirmpassword.isEmpty()||resturant.isEmpty()) 
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
                }
                else
                {
                    
                    //Data_Person data=new Data_Person();
                    checkResturant(resturant,username,password);
                    
            
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
        public void mouseEntered(MouseEvent e) 
        {
         
            if(e.getSource()==Submit)
            {
                Submit.setForeground(new Color(255,90,0));
                Submit.setBackground(Color.white);
                Submit.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
        }

        @Override
        public void mouseExited(MouseEvent e) 
        {
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
        public void mouseClicked(MouseEvent e) 
        {
            if (e.getSource()==SignIn) 
            {
                LogIn_Owner2 data=new LogIn_Owner2(); 
                dispose();
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
            if(e.getSource()==SignIn)
            {
                SignIn.setForeground(new Color(255,90,0));
                SignIn.setBackground(Color.white);
                SignIn.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
            
        }

        @Override
        public void mouseExited(MouseEvent e) 
        {
            
            if(e.getSource()==SignIn)
            {
                SignIn.setBackground(new Color(255,90,0));
                SignIn.setForeground(Color.white);
                SignIn.setBorder(new LineBorder(new Color(255,90,0),1,true));
            }
            
        }
         
     }
     
     public void checkResturant(String RetName,String UserName,String pass)
    {
        boolean flag=false;
        for (int i = 0; i <= createRestaurant.number_Restaurant; i++) {
            
            if (!(UserName.equals(Data.data.UserNameOwner[i]))&&!(RetName.equals(Data.data.RestaurantOwner[i]))) 
            {
               //JOptionPane.showConfirmDialog(null,"User name and Restaurant name already exist ","Error",JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
            else if (UserName.equals(Data.data.UserNameOwner[i])) 
            {
                JOptionPane.showConfirmDialog(null,"User name already exist","Error",JOptionPane.ERROR_MESSAGE);
                flag=false;
                break;
            }
            
            else if (RetName.equals(Data.data.RestaurantOwner[i])) 
            {
                JOptionPane.showConfirmDialog(null,"Restaurant name already exist","Error",JOptionPane.ERROR_MESSAGE);
                flag=false;
                break;
            }
           
        }
        
        if(flag==true)
        {
            
            JOptionPane.showConfirmDialog(null,"Successfully registered. ","Error",JOptionPane.ERROR_MESSAGE);
            saveData(UserName,pass,RetName);
               LogIn_Owner2 y=new LogIn_Owner2();
               dispose();
        }
        
          
    }
     
     public void saveData(String name,String pass,String resturantName)
     {
         createRestaurant.number_Restaurant++;
                    Data.data.numberOfOwners++;
         Data.data.UserNameOwner[Data.data.numberOfOwners]=name;
         Data.data.PasswordOwner[Data.data.numberOfOwners]=pass;
         Data.data.RestaurantOwner[Data.data.numberOfOwners]=resturantName;
         createRestaurant.restaurant[Data.data.numberOfOwners].name_Restautrant=resturantName;
         createRestaurant.restaurant[Data.data.numberOfOwners].res_img=ima;
         System.out.println(Data.data.numberOfOwners);
     }
     public void get_image_res()
    {
           // updated 23/3/2021

        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        File f=fc.getSelectedFile();
        String filename=f.getAbsolutePath();
        PictureOfRestaurant.setText(filename);
        String file=filename; // PageRestaurant.numOfRestaurant instead of 1
        
        ImageIcon myim=new ImageIcon(file); // PageRestaurant.numOfRestaurant instead of 1
        Image img=myim.getImage();
        
        
        
        // for pic of restaurant
        Image newim=img.getScaledInstance(450,220, Image.SCALE_SMOOTH);
        ima=new ImageIcon(newim);
        
        
        
        
        
        
    }
}

