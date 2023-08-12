import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab14EXT
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Racer a = new Racer(1);
      Racer b = new Racer(4);
      Racer c = new Racer(7);
      Thread t1 = new Thread( a );
      Thread t2 = new Thread( b );
      Thread t3 = new Thread( c );
      t1.start();
      t2.start();
      t3.start();
   
   
   }
}