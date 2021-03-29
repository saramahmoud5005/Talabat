/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.*; 
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener
import javax.swing.border.LineBorder;
import java.awt.Toolkit;


public class PageRestaurant extends Design_Pages{
    
    public static Color darkOrange=new Color(255,90,0);
    mouse_Listener Mouse_Click;
    // The main frame
    JFrame frame=new JFrame();
    JFrame Basket_frame=new JFrame();
    // Menu for the pages of meals , desserts or drinks
    JMenu meals,desserts,drinks;
    // white Lines sperate between the meals,dessserts and drinks
    JMenuBar menubar1,menubar2,menubar3,menubar4;
    JTextArea panel1,panel2;
    //
    JLabel mealsLabel,name_meal,price_meal,
            image,image_meal,image_circle,arrow,button1,nameOfRes,info,rates,delivery_info,delivery_image,within,rating,labels[],check_Basket
            ,basket_image,description_food;
    
    JScrollPane sp;
    // This string to save the source of images
    ImageIcon s;
    // this string to show the name of page
    static String type="Meals";
    //
    static int numberOfPage=1,numberOfOrderdMeals=0,numberOfOrderdDesserts=0,numberOfOrderdDrinks=0,numberOfOrders=0;
    static int numOfRestaurant;
    // This boolean to check if the user ordered something or not
    static boolean ordered=false;
    
    getOrder order=new getOrder();
    
    public PageRestaurant(int numberOfRestaurant)
    {
        numOfRestaurant=numberOfRestaurant;
        frame();
        seticon();
        panel(numberOfRestaurant,numberOfPage);
        
        Info_Restaurant(numberOfRestaurant);

        Mouse_Click=new mouse_Listener(numberOfRestaurant);

        Info_menu(numberOfRestaurant);

        food_details(numberOfRestaurant);

        circleBack(numberOfRestaurant);
        check_Basket();
        //frame.add(check_Basket, BorderLayout.PAGE_END);
        frame.setVisible(true);
       
    }
    
