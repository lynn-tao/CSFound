import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class TryCatch
{
   public static void main(String[] args) 
   {
      Scanner infile = null; 
      int counter = 0;
      boolean rightName = false;
      while (!rightName && counter < 3)
      {
         try
         {
            String filename = JOptionPane.showInputDialog("Enter filename");
            infile = new Scanner( new File(filename) ); 
            rightName = true;
         }
         catch(FileNotFoundException e) 
         {
            JOptionPane.showMessageDialog(null, "Error: File not found.");
            counter++;
         
         }
      }
      if (counter == 3)
      {
         JOptionPane.showMessageDialog(null, "Exceeds three time, baibai");
         System.exit(0);
      }
   }
}