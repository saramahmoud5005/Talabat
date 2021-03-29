/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;

import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.*;

public class owner extends Design_Pages implements ActionListener ,MouseListener {
    
    public static Color darkOrange=new Color(255,90,0);
    ///
    
    JLabel logout=new JLabel();
    
    JFrame mainly=new JFrame("Talabat Clone");
    JFrame secondly=new JFrame("Talabat Clone");
    JFrame addly=new JFrame("Talabat Clone");
    JFrame removely=new JFrame("Talabat Clone");
    JFrame select=new JFrame("Talabat Clone");
    JLabel mlab=new JLabel("");
     JLabel alab=new JLabel("Add");//addlabel
    JLabel rlab=new JLabel("Remove");//removelabel
    JLabel nlab=new JLabel("NAME:");//name lablel 
    
    JLabel plab=new JLabel("Price:");//price lable 
    JLabel dlab=new JLabel("Name:");// discribtion label
    
    JLabel description=new JLabel("Description:");
    JTextField description_field=new JTextField();
    
    JTextField ntext=new JTextField();
    JTextField ptext=new JTextField();
    JTextField dtext=new JTextField();
    JButton B_next=new JButton("Next");
    JButton B_add=new JButton("Add");
    JButton B_remove=new JButton("Remove");
    JButton s_log=new JButton("logout");//logout label
    JButton B_meal=new JButton("MEAL");
    JButton B_MEAL=new JButton("MEAL");
    JButton B_juice=new JButton("JUICE");
    JButton B_JUICE=new JButton("JUICE");
    JButton B_dessert=new JButton("DESSERT");
    JButton B_DESSERT=new JButton("DESSERT");
    JButton B_cancel=new JButton("Cancel");
     JButton addo=new JButton("Add");
      JButton removeo=new JButton("Remove");
      JButton s_cancel=new JButton("Cancel");
    JPanel panel=new JPanel();
     JPanel panel2=new JPanel();
     JPanel panel3=new JPanel();
     JPanel panel4=new JPanel();
      JPanel panel5=new JPanel();
      public static Color Darkorange=new Color(255,51,0);
      
    // JoptionPanel f=new JoptionPanel();
      JTextArea area=new JTextArea(200,70);
      JScrollPane scroll= new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    JMenuBar menubar=new JMenuBar();
       JMenu meals=new JMenu("Meals");
        JMenu drinks=new JMenu("Drinks");
        JMenu desserts=new JMenu("Desserts");
         JMenu details=new JMenu("Details");
          JMenu bestSelling=new JMenu("Best Selling");
   public static int x=0;
   ///////////////////////////////////////////////////////////////////
     String []restourant={"mac","kfc","zac","pop","hop"};
    
     static String sort;
     static int mm=5;
     static int dd=6;
     static int jj=6;
     static int removed=0;
     static int anyres=1;
     static int sres=0;
     //////////////////////////////////////
     static int selected=1;
     JMenuBar[] menu=new JMenuBar[50];
     JLabel[]lable1=new JLabel[50];
     JLabel[]lable2=new JLabel[50];
     JLabel[]lable3=new JLabel[50];
     
     //updated 16/3/2021
     
