/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Owner
 */
public class meals extends JFrame{
    
    JPanel panel1=new JPanel();
    public meals()
    {
       JTextArea ta=new JTextArea(10,20);
        JScrollPane sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //ta.setText(all);
        //ta.setLineWrap(true);
        //ta.setWrapStyleWord(true);
        this.add(sp); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
//Set JFrame size  
setSize(400,400);  
        setResizable(false);
  
//Make JFrame visible. So we can see it.  
setVisible(true); 
    }
    
}
