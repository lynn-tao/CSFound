//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Display10 extends JPanel
{
   private JLabel[] bits;
   public Display10()
   {
      setLayout(new GridLayout(1, 8));
      bits = new JLabel[8];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }
      randomize();
   }
   public void randomize()
   {
      for(int x = 0; x < bits.length; x++)
      {
         int i = (int)(Math.random()*2);
         bits[x].setText("" + i);
      }
   }
   public void reverse()
   {
      int array[]=new int[8];
      for(int x = 0; x < bits.length; x++)
      {
         array[x] = Integer.parseInt(bits[x].getText());
      }
      for(int x = 0; x < bits.length; x++)
      {
         int a =  array[bits.length-(x+1)];
         bits[x].setText("" + a);
      }
   
   }
   public void shift()
   {
      int array[]=new int[8];
      for(int x = 0; x < bits.length; x++)
      {
         array[x] = Integer.parseInt(bits[x].getText());
      }
      for(int x = 0; x < bits.length-1; x++)
      {
         int a =  array[x+1];
         bits[x].setText("" + a);
      }
      bits[7].setText("0");
   
   }
   public void rotate()
   {
      int array[]=new int[8];
      for(int x = 0; x < bits.length; x++)
      {
         array[x] = Integer.parseInt(bits[x].getText());
      }
      for(int x = 0; x < bits.length-1; x++)
      {
         int a =  array[x+1];
         bits[x].setText("" + a);
      }
      bits[7].setText(""+array[0]);
   
   }
}