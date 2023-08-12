   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class Driver17
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Unit2, Lab17");
      frame.setSize(408, 438);   
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      PrizePanel1 p = new PrizePanel1();
      frame.setContentPane(p);
      p.requestFocus();
      frame.setVisible(true);
     
   }
}
