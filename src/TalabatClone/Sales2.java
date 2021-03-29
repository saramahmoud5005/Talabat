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
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import static talabat.clone.restaurants_page.darkOrange;


public class Sales2 extends JFrame implements ActionListener ,MouseListener
{
    public static Color darkOrange=new Color(255,90,0);
    
    ///
    JLabel logout=new JLabel("Logout");
    
    //contant dicleration
    JLabel[] name =new JLabel[40];
    JLabel[] price =new JLabel[40];
    JLabel[] date =new JLabel[40];
    JLabel[] quant =new JLabel[40];
    
    JLabel l1 = new JLabel("SALES DETAILS");
    JLabel l2 = new JLabel( "  Total Revenues:");
    JLabel l3 = new JLabel("EGP 00.0");
    
    JLabel l4 = new JLabel("Name");
    JLabel l5 = new JLabel("Price(EGP)");
    JLabel l6 = new JLabel( "Quantity");
    JLabel l7 = new JLabel( "Date");

    
    JButton b1= new JButton("RETURN");
    JButton b2= new JButton("BEST SELLING");
    
    Border border = BorderFactory.createLineBorder(BestSelling.Darkorange,3);
    Border pborder = BorderFactory.createLineBorder(BestSelling.Darkorange,2); 
    
    JPanel p1 = new JPanel();
    
    JScrollPane s=new JScrollPane();

    JLabel backGroung = new JLabel();
    
    DecimalFormat df=new DecimalFormat("#.00");

    //AgetOrder order = new getOrder();
    
    private double totl=0;
    
    
    public Sales2()
    {
        frame();
        seticon();
    }
    
