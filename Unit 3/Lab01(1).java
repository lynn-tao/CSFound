import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
public class Lab01{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab06LastFirstSpriteTester");
      frame.setSize(200,100);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel01());
      frame.setVisible(true);
   }
}