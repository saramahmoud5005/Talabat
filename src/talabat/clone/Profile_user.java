/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class Profile_user {
    
    JFrame frame=new JFrame();
    JTextArea panel1;
    
    public Profile_user(int num_phone)
    {
        
    }
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(450,780); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150); //500,150
    }

    
    public void panel(int numberOfRestaurant,int numberOfPage)
    {
        int num=0;
        if(numberOfPage==1) num=createRestaurant.restaurant[numberOfRestaurant].num_meals_panel;
        else if(numberOfPage==2) num=createRestaurant.restaurant[numberOfRestaurant].num_desserts_panel;
        if(numberOfPage==3) num=createRestaurant.restaurant[numberOfRestaurant].num_drinks_panel;
        panel1=new JTextArea(38+num*num,50);
        panel1.setEditable(false);
        
        
    }
    
}
