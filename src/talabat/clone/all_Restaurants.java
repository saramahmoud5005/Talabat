package talabat.clone;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*;
import talabat.clone.Pages.*; //.mouse_Listener
import javax.swing.border.LineBorder;

public class all_Restaurants {
    
    JFrame frame = new JFrame();
    JTextArea panel1;
    JLabel rest[];
    mouse_Listener Mouse_Click;
    
    public all_Restaurants()
    {
        Mouse_Click=new mouse_Listener();
        frame();
        panel();
        show_restaurants();
        frame.setVisible(true);
    }
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(430,750); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150);
    }
    
    public void panel()
    {
        int num=0;
        num=createRestaurant.number_Restaurant;
        panel1=new JTextArea(38+num*num,50);
        panel1.setEditable(false);
        JScrollPane sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        frame.add(sp);
    }
    
    public void show_restaurants()
    {
        rest= new JLabel[50];
        int h1=50;
        for(int i=1; i<=createRestaurant.number_Restaurant; ++i)
        {
            rest[i]=new JLabel("restaurant "+i);
            rest[i].setBounds(30, h1, 100, 100);
            panel1.add(rest[i]);
            h1+=50;
            rest[i].addMouseListener(Mouse_Click);
        }
    }
    
    public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {

        public mouse_Listener()
        {
        }

        @Override
        public void mouseClicked(MouseEvent me)
        { 
  
            for(int i=1; i<=createRestaurant.number_Restaurant; ++i)
            {
                if(me.getSource()==rest[i])
                {
//                    System.out.println(c.restaurant[i].name_Restautrant);
                    PageRestaurant obj=new PageRestaurant(i);
                    frame.setVisible(false);
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
