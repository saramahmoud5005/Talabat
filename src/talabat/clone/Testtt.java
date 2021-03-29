
package talabat.clone;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener
import javax.swing.border.LineBorder;

public class Testtt {
    
    private Color darkOrange=new Color(255,51,0);
    mouse_Listener Mouse_Click;
    public double price=0;
    createRestaurant res=new createRestaurant();
    JFrame frame=new JFrame();
    JMenu meals,desserts,drinks;
    JMenuBar menubar1,menubar2,menubar3,menubar4;
    JTextArea panel1;
    JPanel details_Food[]=new JPanel[50];
    JLabel mealsLabel,name_meal[],price_meal[],
            image,image_meal[],button1,nameOfRes,info,rates,delivery_info,delivery_image,within,rating,labels[];
    Graphics circle;
    String s;
    static String type="Meals";
    static int numberOfPage=1,numberOfOrderdMeals=0,numberOfOrderdDesserts=0,numberOfOrderdDrinks=0;
    
    //get object from class getOrder
        getOrder order=new getOrder();
    
    public Testtt(int numberOfRestaurant)
    {
        
        
        frame.setTitle("Talabat Clone");
        frame.setSize(430,750); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150);
        
        Mouse_Click=new mouse_Listener(numberOfRestaurant);

        panel1=new JTextArea(300,100);
        panel1.setEditable(false);
        JScrollPane sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        frame.add(sp);
        //addMouseListener(this);
        
        
        // Add picture of the restaurant
        image =new JLabel();
        image.setIcon(new ImageIcon(jf.class.getResource(res.restaurant[numberOfRestaurant].picture_Restaurant)));
        image.setBounds(0,0,450,150);
        //LineBorder line1 = new LineBorder(Color.white, 1, true);
        //    image.setBorder(line1);
        panel1.add(image);
        
        
        //name of the restaurant
        String name=res.restaurant[numberOfRestaurant].name_Restautrant;
        nameOfRes=new JLabel(name);
        nameOfRes.setBounds(16, 100, 300, 145);
        nameOfRes.setFont(new Font("sansserif",Font.BOLD, 20));
        panel1.add(nameOfRes);
        
        //some info about the restaurant
        info =new JLabel("Grills, Sandwiches, Fast Food");
        info.setBounds(16, 125, 300, 145);
        info.setForeground(Color.decode("#999999"));
        info.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(info);
        
        
        //rates
        String rateS=res.restaurant[numberOfRestaurant].rating_status;
        rating =new JLabel(rateS);
        rating.setBounds(16, 147, 200, 145);
        rating.setForeground(Color.black);
        rating.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(rating);
        
        int rate=res.restaurant[numberOfRestaurant].rate_Restaurant;
        rates =new JLabel(" based on "+rate+" rating");
        if(rateS=="Very Good") rates.setBounds(85, 147, 200, 145);
        else rates.setBounds(50, 147, 300, 145);
        rates.setForeground(Color.decode("#999999"));
        rates.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(rates);
        
        
        //delivery
        delivery_image =new JLabel();
        delivery_image.setIcon(new ImageIcon(jf.class.getResource("delivery.png")));
        delivery_image.setBounds(5, 150, 30, 190);
        panel1.add(delivery_image);
        
        within =new JLabel("Within ");
        within.setBounds(40, 160, 50, 180);
        within.setForeground(Color.BLACK);
        within.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(within);
        
        int delivery_timee=res.restaurant[numberOfRestaurant].delivery_time;
        double delivery_costt=res.restaurant[numberOfRestaurant].delivery_cost;        
        delivery_info =new JLabel(delivery_timee+" mins (EGP "+delivery_costt+" delivery)");
        delivery_info.setBounds(85, 160, 300, 180);
        delivery_info.setForeground(Color.decode("#999999"));
        delivery_info.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(delivery_info);
        
        
        // choose menu
        menubar1=new JMenuBar();
        menubar1.setBounds(0, 250, 800, 60);
        menubar1.setBackground(Color.white);
        menubar1.setLayout(null);
        
