/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class talabat extends Design_Pages{
    
    public static Color darkOrange=new Color(255,90,0);
    mouse_Listener Mouse_Click=new mouse_Listener();
    JFrame frame=new JFrame();
    JPanel panel1=new JPanel();
    JLabel image;
    JButton open;
    
    public talabat()
    {
     
        frame();
        seticon();
        frame.add(panel1);
        image_talabat();
        open_app();
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
    }

    public void image_talabat()
    {
        image=new JLabel();
        image.setIcon(new ImageIcon(PageRestaurant.class.getResource("talabhome1.jpg")));
        image.setBounds(0, 0, 450, 780);
        panel1.add(image);
    }
    
    public void open_app()
    {
        open=new JButton("Open App");
        open.setBounds(150, 530, 150, 50);
        open.setBackground(Color.WHITE);
        open.setForeground(darkOrange);
        open.setFocusable(false);
        open.setFont(new java.awt.Font("Verdana",Font.BOLD, 15));
        
        image.add(open);
        open.addMouseListener(Mouse_Click);
        open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    public void seticon() {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }
    
    public class mouse_Listener implements MouseListener,MouseWheelListener,MouseMotionListener
    {
        
        @Override
        public void mouseClicked(MouseEvent me)
        {
  
            if(me.getSource()==open)
            {    
                // login
                Person3 lc=new Person3();
                //PageRestaurant obj=new PageRestaurant(1);
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