    @Override
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(450,780); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(740,130); //500,150
        //frame.setUndecorated(true);
        //frame.setShape(new RoundRectangle2D.Double(0,0, 600,750, 100,80));
    }
    
    public void Basket_frame()
    {
        // not imortant until now
        Basket_frame.setSize(405,100); //450,780
        Basket_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Basket_frame.setResizable(false);
        Basket_frame.setLocation(555,800);
        //frame.add(Basket_frame);
        //panel1.add(Basket_frame);
        Basket_frame.setUndecorated(true);
        
    }
    
    public void panel(int numberOfRestaurant,int numberOfPage)
    {
        int num=0;
        if(numberOfPage==1) num=createRestaurant.restaurant[numberOfRestaurant].num_meals_panel;
        else if(numberOfPage==2) num=createRestaurant.restaurant[numberOfRestaurant].num_desserts_panel;
        if(numberOfPage==3) num=createRestaurant.restaurant[numberOfRestaurant].num_drinks_panel;
        panel1=new JTextArea(38+num*num,50);
        panel1.setEditable(false);
        sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        //sp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frame.add(sp);
        
    }

    public void Info_Restaurant(int numberOfRestaurant)
    {
        // Add picture of the restaurant
        image =new JLabel();
        //if(numberOfRestaurant<=5) image.setIcon(new ImageIcon(PageRestaurant.class.getResource(createRestaurant.restaurant[numberOfRestaurant].picture_Restaurant)));
        //else
        image.setIcon(createRestaurant.restaurant[numberOfRestaurant].res_img);
        //Image newim=img.getScaledInstance(image.getWidth(),image.getHeight() , Image.SCALE_SMOOTH);
        image.setBounds(0,0,450,150);
        panel1.add(image);
        
         //name of the restaurant
        String name=createRestaurant.restaurant[numberOfRestaurant].name_Restautrant;
        nameOfRes=new JLabel(name);
        nameOfRes.setBounds(16, 100, 300, 145);
        nameOfRes.setFont(new Font("sansserif",Font.BOLD, 20));
        panel1.add(nameOfRes);
        
        //some info about the restaurant
        info =new JLabel(createRestaurant.restaurant[numberOfRestaurant].res_type); //"Grills, Sandwiches, Fast Food"
        info.setBounds(16, 125, 300, 145);
        info.setForeground(Color.decode("#999999"));
        info.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(info);
        
        
        //rates
        String rateS=createRestaurant.restaurant[numberOfRestaurant].rating_status;
        rating =new JLabel(rateS);
        rating.setBounds(16, 147, 200, 145);
        rating.setForeground(Color.black);
        rating.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(rating);
        
        int rate=createRestaurant.restaurant[numberOfRestaurant].rate_Restaurant;
        rates =new JLabel(" based on "+rate+" rating");
        if(rateS=="Very Good") rates.setBounds(85, 147, 200, 145);
        else rates.setBounds(50, 147, 300, 145);
        rates.setForeground(Color.decode("#999999"));
        rates.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(rates);
        
        
        //delivery
        delivery_image =new JLabel();
        delivery_image.setIcon(new ImageIcon(PageRestaurant.class.getResource("delivery.png")));
        delivery_image.setBounds(5, 150, 30, 190);
        panel1.add(delivery_image);
        
        within =new JLabel("Within ");
        within.setBounds(40, 160, 50, 180);
        within.setForeground(Color.BLACK);
        within.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(within);
        
        int delivery_timee=createRestaurant.restaurant[numberOfRestaurant].delivery_time;
        double delivery_costt=createRestaurant.restaurant[numberOfRestaurant].delivery_cost;        
        delivery_info =new JLabel(delivery_timee+" mins (EGP "+delivery_costt+" delivery)");
        delivery_info.setBounds(85, 160, 300, 180);
        delivery_info.setForeground(Color.decode("#999999")); // silver color
        delivery_info.setFont(new Font("sansserif",Font.BOLD, 13));
        panel1.add(delivery_info);
    }
    
    public void Info_menu(int numberOfRestaurant)
    {
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
        
        
        //addMouseListener(this);
        meals.addMouseListener(Mouse_Click);
        desserts.addMouseListener(Mouse_Click);
        drinks.addMouseListener(Mouse_Click);
        
        
    }
    
    public void food_details(int numberOfRestaurant)
    {
        labels=new JLabel[50];
        int h1=370,numOfFoods=0,h2=400,h3=400; //h1=370
        if(numberOfPage==1) numOfFoods= createRestaurant.restaurant[numberOfRestaurant].numberOfMeals;
        else if(numberOfPage==2) numOfFoods=createRestaurant.restaurant[numberOfRestaurant].numberOfDesserts;
        else if(numberOfPage==3) numOfFoods=createRestaurant.restaurant[numberOfRestaurant].numberOfDrinks;
        System.out.println(numOfFoods);
        for(int i=1; i<=numOfFoods; ++i)
            {
                if(createRestaurant.restaurant[numberOfRestaurant].exist_meals[i]==false&&numberOfPage==1) continue;
                
                else if(createRestaurant.restaurant[numberOfRestaurant].exist_desserts[i]==false&&numberOfPage==2) continue;
                
                else if(createRestaurant.restaurant[numberOfRestaurant].exist_drinks[i]==false&&numberOfPage==3) continue;
                
                     labels[i]=new JLabel();
                     if(i==1) labels[i].setBounds(0, h2, 450, 60);
                     else labels[i].setBounds(0, h3, 450, 110);
                     panel1.add(labels[i]);

                     if(numberOfPage==1) s=createRestaurant.restaurant[numberOfRestaurant].pictures_meals[i];
                     else if(numberOfPage==2) s=createRestaurant.restaurant[numberOfRestaurant].pictures_desserts[i];
                     else if(numberOfPage==3) s=createRestaurant.restaurant[numberOfRestaurant].pictures_drinks[i];
                     //edit_Image(s);
                     //if(s.length()>3)
                     //{
                        image_meal =new JLabel();
                        image_meal.setIcon(s);
                        image_meal.setBounds(290,(int) h1, 140, 110); //260 ,h1,140,110
                     
                     
                     //border
                     LineBorder line = new LineBorder(Color.white, 20, true);
                     image_meal.setBorder(line);
                     //add image
                     panel1.add(image_meal);
                     //}

                     if(numberOfPage==1) name_meal =new JLabel(createRestaurant.restaurant[numberOfRestaurant].meals[i]);
                     else if(numberOfPage==2) name_meal =new JLabel(createRestaurant.restaurant[numberOfRestaurant].desserts[i]); 
                     if(numberOfPage==3) name_meal =new JLabel(createRestaurant.restaurant[numberOfRestaurant].drinks[i]);

                     name_meal.setBounds(15, (int)h1-10, 450, 60);
                     name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                     name_meal.setForeground(Color.BLACK);
                     panel1.add(name_meal);
                     
                     if(numberOfPage==1) description_food =new JLabel(createRestaurant.restaurant[numberOfRestaurant].meals_description[i]);
                     else if(numberOfPage==2) description_food =new JLabel(createRestaurant.restaurant[numberOfRestaurant].desserts_description[i]); 
                     else if(numberOfPage==3) description_food =new JLabel(createRestaurant.restaurant[numberOfRestaurant].drinks_description[i]); 

                     description_food.setBounds(15, (int)h1+10, 450, 60);
                     description_food.setFont(new Font("sansserif",Font.BOLD, 12));
                     description_food.setForeground(Color.BLACK);
                     panel1.add(description_food); 
                     

                     if(numberOfPage==1) price_meal =new JLabel("EGP "+createRestaurant.restaurant[numberOfRestaurant].meals_Price[i]);
                     else if(numberOfPage==2) price_meal =new JLabel("EGP "+createRestaurant.restaurant[numberOfRestaurant].desserts_Price[i]); 
                     else if(numberOfPage==3) price_meal =new JLabel("EGP "+createRestaurant.restaurant[numberOfRestaurant].drinks_Price[i]); 

                     price_meal.setBounds(15, (int)h1+40, 450, 60); // h1+30
                     price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                     price_meal.setForeground(Color.BLACK);
                     panel1.add(price_meal); 

                     
                     menubar2=new JMenuBar();
                     menubar2.setBounds(0, (int)h1+110, 800, 10);
                     menubar2.setBackground(Color.WHITE);
                     menubar2.setLayout(null);

                     panel1.add(menubar2);

                     h1+=110+20;

                     h2+=100;
                     h3+=120;

                     // Mouse listener
                     labels[i].addMouseListener(Mouse_Click);
                     labels[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                     
            } 
    }
    
    public void circleBack(int numberOfRestaurant)
    {
        
        
        // Add picture of the restaurant
        image_circle =new JLabel();
        image_circle.setIcon(new ImageIcon(PageRestaurant.class.getResource("c2.jpg")));
        image_circle.setBounds(5,5,50,50);
        LineBorder c2 = new LineBorder(Color.white, 50, true);
        image_circle.setBorder(c2);
        image.add(image_circle);
        image_circle.addMouseListener(Mouse_Click);
        
        arrow=new JLabel("<");
        arrow.setBackground(Color.black);
        arrow.setFont(new Font("sansserif",Font.BOLD,30));
        arrow.setBounds(15,3,45,45);
        image_circle.add(arrow);
        arrow.addMouseListener(Mouse_Click);
        
        image_circle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
        
    }  
    
    public void check_Basket()
    {
        check_Basket=new JLabel("Check Basket");
        check_Basket.setBounds(280, 125, 200, 100); //250 125 200 100
        check_Basket.setForeground(Color.black);
        check_Basket.setFont(new Font("sansserif",Font.BOLD, 20));
        panel1.add(check_Basket);
        check_Basket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Mouse listener
        check_Basket.addMouseListener(Mouse_Click);
        
        
        basket_image=new JLabel();
        basket_image.setIcon(new ImageIcon(PageRestaurant.class.getResource("carraige5.jpg")));
        basket_image.setBounds(240, 123, 200, 100);
        panel1.add(basket_image);
        basket_image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Mouse listener
        basket_image.addMouseListener(Mouse_Click);
        
        
    }
    
    public void check_order(int number_res,int i)
    {
        boolean flag=false;
        int num=0;
        if(PageRestaurant.numberOfPage==1) num=order.numberOfOrder;
        else if(PageRestaurant.numberOfPage==2) num=order.numberOfOrder;
        else if(PageRestaurant.numberOfPage==3) num=order.numberOfOrder;
        
        for(int j=1; j<=num; ++j)
        {
            if(order.name_food[j]==createRestaurant.restaurant[number_res].meals[i]&&PageRestaurant.numberOfPage==1) flag=true;
            
            else if(order.name_food[j]==createRestaurant.restaurant[number_res].desserts[i]&&PageRestaurant.numberOfPage==2) flag=true;
            
            else if(order.name_food[j]==createRestaurant.restaurant[number_res].drinks[i]&&PageRestaurant.numberOfPage==3) flag=true;
            
        }
        if(flag==false)
        {
            if(PageRestaurant.numberOfPage==1)
            {
                order.numberOfOrder++;
                
                order.name_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].meals[i];
                order.price_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].meals_Price[i];
                order.all_food_price[order.numberOfOrder]=createRestaurant.restaurant[number_res].meals_Price[i];
                order.image_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].pictures_meals_small[i];
                order.type_food[order.numberOfOrder]="meal";
                
                order.number_food[order.numberOfOrder]=1;
                order.numberOfMeals++; 
                
                //createRestaurant.restaurant[number_res].quantity_ordered_meals[i]++;
                
                System.out.println(createRestaurant.restaurant[number_res].meals[i]);
                System.out.println(numberOfOrders); 
                System.out.println(order.number_food[order.numberOfOrder]);
                //System.out.println(order.numberOfMeals);
            }
            else if(PageRestaurant.numberOfPage==2)
            {
                order.numberOfOrder++;
                
                order.name_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].desserts[i];
                order.price_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].desserts_Price[i];
                order.all_food_price[order.numberOfOrder]=createRestaurant.restaurant[number_res].desserts_Price[i];
                order.image_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].pictures_desserts_small[i];
                order.type_food[order.numberOfOrder]="dessert";

                order.number_food[order.numberOfOrder]=1;
                order.numberOfDesserts++; 
                
                //createRestaurant.restaurant[number_res].quantity_ordered_desserts[i]++;
                
                System.out.println(createRestaurant.restaurant[number_res].desserts[i]);
                System.out.println(numberOfOrders); 
                System.out.println(order.name_food[order.numberOfOrder]);
            }
            else if(PageRestaurant.numberOfPage==3)
            {
                order.numberOfOrder++;
                
                order.name_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].drinks[i];
                order.price_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].drinks_Price[i];
                order.all_food_price[order.numberOfOrder]=createRestaurant.restaurant[number_res].drinks_Price[i];
                order.image_food[order.numberOfOrder]=createRestaurant.restaurant[number_res].pictures_drinks_small[i];
                order.type_food[order.numberOfOrder]="drink";

                order.number_food[order.numberOfOrder]=1;
                order.numberOfDrinks++;
                
                //createRestaurant.restaurant[number_res].quantity_ordered_drinks[i]++;
                
                System.out.println(createRestaurant.restaurant[number_res].drinks[i]);
                System.out.println(numberOfOrders); 
                System.out.println(order.number_food[order.numberOfOrder]);
            }
            
            numberOfOrders++;
            ordered=true;

        }
    }
    
    
    public static void update_then_clear_basket()
    {
        //createRestaurant.restaurant[numOfRestaurant].num_orders=getOrder.numberOfOrder;
        for(int i=1; i<=getOrder.numberOfOrder; ++i)
        {
            createRestaurant.restaurant[numOfRestaurant].num_order++;
            createRestaurant.restaurant[numOfRestaurant].name_food[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.name_food[i];
            createRestaurant.restaurant[numOfRestaurant].type_food[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.type_food[i];
            createRestaurant.restaurant[numOfRestaurant].price_food[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.price_food[i];
            createRestaurant.restaurant[numOfRestaurant].all_food_price[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.all_food_price[i];
            createRestaurant.restaurant[numOfRestaurant].image_food[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.image_food[i];
            createRestaurant.restaurant[numOfRestaurant].number_food[createRestaurant.restaurant[numOfRestaurant].num_order]=getOrder.number_food[i];
            
            
        }
        numberOfPage=1;
        numberOfOrderdMeals=0;
        numberOfOrderdDesserts=0;
        numberOfOrderdDrinks=0;
        numberOfOrders=0;
        ordered=false;
        getOrder obj=new getOrder(true);
        
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
  
            if(me.getSource()==image_circle||me.getSource()==arrow)
            {
                update_then_clear_basket();
                restaurants_page oo = new restaurants_page();
                frame.setVisible(false);

            }
            if(me.getSource()==check_Basket||me.getSource()==basket_image)
            {
                if(ordered==true)
                {
                   PageBasket object2=new PageBasket(number_res);
                   frame.setVisible(false); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Sorry, you should order something first");
                }
                
            }
     
            if(me.getSource()==meals)
            {
                type="Meals";
                System.out.println("meals_Clicked");
                PageRestaurant.numberOfPage=1;
                PageRestaurant object2=new PageRestaurant(number_res);
                frame.setVisible(false);
            }
            // if the user click desserts
            else if(me.getSource()==desserts)
            {
                type="Desserts";
                System.out.println("desserts_Clicked");
                PageRestaurant.numberOfPage=2;
                PageRestaurant object2=new PageRestaurant(number_res);
                frame.setVisible(false);
            }
            // if the user click drinks
            else if(me.getSource()==drinks)
            {
                type="Drinks";
                System.out.println("drinks_Clicked");
                PageRestaurant.numberOfPage=3;
                PageRestaurant object2=new PageRestaurant(number_res);
                frame.setVisible(false);
            }
            
            // if user click on any meal , dessert or drink
            int numOfFood=0;
            if(PageRestaurant.numberOfPage==1) numOfFood=createRestaurant.restaurant[number_res].numberOfMeals;
            else if(PageRestaurant.numberOfPage==2) numOfFood=createRestaurant.restaurant[number_res].numberOfDesserts;
            else if(PageRestaurant.numberOfPage==3) numOfFood=createRestaurant.restaurant[number_res].numberOfDrinks;
            
            for(int i=1; i<=numOfFood; ++i)
            {
                if(me.getSource()==labels[i])
                {
                    check_order(number_res,i);
                }
            }

        }
        @Override
        public void mousePressed(MouseEvent me) {}

        @Override
        public void mouseReleased(MouseEvent me) {}
        
        @Override
        public void mouseEntered(MouseEvent me)
        {
            if(me.getSource()==check_Basket)
            {
                check_Basket.setForeground(darkOrange);
            }
        }

        @Override
        public void mouseExited(MouseEvent me)
        {
           if(me.getSource()==check_Basket)
            {
                check_Basket.setForeground(Color.black);
            } 
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent mwe) {}

        @Override
        public void mouseDragged(MouseEvent me) {}

        @Override
        public void mouseMoved(MouseEvent me) {}

       
    }
    
    @Override
    public void seticon() {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }
    
}

