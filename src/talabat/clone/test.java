/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import java.awt.Color;
import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class test {
    
    JLabel details_Food[]=new JLabel[50];
    JLabel jl=new JLabel();
    JTextArea panel1=new JTextArea();
    JFrame frame=new JFrame();
    createRestaurant res=new createRestaurant();
    
    public test(int numberOfRestaurant, int numberOfPage)
    {
        frame();
        panel(numberOfRestaurant,numberOfPage);
            edit_Image(res.restaurant[2].picture_Restaurant);
                frame.setVisible(true);
                
    }
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(420,750); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150);
    }
    public void panel(int numberOfRestaurant,int numberOfPage)
    {
        int num=0;
        if(numberOfPage==1) num=res.restaurant[numberOfRestaurant].numberOfMeals;
        else if(numberOfPage==2) num=res.restaurant[numberOfRestaurant].numberOfDesserts;
        if(numberOfPage==3) num=res.restaurant[numberOfRestaurant].numberOfDrinks;
        panel1=new JTextArea(38+num*num,50);
        panel1.setEditable(false);
        JScrollPane sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        frame.add(sp);
    }
    public void edit_Image(String pic)
    {
        jl.setIcon((new ImageIcon((new ImageIcon(pic)).getImage().getScaledInstance(200,200,
    java.awt.Image.SCALE_SMOOTH))));
        jl.setBounds(100,80,300,300);
        panel1.add(jl);
        /*jl.setBounds(100,80,200,200);
       ImageIcon dabIcon = new ImageIcon(pic);
       Image dabImage = dabIcon.getImage();
       Image modifiedDabImage = dabImage.getScaledInstance(200, 200,java.awt.Image.SCALE_SMOOTH);
       dabIcon = new ImageIcon(modifiedDabImage);
       jl.setIcon(dabIcon);
       panel1.add(jl);*/
        /*panel1.add(new JLabel(new ImageIcon((new ImageIcon(pic)).getImage().getScaledInstance(200,200,
    java.awt.Image.SCALE_SMOOTH))));*/
        
      /*  ImageIcon ImageIcon = new ImageIcon(pic);
    Image Image = ImageIcon.getImage();
    frame.setIconImage(Image);*/
    }
    
    /*public void food_detailss()
    {

        int h1=50,numOfFoods=0,h2=0,h3=h1+50; //h1=370
        
        for(int i=0; i<getOrder.numberOfMeals; ++i)
            {
                label_m=new JLabel[50];
                label_num=new JLabel[50];
                label_a=new JLabel[50];
                
                label_m[i]=new JLabel("-");
                label_m[i].setBounds(200, h3, 200, 10);
                label_m[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 40));
                label_m[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_m[i]);
                
                String num=String.valueOf(getOrder.number_meals[i]);
                int plus=40-(num.length()-1)*5;
                label_num[i]=new JLabel(num);
                if(num.length()>=7)
                {
                    label_m[i].setBounds(170, h3, 200, 10);
                    
                    plus=-10;
                }
                label_num[i].setBounds(200+plus, h3, 250, 15);
                label_num[i].setFont(new Font("sansserif",Font.PLAIN, 15));
                label_num[i].setForeground(Color.BLACK);
                panel1.add(label_num[i]);
                
                label_a[i]=new JLabel("+");
                if(num.length()==10) label_a[i].setBounds(290, h3, 180, 15);
                label_a[i].setBounds(270, h3, 180, 15);
                label_a[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 25));
                label_a[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_a[i]);
                
                if(getOrder.meals_image[i]!=null)
                {
                    s=getOrder.meals_image[i];
                    //properties
                    image_meal =new JLabel();
                    image_meal.setIcon(new ImageIcon(jf.class.getResource(s)));
                    image_meal.setBounds(280,(int) h1, 140, 110); //260 ,h1,140,110
                    //border
                    LineBorder line = new LineBorder(Color.white, 30, true);
                    image_meal.setBorder(line);
                    //add image
                    panel1.add(image_meal);
                }

                name_meal =new JLabel(getOrder.meals[i]);

                name_meal.setBounds(15, (int)h1, 450, 60);
                name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal.setForeground(Color.BLACK);

                price_meal =new JLabel("EGP "+getOrder.meals_Price[i]); 
                
                price_meal.setBounds(15, (int)h1+30, 450, 60);
                price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal.setForeground(Color.BLACK);

                panel1.add(name_meal); panel1.add(price_meal);
                

                h1+=80;
                
                h2+=100;
                h3=h1+50;
                
                // Mouse listener
                label_m[i].addMouseListener(Mouse_Click);
                
            }
        
        for(int i=0; i<getOrder.numberOfDesserts; ++i)
            {
                label_m=new JLabel[50];
                label_num=new JLabel[50];
                label_a=new JLabel[50];
                
                label_m[i]=new JLabel("-");
                label_m[i].setBounds(200, h3, 200, 10);
                label_m[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 40));
                label_m[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_m[i]);
                
                String num=String.valueOf(getOrder.number_desserts[i]);
                int plus=40-(num.length()-1)*5;
                label_num[i]=new JLabel(num);
                if(num.length()>=7)
                {
                    label_m[i].setBounds(170, h3, 200, 10);
                    
                    plus=-10;
                }
                label_num[i].setBounds(200+plus, h3, 250, 15);
                label_num[i].setFont(new Font("sansserif",Font.PLAIN, 15));
                label_num[i].setForeground(Color.BLACK);
                panel1.add(label_num[i]);
                
                label_a[i]=new JLabel("+");
                if(num.length()==10) label_a[i].setBounds(290, h3, 180, 15);
                label_a[i].setBounds(270, h3, 180, 15);
                label_a[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 25));
                label_a[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_a[i]);
                
                if(getOrder.desserts_image[i]!=null)
                {
                    s=getOrder.desserts_image[i];
                    //properties
                    image_meal =new JLabel();
                    image_meal.setIcon(new ImageIcon(jf.class.getResource(s)));
                    image_meal.setBounds(280,(int) h1, 140, 110); //260 ,h1,140,110
                    //border
                    LineBorder line = new LineBorder(Color.white, 30, true);
                    image_meal.setBorder(line);
                    //add image
                    panel1.add(image_meal);
                }

                name_meal =new JLabel(getOrder.desserts[i]);

                name_meal.setBounds(15, (int)h1, 450, 60);
                name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal.setForeground(Color.BLACK);

                price_meal =new JLabel("EGP "+getOrder.desserts_Price[i]); 
                
                price_meal.setBounds(15, (int)h1+30, 450, 60);
                price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal.setForeground(Color.BLACK);

                panel1.add(name_meal); panel1.add(price_meal);
                
                
                h1+=80;
                
                h2+=100;
                h3=h1+50;
                
                // Mouse listener
                label_m[i].addMouseListener(Mouse_Click);
                
            }
        
        for(int i=0; i<getOrder.numberOfDrinks; ++i)
            {
                label_m=new JLabel[50];
                label_num=new JLabel[50];
                label_a=new JLabel[50];
                
                label_m[i]=new JLabel("-");
                label_m[i].setBounds(200, h3, 200, 10);
                label_m[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 40));
                label_m[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_m[i]);
                
                String num=String.valueOf(getOrder.number_drinks[i]);
                int plus=40-(num.length()-1)*5;
                label_num[i]=new JLabel(num);
                if(num.length()>=7)
                {
                    label_m[i].setBounds(170, h3, 200, 10);
                    
                    plus=-10;
                }
                label_num[i].setBounds(200+plus, h3, 250, 15);
                label_num[i].setFont(new Font("sansserif",Font.PLAIN, 15));
                label_num[i].setForeground(Color.BLACK);
                panel1.add(label_num[i]);
                
                label_a[i]=new JLabel("+");
                if(num.length()==10) label_a[i].setBounds(290, h3, 180, 15);
                label_a[i].setBounds(270, h3, 180, 15);
                label_a[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 25));
                label_a[i].setForeground(PageRestaurant.darkOrange);
                panel1.add(label_a[i]);
                
                if(getOrder.drinks_image[i]!=null)
                {
                    s=getOrder.drinks_image[i];
                    //properties
                    image_meal =new JLabel();
                    image_meal.setIcon(new ImageIcon(jf.class.getResource(s)));
                    image_meal.setBounds(280,(int) h1, 140, 110); //260 ,h1,140,110
                    //border
                    LineBorder line = new LineBorder(Color.white, 30, true);
                    image_meal.setBorder(line);
                    //add image
                    panel1.add(image_meal);
                }

                name_meal =new JLabel(getOrder.drinks[i]);

                name_meal.setBounds(15, (int)h1, 450, 60);
                name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal.setForeground(Color.BLACK);

                price_meal =new JLabel("EGP "+getOrder.drinks_Price[i]); 
                
                price_meal.setBounds(15, (int)h1+30, 450, 60);
                price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal.setForeground(Color.BLACK);

                panel1.add(name_meal); panel1.add(price_meal);
                
     
                h1+=80;
                
                h2+=100;
                h3=h1+50;
                
                // Mouse listener
                label_m[i].addMouseListener(Mouse_Click);
                
            }*/
                
}
