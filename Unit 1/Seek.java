import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Seek extends Athlete
{
   public Seek()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public Seek(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void fetchBeeper()
   {
      while(!nextToABeeper())
      {
         for(int i=
      }
      
      
      pickBeeper();
      while(!facingSouth())
      {
         turnRight();
      }
      while(frontIsClear())
      move();
      turnRight();
      while(frontIsClear())
      move();
   }

}
