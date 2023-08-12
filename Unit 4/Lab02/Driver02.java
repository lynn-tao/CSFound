   //Name:                 Date:
import java.util.Scanner;
public class Driver02
{
   public static final int NUMITEMS = 10;
   public static void main(String[] args)
   {
      double[] fahrenheit = new double[NUMITEMS];
      double[] celsius = new double[NUMITEMS];
      Scanner keyboard = new Scanner(System.in);
      for(int x = 0; x < NUMITEMS; x++)
      {
         System.out.print("#" + (x+1) + ":  ");
         fahrenheit[x] = keyboard.nextDouble();
      }
      System.out.print("Fahrenheit\t\t|\tCelsius\n-----------|-------------\n");
      for(int x = 0; x < NUMITEMS; x++)
      {
         celsius[x] = 5./9*(fahrenheit[x]-32);
         System.out.println(fahrenheit[x]+ "\t\t|\t\t" + celsius[x]);
      }
      
                     
    
         
         
        
   }
}