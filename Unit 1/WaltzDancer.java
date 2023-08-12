import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class WaltzDancer extends Athlete implements Runnable
{
   public WaltzDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public WaltzDancer()
   {
      super(5, 5, Display.NORTH, 0);
   }
   public void run()
   {
      for(int i=1;i<=8;i++)
      {
         move();
         turnLeft();
         move();
         turnRight();
         move();
         turnRight();
         move();
      }
    
   }
}