import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class BeeperDancer extends Athlete implements Runnable
{
   public BeeperDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public BeeperDancer()
   {
      super(5, 5, Display.NORTH, Display.INFINITY);
   }
   public void run()
   {
      for(int i=1;i<=15;i++)
      {
         putBeeper();
         move();
         turnLeft();
         if(nextToABeeper())
            pickBeeper();
      }
    
   }
}