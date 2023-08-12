import java.io.*;
public class P7_Tao_Lynn_Driver07
{
   public static void main(String[] args) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream("P7_Tao_Lynn_output.txt")));
      System.out.println("Shapes");
      System.out.println("------");
   
      Shape[] theArray = new Shape[(int)(Math.random()*11+45)]; 
      for (int i=0; i<theArray.length; i++)
      {
         int r = (int)(Math.random()*4);
         if(r == 0)
         {
            theArray[i] = new P7_Tao_Lynn_Circle(Math.random()*50+50);
            theArray[i].findArea(); 
         }
         if(r == 1)
         {
            theArray[i] = new P7_Tao_Lynn_Square(Math.random()*50+50);
            theArray[i].findArea();
         }
         if(r == 2)
         {
            theArray[i] = new P7_Tao_Lynn_Rectangle(Math.random()*50+50, Math.random()*50+50);
            theArray[i].findArea();
         }
         if(r == 3)
         {
            theArray[i] = new P7_Tao_Lynn_Triangle(Math.random()*50+50);
            theArray[i].findArea();
         }
         System.out.println("Area:\t" + theArray[i].findArea() + "\t\t\t" + theArray[i]);
      }   
   }
}