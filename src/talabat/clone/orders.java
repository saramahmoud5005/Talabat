
package talabat.clone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener


public class orders extends JFrame{
    
    private Color darkOrange=new Color(255,51,0);
    mouse_Listener Mouse_Click;
    public double price=0;
    createRestaurant res=new createRestaurant();
    JFrame frame_meals=new JFrame();
    JMenu meals,desserts,drinks;
    JMenuBar menubar1,menubar2,menubar3,menubar4;
    JPanel panel1;
    JLabel mealsLabel,meal1,meal2,meal3,meal4,meal5,
            Price_meal1,Price_meal2,Price_meal3,Price_meal4,Price_meal5,
            Add1,Add2,Add3,Add4,Add5,
            remove1,remove2,remove3,remove4,remove5;
    
    public orders(int numberOfRestaurant)
    {
        
        frame_meals.setTitle("Talabat Clone");
        frame_meals.setSize(450,750); //450,780
        frame_meals.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_meals.setResizable(false);
        frame_meals.setLocation(550,150);
        
        Mouse_Click=new mouse_Listener(numberOfRestaurant);
        
        panel1=new JPanel();
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 450, 750); //530 800
        //addMouseListener(this);
        
        
        menubar1=new JMenuBar();
        menubar1.setBounds(0, 0, 800, 60);
        menubar1.setBackground(Color.white);
        menubar1.setLayout(null);
        
        
        // First Meal

        meal1 =new JLabel(res.restaurant[numberOfRestaurant].meals[1]);
        meal1.setBounds(15, 300, 200, 60);
        meal1.setFont(new Font("sansserif",Font.BOLD, 15));
        meal1.setForeground(Color.BLACK);
        
        Price_meal1 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[1]);
        Price_meal1.setBounds(15, 330, 200, 60);
        Price_meal1.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal1.setForeground(Color.BLACK);
        
        Add1 =new JLabel("+");
        Add1.setBounds(340, 50, 40, 60);
        Add1.setFont(new Font("sansserif",Font.BOLD, 30));
        Add1.setForeground(darkOrange);
        
        
        remove1 =new JLabel("-");
        remove1.setBounds(390, 50, 40, 60);
        remove1.setFont(new Font("sansserif",Font.BOLD, 40));
        remove1.setForeground(darkOrange);
        
        
        // Second Meal
        
        meal2 =new JLabel(res.restaurant[numberOfRestaurant].meals[2]);
        meal2.setBounds(15, 390, 250, 60);
        meal2.setFont(new Font("sansserif",Font.BOLD, 15));
        meal2.setForeground(Color.BLACK);
        
        Price_meal2 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[2]);
        Price_meal2.setBounds(15, 420, 200, 60);
        Price_meal2.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal2.setForeground(Color.BLACK);
        
        Add2 =new JLabel("+");
        Add2.setBounds(370, 420, 200, 60);
        Add2.setFont(new Font("sansserif",Font.BOLD, 20));
        Add2.setForeground(darkOrange);
        
        // Third Meal

        meal3 =new JLabel(res.restaurant[numberOfRestaurant].meals[3]);
        meal3.setBounds(15, 510, 200, 40);
        meal3.setFont(new Font("sansserif",Font.BOLD, 15));
        meal3.setForeground(Color.BLACK);
        
        Price_meal3 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[3]);
        Price_meal3.setBounds(15, 530, 200, 60);
        Price_meal3.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal3.setForeground(Color.BLACK);
        
        Add3 =new JLabel("+");
        Add3.setBounds(370, 520, 200, 60);
        Add3.setFont(new Font("sansserif",Font.BOLD, 20));
        Add3.setForeground(darkOrange);
       
        // Forth Meal
        
        meal4 =new JLabel(res.restaurant[numberOfRestaurant].meals[4]);
        meal4.setBounds(15, 610, 200, 40);
        meal4.setFont(new Font("sansserif",Font.BOLD,15));
        meal4.setForeground(Color.BLACK);
        
        Price_meal4 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[4]);
        Price_meal4.setBounds(15, 630, 200, 60);
        Price_meal4.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal4.setForeground(Color.BLACK);
        
        Add4 =new JLabel("+");
        Add4.setBounds(370, 620, 200, 60);
        Add4.setFont(new Font("sansserif",Font.BOLD, 20));
        Add4.setForeground(darkOrange);
        
        // Second Menubar
        menubar2=new JMenuBar();
        menubar2.setBounds(0, 100, 800, 20);
        menubar2.setBackground(Color.white);
        menubar2.setLayout(null);
        
        // Third Menubar
        menubar3=new JMenuBar();
        menubar3.setBounds(0, 200, 800, 20);
        menubar3.setBackground(Color.white);
        menubar3.setLayout(null);
        
        // Forth Menubar
        menubar4=new JMenuBar();
        menubar4.setBounds(0, 300, 800, 20);
        menubar4.setBackground(Color.white);
        menubar4.setLayout(null);
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        // Add First Menubar
        frame_meals.add(panel1);
        
        //Mouse Listener
        Add1.addMouseListener(Mouse_Click);
        Add2.addMouseListener(Mouse_Click);
        Add3.addMouseListener(Mouse_Click);
        Add4.addMouseListener(Mouse_Click);
        
        
        // Add second Menubar
        panel1.add(menubar2);
        
        // Add Third Menubar
        panel1.add(menubar3);
        
        // Add Forth Menubar
        panel1.add(menubar4);
        
        // Add meals,desserts,drinks
        panel1.add(meal1); panel1.add(Price_meal1); panel1.add(Add1); panel1.add(remove1);
        panel1.add(meal2); panel1.add(Price_meal2); panel1.add(Add2);
        panel1.add(meal3); panel1.add(Price_meal3); panel1.add(Add3);
        panel1.add(meal4); panel1.add(Price_meal4); panel1.add(Add4);
        
        
        frame_meals.setLayout(null);
        frame_meals.setVisible(true);
        

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
            
            if(me.getSource()==Add1)
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
            }
            else if(me.getSource()==meals)
            {
                System.out.println("meals_Clicked");
                
                Page_meals g=new Page_meals(number_res);
                frame_meals.setVisible(false);
            }
            else if(me.getSource()==desserts)
            {
                System.out.println("desserts_Clicked");
                
                Page_desserts g=new Page_desserts(number_res);
                frame_meals.setVisible(false);
            }
            else if(me.getSource()==drinks)
            {
                System.out.println("drinks_Clicked");
                
                Page_drinks g=new Page_drinks(number_res);
                frame_meals.setVisible(false);
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
