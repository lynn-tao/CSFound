import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02EXT
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8, 8);
      Display.setSpeed(10);
      
      Athlete lisa = new Athlete();
      
      lisa.putBeeper();
      lisa.putAndMove();
      lisa.turnRight();
      lisa.putAndMove();
      lisa.turnRight();
      lisa.putAndMove();
      lisa.turnLeft();
      lisa.putAndMove();
      lisa.turnLeft();
      lisa.putAndMove();
      lisa.turnRight();
      lisa.putAndMove();
      lisa.putAndMove();
      lisa.turnRight();
      lisa.putAndMove();
      lisa.turnLeft();
      lisa.putAndMove();
      lisa.turnLeft();
      lisa.putAndMove();
      lisa.putAndMove();
      lisa.putAndMove();
      lisa.putAndMove();
      lisa.turnRight();
      lisa.putAndMove();
      lisa.putAndMove();
   
   }
}
