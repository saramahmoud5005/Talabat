/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone;
//import java.awt.geom.RoundRectangle2D;
//import java.awt.image.ImageObserver;
//import java.text.AttributedCharacterIterator;
//import java.util.Map;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Owner
 */
public class cr {
    public void edit_Image(String pic)
    {
       ImageIcon dabIcon = new ImageIcon(pic);
       Image dabImage = dabIcon.getImage();
       Image modifiedDabImage = dabImage.getScaledInstance(140, 110,java.awt.Image.SCALE_SMOOTH);
       dabIcon = new ImageIcon(modifiedDabImage);
    }
}
