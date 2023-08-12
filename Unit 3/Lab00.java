import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
public class Lab00{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab06LastFirstSpriteTester");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00());
      frame.setVisible(true);
   }
}