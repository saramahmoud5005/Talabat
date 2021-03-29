/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Design extends JFrame {
    
     JLabel l3 =new JLabel ("talabat");
     JPanel background =new JPanel();
     JPanel background1 =new JPanel();
     
     public static Color darkOrange=new Color(255,90,0);
    
     
     
     public Design()
     {
         this.setTitle("Talabat Clone");
        this.setSize(450,780);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setLocation(450, 10);
        this.setLocation(740,130); 
        //this.setLayout(null);
        this.setResizable(false);
        background.setLayout(null);
        seticon();
        
        background1.add(l3);
        background1.setBounds(-170, 0, 780, 250);
        background.add(background1);
        
         background.setBackground(Color.white);
        background.setBorder(new javax.swing.border.LineBorder(darkOrange, 8, true));
        
        //l3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        l3.setFont(new java.awt.Font("Gadugi", 1, 60));
        l3.setForeground(darkOrange);
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBackground(darkOrange);
        l3.setForeground(Color.white);
        //l3.setText("Talabat");
       
        background1.setForeground(darkOrange);
        background1.setBackground(darkOrange);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

      
        
      this.add(background);
      
        
        
     }
     
     private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
    }
}

