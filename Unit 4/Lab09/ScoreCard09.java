//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
   private JTextField[] input;
   public ScoreCard09()
   {
      setLayout(new GridLayout(2, 18));
   
      for(int x = 1; x <= 18; x++)
      {
         add(new JLabel("" + x, SwingConstants.CENTER));
      }
   
      input = new JTextField[18];
      for(int x = 0; x < input.length; x++)
      {
         input[x] = new JTextField();
         add(input[x]);
      }
   }
   public void randomize()
   {
      for(int x = 0; x < input.length; x++)
      {
         int i = (int)(Math.random()*4+1);
         input[x].setText(""+ i);
      }
   
   }
   public int findTotal()
   {
      int total = 0;
      for(int x = 0; x < input.length; x++)
      {
         
         total+=Integer.parseInt(input[x].getText());
      }
      return total;
   }
   public int findAces()
   {
      int count = 0;
      for(int i = 0; i < input.length; i++)
      {
         if(Integer.parseInt(input[i].getText()) ==1)
         {
            count++;
         }
      }
      return count;
   
   }
   public int findHardestHole()
   {
      int hole = Integer.parseInt(input[0].getText());
      for(int i = 1; i < input.length; i++)
      {
         hole = Math.max(hole, Integer.parseInt(input[i].getText()));
      }
      System.out.print(""+hole);
      for(int a = 0; a < input.length+1; a++)
      {
         if(Integer.parseInt(input[a].getText())==hole)
         {
         System.out.print(""+(a+1));
            return a+1;
                           }
      }
      
   return -1;
   }
}