 //name:    date:  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Driver08
{
   public static void main(String[] args) throws Exception
   {
      Scanner string = new Scanner( new File("words.txt") ); 
      String array[] = new String[string.nextInt()];
      for(int x = 0; x < string.nextInt(); x++)
      {          
         array[x] = string.next();
      }
      
   }
   public static double sum(double[] array)
   { 
      double total = 0;
      for (int i=0; i<array.length; i++)
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
      double minimum = array[0];
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