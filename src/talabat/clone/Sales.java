package talabat.clone;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
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
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import static talabat.clone.PageBasket.update_data;


public class Sales extends JFrame
{
    public static Color darkOrange=new Color(255,51,0);
    
    mouse_Listener Mouse_Click;
    //contant dicleration
    JLabel arrow,image_circle;
    JLabel[] name =new JLabel[40];
    JLabel[] price =new JLabel[40];
    JLabel[] type =new JLabel[40];
    JLabel[] quant =new JLabel[40];
    
    JLabel l1 = new JLabel("SALES DETAILS");
    JLabel l2 = new JLabel( "  Total Revenues:");
    JLabel l3 = new JLabel("EGP 00.0");
    
    JLabel l4 = new JLabel("Name");
    JLabel l5 = new JLabel("Type");
    JLabel l6 = new JLabel( "Price(EGP)");
    JLabel l7 = new JLabel( "Quantity");

    
    JButton b1= new JButton("RETURN");
    JButton b2= new JButton("BEST SELLING");
    
    Color c1 = new Color(255,135,0);
    Color c2 = new Color(255,152,55);
    Color c3 = new Color(255,90,0);
    
    Border border = BorderFactory.createLineBorder(c2,3);
    Border pborder = BorderFactory.createLineBorder(c2,2); 
    
    JPanel p1 = new JPanel();
    
    JScrollPane s=new JScrollPane();

    JLabel backGroung = new JLabel();

    getOrder order = new getOrder();
    
    private double totl=0;
    
    
    public Sales()
    {
        Mouse_Click=new mouse_Listener();
        frame();
        seticon();
    }
    
    private void frame()
    {
    
        //Set the frame properties
        this.setSize(450,750);
        this.setTitle("Talabat");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        //this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setLocation(550,150);
        
        
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
        
        //Scrollbar formating
        s.setBounds(6,120,420,420);    
        s.getViewport().add(p1);
        s.setBorder(pborder);
        s.getVerticalScrollBar().setUI(yourUI );
  
        //The function to disdlay the panel contant(the sold items for this resturant)
         totl=DisplayClcTotal();
         
         
        //lables formating
        l2.setForeground(c1);
        l2.setBackground(Color.WHITE);
        l2.setOpaque(true);
        l2.setFont(new Font("tahoma" , Font.PLAIN ,18));
        l3.setFont(new Font("tahoma" , Font.PLAIN ,18));

        l1.setForeground(c1);
        l1.setFont(new Font("tahoma" , Font.BOLD ,24));

        l4.setForeground(c1);
        l4.setFont(new Font("tahoma" , Font.PLAIN ,13));
        l5.setForeground(c1);
        l5.setFont(new Font("tahoma" , Font.BOLD ,13));
        l6.setForeground(c1);
        l6.setFont(new Font("tahoma" , Font.BOLD ,14));
        l7.setForeground(c1);
        l7.setFont(new Font("tahoma" , Font.PLAIN ,13));

        l3.setText("EGP "+String.valueOf(totl));
            

        b1.setBackground(c2);
        b1.setForeground(Color.white);
        b1.setBorder(border);
        b1.setFont(new Font("tahoma" , Font.BOLD ,14 ));
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UIManager.put("Button.focus", new ColorUIResource(c2));
        SwingUtilities.updateComponentTreeUI(this);

        b2.setBackground(c2);
        b2.setForeground(Color.white);
        b2.setBorder(border);
        b2.setFont(new Font("tahoma" , Font.BOLD ,14 ));
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UIManager.put("Button.focus", new ColorUIResource(c2));

        //lables setbounds
        l1.setBounds(110,20,250,50); 
        l2.setBounds(60,570,150,27); 
        l3.setBounds(280,570,150,27);

        b1.setBounds(90,640,75,25);
        b2.setBounds(250,640,110,25);

        l4.setBounds(26,80,300,50); 
        l5.setBounds(163,80,150,50); 
        l6.setBounds(240,80,150,50);
        l7.setBounds(345,80,150,50);
        
        
        
        b2.addActionListener((new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 //BestSelling bst1 = new BestSelling();
              
                 //bst1.setVisible(true);
                 dispose();

             }
         }
                ));
       
    
    }
    
    
    BasicScrollBarUI yourUI = new BasicScrollBarUI() {
    @Override
    protected JButton createDecreaseButton(int orientation) {
        JButton button = super.createDecreaseButton(orientation);
        button.setBackground(c1);
        return button;
    }

    
    
    @Override
    protected JButton createIncreaseButton(int orientation) {
        JButton button = super.createIncreaseButton(orientation);
        button.setBackground(c1);
        return button;
        
    }
 
   
    
    
  
};
    
   
    private double DisplayClcTotal()
    {
        int z=-14;
        double t=0;
    for( int i =1 ; i<=getOrder.numberOfOrder ; i++)
         {

            name[i] = new JLabel(order.name_food[i]);
            price[i] = new JLabel(String.valueOf(order.price_food[i]));  
            type[i]= new JLabel("desserts");
            quant[i]= new JLabel(String.valueOf(order.number_food[i]));

            //To set the font prorties 
            name[i].setFont(new Font("tahoma" , Font.PLAIN ,12));
            price[i].setFont(new Font("tahoma" , Font.PLAIN ,12));
            type[i].setFont(new Font("tahoma" , Font.PLAIN ,12));
            quant[i].setFont(new Font("tahoma" , Font.PLAIN,12));

            //To add the lables to the fream
            p1.add(name[i]);
            p1.add(price[i]);
            p1.add(type[i]);
            p1.add(quant[i]);

            //To setBounds for lables
            name[i].setBounds(20,z,300,50); 
            type[i].setBounds(150,z,150,50); 
            price[i].setBounds(250,z,150,50);
            quant[i].setBounds(350,z,150,50);
            
            //To increase the distence from the top of the page 
            z = z+30;
            t=t+order.price_food[i];
        
    }
    
    return t;
    };


      
    

public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        
        @Override
        public void mouseClicked(MouseEvent me)
        {
  
            if(me.getSource()==b1)
            {    
                //PaymentDetales pd=new PaymentDetales();
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
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    
