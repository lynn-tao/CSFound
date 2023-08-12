//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Shifter extends Robot implements Runnable, Workable
{
   private int myBeepers;
   public Shifter(int y)
   {
      super(1, y, Display.EAST, 0);
   }
   public void run()
   {
      for(int i = 0; i<7; i++) 
      {
         move();
      }
      turnLeft();
      turnLeft();
      while(!nextToABeeper())
      {
         move();
      }
      for(int i=0; i<6; i++) 
      {
      
         while(nextToABeeper())
         {
            pickBeeper();
         }
         turnLeft();
         turnLeft();
         move();
         while(hasBeepers())
         {
            putBeeper();
         }
         turnLeft();
         turnLeft();
         move();
         while(!nextToABeeper() && frontIsClear())
         {
            move(); 
         }
                   
      }
   }
   public void workCorner()
   {
      
   }
   public void moveOneBlock()
   {
      move();
   }
   public void turnToTheRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   public void turnToTheNorth()
   {
      while(!facingNorth())
         turnLeft();
   }

      
}
     

