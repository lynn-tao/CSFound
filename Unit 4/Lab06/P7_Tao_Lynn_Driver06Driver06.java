//Name______________________________ Date_____________
import java.io.*;
public class P7_Tao_Lynn_Driver06Driver06
{
   public static void main(String[] args) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream("P7_Tao_Lynn_output.txt")));
   
   //create the objects
      P7_Tao_Lynn_Circle c = new P7_Tao_Lynn_Circle(75);
      P7_Tao_Lynn_Rectangle r = new P7_Tao_Lynn_Rectangle(30.0, 40.0);       
      P7_Tao_Lynn_Square s = new P7_Tao_Lynn_Square(50.0);			 	
      P7_Tao_Lynn_Triangle t = new P7_Tao_Lynn_Triangle(37);                
   
      System.out.println("Circle");
      System.out.println("------");
      System.out.println("Radius: " + c.getRadius());
      System.out.println("Area: " + c.findArea());
      System.out.println("Circumference: " + c.findCircumference());
      System.out.println();
   
      System.out.println("Rectangle");
      System.out.println("---------");
      System.out.println("Base: " + r.getBase());
      System.out.println("Height: " + r.getHeight());
      System.out.println("Area: " + r.findArea());
      System.out.println("Perimeter: " + r.findPerimeter());
      System.out.println("Diagonal: " + r.findDiagonal());
      System.out.println();
      
      System.out.println("Square");
      System.out.println("------");
      System.out.println("Side: " + s.getSide());
      System.out.println("Area: " + s.findArea());
      System.out.println("Perimeter: " + s.findPerimeter());
      System.out.println("Diagonal: " + s.findDiagonal());
      s.setmySide(10.0);
      System.out.println("New side: " + s.getSide());
      System.out.println("New area: " + s.findArea());	
      System.out.println(); 
   
      System.out.println("Triangle");
      System.out.println("--------");
      System.out.println("Side: " + t.getSide());
      System.out.println("Area: " + t.findArea());
      System.out.println("Perimeter: " + t.findPerimeter());
   
      System.out.println();
   }
}