        meals=new JMenu("          Meals      ");
        meals.setFont(new Font("sansserif",Font.BOLD, 15));
        meals.setBounds(10, 20, 130, 40);
        meals.setForeground(Color.BLACK);
        
        desserts=new JMenu("         Desserts");
        desserts.setFont(new Font("sansserif",Font.BOLD, 15));
        desserts.setBounds(140, 20, 150, 40);
        desserts.setForeground(Color.BLACK);
        
        drinks=new JMenu("         Drinks");
        drinks.setFont(new Font("sansserif",Font.BOLD, 15));
        drinks.setBounds(280, 20, 150, 40);
        drinks.setForeground(Color.BLACK);
        
        menubar1.add(meals);
        menubar1.add(desserts);
        menubar1.add(drinks);
        panel1.add(menubar1);
        
        
        // First Menubar
        mealsLabel =new JLabel(type);
        mealsLabel.setBounds(20, 330, 100, 30);
        mealsLabel.setFont(new Font("sansserif",Font.BOLD, 20));
        mealsLabel.setForeground(Color.BLACK);
        
        panel1.add(mealsLabel);
        
        meals.addMouseListener(Mouse_Click);
        desserts.addMouseListener(Mouse_Click);
        drinks.addMouseListener(Mouse_Click);
        
        labels=new JLabel[50];
        
        image_meal =new JLabel[50];
        name_meal =new JLabel[50];
        price_meal =new JLabel[50];
        
        // set all the food
        food_details(numberOfRestaurant);
     
        
        ////////////////////////////////////////////////////////////////////////////////////
        

        // Draw Circle
        /*Testing o=new Testing();
        image.setLayout(null);
        image.add(o);*/

        button1=new JLabel("Back");
        button1.setForeground(Color.white);
        //button1.setBackground(darkOrange);
        button1.setBackground(new Color(0, 0, 0, 0));
        button1.setBounds(15, 5,50 , 50);
        button1.setFont(new Font("sansserif",Font.BOLD, 20));
        image.add(button1);
        
