
//group members: Lynn Tao and Kavyesh Pasham
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Placer extends Orderer 
{
   public Placer()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public Placer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void order()
   {
      
   }
   public void seekBeepers()
   {         while(frontIsClear())
      {
         while(frontIsClear())
         {
            move();
            if(nextToABeeper())
               order();
         }
         if(nextToABeeper())
            order();
         turnRight();
         if(frontIsClear())
         {
            move();
            turnRight();
            if(nextToABeeper())
               order();
         }
         while(frontIsClear())
         {
            move();
            if(nextToABeeper())
               order();
         }
         if(nextToABeeper())
            order();
         turnLeft();
         if(frontIsClear())
         {
            move();
            turnLeft();
         }
         if(nextToABeeper())
            order();
      
      }
      while(!facingSouth())
         turnLeft();
      while(frontIsClear())
      {
         move();
      }
      turnRight();
      while(frontIsClear())
         move();
      
   
   
         
   }
}