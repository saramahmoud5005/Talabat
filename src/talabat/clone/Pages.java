package talabat.clone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener

public class Pages extends JFrame {
 
    mouse_Listener mo=new mouse_Listener();
    public double price=0;
    createRestaurant res=new createRestaurant();
    JMenu meals,desserts,drinks;
    JMenuBar menubar1,menubar2,menubar3,menubar4;
    JPanel panel1;
    JLabel mealsLabel,meal1,meal2,meal3,meal4,meal5,
            Price_meal1,Price_meal2,Price_meal3,Price_meal4,Price_meal5,
            Add1,Add2,Add3,Add4,Add5,
            image1,image2;
    
    public Pages(int numberOfRestaurant)
    {
        
        setTitle("Talabat Clone");
        setSize(450,750); //450,780
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(550,150);
        
        
        
        panel1=new JPanel();
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 450, 750); //530 800
        //addMouseListener(this);
        
        
        menubar1=new JMenuBar();
        menubar1.setBounds(0, 200, 800, 60);
        menubar1.setBackground(Color.white);
        menubar1.setLayout(null);
        
        meals=new JMenu("            Meals");
        meals.setFont(new Font("sansserif",Font.BOLD, 15));
        meals.setBounds(0, 20, 140, 40);
        meals.setForeground(Color.BLACK);
        
        desserts=new JMenu("            Desserts");
        desserts.setFont(new Font("sansserif",Font.BOLD, 15));
        desserts.setBounds(140, 20, 170, 40);
        desserts.setForeground(Color.BLACK);
        
        drinks=new JMenu("            Drinks");
        drinks.setFont(new Font("sansserif",Font.BOLD, 15));
        drinks.setBounds(300, 20, 170, 40);
        drinks.setForeground(Color.BLACK);
        
        // First Menubar
        mealsLabel =new JLabel("Meals");
        mealsLabel.setBounds(20, 270, 100, 40);
        mealsLabel.setFont(new Font("sansserif",Font.BOLD, 20));
        mealsLabel.setForeground(Color.BLACK);
        
        // First Meal
        image2 =new JLabel();
        String s="Abou Shakra.png";
        image2.setIcon(new ImageIcon(jf.class.getResource(s)));
        image2.setBounds(15,315,100,60);
        panel1.add(image2);
        
        meal1 =new JLabel(res.restaurant[numberOfRestaurant].meals[numberOfRestaurant]);
        meal1.setBounds(120,295, 200, 60);
        meal1.setFont(new Font("sansserif",Font.BOLD, 15));
        meal1.setForeground(Color.BLACK);
        
        Price_meal1 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[numberOfRestaurant]);
        Price_meal1.setBounds(120,325, 200, 60);
        Price_meal1.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal1.setForeground(Color.BLACK);
        
        Add1 =new JLabel("+Add");
        Add1.setBounds(370, 320, 200, 60);
        Add1.setFont(new Font("sansserif",Font.BOLD, 20));
        Add1.setForeground(Color.ORANGE);
        
        
        // Second Meal
        meal2 =new JLabel(res.restaurant[numberOfRestaurant].meals[2]);
        meal2.setBounds(15, 390, 250, 60);
        meal2.setFont(new Font("sansserif",Font.BOLD, 15));
        meal2.setForeground(Color.BLACK);
        
        Price_meal2 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[2]);
        Price_meal2.setBounds(15, 420, 200, 60);
        Price_meal2.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal2.setForeground(Color.BLACK);
        
        Add2 =new JLabel("+Add");
        Add2.setBounds(370, 420, 200, 60);
        Add2.setFont(new Font("sansserif",Font.BOLD, 20));
        Add2.setForeground(Color.ORANGE);
        
        // Third Meal
        meal3 =new JLabel(res.restaurant[numberOfRestaurant].meals[3]);
        meal3.setBounds(15, 510, 200, 40);
        meal3.setFont(new Font("sansserif",Font.BOLD, 15));
        meal3.setForeground(Color.BLACK);
        
        Price_meal3 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[3]);
        Price_meal3.setBounds(15, 530, 200, 60);
        Price_meal3.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal3.setForeground(Color.BLACK);
        
        Add3 =new JLabel("+Add");
        Add3.setBounds(370, 520, 200, 60);
        Add3.setFont(new Font("sansserif",Font.BOLD, 20));
        Add3.setForeground(Color.ORANGE);
       
        // Forth Meal
        meal4 =new JLabel(res.restaurant[numberOfRestaurant].meals[4]);
        meal4.setBounds(15, 610, 200, 40);
        meal4.setFont(new Font("sansserif",Font.BOLD,15));
        meal4.setForeground(Color.BLACK);
        
        Price_meal4 =new JLabel("EGP "+res.restaurant[numberOfRestaurant].meals_Price[4]);
        Price_meal4.setBounds(15, 630, 200, 60);
        Price_meal4.setFont(new Font("sansserif",Font.BOLD, 15));
        Price_meal4.setForeground(Color.BLACK);
        
        Add4 =new JLabel("+Add");
        Add4.setBounds(370, 620, 200, 60);
        Add4.setFont(new Font("sansserif",Font.BOLD, 20));
        Add4.setForeground(Color.ORANGE);
        
        // Second Menubar
        menubar2=new JMenuBar();
        menubar2.setBounds(0, 370, 800, 20);
        menubar2.setBackground(Color.white);
        menubar2.setLayout(null);
        
        // Third Menubar
        menubar3=new JMenuBar();
        menubar3.setBounds(0, 480, 800, 20);
        menubar3.setBackground(Color.white);
        menubar3.setLayout(null);
        
        // Forth Menubar
        menubar4=new JMenuBar();
        menubar4.setBounds(0, 590, 800, 20);
        menubar4.setBackground(Color.white);
        menubar4.setLayout(null);
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        
               
        // Add picture of the restaurant
        image1 =new JLabel();
        s="Abou Shakra.png";
        image1.setIcon(new ImageIcon(jf.class.getResource(s)));
        image1.setBounds(0,0,450,220);
        panel1.add(image1); 
        
        // Add First Menubar
        this.add(panel1);
        Add1.addMouseListener(mo);
        menubar1.add(meals);
        menubar1.add(desserts);
        menubar1.add(drinks);
        panel1.add(menubar1);
        
        // Add second Menubar
        panel1.add(menubar2);
        panel1.add(mealsLabel);
        
        // Add Third Menubar
        panel1.add(menubar3);
        
        // Add Forth Menubar
        panel1.add(menubar4);
        
        // Add meals,desserts,drinks
        panel1.add(meal1); panel1.add(Price_meal1); panel1.add(Add1);
        panel1.add(meal2); panel1.add(Price_meal2); panel1.add(Add2);
        panel1.add(meal3); panel1.add(Price_meal3); panel1.add(Add3);
        panel1.add(meal4); panel1.add(Price_meal4); panel1.add(Add4);
        
        
        this.setLayout(null);
        setVisible(true);
        

    }
    public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {

        @Override
        public void mouseClicked(MouseEvent me) {
            
               if(me.getSource()==Add1)
                   System.out.println("talabat.clone.Pages.mo.mouseClicked()");

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