     JTextField t=new JTextField("add");
     JButton add_pic_food=new JButton("Choose");
     
     
     static int num_res=0;
     public owner()
     {
         
     }
public owner(int p,int i){
        
    anyres=i;
    
    main_gui5();

    guimeal(p);
    
    seticon();
  


}

    
    @Override
    public void frame(){};
    public void f_page(){main_gui();
    mlab.setText("Enter Your Restaurant Name");
    mlab.setBounds(120, 125, 400,150);
    panel.add(mlab);
    ntext.setSize(50, 20);
    ntext.setBounds(20,225,400,50);
     ntext.setText("");
    panel.add(ntext);
    B_next.setBounds(50, 350, 100, 50);
    panel.add(B_next);
    B_cancel.setBounds(300, 350, 100, 50);
    panel.add(B_cancel);
    panel.add(nlab);
     B_next.addActionListener(this);////////////////////88888885555
     B_cancel.addActionListener(this);
    }
    public void s_page(String s){
        main_gui2();
    mlab.setText(createRestaurant.restaurant[anyres].name_Restautrant);
    if(createRestaurant.restaurant[anyres].name_Restautrant.length()>3) mlab.setBounds(150, 10, 200, 100);
    else mlab.setBounds(200, 10, 200, 100);
    mlab.setFont(new Font("atilic",Font.BOLD,25));
    mlab.setForeground(Darkorange);
    panel2.add(mlab);
    alab.setBounds(100, 100, 200, 100);
    alab.setFont(new Font("atilic",Font.BOLD,20));
    alab.setForeground(Darkorange);
    panel2.add(alab);
     B_MEAL.setBounds(70, 200, 100, 50);
     B_MEAL.setBackground(Darkorange);
    panel2.add(B_MEAL);
    B_JUICE.setBounds(70, 350, 100, 50);
     B_JUICE.setBackground(Darkorange);
    panel2.add(B_JUICE);
     B_DESSERT.setBounds(70, 500, 100, 50);
      B_DESSERT.setBackground(Darkorange);
    panel2.add(B_DESSERT);
     rlab.setBounds(270, 100, 200, 100);
     rlab.setFont(new Font("atilic",Font.BOLD,20));
    rlab.setForeground(Darkorange);
    panel2.add(rlab);
     B_meal.setBounds(260, 200, 100, 50);
      B_meal.setBackground(Darkorange);
    panel2.add(B_meal);
     B_juice.setBounds(260, 350, 100, 50);
      B_juice.setBackground(Darkorange);
    panel2.add(B_juice);
     B_dessert.setBounds(260, 500, 100, 50);
      B_dessert.setBackground(Darkorange);
    panel2.add(B_dessert);
    
    s_cancel.setBounds(140, 600, 150, 50);
    s_cancel.setBackground(Darkorange);
    panel2.add(s_cancel);
   
     B_meal.addActionListener(this);
     B_juice.addActionListener(this);
     B_dessert.addActionListener(this);
     B_MEAL.addActionListener(this);
     B_JUICE.addActionListener(this);
     B_DESSERT.addActionListener(this);
     s_cancel.addActionListener(this);
     
    }
    public void add_page(String ss){main_gui3();
    mlab.setText("Add"+"   "+ss);
     mlab.setFont(new Font("atilic",Font.BOLD,25));
     mlab.setForeground(Darkorange);
    mlab.setBounds(150, 30, 400,50);
    panel3.add(mlab);
    
    dlab.setBounds(30, 150, 100, 60);
     dlab.setText("Name:");
    panel3.add(dlab);
    dtext.setBounds(110, 165, 250, 30);
    dtext.setText("");
    dtext.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
    panel3.add(dtext);
    
    plab.setBounds(30, 225, 100, 60);
    panel3.add(plab);
     ptext.setText("");
    ptext.setBounds(110, 235, 250, 30);
    ptext.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
    panel3.add(ptext);
    
    //updated 22/3/2021
    description.setBounds(30, 300, 100, 60);
    panel3.add(description);
    
    description_field.setBounds(110, 310, 250, 30);
    description_field.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
    panel3.add(description_field);
    
    
    //updated 16/3/2021
    
    t.setBounds(40, 380, 250, 30);
    t.setText(" Choose a picture");
    t.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
    panel3.add(t);
    
    add_pic_food.setBounds(300, 380, 90, 30);
    add_pic_food.setBackground(Darkorange);
    add_pic_food.addMouseListener(this);
    panel3.add(add_pic_food);
   
    B_add.setBounds(50, 480, 150, 40);
    B_add.setBackground(Darkorange);
    panel3.add(B_add);
    B_cancel.setBounds(250, 480, 150, 40);
     B_cancel.setBackground(Darkorange);
    panel3.add(B_cancel);
     B_add.addActionListener(this);
      B_cancel.addActionListener(this);
   
    
    }
    public void remove_page(String mm){main_gui4();
     mlab.setText("Remove"+"   "+mm);
     mlab.setFont(new Font("atilic",Font.BOLD,25));
     mlab.setForeground(Darkorange);
      mlab.setFont(new Font("atilic",Font.BOLD,20));
    mlab.setBounds(140, 120, 200,150);
    panel4.add(mlab);
     dtext.setText(" Enter the name of "+mm.toLowerCase());
    dtext.setBounds( 70 , 260, 300, 30);
    dtext.setBorder(new javax.swing.border.LineBorder(darkOrange, 1, true));
    panel4.add(dtext);
     B_remove.setBounds( 50 , 400, 150, 40);
      B_remove.setBackground(Darkorange);
    panel4.add(B_remove);
     B_cancel.setBounds( 250 , 400, 150, 40);
      B_cancel.setBackground(Darkorange);
    panel4.add(B_cancel);
     B_remove.addActionListener(this);
      B_cancel.addActionListener(this);
    }
    
