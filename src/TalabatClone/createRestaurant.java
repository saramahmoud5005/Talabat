/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TalabatClone;


import javax.swing.ImageIcon;

public class createRestaurant {
    
     public static Restaurants restaurant[]=new Restaurants[50];
     static int number_Restaurant=5;
     
    //public static final number_Restaurant;
    
    public createRestaurant()
    {
        
        for(int i=0; i<=49; ++i) restaurant[i]=new Restaurants();
        
        for(int i=6; i<49; ++i)
        {
            if(i%2==0)
            {
                restaurant[i].rate_Restaurant=850;
                restaurant[i].delivery_cost=15.00;
                restaurant[i].delivery_time=50;
                restaurant[i].rating_status="Very Good";
                restaurant[i].res_type="Fasst Food, Sandwiches, International"; 
            }
            else 
            {
                restaurant[i].rate_Restaurant=550;
                restaurant[i].delivery_cost=25.00;
                restaurant[i].delivery_time=30;
                restaurant[i].rating_status="Good";
                restaurant[i].res_type="Fasst Food, Oriental, International";  
            }
            
        }
        
        restaurant[1].rate_Restaurant=850;
        restaurant[1].delivery_cost=15.00;
        restaurant[1].delivery_time=50;
        restaurant[1].numberOfMeals=5;
        restaurant[1].numberOfDesserts=5;
        restaurant[1].numberOfDrinks=5;
        restaurant[1].rating_status="Very Good";
        restaurant[1].res_type="Grills, Oriental";
        restaurant[1].name_Restautrant="Abou Shakra";
        restaurant[1].picture_Restaurant="abo2.jpg";
        restaurant[1].res_img=new ImageIcon(PageRestaurant.class.getResource("abo2.jpg"));
        restaurant[1].image_res="abo4.jpg";
        
        // meals of the restaurant and price
        restaurant[1].meals[0]="Nothing";
        restaurant[1].meals_Price[0]=0.00;
        restaurant[1].pictures_meals[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[1].exist_meals[0]=false;
        
        
        restaurant[1].meals[1]="Chicken Pane";
        restaurant[1].meals_Price[1]=36.83;
        restaurant[1].meals_description[1]="chicken with some cheese";
        restaurant[1].pictures_meals[1]=new ImageIcon(PageRestaurant.class.getResource("pane.jpg"));
        restaurant[1].pictures_meals_small[1]=new ImageIcon(PageRestaurant.class.getResource("pane2.jpg"));
        restaurant[1].exist_meals[1]=true;
        
        restaurant[1].meals[2]="Chicken Shawerma Sandwich";
        restaurant[1].meals_Price[2]=35.08;
        restaurant[1].pictures_meals[2]=new ImageIcon(PageRestaurant.class.getResource("shawerma.jpg"));
        restaurant[1].pictures_meals_small[2]=new ImageIcon(PageRestaurant.class.getResource("shawerma2.jpg"));
        restaurant[1].exist_meals[2]=true;
        
        restaurant[1].meals[3]="Kofta Sandwich";
        restaurant[1].meals_Price[3]=42.97;
        restaurant[1].pictures_meals[3]=new ImageIcon(PageRestaurant.class.getResource("kofta.jpg"));
        restaurant[1].pictures_meals_small[3]=new ImageIcon(PageRestaurant.class.getResource("kofta2.jpg"));
        restaurant[1].exist_meals[3]=true;
        
        restaurant[1].meals[4]="Escallop Pane Sandwich";
        restaurant[1].meals_Price[4]=49.99;
        restaurant[1].pictures_meals[4]=new ImageIcon(PageRestaurant.class.getResource("Esclopane.jpg"));
        restaurant[1].pictures_meals_small[4]=new ImageIcon(PageRestaurant.class.getResource("Esclopane2.jpg"));
        restaurant[1].exist_meals[4]=true;
        
        restaurant[1].meals[5]="Grilled Chicken Breasts";
        restaurant[1].meals_Price[5]=57.88;
        restaurant[1].pictures_meals[5]=new ImageIcon(PageRestaurant.class.getResource("grill.jpg"));
        restaurant[1].pictures_meals_small[5]=new ImageIcon(PageRestaurant.class.getResource("grill2.jpg"));
        restaurant[1].exist_meals[5]=true;
        
        // desserts of the restaurant and price
        restaurant[1].desserts[0]="Nothing";
        restaurant[1].desserts_Price[0]=0.00;
        restaurant[1].pictures_desserts[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[1].exist_desserts[0]=false;
        
        restaurant[1].desserts[1]="Molten Chocolate Cake";
        restaurant[1].desserts_Price[1]=25.50;
        restaurant[1].pictures_desserts[1]=new ImageIcon(PageRestaurant.class.getResource("molten.jpeg"));
        restaurant[1].pictures_desserts_small[1]=new ImageIcon(PageRestaurant.class.getResource("molten2.jpeg"));
        restaurant[1].exist_desserts[1]=true;
        
        restaurant[1].desserts[2]="Milk Pudding with Nuts";
        restaurant[1].desserts_Price[2]=18.20;
        restaurant[1].pictures_desserts[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding.jpg"));
        restaurant[1].pictures_desserts_small[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding2.jpg"));
        restaurant[1].exist_desserts[2]=true;
        
        restaurant[1].desserts[3]="Milk Pudding";
        restaurant[1].desserts_Price[3]=15.20;
        restaurant[1].pictures_desserts[3]=new ImageIcon(PageRestaurant.class.getResource("milk.jpg"));
        restaurant[1].pictures_desserts_small[3]=new ImageIcon(PageRestaurant.class.getResource("milk2.jpg"));
        restaurant[1].exist_desserts[3]=true;
        
        restaurant[1].desserts[4]="Umm Ali";
        restaurant[1].desserts_Price[4]=10.50;
        restaurant[1].pictures_desserts[4]=new ImageIcon(PageRestaurant.class.getResource("umAli.jpg"));
        restaurant[1].pictures_desserts_small[4]=new ImageIcon(PageRestaurant.class.getResource("umAli2.jpg"));
        restaurant[1].exist_desserts[4]=true;
        
        restaurant[1].desserts[5]="Cream Cramel";
        restaurant[1].desserts_Price[5]=20.50;
        restaurant[1].pictures_desserts[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel.jpeg"));
        restaurant[1].pictures_desserts_small[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel2.jpeg"));
        restaurant[1].exist_desserts[5]=true;
        
        
        // drinks of the restaurant and price
        restaurant[1].drinks[0]="Nothing";
        restaurant[1].drinks_Price[0]=0.00;
        restaurant[1].pictures_drinks[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[1].exist_drinks[0]=false;
        
        restaurant[1].drinks[1]="Pepsi Can";
        restaurant[1].drinks_Price[1]=7.01;
        restaurant[1].pictures_drinks[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can.jpg"));
        restaurant[1].pictures_drinks_small[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can2.jpg"));
        restaurant[1].exist_drinks[1]=true;
        
        restaurant[1].drinks[2]="Pepsi Diet Can";
        restaurant[1].drinks_Price[2]=7.01;
        restaurant[1].pictures_drinks[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi2.jpg"));
        restaurant[1].pictures_drinks_small[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi22.jpg"));
        restaurant[1].exist_drinks[2]=true;
        
        restaurant[1].drinks[3]="7 Up Can";
        restaurant[1].drinks_Price[3]=7.01;
        restaurant[1].pictures_drinks[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan.jpg"));
        restaurant[1].pictures_drinks_small[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan2.jpg"));
        restaurant[1].exist_drinks[3]=true;
        
        restaurant[1].drinks[4]="7 Up Diet Can";
        restaurant[1].drinks_Price[4]=7.01;
        restaurant[1].pictures_drinks[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet.jpg"));
        restaurant[1].pictures_drinks_small[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet2.jpg"));
        restaurant[1].exist_drinks[4]=true;
        
        restaurant[1].drinks[5]="Mango Juice";
        restaurant[1].drinks_Price[5]=7.01;
        restaurant[1].pictures_drinks[5]=new ImageIcon(PageRestaurant.class.getResource("mango.jpg"));
        restaurant[1].pictures_drinks_small[5]=new ImageIcon(PageRestaurant.class.getResource("mango2.jpg"));
        restaurant[1].exist_drinks[5]=true;
        
        
        //////////////////////////////////////////////////
        
        // name of restaurant 2
        restaurant[2].rate_Restaurant=750;
        restaurant[2].delivery_cost=20.00;
        restaurant[2].delivery_time=60;
        restaurant[2].numberOfMeals=5;
        restaurant[2].numberOfDesserts=5;
        restaurant[2].numberOfDrinks=5;
        restaurant[2].rating_status="Good";
        restaurant[2].res_type="Fasst Food, Sandwiches, International";
        restaurant[2].name_Restautrant="KFC";
        restaurant[2].picture_Restaurant="kfc2.jpg";
        restaurant[2].res_img=new ImageIcon(PageRestaurant.class.getResource("kfc2.jpg"));
        restaurant[2].image_res="kfc6.jpg";
        
        // meals of the restaurant and price
        restaurant[2].meals[0]="Nothing";
        restaurant[2].meals_Price[0]=0.00;
        restaurant[2].pictures_meals[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[2].exist_meals[0]=false;
        
        restaurant[2].meals[1]="Grand Feast Bucket";
        restaurant[2].meals_Price[1]=253.00;
        restaurant[2].pictures_meals[1]=new ImageIcon(PageRestaurant.class.getResource("GrandFeastBucket.jpg"));
        restaurant[2].pictures_meals_small[1]=new ImageIcon(PageRestaurant.class.getResource("GrandFeastBucket2.jpg"));
        restaurant[2].exist_meals[1]=true;
        
        restaurant[2].meals[2]="Mighty Plus";
        restaurant[2].meals_Price[2]=85.00;
        restaurant[2].pictures_meals[2]=new ImageIcon(PageRestaurant.class.getResource("MightyPlus.jpg"));
        restaurant[2].pictures_meals_small[2]=new ImageIcon(PageRestaurant.class.getResource("MightyPlus2.jpg"));
        restaurant[2].exist_meals[2]=true;
        
        restaurant[2].meals[3]="Shrimp Box";
        restaurant[2].meals_Price[3]=100.00;
        restaurant[2].pictures_meals[3]=new ImageIcon(PageRestaurant.class.getResource("ShrimpBox.jpg"));
        restaurant[2].pictures_meals_small[3]=new ImageIcon(PageRestaurant.class.getResource("ShrimpBox2.jpg"));
        restaurant[2].exist_meals[3]=true;
        
        restaurant[2].meals[4]="Free Snack Box Offer";
        restaurant[2].meals_Price[4]=84.50;
        restaurant[2].pictures_meals[4]=new ImageIcon(PageRestaurant.class.getResource("FreeSnackBoxOffer.jpg"));
        restaurant[2].pictures_meals_small[4]=new ImageIcon(PageRestaurant.class.getResource("FreeSnackBoxOffer2.jpg"));
        restaurant[2].exist_meals[4]=true;
        
        restaurant[2].meals[5]="Dinner Box";
        restaurant[2].meals_Price[5]=57.00;
        restaurant[2].pictures_meals[5]=new ImageIcon(PageRestaurant.class.getResource("DinnerBox.jpg"));
        restaurant[2].pictures_meals_small[5]=new ImageIcon(PageRestaurant.class.getResource("DinnerBox2.jpg"));
        restaurant[2].exist_meals[5]=true;
        
        
        // desserts of the restaurant and price
        restaurant[2].desserts[0]="Nothing";
        restaurant[2].desserts_Price[0]=0.00;
        restaurant[2].pictures_desserts[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[2].exist_desserts[0]=false;
        
        restaurant[2].desserts[1]="Molten Chocolate Cake";
        restaurant[2].desserts_Price[1]=25.50;
        restaurant[2].pictures_desserts[1]=new ImageIcon(PageRestaurant.class.getResource("molten.jpeg"));
        restaurant[2].pictures_desserts_small[1]=new ImageIcon(PageRestaurant.class.getResource("molten2.jpeg"));
        restaurant[2].exist_desserts[1]=true;
        
        restaurant[2].desserts[2]="Milk Pudding with Nuts";
        restaurant[2].desserts_Price[2]=18.20;
        restaurant[2].pictures_desserts[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding.jpg"));
        restaurant[2].pictures_desserts_small[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding2.jpg"));
        restaurant[2].exist_desserts[2]=true;
        
        restaurant[2].desserts[3]="Milk Pudding";
        restaurant[2].desserts_Price[3]=15.20;
        restaurant[2].pictures_desserts[3]=new ImageIcon(PageRestaurant.class.getResource("milk.jpg"));
        restaurant[2].pictures_desserts_small[3]=new ImageIcon(PageRestaurant.class.getResource("milk2.jpg"));
        restaurant[2].exist_desserts[3]=true;
        
        restaurant[2].desserts[4]="Umm Ali";
        restaurant[2].desserts_Price[4]=10.50;
        restaurant[2].pictures_desserts[4]=new ImageIcon(PageRestaurant.class.getResource("umAli.jpg"));
        restaurant[2].pictures_desserts_small[4]=new ImageIcon(PageRestaurant.class.getResource("umAli2.jpg"));
        restaurant[2].exist_desserts[4]=true;
        
        restaurant[2].desserts[5]="Cream Caramel";
        restaurant[2].desserts_Price[5]=20.50;
        restaurant[2].pictures_desserts[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel.jpeg"));
        restaurant[2].pictures_desserts_small[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel2.jpeg"));
        restaurant[2].exist_desserts[5]=true;
        
        
        // drinks of the restaurant and price
        restaurant[2].drinks[0]="Nothing";
        restaurant[2].drinks_Price[0]=0.00;
        restaurant[2].pictures_drinks[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[2].exist_drinks[0]=false;
        
        restaurant[2].drinks[1]="Pepsi Can";
        restaurant[2].drinks_Price[1]=7.01;
        restaurant[2].pictures_drinks[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can.jpg"));
        restaurant[2].pictures_drinks_small[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can2.jpg"));
        restaurant[2].exist_drinks[1]=true;
        
        restaurant[2].drinks[2]="Pepsi Diet Can";
        restaurant[2].drinks_Price[2]=7.01;
        restaurant[2].pictures_drinks[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi2.jpg"));
        restaurant[2].pictures_drinks_small[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi22.jpg"));
        restaurant[2].exist_drinks[2]=true;
        
        restaurant[2].drinks[3]="7 Up Can";
        restaurant[2].drinks_Price[3]=7.01;
        restaurant[2].pictures_drinks[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan.jpg"));
        restaurant[2].pictures_drinks_small[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan2.jpg"));
        restaurant[2].exist_drinks[3]=true;
        
        restaurant[2].drinks[4]="7 Up Diet Can";
        restaurant[2].drinks_Price[4]=7.01;
        restaurant[2].pictures_drinks[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet.jpg"));
        restaurant[2].pictures_drinks_small[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet2.jpg"));
        restaurant[2].exist_drinks[4]=true;
        
        restaurant[2].drinks[5]="Mango Juice";
        restaurant[2].drinks_Price[5]=7.01;
        restaurant[2].pictures_drinks[5]=new ImageIcon(PageRestaurant.class.getResource("mango.jpg"));
        restaurant[2].pictures_drinks_small[5]=new ImageIcon(PageRestaurant.class.getResource("mango2.jpg"));
        restaurant[2].exist_drinks[5]=true;
        
        
        //////////////////////////////////////////////////
        
        // name of restaurant 3
        restaurant[3].rate_Restaurant=100;
        restaurant[3].delivery_cost=25.00;
        restaurant[3].delivery_time=50;
        restaurant[3].numberOfMeals=5;
        restaurant[3].numberOfDesserts=5;
        restaurant[3].numberOfDrinks=5;
        restaurant[3].rating_status="Very Good";
        restaurant[3].res_type="Pizza, Pasta,Pies";
        restaurant[3].name_Restautrant="Pizza Hum";
        restaurant[3].picture_Restaurant="pizzahum2.jpg";
        restaurant[3].res_img=new ImageIcon(PageRestaurant.class.getResource("pizzahum2.jpg"));
        restaurant[3].image_res="pizzahum3.jpg";
        
        // meals of the restaurant and price
        restaurant[3].meals[0]="Nothing";
        restaurant[3].meals_Price[0]=0.00;
        restaurant[3].pictures_meals[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[3].exist_meals[0]=false;
        
        restaurant[3].meals[1]="Sicilian Pizza Offer";
        restaurant[3].meals_Price[1]=90.00;
        restaurant[3].pictures_meals[1]=new ImageIcon(PageRestaurant.class.getResource("pizza1.jpg"));
        restaurant[3].pictures_meals_small[1]=new ImageIcon(PageRestaurant.class.getResource("pizza12.jpg"));
        restaurant[3].exist_meals[1]=true;
        
        restaurant[3].meals[2]="Limo Pizza";
        restaurant[3].meals_Price[2]=225.00;
        restaurant[3].pictures_meals[2]=new ImageIcon(PageRestaurant.class.getResource("pizza2.jpg"));
        restaurant[3].pictures_meals_small[2]=new ImageIcon(PageRestaurant.class.getResource("pizza22.jpg"));
        restaurant[3].exist_meals[2]=true;
        
        restaurant[3].meals[3]="Chicken Supreme Pizza";
        restaurant[3].meals_Price[3]=60.99;
        restaurant[3].pictures_meals[3]=new ImageIcon(PageRestaurant.class.getResource("pizza3.jpg"));
        restaurant[3].pictures_meals_small[3]=new ImageIcon(PageRestaurant.class.getResource("pizza32.jpg"));
        restaurant[3].exist_meals[3]=true;
        
        restaurant[3].meals[4]="Margarita Pizza";
        restaurant[3].meals_Price[4]=34.50;
        restaurant[3].pictures_meals[4]=new ImageIcon(PageRestaurant.class.getResource("pizza4.jpg"));
        restaurant[3].pictures_meals_small[4]=new ImageIcon(PageRestaurant.class.getResource("pizza42.jpg"));
        restaurant[3].exist_meals[4]=true;
        
        restaurant[3].meals[5]="Pepperoni Pizza";
        restaurant[3].meals_Price[5]=49.00;
        restaurant[3].pictures_meals[5]=new ImageIcon(PageRestaurant.class.getResource("pizza5.jpg"));
        restaurant[3].pictures_meals_small[5]=new ImageIcon(PageRestaurant.class.getResource("pizza52.jpg"));
        restaurant[3].exist_meals[5]=true;
        
        
        // desserts of the restaurant and price
        restaurant[3].desserts[0]="Nothing";
        restaurant[3].desserts_Price[0]=0;
        restaurant[3].pictures_desserts[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[3].exist_desserts[0]=false;
        
        restaurant[3].desserts[1]="Molten Chocolate Cake";
        restaurant[3].desserts_Price[1]=25.50;
        restaurant[3].pictures_desserts[1]=new ImageIcon(PageRestaurant.class.getResource("molten.jpeg"));
        restaurant[3].pictures_desserts_small[1]=new ImageIcon(PageRestaurant.class.getResource("molten2.jpeg"));
        restaurant[3].exist_desserts[1]=true;
        
        restaurant[3].desserts[2]="Milk Pudding with Nuts";
        restaurant[3].desserts_Price[2]=18.20;
        restaurant[3].pictures_desserts[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding.jpg"));
        restaurant[3].pictures_desserts_small[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding2.jpg"));
        restaurant[3].exist_desserts[2]=true;
        
        restaurant[3].desserts[3]="Milk Pudding";
        restaurant[3].desserts_Price[3]=15.20;
        restaurant[3].pictures_desserts[3]=new ImageIcon(PageRestaurant.class.getResource("milk.jpg"));
        restaurant[3].pictures_desserts_small[3]=new ImageIcon(PageRestaurant.class.getResource("milk2.jpg"));
        restaurant[3].exist_desserts[3]=true;
        
        restaurant[3].desserts[4]="Umm Ali";
        restaurant[3].desserts_Price[4]=10.50;
        restaurant[3].pictures_desserts[4]=new ImageIcon(PageRestaurant.class.getResource("umAli.jpg"));
        restaurant[3].pictures_desserts_small[4]=new ImageIcon(PageRestaurant.class.getResource("umAli2.jpg"));
        restaurant[3].exist_desserts[4]=true;
        
        restaurant[3].desserts[5]="Cream Caramel";
        restaurant[3].desserts_Price[5]=20.50;
        restaurant[3].pictures_desserts[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel.jpeg"));
        restaurant[3].pictures_desserts_small[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel2.jpeg"));
        restaurant[3].exist_desserts[5]=true;
        
        
        // drinks of the restaurant and price
        restaurant[3].drinks[0]="Nothing";
        restaurant[3].drinks_Price[0]=0;
        restaurant[3].pictures_drinks[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[3].exist_drinks[0]=false;
        
        restaurant[3].drinks[1]="Pepsi Can";
        restaurant[3].drinks_Price[1]=7.01;
        restaurant[3].pictures_drinks[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can.jpg"));
        restaurant[3].pictures_drinks_small[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can2.jpg"));
        restaurant[3].exist_drinks[1]=true;
        
        restaurant[3].drinks[2]="Pepsi Diet Can";
        restaurant[3].drinks_Price[2]=7.01;
        restaurant[3].pictures_drinks[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi2.jpg"));
        restaurant[3].pictures_drinks_small[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi22.jpg"));
        restaurant[3].exist_drinks[2]=true;
        
        restaurant[3].drinks[3]="7 Up Can";
        restaurant[3].drinks_Price[3]=7.01;
        restaurant[3].pictures_drinks[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan.jpg"));
        restaurant[3].pictures_drinks_small[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan2.jpg"));
        restaurant[3].exist_drinks[3]=true;
        
        restaurant[3].drinks[4]="7 Up Diet Can";
        restaurant[3].drinks_Price[4]=7.01;
        restaurant[3].pictures_drinks[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet.jpg"));
        restaurant[3].pictures_drinks_small[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet2.jpg"));
        restaurant[3].exist_drinks[4]=true;
        
        restaurant[3].drinks[5]="Mango Juice";
        restaurant[3].drinks_Price[5]=7.01;
        restaurant[3].pictures_drinks[5]=new ImageIcon(PageRestaurant.class.getResource("mango.jpg"));
        restaurant[3].pictures_drinks_small[5]=new ImageIcon(PageRestaurant.class.getResource("mango2.jpg"));
        restaurant[3].exist_drinks[5]=true;
        
        
        //////////////////////////////////////////////////
        
        // name of restaurant 4
        restaurant[4].rate_Restaurant=230;
        restaurant[4].delivery_cost=15.00;
        restaurant[4].delivery_time=50;
        restaurant[4].numberOfMeals=5;
        restaurant[4].numberOfDesserts=5;
        restaurant[4].numberOfDrinks=5;
        restaurant[4].rating_status="Good";
        restaurant[4].res_type="International, Oriental, Asian";
        restaurant[4].name_Restautrant="kinwa";
        restaurant[4].picture_Restaurant="kinwa2.jpg";
        restaurant[4].res_img=new ImageIcon(PageRestaurant.class.getResource("kinwa2.jpg"));
        restaurant[4].image_res="kinwa3.jpg";
        
        // meals of the restaurant and price
        restaurant[4].meals[0]="Nothing";
        restaurant[4].meals_Price[0]=0.00;
        restaurant[4].pictures_meals[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[4].exist_meals[0]=false;
        
        restaurant[4].meals[1]="Super Hattrick";
        restaurant[4].meals_Price[1]=125.00;
        restaurant[4].pictures_meals[1]=new ImageIcon(PageRestaurant.class.getResource("SuperHattrick.jpg"));
        restaurant[4].pictures_meals_small[1]=new ImageIcon(PageRestaurant.class.getResource("SuperHattrick2.jpg"));
        restaurant[4].exist_meals[1]=true;
        
        restaurant[4].meals[2]="Classic Burger";
        restaurant[4].meals_Price[2]=49.00;
        restaurant[4].pictures_meals[2]=new ImageIcon(PageRestaurant.class.getResource("burger1.jpg"));
        restaurant[4].pictures_meals_small[2]=new ImageIcon(PageRestaurant.class.getResource("burger12.jpg"));
        restaurant[4].exist_meals[2]=true;
        
        restaurant[4].meals[3]="Barbique Pizza";
        restaurant[4].meals_Price[3]=61.00;
        restaurant[4].pictures_meals[3]=new ImageIcon(PageRestaurant.class.getResource("pizza1.jpg"));
        restaurant[4].pictures_meals_small[3]=new ImageIcon(PageRestaurant.class.getResource("pizza12.jpg"));
        restaurant[4].exist_meals[3]=true;
        
        restaurant[4].meals[4]="Sea Food Ranch";
        restaurant[4].meals_Price[4]=76.00;
        restaurant[4].pictures_meals[4]=new ImageIcon(PageRestaurant.class.getResource("seaFood.jpg"));
        restaurant[4].pictures_meals_small[4]=new ImageIcon(PageRestaurant.class.getResource("seaFood2.jpg"));
        restaurant[4].exist_meals[4]=true;
        
        restaurant[4].meals[5]="Vegetables Pizza";
        restaurant[4].meals_Price[5]=55.00;
        restaurant[4].pictures_meals[5]=new ImageIcon(PageRestaurant.class.getResource("pizza2.jpg"));
        restaurant[4].pictures_meals_small[5]=new ImageIcon(PageRestaurant.class.getResource("pizza22.jpg"));
        restaurant[4].exist_meals[5]=true;
        
        
        // desserts of the restaurant and price
        restaurant[4].desserts[0]="Nothing";
        restaurant[4].desserts_Price[0]=0;
        restaurant[4].pictures_desserts[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[4].exist_desserts[0]=false;
        
        restaurant[4].desserts[1]="Molten Chocolate Cake";
        restaurant[4].desserts_Price[1]=25.50;
        restaurant[4].pictures_desserts[1]=new ImageIcon(PageRestaurant.class.getResource("molten.jpeg"));
        restaurant[4].pictures_desserts_small[1]=new ImageIcon(PageRestaurant.class.getResource("molten2.jpeg"));
        restaurant[4].exist_desserts[1]=true;
        
        restaurant[4].desserts[2]="Milk Pudding with Nuts";
        restaurant[4].desserts_Price[2]=18.20;
        restaurant[4].pictures_desserts[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding.jpg"));
        restaurant[4].pictures_desserts_small[2]=new ImageIcon(PageRestaurant.class.getResource("milkPudding2.jpg"));
        restaurant[4].exist_desserts[2]=true;
        
        restaurant[4].desserts[3]="Milk Pudding";
        restaurant[4].desserts_Price[3]=15.20;
        restaurant[4].pictures_desserts[3]=new ImageIcon(PageRestaurant.class.getResource("milk.jpg"));
        restaurant[4].pictures_desserts_small[3]=new ImageIcon(PageRestaurant.class.getResource("milk2.jpg"));
        restaurant[4].exist_desserts[3]=true;
        
        restaurant[4].desserts[4]="Umm Ali";
        restaurant[4].desserts_Price[4]=10.50;
        restaurant[4].pictures_desserts[4]=new ImageIcon(PageRestaurant.class.getResource("umAli.jpg"));
        restaurant[4].pictures_desserts_small[4]=new ImageIcon(PageRestaurant.class.getResource("umAli2.jpg"));
        restaurant[4].exist_desserts[4]=true;
        
        restaurant[4].desserts[5]="Cream Caramel";
        restaurant[4].desserts_Price[5]=20.50;
        restaurant[4].pictures_desserts[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel.jpeg"));
        restaurant[4].pictures_desserts_small[5]=new ImageIcon(PageRestaurant.class.getResource("creamCramel2.jpeg"));
        restaurant[4].exist_desserts[5]=true;
        
        
        // drinks of the restaurant and price
        restaurant[4].drinks[0]="Nothing";
        restaurant[4].drinks_Price[0]=0;
        restaurant[4].pictures_drinks[0]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can.jpg"));
        restaurant[4].exist_drinks[0]=false;
        
        restaurant[4].drinks[1]="Pepsi Can";
        restaurant[4].drinks_Price[1]=7.01;
        restaurant[4].pictures_drinks[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can.jpg"));
        restaurant[4].pictures_drinks_small[1]=new ImageIcon(PageRestaurant.class.getResource("Pepsi-Can2.jpg"));
        restaurant[4].exist_drinks[1]=true;
        
        restaurant[4].drinks[2]="Pepsi Diet Can";
        restaurant[4].drinks_Price[2]=7.01;
        restaurant[4].pictures_drinks[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi2.jpg"));
        restaurant[4].pictures_drinks_small[2]=new ImageIcon(PageRestaurant.class.getResource("pepsi22.jpg"));
        restaurant[4].exist_drinks[2]=true;
        
        restaurant[4].drinks[3]="7 Up Can";
        restaurant[4].drinks_Price[3]=7.01;
        restaurant[4].pictures_drinks[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan.jpg"));
        restaurant[4].pictures_drinks_small[3]=new ImageIcon(PageRestaurant.class.getResource("7upCan2.jpg"));
        restaurant[4].exist_drinks[3]=true;
        
        restaurant[4].drinks[4]="7 Up Diet Can";
        restaurant[4].drinks_Price[4]=7.01;
        restaurant[4].pictures_drinks[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet.jpg"));
        restaurant[4].pictures_drinks_small[4]=new ImageIcon(PageRestaurant.class.getResource("7upDiet2.jpg"));
        restaurant[4].exist_drinks[4]=true;
        
        restaurant[4].drinks[5]="Mango Juice";
        restaurant[4].drinks_Price[5]=7.01;
        restaurant[4].pictures_drinks[5]=new ImageIcon(PageRestaurant.class.getResource("mango.jpg"));
        restaurant[4].pictures_drinks_small[5]=new ImageIcon(PageRestaurant.class.getResource("mango2.jpg"));
        restaurant[4].exist_drinks[5]=true;
        
        
        //////////////////////////////////////////////////
        
        // name of restaurant 5
        restaurant[5].rate_Restaurant=500;
        restaurant[5].delivery_cost=20.00;
        restaurant[5].delivery_time=30;
        restaurant[5].numberOfMeals=5;
        restaurant[5].numberOfDesserts=5;
        restaurant[5].numberOfDrinks=5;
        restaurant[5].rating_status="Very Good";
        restaurant[5].res_type="Sandwiches, Desserts, Beverages";
        restaurant[5].name_Restautrant="Cilantro";
        restaurant[5].picture_Restaurant="cil2.jpg";
        restaurant[5].res_img=new ImageIcon(PageRestaurant.class.getResource("cil2.jpg"));
        restaurant[5].image_res="cil3.jpg";
        
        // meals of the restaurant and price
        restaurant[5].meals[0]="Nothing";
        restaurant[5].meals_Price[0]=0.00;
        restaurant[5].pictures_meals[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[5].exist_meals[0]=false;
        
        restaurant[5].meals[1]="Croissant";
        restaurant[5].meals_Price[1]=18.00;
        restaurant[5].pictures_meals[1]=new ImageIcon(PageRestaurant.class.getResource("croissant.jpg"));
        restaurant[5].pictures_meals_small[1]=new ImageIcon(PageRestaurant.class.getResource("croissant2.jpg"));
        restaurant[5].exist_meals[1]=true;
        
        restaurant[5].meals[2]="Chocolate Chip Cookie";
        restaurant[5].meals_Price[2]=19.00;
        restaurant[5].pictures_meals[2]=new ImageIcon(PageRestaurant.class.getResource("chocolateChipCookie.jpg"));
        restaurant[5].pictures_meals_small[2]=new ImageIcon(PageRestaurant.class.getResource("chocolateChipCookie2.jpg"));
        restaurant[5].exist_meals[2]=true;
        
        restaurant[5].meals[3]="Mega Duetto";
        restaurant[5].meals_Price[3]=60.00;
        restaurant[5].pictures_meals[3]=new ImageIcon(PageRestaurant.class.getResource("megaduetto.jpg"));
        restaurant[5].pictures_meals_small[3]=new ImageIcon(PageRestaurant.class.getResource("megaduetto2.jpg"));
        restaurant[5].exist_meals[3]=true;
        
        restaurant[5].meals[4]="Classic Roast Beef";
        restaurant[5].meals_Price[4]=48.00;
        restaurant[5].pictures_meals[4]=new ImageIcon(PageRestaurant.class.getResource("classicRoastBeef.jpg"));
        restaurant[5].pictures_meals_small[4]=new ImageIcon(PageRestaurant.class.getResource("classicRoastBeef2.jpg"));
        restaurant[5].exist_meals[4]=true;
        
        restaurant[5].meals[5]="Triple Cheese Club";
        restaurant[5].meals_Price[5]=48.00;
        restaurant[5].pictures_meals[5]=new ImageIcon(PageRestaurant.class.getResource("TripleCheeseClub.jpg"));
        restaurant[5].pictures_meals_small[5]=new ImageIcon(PageRestaurant.class.getResource("TripleCheeseClub2.jpg"));
        restaurant[5].exist_meals[5]=true;
        
        
        // desserts of the restaurant and price
        restaurant[5].desserts[0]="Nothing";
        restaurant[5].desserts_Price[0]=0;
        restaurant[5].pictures_desserts[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[5].exist_desserts[0]=false;
        
        restaurant[5].desserts[1]="Molten Chocolate Cake";
        restaurant[5].desserts_Price[1]=25.50;
        restaurant[5].pictures_desserts[1]=new ImageIcon(PageRestaurant.class.getResource("molten.jpeg"));
        restaurant[5].pictures_desserts_small[1]=new ImageIcon(PageRestaurant.class.getResource("molten2.jpeg"));
        restaurant[5].exist_desserts[1]=true;
        
        restaurant[5].desserts[2]="Carrot Cake";
        restaurant[5].desserts_Price[2]=44.00;
        restaurant[5].pictures_desserts[2]=new ImageIcon(PageRestaurant.class.getResource("carrotCake.jpg"));
        restaurant[5].pictures_desserts_small[2]=new ImageIcon(PageRestaurant.class.getResource("carrotCake2.jpg"));
        restaurant[5].exist_desserts[2]=true;
        
        restaurant[5].desserts[3]="Nutella Volcano";
        restaurant[5].desserts_Price[3]=55.00;
        restaurant[5].pictures_desserts[3]=new ImageIcon(PageRestaurant.class.getResource("nutella.jpg"));
        restaurant[5].pictures_desserts_small[3]=new ImageIcon(PageRestaurant.class.getResource("nutella2.jpg"));
        restaurant[5].exist_desserts[3]=true;
        
        restaurant[5].desserts[4]="Cheesecake";
        restaurant[5].desserts_Price[4]=41.00;
        restaurant[5].pictures_desserts[4]=new ImageIcon(PageRestaurant.class.getResource("cheeseCake.jpg"));
        restaurant[5].pictures_desserts_small[4]=new ImageIcon(PageRestaurant.class.getResource("cheeseCake2.jpg"));
        restaurant[5].exist_desserts[4]=true;
        
        restaurant[5].desserts[5]="Dessert Cups";
        restaurant[5].desserts_Price[5]=70.00;
        restaurant[5].pictures_desserts[5]=new ImageIcon(PageRestaurant.class.getResource("dessertCups.jpg"));
        restaurant[5].pictures_desserts_small[5]=new ImageIcon(PageRestaurant.class.getResource("dessertCups2.jpg"));
        restaurant[5].exist_desserts[5]=true;
        
        
        // drinks of the restaurant and price
        restaurant[5].drinks[0]="Nothing";
        restaurant[5].drinks_Price[0]=0;
        restaurant[5].pictures_drinks[0]=new ImageIcon(PageRestaurant.class.getResource(" "));
        restaurant[5].exist_drinks[0]=false;
        
        restaurant[5].drinks[1]="Mocha Frappe";
        restaurant[5].drinks_Price[1]=35.00;
        restaurant[5].pictures_drinks[1]=new ImageIcon(PageRestaurant.class.getResource("drink3.jpg"));
        restaurant[5].pictures_drinks_small[1]=new ImageIcon(PageRestaurant.class.getResource("drink32.jpg"));
        restaurant[5].exist_drinks[1]=true;
        
        restaurant[5].drinks[2]="Latte Frappe";
        restaurant[5].drinks_Price[2]=35.00;
        restaurant[5].pictures_drinks[2]=new ImageIcon(PageRestaurant.class.getResource("drink4.jpg"));
        restaurant[5].pictures_drinks_small[2]=new ImageIcon(PageRestaurant.class.getResource("drink42.jpg"));
        restaurant[5].exist_drinks[2]=true;
        
        restaurant[5].drinks[3]="Affogato";
        restaurant[5].drinks_Price[3]=34.00;
        restaurant[5].pictures_drinks[3]=new ImageIcon(PageRestaurant.class.getResource("drink1.jpg"));
        restaurant[5].pictures_drinks_small[3]=new ImageIcon(PageRestaurant.class.getResource("drink12.jpg"));
        restaurant[5].exist_drinks[3]=true;
        
        restaurant[5].drinks[4]="Freddo";
        restaurant[5].drinks_Price[4]=36.00;
        restaurant[5].pictures_drinks[4]=new ImageIcon(PageRestaurant.class.getResource("drink2.jpg"));
        restaurant[5].pictures_drinks_small[4]=new ImageIcon(PageRestaurant.class.getResource("drink22.jpg"));
        restaurant[5].exist_drinks[4]=true;
        
        restaurant[5].drinks[5]="Americano";
        restaurant[5].drinks_Price[5]=26.00;
        restaurant[5].pictures_drinks[5]=new ImageIcon(PageRestaurant.class.getResource("drink5.jpg"));
        restaurant[5].pictures_drinks_small[5]=new ImageIcon(PageRestaurant.class.getResource("drink52.jpg"));
        restaurant[5].exist_drinks[5]=true;
        
        for_panel();
        num_each_type_food();
        print_data();
        
        
    }
    
    public static void for_panel()
    {
        for(int i=1; i<=number_Restaurant; ++i)
        {
            restaurant[i].num_meals_panel=restaurant[i].numberOfMeals;
            restaurant[i].num_desserts_panel=restaurant[i].numberOfDesserts;
            restaurant[i].num_drinks_panel=restaurant[i].numberOfDrinks;
        }
    }
    
    public static void num_each_type_food()
    {
        // i for number of the restaurant
        // first loop iterante for each restaurant
        for(int i=1; i<=number_Restaurant; ++i)
        {
            // second loop iterate for each meal
            for(int m=1; m<=restaurant[i].numberOfMeals; ++m)
            {
                if(restaurant[i].exist_meals[m]==false) restaurant[i].num_meals_panel--;
            }
            // third loop iterate for each dessert
            for(int d=1; d<=restaurant[i].numberOfDesserts; ++d)
            {
                if(restaurant[i].exist_desserts[d]==false) restaurant[i].num_desserts_panel--;
            }
            // forth loop iterate for each drink
            for(int dr=1; dr<=restaurant[i].numberOfDrinks; ++dr)
            {
                if(restaurant[i].exist_drinks[dr]==false) restaurant[i].num_drinks_panel--;
            }
        }
    }
    
    public static void print_data()
    {
        for(int i=PageRestaurant.numOfRestaurant; i<=PageRestaurant.numOfRestaurant; ++i)
        {
            for(int j=1; j<=restaurant[i].numberOfMeals; ++j)
                System.out.println("quantity meal bought: "+j+" = "+restaurant[i].quantity_ordered_meals[j]);
            
            for(int j=1; j<=restaurant[i].numberOfDesserts; ++j)
                System.out.println("quantity dessert bought: "+j+" = "+restaurant[i].quantity_ordered_desserts[j]);
            
            for(int j=1; j<=restaurant[i].numberOfDrinks; ++j)
                System.out.println("quantity drink bought: "+j+" = "+restaurant[i].quantity_ordered_drinks[j]);
        }
    }
}