    private void frame()
    {
    
        //Set the frame properties
        this.setSize(450,780);
        this.setTitle("Talabat Clone");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Toolkit toolkit = getToolkit();
        //Dimension size = toolkit.getScreenSize();
        //this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setLocation(740,130);
        
        
        // Add the contant to the frame
        this.add(b1);
        this.add(b2);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(s);
        this.add(backGroung);
        
        
        backGroung.setBounds(0,0,450,750);
       
         
        //The panel formating
        p1.setLayout(null);
        p1.setBackground(Color.white);
        p1.setBounds(6,120,420,420);
        p1.setPreferredSize(new Dimension(0,650 ));

        //backGroung formating
        backGroung.setIcon(new ImageIcon("page.jpg"));
        backGroung.setBounds(0,0,450,750);
        p1.add(backGroung);
        
        //Scrollbar formating
        s.setBounds(6,120,420,420);    
        s.getViewport().add(p1);
        s.setBorder(pborder);
        s.getVerticalScrollBar().setUI(yourUI );
  
        //The function to disdlay the panel contant(the sold items for this resturant)
         totl=DisplayClcTotal();
         
         
        //lables formating
        l2.setForeground(darkOrange);
        l2.setBackground(Color.WHITE);
        l2.setOpaque(true);
        l2.setFont(new Font("tahoma" , Font.PLAIN ,18));
        l3.setFont(new Font("tahoma" , Font.PLAIN ,18));

        l1.setForeground(darkOrange);
        l1.setFont(new Font("tahoma" , Font.BOLD ,24));

        l4.setForeground(darkOrange);
        l4.setFont(new Font("tahoma" , Font.PLAIN ,13));
        l5.setForeground(darkOrange);
        l5.setFont(new Font("tahoma" , Font.PLAIN ,13));
        l6.setForeground(darkOrange);
        l6.setFont(new Font("tahoma" , Font.PLAIN ,14));
        l7.setForeground(darkOrange);
        l7.setFont(new Font("tahoma" , Font.PLAIN ,13));

        l3.setText("EGP "+String.valueOf(df.format(totl)));
            

        b1.setBackground(darkOrange);
        b1.setForeground(Color.white);
        b1.setBorder(border);
        b1.setFont(new Font("tahoma" , Font.BOLD ,14 ));
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UIManager.put("Button.focus", new ColorUIResource(BestSelling.Darkorange));
        SwingUtilities.updateComponentTreeUI(this);

        b2.setBackground(BestSelling.Darkorange);
        b2.setForeground(Color.white);
        b2.setBorder(border);
        b2.setFont(new Font("tahoma" , Font.BOLD ,14 ));
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UIManager.put("Button.focus", new ColorUIResource(darkOrange));

        //lables setbounds
        l1.setBounds(110,20,250,50); 
        l2.setBounds(60,570,150,27); 
        l3.setBounds(280,570,150,27);

        b1.setBounds(90,640,75,25);
        b2.setBounds(250,640,110,25);

        l4.setBounds(26,80,300,50); 
        l5.setBounds(150,80,150,50); //166
        l6.setBounds(240,80,150,50);
        l7.setBounds(345,80,150,50);
        
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        
        logout.setBounds(350, 20, 100, 40);
        logout.setForeground(Color.black);
        logout.setBackground(Color.white);
        logout.setFont(new Font("sansserif",Font.BOLD,20));
        this.add(logout);
        logout.addMouseListener(this);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        b2.addActionListener((new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 BestSelling bst1 = new BestSelling();
              
                 bst1.setVisible(true);
                 dispose();

             }
         }
                ));
       
    
    }
    
    
    BasicScrollBarUI yourUI = new BasicScrollBarUI() {
    @Override
    protected JButton createDecreaseButton(int orientation) {
        JButton button = super.createDecreaseButton(orientation);
        button.setBackground(darkOrange);
        return button;
    }

    
    
    @Override
    protected JButton createIncreaseButton(int orientation) {
        JButton button = super.createIncreaseButton(orientation);
        button.setBackground(darkOrange);
        return button;
        
    }
 
   
    
    
  
};
    
   
    private double DisplayClcTotal()
    {
        int z=-5;
        double t=0;
    for( int i =1 ; i<=createRestaurant.restaurant[owner.anyres].num_order ; i++)
         {

            name[i] = new JLabel(createRestaurant.restaurant[owner.anyres].name_food[i]);
            price[i] = new JLabel(String.valueOf(createRestaurant.restaurant[owner.anyres].price_food[i]));  
            date[i]= new JLabel("23-3-2021");
            quant[i]= new JLabel(String.valueOf(createRestaurant.restaurant[owner.anyres].number_food[i]));

            //To set the font prorties 
            name[i].setFont(new Font("tahoma" , Font.BOLD ,12));
            price[i].setFont(new Font("tahoma" , Font.BOLD ,12));
            date[i].setFont(new Font("tahoma" , Font.BOLD ,12));
            quant[i].setFont(new Font("tahoma" , Font.BOLD,12));

            //To add the lables to the fream
            p1.add(name[i]);
            p1.add(price[i]);
            p1.add(date[i]);
            p1.add(quant[i]);

            //To setBounds for lables
            name[i].setBounds(20,z,300,50); 
            price[i].setBounds(150,z,150,50); 
            quant[i].setBounds(250,z,150,50);
            date[i].setBounds(320,z,150,50);
            
            //To increase the distence from the top of the page 
            z = z+30;
            t=t+createRestaurant.restaurant[owner.anyres].price_food[i];
        
    }
    
    return t;
    };

    @Override
    public void mouseClicked(MouseEvent me) {
       
        if(me.getSource()==b1)
        {
            owner o=new owner(1,owner.anyres);
            this.setVisible(false);
        }
        else if(me.getSource()==b2)
        {
            BestSelling o=new BestSelling();
            this.setVisible(false);
        }
        else if(me.getSource()==logout)
            {
                
                Person3 o=new Person3();
                setVisible(false);
            }
    }

    @Override
    public void mousePressed(MouseEvent me) {
         
     
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
        public void mouseEntered(MouseEvent me) {
           if(me.getSource()==logout)
            {
                
               logout.setForeground(darkOrange);

            }
        }

        @Override
        public void mouseExited(MouseEvent me) {
           
            if(me.getSource()==logout)
            {
               
               logout.setForeground(Color.black);
            }
        } 
    
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    


