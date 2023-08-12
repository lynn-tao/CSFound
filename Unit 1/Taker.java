//group members: Lynn Tao and Kavyesh Pasham
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Taker extends Orderer 
{
   public Taker()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public Taker(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void order()
   {
      pickBeeper();
   }
   public void seekBeepers()
   {
      //solution code
      while(frontIsClear())
      {
         if(nextToABeeper())
            pickBeeper();
         move();
         turnRight();
         move();
         while(!facingNorth())
            turnLeft();
      }
      pickBeeper();
      explode();
   }
}