import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Democrat extends MazeEscaper implements Runnable
{
   public void walkDownCurrentSegment()
   {
      if(frontIsClear()&&!leftIsClear())
      {
         move();
      }
    
   }
   public void turnToTheNextSegment()
   {
      if(leftIsClear())
      {
         turnLeft();
         move();
      }
      else
         turnRight();
   }
   public void run()
   {
      if(frontIsClear()&&!leftIsClear())
      {
         move();
      }
      while(!nextToABeeper())
      {
         if(leftIsClear())
         {
            turnLeft();
            move();
         }
         else
            turnRight();
         if(frontIsClear()&&!leftIsClear())
         {
            move();
         }
      }
   }
}