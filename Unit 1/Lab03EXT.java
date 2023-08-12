import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03EXT
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      
      BetterClimber a = new BetterClimber(8);
         
      a.climbMountainLeft();  
      a.turnAround();
      a.climbMountainRight();  
      a.move();
   }
}