    public void select_page(){main_gui5();
    
    
     
     nlab.setText(createRestaurant.restaurant[anyres].name_Restautrant);
      if(createRestaurant.restaurant[anyres].name_Restautrant.length()<=3) nlab.setBounds(200, 0, 200, 40);
      else if(createRestaurant.restaurant[anyres].name_Restautrant.length()>3) nlab.setBounds(150, 0, 200, 40);
      nlab.setFont(new Font("atilic",Font.BOLD,20));
      nlab.setForeground(darkOrange);
     area.add(nlab);
     
     area.add(s_log);
     s_log.setBounds(320,50,100,40);
     s_log.setBackground(darkOrange);
     s_log.addActionListener(this);
     
     
     
     area.add(addo);
     addo.setBounds(10, 50, 100, 40);
     addo.setBackground(darkOrange);
     addo.addActionListener(this);
     
     area.add(removeo);
     removeo.setBounds(170, 50, 100, 40);
     removeo.setBackground(darkOrange);
     removeo.addActionListener(this);
  
   menubar.setLayout(null);
   menubar.setBackground(darkOrange);
  area.add(menubar);
   menubar.setBounds(0, 100, 450, 20);
 
  meals.setLayout(null);
  menubar.add(meals);
 meals.setBounds(0, 0, 80, 20);
  meals.addMouseListener(this);
  
  menubar.add(drinks);
  drinks.setBounds(80, 0, 80, 20);
  drinks.addMouseListener(this);
  
  menubar.add(desserts);
  desserts.setBounds(160, 0, 80, 20);
   desserts.addMouseListener(this);
   
   menubar.add(details);
  details.setBounds(250, 0, 80, 20);
   details.addMouseListener(this);
   
   menubar.add(bestSelling);
  bestSelling.setBounds(330, 0, 80, 20);
   bestSelling.addMouseListener(this);
  
    }
    
    
    public void main_gui(){
    mainly.setSize(450, 780);
    mainly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainly.setLayout(new GridLayout(1,1));
    mainly.setVisible(true);
    mainly.setLocation(740,130);
    mainly.setResizable(false);
    panel.setLayout(null);
    panel.setBackground(Color.white);
    mainly.add(panel);
    
    }
     public void main_gui2(){
   
    /////////////
       secondly.setSize(450, 780);
     secondly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     secondly.setLayout(new GridLayout(1,1));
     secondly.setVisible(true);
     secondly.setLocation(740,130);
     secondly.setResizable(false);
  
     panel2.setLayout(null);
    panel2.setBackground(Color.white);
    secondly.add(panel2);
    
    }
      public void main_gui3(){
   
    
       addly.setSize(450, 780);
     addly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     addly.setLayout(new GridLayout(1,1));
     addly.setVisible(true);
     addly.setLocation(740,130);
     addly.setResizable(false);
  
     panel3.setLayout(null);
    panel3.setBackground(Color.white);
    addly.add(panel3);
    
    }
       public void main_gui4(){
   
    
       removely.setSize(450, 780);
      removely.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      removely.setLayout(new GridLayout(1,1));
      removely.setVisible(true);
      removely.setLocation(740,130);
      removely.setResizable(false);
  
     panel4.setLayout(null);
    panel4.setBackground(Color.white);
     removely.add(panel4);
    
    }
       public void main_gui5(){
   
    
       select.setSize(450, 780);
      select.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     select.setLayout(new GridLayout(1,1));
      select.setVisible(true);
      select.setLocation(740,130);
     select.setResizable(false);
  
    
 
     scroll.setSize(0,5);
    area.setEditable(false);
    area.setSize(450, 780);
 scroll.setBounds(410, 0, 20, 20);
  select.add(scroll);
  area.setLayout(null);
  /////////////////////////////
   

    
    }
     

    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource()==B_next){
//         next();
//        
//         }
         if(ae.getSource()==addo){
         
        s_page(restourant[sres]);
        select.setVisible(false);
        
         }
        else if(ae.getSource()==removeo){
         
        s_page(restourant[sres]);
        select.setVisible(false);
         }
        else if(ae.getSource()==B_MEAL){
            sort="MEAL";
            createRestaurant.restaurant[anyres].numberOfMeals++;
             System.out.println(createRestaurant.restaurant[anyres].numberOfMeals);
         add_page(sort);
         secondly.setVisible(false);
         }
        else if(ae.getSource()==B_JUICE){
           sort="JUICE";
           createRestaurant.restaurant[anyres].numberOfDrinks++;
         add_page(sort);
         secondly.setVisible(false);
         }
         else if(ae.getSource()==B_DESSERT){
           sort="DESSERT";
           createRestaurant.restaurant[anyres].numberOfDesserts++;
         add_page(sort);
         secondly.setVisible(false);
         }
            else if(ae.getSource()==B_meal){
           sort="MEAL";
         remove_page(sort);
         secondly.setVisible(false);
          
         }
        else if(ae.getSource()==B_juice){
          sort="JUICE";
         remove_page(sort);
         secondly.setVisible(false);
         }
        else if(ae.getSource()==B_dessert){
          sort="DESSERT";
         remove_page(sort);
         secondly.setVisible(false);
         }
         else if(ae.getSource()==B_add){
         add_element();
         owner o=new owner(1,anyres);
         addly.setVisible(false);
         removely.setVisible(false);
         
         }
        
         else if(ae.getSource()==B_remove){
        remove_element();
        owner o=new owner(1,anyres);
        addly.setVisible(false);
        removely.setVisible(false);
         }
       
        else if(ae.getSource()==B_cancel){
        
       owner o=new owner(1,anyres);
       addly.setVisible(false);
       removely.setVisible(false);
         }
        else if(ae.getSource()==s_cancel)
        {
            owner o=new owner(1,anyres);
            secondly.setVisible(false);
        }
         else if(ae.getSource()==s_log)
        {
            Person3 o=new Person3();
            select.setVisible(false);
        }
        
       
            
      
    }       
     
    
   public void add_element(){
   if(dtext.getText().isEmpty()||ptext.getText().isEmpty()){JOptionPane.showMessageDialog(null,"the field musnot be Empty","",JOptionPane.WARNING_MESSAGE);}
   
    else if(!(dtext.getText().isEmpty())){
         
       switch (sort) {
           case "MEAL":
                if(Pattern.matches("^[0-9-.]+$", ptext.getText())){ 
                    //createRestaurant.restaurant[anyres].numberOfMeals+=1;
                  createRestaurant.restaurant[anyres].meals[createRestaurant.restaurant[anyres].numberOfMeals]=dtext.getText().toString();
                  createRestaurant.restaurant[anyres].meals_Price[createRestaurant.restaurant[anyres].numberOfMeals]=Double.parseDouble(ptext.getText());
                  createRestaurant.restaurant[anyres].meals_description[ createRestaurant. restaurant[anyres].numberOfDesserts]=description_field.getText().toString();
                  createRestaurant.restaurant[anyres].exist_meals[createRestaurant.restaurant[anyres].numberOfMeals]=true;
                  //createRestaurant.restaurant[anyres].pictures_meals[createRestaurant.restaurant[anyres].numberOfMeals]=new ImageIcon(PageRestaurant.class.getResource(" "));
                 System.out.println(createRestaurant.restaurant[anyres].meals[createRestaurant.restaurant[anyres].numberOfMeals]);
                 System.out.println(createRestaurant.restaurant[anyres].meals_Price[createRestaurant.restaurant[anyres].numberOfMeals]);
                 
                 //createRestaurant.restaurant[anyres].numberOfMeals
                 
                
                }
             
             else if(!Pattern.matches("^[0-9-.]+$", ptext.getText()))
        {
            
            JOptionPane.showConfirmDialog(null,"price must contain numbers only","Error",JOptionPane.ERROR_MESSAGE);
        }
             
               break;
           case "JUICE":
               if(Pattern.matches("^[0-9-.]+$", ptext.getText())){
                   //createRestaurant. restaurant[anyres].numberOfDrinks+=1;  
               createRestaurant.restaurant[anyres].drinks[createRestaurant. restaurant[anyres].numberOfDrinks]=dtext.getText().toString();
               createRestaurant.restaurant[anyres].drinks_Price[createRestaurant. restaurant[anyres].numberOfDrinks]=Double.parseDouble(ptext.getText());
               createRestaurant.restaurant[anyres].drinks_description[ createRestaurant. restaurant[anyres].numberOfDesserts]=description_field.getText().toString();
               createRestaurant.restaurant[anyres].exist_drinks[createRestaurant. restaurant[anyres].numberOfDrinks]=true;
               //createRestaurant.restaurant[anyres].pictures_drinks[createRestaurant.restaurant[anyres].numberOfDrinks]=new ImageIcon(PageRestaurant.class.getResource(" "));
               System.out.println(createRestaurant.restaurant[anyres].drinks[createRestaurant. restaurant[anyres].numberOfDrinks]);
               System.out.println(createRestaurant.restaurant[anyres].drinks_Price[createRestaurant. restaurant[anyres].numberOfDrinks]);
                 
               }
                else if(!Pattern.matches("^[0-9-.]+$", ptext.getText()))
        {
            
            JOptionPane.showConfirmDialog(null,"price must contain numbers only","Error",JOptionPane.ERROR_MESSAGE);
        }
                 
               break;
           case "DESSERT":
                if(Pattern.matches("^[0-9-.]+$", ptext.getText())){  
                     //createRestaurant. restaurant[anyres].numberOfDesserts+=1;
                    createRestaurant.restaurant[anyres].desserts[ createRestaurant. restaurant[anyres].numberOfDesserts]=dtext.getText().toString();
                    createRestaurant.restaurant[anyres].desserts_Price[ createRestaurant. restaurant[anyres].numberOfDesserts]=Double.parseDouble(ptext.getText());
                    createRestaurant.restaurant[anyres].desserts_description[ createRestaurant. restaurant[anyres].numberOfDesserts]=description_field.getText().toString();
                    createRestaurant.restaurant[anyres].exist_desserts[ createRestaurant. restaurant[anyres].numberOfDesserts]=true;
                    //createRestaurant.restaurant[anyres].pictures_desserts[createRestaurant.restaurant[anyres].numberOfDesserts]=new ImageIcon(PageRestaurant.class.getResource(" "));
                     System.out.println(createRestaurant.restaurant[anyres].desserts[ createRestaurant. restaurant[anyres].numberOfDesserts]);
                     System.out.println(createRestaurant.restaurant[anyres].desserts_Price[ createRestaurant. restaurant[anyres].numberOfDesserts]);
                
                }
                else if(!Pattern.matches("^[0-9-.]+$", ptext.getText()))
        {
            
            JOptionPane.showConfirmDialog(null,"price must contain numbers only","Error",JOptionPane.ERROR_MESSAGE);
        }
               
               break;
           default:
               break;
       }
       
     
         }
   createRestaurant.for_panel();
       createRestaurant.num_each_type_food();
   }
   
   public void remove_element(){
   
   
    if(dtext.getText().isEmpty()){JOptionPane.showMessageDialog(null,"the field musnot be Empty","",JOptionPane.WARNING_MESSAGE);}
   
    else if(!(dtext.getText().isEmpty())){
         
       switch (sort) {
           case "MEAL":
                for(int i=1;i<=createRestaurant.restaurant[anyres].numberOfMeals;i++){
                if( createRestaurant.restaurant[anyres].meals[i].toLowerCase().equals(dtext.getText().toString().toLowerCase())){
                    removed=i; 
                    break;
                }
                else{
                    removed=0;
                }
                }
                if(removed>0){ 
                    createRestaurant.restaurant[anyres].exist_meals[removed]=false;
               System.out.println( createRestaurant.restaurant[anyres].exist_meals[removed]);}
                else if(removed==0){ JOptionPane.showMessageDialog(null,"This Meal dosnot exist ,Write the name of Meal correctly","",JOptionPane.ERROR_MESSAGE);}
             
               break;
           case "JUICE":
                for(int i=1;i<= createRestaurant. restaurant[anyres].numberOfDrinks;i++){
                if( createRestaurant.restaurant[anyres].drinks[i].toLowerCase().equals(dtext.getText().toString().toLowerCase())){
                    removed=i;
              
                break;
                }
                else{
                    removed=0;
                    
                }
                }
                if(removed>0){ 
                    createRestaurant.restaurant[anyres].exist_drinks[removed]=false;
               System.out.println( createRestaurant.restaurant[anyres].exist_drinks[removed]);}
                else if(removed==0){ JOptionPane.showMessageDialog(null,"This Drink dosnot exist ,Write the name of drink correctly","",JOptionPane.ERROR_MESSAGE);}
             
               break;
           case "DESSERT":
                 for(int i=1;i<= createRestaurant. restaurant[anyres].numberOfDesserts;i++){
                if( createRestaurant.restaurant[anyres].desserts[i].toLowerCase().equals(dtext.getText().toString().toLowerCase())){
                    removed=i;
              
                break;
                }
                else{
                    removed=0;
                    
                }
                }
                if(removed>0){ 
                    createRestaurant.restaurant[anyres].exist_desserts[removed]=false;
               System.out.println( createRestaurant.restaurant[anyres].exist_desserts[removed]);}
                else if(removed==0){ JOptionPane.showMessageDialog(null,"This Dessert dosnot exist ,Write the name of dessert correctly","",JOptionPane.ERROR_MESSAGE);}
                
               
               break;
           default:
               break;
       }
       
     
         }
   
    createRestaurant.for_panel();
       createRestaurant.num_each_type_food();
       
    // for page restaurant
   
   
   
   }

    @Override
    public void mouseClicked(MouseEvent me) {
       if(me.getSource()==meals){ System.out.println("xcscas");
         selected=1;
         owner o=new owner(selected,anyres);
         
         select.setVisible(false);
        
         }
         else if(me.getSource()==desserts){ System.out.println("6867887");
         selected=2;
         owner o=new owner(selected,anyres);
         
           select.setVisible(false);
         }
         else if(me.getSource()==drinks){ System.out.println("xcs25222s");
         selected=3;
         owner o=new owner(selected,anyres);
         
          select.setVisible(false);
         }
        else if(me.getSource()==details)
        {
            Sales2 o=new Sales2();
            select.setVisible(false);
        }
         else if(me.getSource()==bestSelling)
        {
            BestSelling o=new BestSelling();
            select.setVisible(false);
        }
         else if(me.getSource()==add_pic_food)
            {    
                
                    get_image_res(sort);
                
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
    
    public void guimeal(int p){
        int grad=50;
       if(p==1){ 
           select_page();
        for(int i=0,j=1;i<createRestaurant.restaurant[anyres].numberOfMeals&&j<=createRestaurant.restaurant[anyres].numberOfMeals;i++,j++){
            if(createRestaurant.restaurant[anyres].exist_meals[j]==false){continue;}
            else if( createRestaurant.restaurant[anyres].exist_meals[j]==true){
                System.out.println(createRestaurant.restaurant[anyres].meals[j]);////////to make sure
    menu[i]=new JMenuBar();
    menu[i].setBounds(0, 65+grad, 450, 100);
    menu[i].setBackground(Color.white);
     menu[i].setLayout(null);
    area.add(menu[i]);
    lable1[i]=new JLabel();
    lable1[i].setText(createRestaurant.restaurant[anyres].meals[j]);
    lable1[i].setBounds(0, 40, 300, 20);
    lable1[i].setFont(new Font("atilic",Font.BOLD,20));
    lable1[i].setForeground(darkOrange);
     menu[i].add(lable1[i]);
     
      lable2[i]=new JLabel();
    lable2[i].setText("number of sales");
    lable2[i].setBounds(280, 10, 200, 20);
    lable2[i].setFont(new Font("atilic",Font.BOLD,18));
     menu[i].add(lable2[i]);
     
     lable3[i]=new JLabel(createRestaurant.restaurant[anyres].quantity_ordered_meals[j]+"");
    //lable3[i].setText(.toString());
    lable3[i].setBounds(335, 50, 100, 20);
    lable3[i].setFont(new Font("atilic",Font.BOLD,20));
     menu[i].add(lable3[i]);}
       grad+=100;
    }}
        
        else if(p==2){
            select_page();
            for(int i=0,j=1;i<createRestaurant. restaurant[anyres].numberOfDesserts&&j<=createRestaurant. restaurant[anyres].numberOfDesserts;i++,j++){
            if(createRestaurant.restaurant[anyres].exist_desserts[j]==false){continue;}
            else if( createRestaurant.restaurant[anyres].exist_desserts[j]==true){
                 System.out.println(createRestaurant.restaurant[anyres].desserts[j]);/////////to make sure
    menu[i]=new JMenuBar();
    menu[i].setBounds(0, 65+grad, 450, 100);
    menu[i].setBackground(Color.white);
     menu[i].setLayout(null);
    area.add(menu[i]);
    lable1[i]=new JLabel();
    lable1[i].setText(createRestaurant.restaurant[anyres].desserts[j]);
    lable1[i].setBounds(0, 40, 300, 20);
    lable1[i].setFont(new Font("atilic",Font.BOLD,20));
    lable1[i].setForeground(darkOrange);
     menu[i].add(lable1[i]);
     
      lable2[i]=new JLabel();
    lable2[i].setText("number of sales");
    lable2[i].setBounds(280, 10, 200, 20);
    lable2[i].setFont(new Font("atilic",Font.BOLD,18));
     menu[i].add(lable2[i]);
     
     lable3[i]=new JLabel(createRestaurant.restaurant[anyres].quantity_ordered_desserts[j]+"");
    //lable3[i].setText("5");
    lable3[i].setBounds(335, 50, 100, 20);
    lable3[i].setFont(new Font("atilic",Font.BOLD,20));
     menu[i].add(lable3[i]);}
       grad+=100;}}
          else if(p==3){ 
              select_page();
              for(int i=0,j=1;i<createRestaurant. restaurant[anyres].numberOfDrinks&&j<=createRestaurant. restaurant[anyres].numberOfDrinks;i++,j++){
            if(createRestaurant.restaurant[anyres].exist_drinks[j]==false){continue;}
            else if( createRestaurant.restaurant[anyres].exist_drinks[j]==true){
    menu[i]=new JMenuBar();
    menu[i].setBounds(0, 65+grad, 450, 100);
    menu[i].setBackground(Color.white);
     menu[i].setLayout(null);
    area.add(menu[i]);
    lable1[i]=new JLabel();
    lable1[i].setText(createRestaurant.restaurant[anyres].drinks[j]);
    lable1[i].setBounds(0, 40, 300, 20);
    lable1[i].setFont(new Font("atilic",Font.BOLD,20));
    lable1[i].setForeground(darkOrange);
     menu[i].add(lable1[i]);
     
      lable2[i]=new JLabel();
    lable2[i].setText("number of sales");
    lable2[i].setBounds(280, 10, 200, 20);
    lable2[i].setFont(new Font("atilic",Font.BOLD,18));
     menu[i].add(lable2[i]);
     
     lable3[i]=new JLabel(createRestaurant.restaurant[anyres].quantity_ordered_drinks[j]+"");
    //lable3[i].setText("5");
    lable3[i].setBounds(335, 50, 100, 20);
    lable3[i].setFont(new Font("atilic",Font.BOLD,20));
     menu[i].add(lable3[i]);}
       grad+=100;}}
    }
    
    @Override
   public void seticon() {
        secondly.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
        mainly.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
        addly.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
        removely.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
        select.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }

   
   public void get_image_res(String s)
    {
           // updated 16/3/2021
        
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        File f=fc.getSelectedFile();
        String filename=f.getAbsolutePath();
        t.setText(filename);
        String file=filename; // PageRestaurant.numOfRestaurant instead of 1
        
        ImageIcon myim=new ImageIcon(file); // PageRestaurant.numOfRestaurant instead of 1
        Image img=myim.getImage();
        
        // small image
        Image newim_small=img.getScaledInstance(100,60 , Image.SCALE_SMOOTH);
        ImageIcon ima_small=new ImageIcon(newim_small);
        
        // big image
        Image newim=img.getScaledInstance(140,80 , Image.SCALE_SMOOTH);
        ImageIcon ima=new ImageIcon(newim);
        
        // for pic of restaurant
        //Image newim=img.getScaledInstance(450,220, Image.SCALE_SMOOTH);
        
        if(s=="MEAL")
        {
            createRestaurant.restaurant[anyres].pictures_meals[createRestaurant.restaurant[anyres].numberOfMeals]=ima; 
            createRestaurant.restaurant[anyres].pictures_meals_small[createRestaurant.restaurant[anyres].numberOfMeals]=ima_small;
        }
        else if(s=="JUICE")
        {
            createRestaurant.restaurant[anyres].pictures_drinks[createRestaurant.restaurant[anyres].numberOfDrinks]=ima; 
            createRestaurant.restaurant[anyres].pictures_drinks_small[createRestaurant.restaurant[anyres].numberOfDrinks]=ima_small;
        }
        else if(s=="DESSERT")
        {
            createRestaurant.restaurant[anyres].pictures_desserts[createRestaurant.restaurant[anyres].numberOfDesserts]=ima; 
            createRestaurant.restaurant[anyres].pictures_desserts_small[createRestaurant.restaurant[anyres].numberOfDesserts]=ima_small;
        }
        
        
    }
}
