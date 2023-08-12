 //name:    date:  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Driver04
{
   public static void main(String[] args) 
   {
     
      Scanner infile = null; 
      try
      {
         String filename = JOptionPane.showInputDialog("Enter filename");
         infile = new Scanner( new File(filename) ); 
      }
      catch(FileNotFoundException e) 
      {
         JOptionPane.showMessageDialog(null, "Cmon, watch your typing!");
         System.exit(0);
      }
      double[] array = new double[infile.nextInt()];
      for(int x = 1; x < array.length; x++)
      {          
         array[x] = infile.nextDouble();
      }
      infile.close();
      System.out.println("The sum is: " + sum(array)); 
      System.out.println("The average is: " + average(array));
      System.out.println("The minimum is: " + min(array));
      System.out.println("The maximum is: " + max(array));
   }
   public static double sum(double[] array)
   { 
      double total = 0;
      for (int i=1; i<array.length; i++)
      {
         total += array[i];
      }
      return total;
   }
   public static double average(double[] array)
   { 
      return sum(array)/array.length;
   
   }
   public static double min(double[] array)
   { 
      double minimum = array[1];
      for (int i=1; i<array.length; i++)
      {
         minimum = Math.min(array[i], minimum);
         
      }
      return minimum;
   }
   public static double max(double[] array)
   { 
      double maximum = array[0];
      for (int i=1; i<array.length; i++)
      {
         maximum = Math.max(array[i], maximum);
         
      }
      return maximum;
   
      
   }
}
/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477

*************************************/