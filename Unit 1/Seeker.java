
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Seeker extends Athlete
{
   public Seeker()
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   public Seeker(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void fetchBeeper()
   {
      while(!rightIsClear())
      {
         move();
      }
      turnRight();
      move();
      
      turnRight();
      while(!nextToABeeper())
      {
         move();
      }
      pickBeeper();
      turnAround();
      while(!leftIsClear())
      {
         move();
      }
      turnLeft();
      move();
   
      turnLeft();
      while(frontIsClear())
      {
         move();
      }
   
   }

}
