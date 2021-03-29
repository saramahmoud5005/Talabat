/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import static talabat.clone.Login_Coustomer.darkOrange;

/**
 *
 * @author Aya
 */
public class LogIn_Owner2 extends Name_X{
    
     JLabel l6 =new JLabel (" Restaurant Name: ");
    JTextField  RestaurantName=new JTextField();
    JButton SIGNIN=new JButton("SIGNIN");
    JButton Register=new JButton("Register");
    JButton Forget=new JButton("Forget Password");
    SignInMouseLesiner signMouse=new SignInMouseLesiner();
    RegisterMouse registerMouse=new RegisterMouse();
    ForgetMouse forgetMouse =new ForgetMouse();
    //Name_X y=new Name_X();
    
    public static Color darkOrange=new Color(255,90,0);
    JLabel switch_to_user=new JLabel("Switch to user");
    
    public LogIn_Owner2()
    {
        
        ////////////////////////////
        //updated 23/3/2021
        switch_to_user.setForeground(darkOrange);
        switch_to_user.setBounds(165, 600, 150,100);
        switch_to_user.setFont(new java.awt.Font("Calibri", 0, 17));
        switch_to_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(switch_to_user);
        switch_to_user.addMouseListener(signMouse);
        
        
        
        ///////////////////////////////
        
        l6.setBounds(20, 400, 180, 25);
        background.add(l6);
        RestaurantName.setBounds(210, 400, 180, 25);
        background.add(RestaurantName);
        
        l6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l6.setForeground(darkOrange);
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBackground(Color.white);
        //l6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        
        RestaurantName.setForeground(darkOrange);
        RestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestaurantName.setFont(new java.awt.Font("Calibri", 0, 18));
        RestaurantName.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        
        SIGNIN.setBounds(50, 515, 140, 32);
        background.add(SIGNIN);
        Register.setBounds(250, 515, 140, 32);
        background.add(Register);
        Forget.setBounds(100, 580, 245, 32);
        background.add(Forget);
        
        
        SIGNIN.setBackground(darkOrange);
        SIGNIN.setForeground(Color.white);
        SIGNIN.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        SIGNIN.setFont(new java.awt.Font("Calibri", 0, 18));
        SIGNIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNIN.addMouseListener(signMouse);
        SIGNIN.setFocusable(false);
        
        Register.setBackground(darkOrange);
        Register.setForeground(Color.white);
        Register.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Register.setFont(new java.awt.Font("Calibri", 0, 18));
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(registerMouse);
        Register.setFocusable(false);
        
        Forget.setBackground(darkOrange);
        Forget.setForeground(Color.white);
        Forget.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        Forget.setFont(new java.awt.Font("Calibri", 0, 18));
        Forget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forget.addMouseListener(forgetMouse);
        Forget.setFocusable(false);
        
    }
    public class SignInMouseLesiner implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==switch_to_user)
            {
                Login_Coustomer o=new Login_Coustomer();
                dispose();
            }
            if(e.getSource()==SIGNIN)
            {
        
                String username=UserName.getText();
        
                String password=Password.getText();
                int pass=Password.getPassword().length;
                String ResName=RestaurantName.getText();
               // ExistResturant(ResName,password,username);
                if (username.isEmpty()||password.isEmpty()||ResName.isEmpty()) 
                {
                    JOptionPane.showConfirmDialog(null,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if (pass<6) 
                {
                    JOptionPane.showConfirmDialog(null,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
                }else if (!Pattern.matches("[a-zA-Z]+", username))
                {
                     JOptionPane.showConfirmDialog(null,"Tha name is Invalid","Error",JOptionPane.ERROR_MESSAGE);
                     UserName.setText("");
                }
                else 
                {
                    //Data_Person data=new Data_Person();
                    checkResturant(ResName,password,username);
                }

                    SIGNIN.setForeground(darkOrange);
                    SIGNIN.setBackground(Color.white);
                    SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
                }
                    //LogIn_Owner2 x=new LogIn_Owner2();
                    //dispose();
                }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(darkOrange);
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(darkOrange);
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(darkOrange);
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setBackground(darkOrange);
            SIGNIN.setForeground(Color.white);
            SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
          
      }
     
      public class RegisterMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(darkOrange);
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(darkOrange,1,true));
        }
            RegisterOwner reg=new RegisterOwner();
            dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(darkOrange);
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(darkOrange,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(darkOrange);
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(darkOrange,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(darkOrange);
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setBackground(darkOrange);
            Register.setForeground(Color.white);
            Register.setBorder(new LineBorder(darkOrange,1,true));
        }
        }
        
      }
      
       public class ForgetMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(darkOrange);
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(darkOrange,1,true));
            ForgetPassword2 x=new ForgetPassword2();
            dispose();
        }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(darkOrange);
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(darkOrange,1,true));
            }   
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(darkOrange);
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(darkOrange,1,true));
            }
          
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(darkOrange);
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(darkOrange,1,true));
            }
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            if(e.getSource()==Forget)
            {
            Forget.setBackground(darkOrange);
            Forget.setForeground(Color.white);
            Forget.setBorder(new LineBorder(darkOrange,1,true));
            }
        }
    }
       
      public void checkResturant(String RetName,String pass,String UserName)
    {
        boolean flag=false;
        for (int i = 1; i <= createRestaurant.number_Restaurant; i++) {
            
            if (UserName.equals(Data.data.UserNameOwner[i])&&pass.equals(Data.data.PasswordOwner[i])&&RetName.equals(Data.data.RestaurantOwner[i])) 
            {
                flag=true;
              owner x=new owner(1,i);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             dispose();
            }
            
        }
        if(flag==false)
            JOptionPane.showConfirmDialog(null,"Incorrect data please try again","Error",JOptionPane.ERROR_MESSAGE);
    }
}


        
    
    


