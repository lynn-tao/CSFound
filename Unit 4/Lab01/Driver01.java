import java.util.Scanner;
public class Driver01
{
   public static final int NUMITEMS = 10;
   public static void main(String[] args)
   {
      double[] array = new double[NUMITEMS];
      Scanner keyboard = new Scanner(System.in);
      for(int x = 0; x < NUMITEMS; x++)
      {
         System.out.print("#" + (x+1) + ":  ");
         array[x] = keyboard.nextDouble();
      }
      
      System.out.println("The sum is:" + sum(array)); 
      System.out.println("The average is:" + average(array));
      System.out.println("The minimum is:" + min(array));
      System.out.println("The maximum is:" + max(array));
   
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


