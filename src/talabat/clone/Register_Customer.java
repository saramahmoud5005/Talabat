/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;
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
import java.io.File;
/**
 *
 * @author Owner
 */
public class Register_Customer {
    
    JFrame frame=new JFrame();
    JTextArea panel1=new JTextArea();
    JScrollPane sp;
    JTextField t=new JTextField();
    JButton b=new JButton();
    JButton s=new JButton();
    mouse_Listener mm=new mouse_Listener();
    
    public Register_Customer()
    {
        t.setBounds(100,100,200,50);
        b.setBounds(350,100,50,50);
        s.setBounds(350,200,50,50);
        frame();
        panel();
        panel1.add(t);
        panel1.add(b);
        panel1.add(s);
        b.addMouseListener(mm);
        s.addMouseListener(mm);
        frame.setVisible(true);
        
    }
    public void frame()
    {
        frame.setTitle("Talabat Clone");
        frame.setSize(450,780); //450,780
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(550,150); //500,150
    }
 
    public void panel()
    {
        
        panel1=new JTextArea(100,50);
        panel1.setEditable(false);
        sp=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setSize(5,5);
        //sp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frame.add(sp);
        
    }
    public void get_image_res()
    {
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        File f=fc.getSelectedFile();
        String filename=f.getAbsolutePath();
        t.setText(filename);
        createRestaurant.restaurant[1].picture_Restaurant=filename; // PageRestaurant.numOfRestaurant instead of 1
        
        /*image =new JLabel();
        image.setBounds(0,0,450,150);*/
        
        ImageIcon myim=new ImageIcon(createRestaurant.restaurant[1].picture_Restaurant); // PageRestaurant.numOfRestaurant instead of 1
        Image img=myim.getImage();
        Image newim=img.getScaledInstance(450,150 , Image.SCALE_SMOOTH);
        //Image newim=img.getScaledInstance(450,220, Image.SCALE_SMOOTH);
        ImageIcon ima=new ImageIcon(newim);
        createRestaurant.restaurant[1].res_img=ima; // PageRestaurant.numOfRestaurant instead of 1
        /*image.setIcon(ima);
        panel1.add(image);*/
    }
                
                public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        
        @Override
        public void mouseClicked(MouseEvent me)
        {
  
            if(me.getSource()==b)
            {    
                get_image_res();
                
            }
            else if(me.getSource()==s)
            {    
                
                PageRestaurant o=new PageRestaurant(1);
                frame.setVisible(false);
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
