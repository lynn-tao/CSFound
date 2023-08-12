import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
public class Lab05{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab06LastFirstSpriteTester");
      frame.setSize(375,200);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel05());
      frame.setVisible(true);
   }
}