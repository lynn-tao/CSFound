//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Swimmer extends Robot implements Runnable
{
   public Swimmer(int x)
   {
      super(x, 1, Display.NORTH, 0);
   }
   public void run() //not swim
   {
      for(int k=1; k<=10; k++)
      {
         for(int i=1; i<=8; i++)
         {
            move();
         }
         turnLeft();
         turnLeft();
         for(int i=1; i<=8; i++)
         {
            move();
         }
         turnLeft();
         turnLeft();
      }
   
   }
}