import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05EXT
{

   public static void main(String[] args)
   {
      Display.openWorld("");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Robot algo = new Robot(1, 1, Display.NORTH, 36);
      
      for(int i=8; i>0; i--)
      {
         for(int k=0; k<i; k++)
         {
            algo.putBeeper();
         }
         algo.move();
      }
      
     
   }
}