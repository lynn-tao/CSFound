import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05
{
   public static void runTheRace(Racer arg)
   {
      arg.shuttle(2, 7);
      arg.shuttle(4, 5);
      arg.shuttle(6, 3);
      arg.move();
   
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Racer a = new Racer(1);
      Racer b = new Racer(4);
      Racer c = new Racer(7);
      
      runTheRace(a);
      runTheRace(b);
    
      runTheRace(c);
   
   }
}