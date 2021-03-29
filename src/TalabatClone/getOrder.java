/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import javax.swing.ImageIcon;

public class getOrder {
    
    static int numberOfMeals=0,numberOfDesserts=0,numberOfDrinks=0,numberOfOrder=0,numberOfRes=PageRestaurant.numOfRestaurant;
    boolean ordered=false;
         
    
    public static String[] name_food=new String[50];
    public static String[] type_food=new String[50];
    public static double[] price_food=new double[50];
    public static double[] all_food_price= new double[50]; // price of all meals of this kind of food 
    public static ImageIcon[] image_food=new ImageIcon[50];
    public static int[] number_food=new int[50]; // number of all meals of this kind of food

    
    public getOrder()
    {
       // do nothing until now
       
    }
    
    public getOrder(int n)
    {
        for(int i=1; i<5; ++i)
        {
            System.out.println(name_food[i]);
            System.out.println(price_food[i]);
        }
        
    }
    
    public getOrder(boolean var)
    {
        if(var==true)
        {
           numberOfMeals=0;
           numberOfDesserts=0;
           numberOfDrinks=0;
           numberOfOrder=0;
           for(int i=1; i<50; ++i)
           {
               //meals
               name_food[i]=null;
               price_food[i]=0;
               all_food_price[i]=0;
               number_food[i]=0;
               image_food[i]=null;
                 
           } 
        }
           
    }
    
}

