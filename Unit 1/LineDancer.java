import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class LineDancer extends Athlete implements Runnable
{
   public LineDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public LineDancer()
   {
      super(1, 1, Display.EAST, Display.INFINITY);
   }
   public void run()
   {
      for(int k=1; k<=8; k++)
      {
         for(int i=1; i<=8; i++)
         {
            move();
         }
         putBeeper();
         turnAround();
         for(int j=1; j<=8; j++)
         {
            move();
         }
         putBeeper();
         turnAround();
      }
   
   }
}