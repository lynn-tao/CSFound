import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04EXT
{
   public static void runTheField(Athlete one, Athlete two)
   {
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
      
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
   
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
      
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
   
      one.turnAround();
      two.turnAround();
      
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
      
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
   
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
      
      one.move();
      one.move();
      one.move();
      one.move();
      two.move();
      two.move();
      two.move();
      two.move();
      
   }
   public static void main(String[] args)
   {
      Display.openWorld("");
      Display.setSize(20, 20);
      Display.setSpeed(10);
      
      Athlete s1 = new Athlete();
      Athlete h1 = new Athlete();
      Athlete s2 = new Athlete(3, 1, Display.NORTH, Display.INFINITY);
      Athlete h2 = new Athlete(3, 1, Display.NORTH, Display.INFINITY);
      
      runTheField(s1, h1);
      runTheField(s2, h2);
      
   }
}
