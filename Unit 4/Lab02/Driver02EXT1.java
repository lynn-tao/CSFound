   //Name:                 Date:
import java.util.Scanner;
import java.text.DecimalFormat;
public class Driver02EXT1
{
   public static final int NUMITEMS = 15;
   public static void main(String[] args)
   {
      double[] fahrenheit = new double[NUMITEMS];
      double[] celsius = new double[NUMITEMS];
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat decimalFormat = new DecimalFormat("0.0");
      for(int x = 0; x < 10; x++)
      {
         System.out.print("#" + (x+1) + ":  ");
         fahrenheit[x] = keyboard.nextDouble();
      }
      System.out.print("Fahrenheit\t\t|\tCelsius\n-----------|-------------\n");
      for(int x = 0; x < 10; x++)
      {
         celsius[x] = 5./9*(fahrenheit[x]-32);
         
         System.out.println(fahrenheit[x]+ "\t\t|\t\t" + decimalFormat.format(celsius[x]));
      }
      for(int j=0; j<5; j++)
      {
         double f = Math.random()*1001;
         double c= 5./9*(f -32);
         System.out.println(decimalFormat.format(f)+ "\t\t|\t\t" + decimalFormat.format(c));
      }
         
      
      
                     
    
         
         
        
   }
}