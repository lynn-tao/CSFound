//Lynn Tao Period 7
import javax.swing.JFrame;
public class TTaoLynnDriver01
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab01");   
      frame.setSize(600, 500);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(
                       JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TTaoLynnPanel01());
      frame.setVisible(true);
   
   }
  
}

