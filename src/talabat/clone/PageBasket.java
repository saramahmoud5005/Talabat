package talabat.clone;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener
import javax.swing.border.LineBorder;


public class PageBasket {
    
    JFrame frame=new JFrame();
    JTextArea panel1;
    JLabel word,label_m[],label_a[],label_num[],back2,name_meal,price_meal,image_meal,basket_image,image_circle,arrow;
    JButton checkout,back1;
    mouse_Listener Mouse_Click;
    ImageIcon s;
    int h1=50, h2=0, h3=h1+50;
    getOrder order = new getOrder();
    public static Color darkOrange=new Color(255,90,0);
   
    public PageBasket(int numberOfRestaurant) {
        
        //panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        Mouse_Click=new mouse_Listener();
        frame();
        seticon();
        panel(numberOfRestaurant);
        word_Basket();
        circleBack(numberOfRestaurant);
        food_details(numberOfRestaurant, order.image_food, order.all_food_price, order.name_food, order.number_food,order.numberOfOrder);
        
        checkout();
      
        //frame.add(checkout, BorderLayout.PAGE_END);
        frame.setVisible(true);
        
    }
    
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(450,780); //450,780 //430,750
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150);
    }
    
    public void panel(int numberOfRestaurant)
    {
        int num=0;
        num=order.numberOfOrder;
        panel1=new JTextArea(38+num*num,50);
        panel1.setEditable(false);
        JScrollPane sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        frame.add(sp);
    }
    
    public void word_Basket()
    {
        word=new JLabel("Basket");
        word.setBounds(175, 20, 200, 20);
        word.setFont(new Font("sansserif",Font.BOLD, 23));
        word.setForeground(Color.BLACK);
        panel1.add(word);
        
    }
    
    public void circleBack(int numberOfRestaurant)
    {
        
        back2=new JLabel();
        back2.setIcon(new ImageIcon(PageBasket.class.getResource("arrow_shape.png")));
        back2.setBounds(15,8,50,50);
        LineBorder c1 = new LineBorder(Color.white, 10, true);
        back2.setBorder(c1);
        panel1.add(back2);
        back2.addMouseListener(Mouse_Click);
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
    }
    
    public void food_details(int numberOfRestaurant, ImageIcon image[], double price[], String name[], int number_for_each_food[],int num_of_food)
    {
        label_m=new JLabel[50];
        label_num=new JLabel[50];
        label_a=new JLabel[50];
        for(int i=1; i<=num_of_food; ++i)
            {
                
                label_m[i]=new JLabel("-");
                label_m[i].setBounds(220, h3, 20, 10); //200 h3 20 10
                label_m[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 40));
                label_m[i].setForeground(PageRestaurant.darkOrange);
                label_m[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panel1.add(label_m[i]);
                
                String num=String.valueOf(number_for_each_food[i]);
                int plus=40-(num.length()-1)*5;
                label_num[i]=new JLabel(num);
                if(num.length()>=7)
                {
                    label_m[i].setBounds(190, h3, 20, 10); //170 h3 20 10
                    
                    plus=-10;
                }
                label_num[i].setBounds(220+plus, h3, 30, 15); // 200+plus h3 20 15
                label_num[i].setFont(new Font("sansserif",Font.PLAIN, 15));
                label_num[i].setForeground(Color.BLACK);
                panel1.add(label_num[i]);
                
                label_a[i]=new JLabel("+");
                if(num.length()==10) label_a[i].setBounds(320, h3, 20, 15); // 290 h3 20 15
                label_a[i].setBounds(290, h3, 20, 15); // 270 h3 20 15
                label_a[i].setFont(new Font("sansserif",Font.ROMAN_BASELINE, 25));
                label_a[i].setForeground(PageRestaurant.darkOrange);
                label_a[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panel1.add(label_a[i]);
                
                
                if(image[i]!=null)
                {
                    s=image[i];
                    //properties
                    image_meal =new JLabel();
                    //image_meal.add(image[i]);
                    image_meal.setIcon(s);
                    image_meal.setBounds(310,(int) h1, 140, 110); //280 ,h1,140,110
                    //border
                    LineBorder line = new LineBorder(Color.white, 30, true);
                    image_meal.setBorder(line);
                    //add image
                    panel1.add(image_meal);
                }

                name_meal =new JLabel(name[i]);

                name_meal.setBounds(15, (int)h1, 450, 60);
                name_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                name_meal.setForeground(Color.BLACK);

                price_meal =new JLabel("EGP "+price[i]); 
                
                price_meal.setBounds(15, (int)h1+30, 450, 60);
                price_meal.setFont(new Font("sansserif",Font.BOLD, 15));
                price_meal.setForeground(Color.BLACK);

                panel1.add(name_meal); panel1.add(price_meal);
                

                h1+=80;
                
                h2+=100;
                h3=h1+50;
                
                // Mouse listener
                label_m[i].addMouseListener(Mouse_Click);
                label_a[i].addMouseListener(Mouse_Click);
                 
            }
    }
    
    public void checkout()
    {
        // Button back
        back1 =new JButton("Add items");
        //checkout.setAutoscrolls(false);
        back1.setBounds(40,h1+100, 160, 50); //260 ,h1,140,110
        back1.setBackground(Color.WHITE);
        back1.setForeground(PageRestaurant.darkOrange);
        panel1.add(back1);
        back1.addMouseListener(Mouse_Click);
        back1.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
        back1.setFocusable(false);
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        checkout =new JButton("Checkout");
        //checkout.setAutoscrolls(false);
        checkout.setBounds(220,h1+100, 160, 50); //260 ,h1,140,110
        checkout.setBackground(PageRestaurant.darkOrange);
        checkout.setForeground(Color.white);
        panel1.add(checkout);
        checkout.addMouseListener(Mouse_Click);
        checkout.setFocusable(false);
        checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
    }
    
    public static void update_data()
    {
        System.out.println("num of order "+getOrder.numberOfOrder);
        System.out.println("num of restaurant "+PageRestaurant.numOfRestaurant);
        for(int i=1; i<=getOrder.numberOfOrder; ++i)
        {
            for(int j=1; j<=createRestaurant.restaurant[PageRestaurant.numOfRestaurant].numberOfMeals; ++j)
            {
                if(createRestaurant.restaurant[PageRestaurant.numOfRestaurant].pictures_meals_small[j]==(getOrder.image_food[i]))
                {
                    createRestaurant.restaurant[PageRestaurant.numOfRestaurant].quantity_ordered_meals[j]+=getOrder.number_food[i];
                    //System.out.println(createRestaurant.restaurant[PageRestaurant.numOfRestaurant].quantity_ordered_meals[j]);
                }
            }
            for(int j=1; j<=createRestaurant.restaurant[PageRestaurant.numOfRestaurant].numberOfDesserts; ++j)
            {
                if(createRestaurant.restaurant[PageRestaurant.numOfRestaurant].pictures_desserts_small[j]==(getOrder.image_food[i]))
                {
                    createRestaurant.restaurant[PageRestaurant.numOfRestaurant].quantity_ordered_desserts[j]+=getOrder.number_food[i];
                }
            }
            for(int j=1; j<=createRestaurant.restaurant[PageRestaurant.numOfRestaurant].numberOfDrinks; ++j)
            {
                if(createRestaurant.restaurant[PageRestaurant.numOfRestaurant].pictures_drinks_small[j]==(getOrder.image_food[i]))
                {
                    createRestaurant.restaurant[PageRestaurant.numOfRestaurant].quantity_ordered_drinks[j]+=getOrder.number_food[i];
                }
            }
        }
    }
            
    public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        
        @Override
        public void mouseClicked(MouseEvent me)
        {
  
            if(me.getSource()==back2||me.getSource()==back1)
            {    
                
                //createRestaurant.restaurant[1].exist_meals[1]=false;
                //createRestaurant.for_panel();
                //createRestaurant.num_each_type_food();
                //createRestaurant.print_data();
                PageRestaurant obj=new PageRestaurant(PageRestaurant.numOfRestaurant);
                frame.setVisible(false);
            }
            if(me.getSource()==checkout)
            {
                // obj from 
                //PaymentDetales pd=new PaymentDetales();
                paymentDetails pd=new paymentDetails();
                //Sales sa=new Sales();
                frame.setVisible(false);
                
            }
            for(int i=1; i<=order.numberOfOrder; ++i)
            {
                if(me.getSource()==label_a[i])
                {
                    order.number_food[i]++;
                    order.all_food_price[i]+=order.price_food[i];
                    
                    PageBasket o=new PageBasket(PageRestaurant.numOfRestaurant);
                    frame.setVisible(false);
                    System.out.println("Plus Clicked"+i+"OK"+order.numberOfOrder);
                    
                }
                
                else if(me.getSource()==label_m[i]&&order.all_food_price[i]>0)
                {
                    order.number_food[i]--;
                    order.all_food_price[i]-=order.price_food[i];
                    
                    PageBasket o=new PageBasket(PageRestaurant.numOfRestaurant);
                    frame.setVisible(false);
                    System.out.println("minus Clicked");
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
    private void seticon() {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }
    
}



