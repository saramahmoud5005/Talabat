/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import javax.swing.ImageIcon;

public class Restaurants {
    
    public String name_Restautrant,picture_Restaurant,image_res,rating_status,res_type;
    int rate_Restaurant,delivery_time,numberOfMeals,numberOfDesserts,numberOfDrinks
            ,num_meals_panel,num_desserts_panel,num_drinks_panel,num_order=0;
    double delivery_cost;
    
    public String[] meals=new String[50];
    public double[] meals_Price=new double[50];
    public String[] meals_description=new String[50];
    
    public String[] desserts=new String[50];
    public double[] desserts_Price=new double[50];
    public String[] desserts_description=new String[50];
    
    public String[] drinks=new String[50];
    public double[] drinks_Price=new double[50];
    public String[] drinks_description=new String[50];
    
    public ImageIcon[] pictures_meals=new ImageIcon[50];
    public ImageIcon[] pictures_meals_small=new ImageIcon[50];
    public ImageIcon[] pictures_desserts=new ImageIcon[50];
    public ImageIcon[] pictures_desserts_small=new ImageIcon[50];
    public ImageIcon[] pictures_drinks=new ImageIcon[50];
    public ImageIcon[] pictures_drinks_small=new ImageIcon[50];
    
    public int[] quantity_ordered_meals=new int[50];
    public int[] quantity_ordered_desserts=new int[50];
    public int[] quantity_ordered_drinks=new int[50];
    
    public String[] name_food=new String[50];
    public String[] type_food=new String[50];
    public double[] price_food=new double[50];
    public double[] all_food_price= new double[50]; // price of all meals of this kind of food 
    public ImageIcon[] image_food=new ImageIcon[50];
    public int[] number_food=new int[50]; // number of all meals of this kind of food
    
    
    
    public boolean[] exist_meals=new boolean[50];
    public boolean[] exist_desserts=new boolean[50];
    public boolean[] exist_drinks=new boolean[50];
    
    public ImageIcon res_img;
        
}

