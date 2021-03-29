/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import static talabat.clone.PageRestaurant.numberOfPage;

/**
 *
 * @author Owner
 */
public class NewClass {
    
    JFrame frame=new JFrame();
    JTextArea panel1;
    JLabel labels[],image_meal,name_meal,price_meal;
    JMenuBar menubar2;
    //mouse_Listener Mouse_Click;
    createRestaurant res=new createRestaurant();
    String s;
    
    public NewClass(int numberofRestaurant)
    {
        frame();
        panel();
        food_details(numberofRestaurant);
        frame.setVisible(true);
    }
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(430,750); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150);
    }
    
    public void panel()
    {
        panel1=new JTextArea(430,50);
        panel1.setEditable(false);
        JScrollPane sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        frame.add(sp);
    }
    
    public void food_details(int numberOfRestaurant)
    {
        labels=new JLabel[50];
        int h1=0,numOfFoods=0,h2=400,h3=400; //h1=370
        if(numberOfPage==1) numOfFoods= res.restaurant[numberOfRestaurant].numberOfMeals;
        else if(numberOfPage==2) numOfFoods=res.restaurant[numberOfRestaurant].numberOfDesserts;
        else if(numberOfPage==3) numOfFoods=res.restaurant[numberOfRestaurant].numberOfDrinks;
        
        for(int i=1; i<=numOfFoods; ++i)
            {
                labels[i]=new JLabel();
                if(i==1) labels[i].setBounds(0, h2, 450, 60);
                else labels[i].setBounds(0, h3, 450, 110);
                panel1.add(labels[i]);
                
                if(numberOfPage==1) s=res.restaurant[numberOfRestaurant].pictures_meals[i];
                else if(numberOfPage==2) s=res.restaurant[numberOfRestaurant].pictures_desserts[i];
                else if(numberOfPage==3) s=res.restaurant[numberOfRestaurant].pictures_drinks[i];
                //properties
                image_meal =new JLabel();
                image_meal.setIcon(new ImageIcon(jf.class.getResource(s)));
                image_meal.setBounds(260,(int) h1, 140, 110); //260 ,h1,140,110
                //border
                LineBorder line = new LineBorder(Color.white, 20, true);
                image_meal.setBorder(line);
                //add image
                panel1.add(image_meal);

                if(numberOfPage==1) name_meal =new JLabel(res.restaurant[numberOfRestaurant].meals[i]);
                else if(numberOfPage==2) name_meal =new JLabel(res.restaurant[numberOfRestaurant].desserts[i]); 
                if(numberOfPage==3) name_meal =new JLabel(res.restaurant[numberOfRestaurant].drinks[i]);

                name_meal.setBounds(15, (int)h1-10, 450, 60);
                name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal.setForeground(Color.BLACK);

                if(numberOfPage==1) price_meal =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[i]);
                else if(numberOfPage==2) price_meal =new JLabel("EGP "+res.restaurant[numberOfRestaurant].desserts_Price[i]); 
                else if(numberOfPage==3) price_meal =new JLabel("EGP "+res.restaurant[numberOfRestaurant].drinks_Price[i]); 
                
                price_meal.setBounds(15, (int)h1+30, 450, 60);
                price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal.setForeground(Color.BLACK);

                panel1.add(name_meal); panel1.add(price_meal);
                menubar2=new JMenuBar();
                menubar2.setBounds(0, (int)h1+110, 800, 10);
                menubar2.setBackground(Color.WHITE);
                menubar2.setLayout(null);

                panel1.add(menubar2);

                h1+=110+20;
                
                h2+=100;
                h3+=120;
                
                // Mouse listener
                //labels[i].addMouseListener(Mouse_Click);
                
            } 
    }
    
}
