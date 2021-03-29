package talabat.clone;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
//import static salesdetails.createRestaurant.restaurant;

/**
 *
 * @author compuhome
 */
public final class PaymentDetales extends JFrame
{

    public static Color darkOrange=new Color(255,51,0);
    
    mouse_Listener Mouse_Click;
    
    JLabel l1 = new JLabel("PAYMENT DETAILS");
    JLabel l2 = new JLabel("Subtotal:");
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel("Delivery Charge:");
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel("Service Charge:");
    JLabel l7 = new JLabel("EGP 00.0");
    JLabel l8 = new JLabel( "Total amount:");
    JLabel l9 = new JLabel();
    JLabel l10 = new JLabel( " Bayment options:");
    JLabel backGroung = new JLabel();
    
    JRadioButton r1= new JRadioButton("Cash",rootPaneCheckingEnabled);
    JRadioButton  r2= new JRadioButton("By credit");
    
    ButtonGroup g1 = new ButtonGroup();

    JButton b1 =new JButton("CONFIRM");
    JButton b2 =new JButton("CANCLE");
    
    Color c1 = new Color(255,135,0);
    Color c2 = new Color(255,152,55);
    
    Border border = BorderFactory.createLineBorder(darkOrange,3);
    
    private double subtotal = 0;
    private double total = 0;
    
    getOrder order = new getOrder();
    
    
    public PaymentDetales()
    {
        Mouse_Click=new mouse_Listener();
     FFrame();   
     seticon();
        
    }
    
     
     public void FFrame()
     {
        this.setSize(450,750);
        this.setTitle("Talabat");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocation(300, 300);
        setLocation(550,150);
       
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        //this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
//      backGroung.setIcon(new ImageIcon("d://eerr.jpg"));
         
        backGroung.setOpaque(true);
        backGroung.setBackground(Color.WHITE);
        
        
        this.add(l1); 
        this.add(l2);
        this.add(l3);
        this.add(l4); 
        this.add(l5);
        this.add(l6);
        this.add(l7); 
        this.add(l8);
        this.add(l9);
        this.add(l10); 
        this.add(b1);
        this.add(b2);
        this.add(r1);
        this.add(r2); 
        g1.add(r1);
        g1.add(r2);
        this.add(backGroung);
        
//        this.add(p1);
        
        boldlables(l1,24);
        boldlables(l10,16); 
        boldlables(l2,14);
        boldlables(l3,14);
        boldlables(l4,14);
        boldlables(l5,14);
        boldlables(l6,14);
        boldlables(l7,14);
        boldlables(l8,18);
        boldlables(l9,18);
       
      
       
       l1.setBounds(100,40,250,50);
       
       l2.setBounds(65,110,100,50 );
       l3.setBounds(300,110,100,50 );
       
       l4.setBounds(65,150,150,50 );
       l5.setBounds(300,150,100,50 );
       
       l6.setBounds(65,190,150,50 );
       l7.setBounds(300,190,100,50 );
       
       l8.setBounds(65,260,150,50 );
       l9.setBounds(300,260,300,50 );
       
       l10.setBounds(30,400,150,27 );
       r1.setBounds(200,400,75,27 );
       r2.setBounds(320,400,125,27 );
       
       b1.setBounds(260,570,125,30 );
       b2.setBounds(60,570,125,30 );
       
       r1.setOpaque(false);
       r2.setOpaque(false);
       
       backGroung.setBounds(0,0,450,750);
       
       l1.setForeground(darkOrange);
       l2.setForeground(Color.darkGray);
       l3.setForeground(Color.darkGray);
       l4.setForeground(Color.DARK_GRAY);
       l5.setForeground(Color.darkGray);
       l6.setForeground(Color.darkGray);
       l7.setForeground(Color.darkGray);
       l8.setForeground(darkOrange);
       l9.setForeground(Color.BLACK);
 
       l10.setForeground(darkOrange);
       l10.setOpaque(true);
       l10.setBackground(Color.white);
       r1.setForeground(Color.black);
       r2.setForeground(Color.black);
       r1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       r2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       UIManager.put("RadioButton.focus", new ColorUIResource(Color.white));
       SwingUtilities.updateComponentTreeUI(this);
       
       
       
       b1.setBackground(darkOrange);
       b1.setForeground(Color.white);
       b1.setBorder(border);
       b1.setFont(new Font("tahoma" , Font.BOLD ,14 ));
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       UIManager.put("Button.focus", new ColorUIResource(Color.white));
       SwingUtilities.updateComponentTreeUI(this);
       
       b2.setBackground(Color.white);
       b2.setForeground(darkOrange);
       b2.setBorder(border);
       b2.setFont(new Font("tahoma" , Font.BOLD ,13 ));
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       b2.addMouseListener(Mouse_Click);
       
       
     //  to display the valus of lables     
      subtotal = calcSubtotal();
       
      l3.setText("EGP " + String.format("%.3g%n", subtotal));
      total = subtotal + createRestaurant.restaurant[PageRestaurant.numOfRestaurant].delivery_cost;
      
      l5.setText("EGP " + String.valueOf(createRestaurant.restaurant[PageRestaurant.numOfRestaurant].delivery_cost));
      
      l9.setText("EGP " + String.format("%.3g%n", total));
       
      
       

    }
  
     public void boldlables ( JLabel lab1 ,int s  )
     {
     lab1.setFont(new Font("tahoma" , Font.BOLD ,s ));
     }
    
     public double calcSubtotal()
     {
         double st=0;
         
         for(int i=1 ; i<=order.numberOfOrder ; i++)
         {
             st = st + order.all_food_price[i];
         }
           return st;
     }
     
     public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        
        @Override
        public void mouseClicked(MouseEvent me)
        {
  
            if(me.getSource()==b2)
            {    
                PageBasket pb=new PageBasket(getOrder.numberOfRes);
                setVisible(false);
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }
     
     
     
     
     
     
     
}
