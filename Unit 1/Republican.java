import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Republican extends MazeEscaper implements Runnable
{
   public void walkDownCurrentSegment()
   {
      if(frontIsClear()&&!rightIsClear())
      {
         move();
      }
    
   }
   public void turnToTheNextSegment()
   {
      if(rightIsClear())
      {
         turnRight();
         move();
      }
      else
         turnLeft();
   }
   public void run()
   {
      if(frontIsClear()&&!rightIsClear())
      {
         move();
      }
      while(!nextToABeeper())
      {
         if(rightIsClear())
         {
            turnRight();
            move();
         }
         else
            turnLeft();
         if(frontIsClear()&&!rightIsClear())
         {
            move();
         }
      
      }
   }
  

   
}