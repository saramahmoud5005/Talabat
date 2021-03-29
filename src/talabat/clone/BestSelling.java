/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import static talabat.clone.owner.selected;


public class BestSelling extends JFrame implements ActionListener ,MouseListener
{
    
    ///
    JLabel logout=new JLabel();

//contant dicleration
JLabel l1 = new JLabel("BEST SELLING");
JLabel l2 = new JLabel("IN Meales:");
JLabel l3 = new JLabel();
JLabel l4 = new JLabel();
JLabel l33 = new JLabel();
JLabel l44 = new JLabel();
JLabel l5 = new JLabel();
JLabel l6 = new JLabel("IN Desserts:");
JLabel l7 = new JLabel();
JLabel l8 = new JLabel();
JLabel l77 = new JLabel();
JLabel l88 = new JLabel();
JLabel l9 = new JLabel();
JLabel l10 = new JLabel("IN Drinks:");
JLabel l11 = new JLabel();
JLabel l12 = new JLabel();
JLabel l111 = new JLabel();
JLabel l122 = new JLabel();
JLabel l13 = new JLabel();


JButton b1= new JButton("RETURN");

    
public static Color Darkorange=new Color(255,90,0);

Border border = BorderFactory.createLineBorder(Darkorange,3);
Border pborder = BorderFactory.createLineBorder(Darkorange,2);   


   
    public BestSelling()
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
        setLocation(550,150);
    
       
        // Add the contant to the frame
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l33);
        this.add(l44);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(l77);
        this.add(l88);
        this.add(l9);
        this.add(l10);
        this.add(l11);
        this.add(l12);
        this.add(l111);
        this.add(l122);
        this.add(l13);
        this.add(b1);
        
      
        //Contant formating
        b1.setBackground(Darkorange);
        b1.setForeground(Color.white);
        b1.setBorder(border);
        b1.setFont(new Font("tahoma" , Font.BOLD ,14 ));
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UIManager.put("Button.focus", new ColorUIResource(Darkorange));
        SwingUtilities.updateComponentTreeUI(this);


        l1.setForeground(Darkorange);
        l1.setFont(new Font("tahoma" , Font.BOLD ,24));

        //Seating the headings color and font detales
        heading(l2);
        heading(l6);
        heading(l10);

        l3.setFont(new Font("tahoma" , Font.BOLD ,12));
        l4.setFont(new Font("tahoma" , Font.BOLD ,12));
        l33.setFont(new Font("tahoma" , Font.BOLD ,12));
        l44.setFont(new Font("tahoma" , Font.BOLD ,12));
        l5.setFont(new Font("tahoma" , Font.BOLD ,14));

        l7.setFont(new Font("tahoma" , Font.BOLD ,12));
        l8.setFont(new Font("tahoma" , Font.BOLD ,12));
        l77.setFont(new Font("tahoma" , Font.BOLD ,12));
        l88.setFont(new Font("tahoma" , Font.BOLD ,12));
        l9.setFont(new Font("tahoma" , Font.BOLD ,14));

        l11.setFont(new Font("tahoma" , Font.BOLD ,12));
        l12.setFont(new Font("tahoma" , Font.BOLD ,12));
        l111.setFont(new Font("tahoma" , Font.BOLD ,12));
        l122.setFont(new Font("tahoma" , Font.BOLD ,12));
        l13.setFont(new Font("tahoma" , Font.BOLD ,14));
          
      
        //Contant setbounds
        l1.setBounds(130,40,250,50); 

        l2.setBounds(30,140,150,25);
        l5.setBounds(240,140,150,25);

        
        l3.setBounds(30,190,300,25);
        l4.setBounds(320,190,150,25);
        l33.setBounds(30,230,300,25);
        l44.setBounds(320,230,150,25);

        l6.setBounds(30,300,150,25);
        l9.setBounds(240,300,150,25);

        
        l7.setBounds(30,360,300,25);
        l8.setBounds(320,360,150,25);
        l77.setBounds(30,400,300,25);
        l88.setBounds(320,400,150,25);
        
        

        l10.setBounds(30,460,150,25);
        l13.setBounds(240,460,150,25);

        l11.setBounds(30,520,300,25);
        l12.setBounds(320,520,150,25);
        l111.setBounds(30,560,300,25);
        l122.setBounds(320,560,150,25);
        
        disblayBestselling();

        b1.setBounds(163,630,110,25);
           
        b1.addMouseListener(this);
        
        
        
        //Contant setbounds
        /*b1.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent ae) {
               Sales2 s1 = new Sales2();
               setVisible(false);

           }
       });*/
         

    }
        
    
    //to set the font properties 
    public void heading(JLabel l)
    {
        l.setForeground(Darkorange);
        l.setFont(new Font("tahoma" , Font.BOLD ,18));
    }
    
    //To disblay and check if we have seales in this type of food
    public void disblayBestselling()
    {
        int mealsFlag=1;
        int dessertsflag=1;
        int drinksflag=1;
        
        mealsFlag = BestsellingIn("meal",l3,l4,l33,l44,l5);
        if(mealsFlag==0)
                {
                    l3.setText("Have No Sales Yet");
                    l5.setText("No one has been sold");
                }
        
       dessertsflag = BestsellingIn("dessert",l7,l8,l77,l88,l9);
       if(dessertsflag==0)
                {
                    l7.setText("Have No Sales Yet");
                    l9.setText("No one has been sold");
                }
       
        drinksflag = BestsellingIn("drink",l11,l12,l111,l122,l13);
        if(drinksflag==0)
                {
                    l11.setText("Have No Sales Yet");
                    l13.setText("No one has been sold");
                }
    
    
    }
    
    
    //To check which item have the highest sales rate
    public int BestsellingIn(String type , JLabel l1 , JLabel l2, JLabel l3, JLabel l4, JLabel l5)
    {
        int qntty=0;
        int indx=-1;
        int flag =0;
        
        //to check all sold items
        for(int i=1 ; i<=createRestaurant.restaurant[owner.anyres].num_order ; i++) //int i=1 //sara
        {
            
            if(createRestaurant.restaurant[owner.anyres].quantity_ordered_meals[i]>qntty&&type=="meal")
            {
                qntty=createRestaurant.restaurant[owner.anyres].quantity_ordered_meals[i];
                indx=i; flag=1;
            }
            else if(createRestaurant.restaurant[owner.anyres].quantity_ordered_desserts[i]>qntty&&type=="dessert")
            {
                qntty=createRestaurant.restaurant[owner.anyres].quantity_ordered_desserts[i];
                indx=i; flag=1;
            }
            else if(createRestaurant.restaurant[owner.anyres].quantity_ordered_drinks[i]>qntty&&type=="drink")
            {
                qntty=createRestaurant.restaurant[owner.anyres].quantity_ordered_drinks[i];
                indx=i; flag=1;
            }
            
    
        }
        
    if(flag==1&&type=="meal")
    {
        l1.setText(createRestaurant.restaurant[owner.anyres].meals[indx]);
                    l2.setText(String.valueOf("EGP " +createRestaurant.restaurant[owner.anyres].meals_Price[indx]));
                    //indx=i;
                    //qntty=createRestaurant.restaurant[owner.anyres].number_food[indx];
                    l5.setText(String.valueOf(createRestaurant.restaurant[owner.anyres].quantity_ordered_meals[indx]+" Sold Out From"));
                    //To make sure that we have sales in this tybe of food
    }
    else if(flag==1&&type=="dessert")
    {
        l1.setText(createRestaurant.restaurant[owner.anyres].desserts[indx]);
                    l2.setText(String.valueOf("EGP " +createRestaurant.restaurant[owner.anyres].desserts_Price[indx]));
                    //indx=i;
                   //qntty=createRestaurant.restaurant[owner.anyres].number_food[indx];
                    l5.setText(String.valueOf(createRestaurant.restaurant[owner.anyres].quantity_ordered_desserts[indx]+" Sold Out From"));
                    //To make sure that we have sales in this tybe of food
    }
    else if(flag==1&&type=="drink")
    {
        l1.setText(createRestaurant.restaurant[owner.anyres].drinks[indx]);
                    l2.setText(String.valueOf("EGP " +createRestaurant.restaurant[owner.anyres].drinks_Price[indx]));
                    //indx=i;
                    //qntty=createRestaurant.restaurant[owner.anyres].number_food[indx];
                    l5.setText(String.valueOf(createRestaurant.restaurant[owner.anyres].quantity_ordered_drinks[indx]+" Sold Out From"));
                    //To make sure that we have sales in this tybe of food
    }
    
                
                return flag;    
                }
    
    @Override
    public void mouseClicked(MouseEvent me) {
       
        if(me.getSource()==b1)
        {
            owner o=new owner(1,owner.anyres);
            this.setVisible(false);
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
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
         
    }
    
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    
    
    
    
    
    

