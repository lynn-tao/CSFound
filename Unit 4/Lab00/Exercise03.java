import java.io.*;
import java.util.*;
public class Exercise03
{
   public static final int NUMITEMS = 3;
   public static void main(String[] args) throws Exception 
   {
      Scanner infile = new Scanner( new File("diskfile.txt") ); 
      String s = infile.next();
      double d = infile.nextDouble();
      double e = infile.nextDouble();
      int n = infile.nextInt();
      infile.close();
      System.out.print("You read: " + s + ", " + d + ", " + e + ", " + n);      
   }
}