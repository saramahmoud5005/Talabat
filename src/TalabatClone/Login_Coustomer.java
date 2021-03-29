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

/**
 *
 * @author Aya
 */
public class Login_Coustomer extends Name_X{
    
    JButton SIGNIN=new JButton("SIGNIN");
    JButton Register=new JButton("Register");
    JButton Forget=new JButton("Forget Password");
    SignInMouseLesiner signMouse=new SignInMouseLesiner();
    RegisterMouse registerMouse=new RegisterMouse();
    ForgetMouse forgetMouse =new ForgetMouse();
    
    public static Color darkOrange=new Color(255,90,0);
    JLabel switch_to_owner=new JLabel("Switch to owner");
    
    public Login_Coustomer()
    {
        //////////////////////////////////////////////
        //updated 22/3/2021
        l1.setBounds(50, 350, 100, 25);
        
        UserName.setBounds(210, 350, 180, 25);
        
        l2.setBounds(50, 400, 100, 25);
        
        Password.setBounds(210, 400, 180, 25);
        
        switch_to_owner.setForeground(darkOrange);
        switch_to_owner.setBounds(165, 600, 150,100);
        switch_to_owner.setFont(new java.awt.Font("Calibri", 0, 17));
        switch_to_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(switch_to_owner);
        
        /////////////////////////////////////////////
        
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
        
        switch_to_owner.addMouseListener(signMouse);

       
    }
    

 public class SignInMouseLesiner implements MouseListener
      {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            if(e.getSource()==switch_to_owner)
            {
                LogIn_Owner2 o =new LogIn_Owner2();
                dispose();
            }
            if(e.getSource()==SIGNIN)
            {
                
                    String username=UserName.getText();
                    String password=(Password.getText());
                    int pass=Password.getPassword().length;
           
                if (username.isEmpty()||password.isEmpty())
                {
                    JOptionPane.showConfirmDialog(null,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
                }
                if (pass<6)
                {
                    JOptionPane.showConfirmDialog(null,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
                }

                else
                {
                        boolean flag=false;
                        for(int i=1; i<=Data.data.numberOfUsers; ++i)
                        {
                            if((username.equals(Data.data.user_name[i]))&&(password.equals(Data.data.user_password[i])))
                            {
                                flag=true;
                                System.out.println("correct data");
                                break;
                            }
                            System.out.println(Data.data.user_name[i]+"\n"+Data.data.user_password[i]);
                            System.out.println(username+"\n"+password);

                        }
                        if(flag==false)
                        {
                            JOptionPane.showConfirmDialog(null,"Incorrect data please try again","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else 
                        {
                             restaurants_page x=new restaurants_page();
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                    
                }


                SIGNIN.setForeground(darkOrange);
                SIGNIN.setBackground(Color.white);
                SIGNIN.setBorder(new LineBorder(darkOrange,1,true));
                
            }
            

            
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
            if(e.getSource()==switch_to_owner)
            {
                
            }
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
            Register x=new Register();
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
            //LogIn_Owner x=new LogIn_Owner();
            
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
}

        
    
    


