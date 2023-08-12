//group members: Lynn Tao and Kavyesh Pasham
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public abstract class Orderer extends Athlete 
{
   public Orderer(int x, int y, int dir, int beep)
   {
      super(x,y,dir,beep);
   }
   public abstract void order();
   public void seekBeepers()
   {
     /*karel.tralalalalalalalalalalala();
     jUsT gEt rId oF tHe sUpEr XXXXXX
     i oVeRrOdE tHeM sksksksks anna oup
     -Lynn Tao                   */
     while(frontIsClear())
     {
     if(nextToABeeper())
     pickBeeper();
     move();
     }
     turnRight();
     if(frontIsClear())
     {
     move();
     turnRight();
     }
     while(frontIsClear())
     {
     if(nextToABeeper())
     pickBeeper();
     move(); 
   }
 
}
}