/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import static talabat.clone.PageRestaurant.type;

//public class mouse_Listener extends PageRestaurant implements MouseListener,MouseWheelListener,MouseMotionListener
//    {
//        int number_res;
//        //PageRestaurant object1=new PageRestaurant(number_res);
//
//        public mouse_Listener(int numberOfRestaurant)
//        {
//             number_res=numberOfRestaurant;
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent me) {
//  
//     
//            if(me.getSource()==meals)
//            {
//                type="Meals";
//                System.out.println("meals_Clicked");
//                PageRestaurant.numberOfPage=1;
//                PageRestaurant object2=new PageRestaurant(number_res);
//                frame.setVisible(false);
//            }
//            // if the user click desserts
//            else if(me.getSource()==desserts)
//            {
//                type="Desserts";
//                System.out.println("desserts_Clicked");
//                PageRestaurant.numberOfPage=2;
//                PageRestaurant object2=new PageRestaurant(number_res);
//                frame.setVisible(false);
//            }
//            // if the user click drinks
//            else if(me.getSource()==drinks)
//            {
//                type="Drinks";
//                System.out.println("drinks_Clicked");
//                PageRestaurant.numberOfPage=3;
//                PageRestaurant object2=new PageRestaurant(number_res);
//                frame.setVisible(false);
//            }
//            
//            int numOfFood=0;
//            if(PageRestaurant.numberOfPage==1) numOfFood=res.restaurant[number_res].numberOfMeals;
//            else if(PageRestaurant.numberOfPage==2) numOfFood=res.restaurant[number_res].numberOfDesserts;
//            else if(PageRestaurant.numberOfPage==3) numOfFood=res.restaurant[number_res].numberOfDrinks;
//            for(int i=1; i<=numOfFood; ++i)
//            {
//                if(me.getSource()==labels[i])
//                {
//                    if(PageRestaurant.numberOfPage==1) System.out.println(res.restaurant[number_res].meals[i]);
//                    else if(PageRestaurant.numberOfPage==2) System.out.println(res.restaurant[number_res].desserts[i]);
//                    else if(PageRestaurant.numberOfPage==3) System.out.println(res.restaurant[number_res].drinks[i]);   
//                }
//            }
//
//        }
//        @Override
//        public void mousePressed(MouseEvent me) {}
//
//        @Override
//        public void mouseReleased(MouseEvent me) {}
//        
//        @Override
//        public void mouseEntered(MouseEvent me) {}
//
//        @Override
//        public void mouseExited(MouseEvent me) {}
//
//        @Override
//        public void mouseWheelMoved(MouseWheelEvent mwe) {}
//
//        @Override
//        public void mouseDragged(MouseEvent me) {}
//
//        @Override
//        public void mouseMoved(MouseEvent me) {}
//
//       
//    }