        //frame.setLayout(null);
        frame.setVisible(true);
        

    }
    
    
    public void food_details(int numberOfRestaurant)
    {
        
        int h1=370,numOfFoods=0,h2=400,h3=400;
        if(numberOfPage==1) numOfFoods= res.restaurant[numberOfRestaurant].numberOfMeals;
        else if(numberOfPage==2) numOfFoods=res.restaurant[numberOfRestaurant].numberOfDesserts;
        else if(numberOfPage==3) numOfFoods=res.restaurant[numberOfRestaurant].numberOfDrinks;
        for(int i=1; i<=numOfFoods; ++i)
            {
                labels[i]=new JLabel();
                if(i==1) labels[i].setBounds(0, h2, 450, 60);
                else labels[i].setBounds(0, h3, 450, 110);
                panel1.add(labels[i]);
                
                image_meal[i] =new JLabel();
                /*if(numberOfPage==1) s=res.restaurant[numberOfRestaurant].pictures_meals[i];
                else if(numberOfPage==2) s=res.restaurant[numberOfRestaurant].pictures_desserts[i];
                else if(numberOfPage==3) s=res.restaurant[numberOfRestaurant].pictures_drinks[i];*/
                //properties
                image_meal[i].setIcon(new ImageIcon(jf.class.getResource(s)));
                image_meal[i].setBounds(260,(int) h1, 140, 110);
                //border
                LineBorder line = new LineBorder(Color.white, 10, true);
                image_meal[i].setBorder(line);
                //add image
                panel1.add(image_meal[i]);

                if(numberOfPage==1) name_meal[i] =new JLabel(res.restaurant[numberOfRestaurant].meals[i]);
                else if(numberOfPage==2) name_meal[i] =new JLabel(res.restaurant[numberOfRestaurant].desserts[i]); 
                if(numberOfPage==3) name_meal[i] =new JLabel(res.restaurant[numberOfRestaurant].drinks[i]);

                name_meal[i].setBounds(15, (int)h1-10, 450, 60);
                name_meal[i].setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal[i].setForeground(Color.BLACK);

                if(numberOfPage==1) price_meal[i] =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[i]);
                else if(numberOfPage==2) price_meal[i] =new JLabel("EGP "+res.restaurant[numberOfRestaurant].desserts_Price[i]); 
                else if(numberOfPage==3) price_meal[i] =new JLabel("EGP "+res.restaurant[numberOfRestaurant].drinks_Price[i]); 
                
                price_meal[i].setBounds(15, (int)h1+30, 450, 60);
                price_meal[i].setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal[i].setForeground(Color.BLACK);

                panel1.add(name_meal[i]); panel1.add(price_meal[i]);
                menubar2=new JMenuBar();
                menubar2.setBounds(0, (int)h1+110, 800, 10);
                menubar2.setBackground(Color.black);
                menubar2.setLayout(null);

                panel1.add(menubar2);

                h1+=110+20;
                
                h2+=100;
                h3+=120;
                
                // Mouse listener
                labels[i].addMouseListener(Mouse_Click);
                name_meal[i].addMouseListener(Mouse_Click);
                price_meal[i].addMouseListener(Mouse_Click);
                image_meal[i].addMouseListener(Mouse_Click);
            } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        int number_res;

        public mouse_Listener(int numberOfRestaurant)
        {
            number_res=numberOfRestaurant;
        }

        @Override
        public void mouseClicked(MouseEvent me) {
  
            
            /*if(me.getSource()==Add1)
            {
                System.out.println("Add1_Clicked");
            }
            else if(me.getSource()==Add2)
            {
                System.out.println("Add2_Clicked");
            }
            else if(me.getSource()==Add3)
            {
                System.out.println("Add3_Clicked");
            }
            else if(me.getSource()==Add4)
            {
                System.out.println("Add4_Clicked");
            }*/
            // if the user click meals
            if(me.getSource()==meals)
            {
                type="Meals";
                System.out.println("meals_Clicked");
                Testtt.numberOfPage=1;
                Testtt g=new Testtt(number_res);
                frame.setVisible(false);
            }
            // if the user click desserts
            else if(me.getSource()==desserts)
            {
                type="Desserts";
                System.out.println("desserts_Clicked");
                Testtt.numberOfPage=2;
                Testtt g=new Testtt(number_res);
                frame.setVisible(false);
            }
            // if the user click drinks
            else if(me.getSource()==drinks)
            {
                type="Drinks";
                System.out.println("drinks_Clicked");
                Testtt.numberOfPage=3;
                Testtt g=new Testtt(number_res);
                frame.setVisible(false);
            }
            //checkkkkkkkkkkkk
            /*else if((me.getSource()==image_meal||me.getSource()==name_meal||me.getSource()==price_meal)&&numberOfPage==1)
            {
                numberOfOrderdMeals++;
                order.meals[numberOfOrderdMeals]=res.restaurant[number_res].meals[numberOfOrderdMeals];
                order.meals_Price[numberOfOrderdMeals]=res.restaurant[number_res].meals_Price[numberOfOrderdMeals];
                System.out.println(res.restaurant[number_res].meals[numberOfOrderdMeals]);
            }*/
            for(int i=1; i<=res.restaurant[number_res].numberOfMeals; ++i)
            {
                if(me.getSource()==labels[i])
                {
                    System.out.println(res.restaurant[number_res].meals[i]);
                }
                if(me.getSource()==name_meal[i])
                {
                    System.out.println(res.restaurant[number_res].meals[i]);
                }
                else if(me.getSource()==image_meal[i])
                {
                   System.out.println(res.restaurant[number_res].meals[i]);
                }
                else if(me.getSource()==res.restaurant[number_res].pictures_meals[i])
                {
                   System.out.println(res.restaurant[number_res].meals[i]); 
                }
            }

        }
        @Override
        public void mousePressed(MouseEvent me) {}

        @Override
        public void mouseReleased(MouseEvent me) {}
        
        @Override
        public void mouseEntered(MouseEvent me) {}

        @Override
        public void mouseExited(MouseEvent me) {}

        @Override
        public void mouseWheelMoved(MouseWheelEvent mwe) {}

        @Override
        public void mouseDragged(MouseEvent me) {}

        @Override
        public void mouseMoved(MouseEvent me) {}

       

       
        
    }
}

