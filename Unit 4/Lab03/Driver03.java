   //Name______________________________ Date_____________
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import java.text.DecimalFormat;
public class Driver03
{
   
   public static void main(String[] args) throws Exception
   {
      Scanner string = new Scanner(System.in);
      System.out.print("Text file?");
      System.out.println();
      String sting1 = string.next();
      string.close();
      
      Scanner keyboard = new Scanner(new File(sting1));
      DecimalFormat decimalFormat = new DecimalFormat("0.0");
   
      int count = 0;
      double fahrenheit[] = new double[count];
      
      Scanner keyboard2 = new Scanner(new File(sting1));
      
      for(int x = 0; x < count; x++)
      {          
         fahrenheit[x] = keyboard2.nextDouble();
      }
      keyboard.close();
      keyboard2.close();
      double celsius[] = new double[count];
      System.out.print("Fahrenheit\t\t|\tCelsius\n-----------|-------------\n");
      for(int x = 0; x < count; x++)
      {          
         celsius[x] = 5./9*(fahrenheit[x]-32);
         System.out.println(decimalFormat.format(fahrenheit[x]) + "\t\t|\t\t" + decimalFormat.format(celsius[x]));
      }
      
   }
}
	/************************************
	Fahrenheit      | Celsius
	----------------|-------------------
	5.0             | -15.0
	10.0            | -12.222222222222221
	15.0            | -9.444444444444445
	20.0            | -6.666666666666667
	25.0            | -3.888888888888889
	26.0            | -3.3333333333333335
	28.0            | -2.2222222222222223
	31.0            | -0.5555555555555556
	37.0            | 2.7777777777777777
	45.0            | 7.222222222222222
	48.0            | 8.88888888888889
	51.0            | 10.555555555555555
	75.0            | 23.88888888888889
	98.6            | 37.0
	212.0           | 100.0
	451.0           | 232.77777777777777
	32.0            | 0.0
	0.0             | -17.77777777777778
	9.29            | -12.616666666666667
	19.77           | -6.794444444444445

	END OF EXECUTION, press any key:
	*************************************/