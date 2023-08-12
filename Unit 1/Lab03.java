import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      
      Climber a = new Climber(8);
      Climber b = new Climber(8);
         
      a.turnRight();
      b.turnRight();
      a.move();
      b.move();
      a.climbUpRight();
      b.climbUpRight(); 
      a.climbUpRight();
      b.climbUpRight();
      a.climbUpRight();
      b.climbUpRight(); 
     
      a.climbDownRight();
      b.climbDownRight(); 
      a.climbDownRight();
      b.climbDownRight(); 
      a.pickBeeper();
      a.turnAround();
      b.turnAround();
      
      a.climbUpLeft();
      b.climbUpLeft();
      a.climbUpLeft();
      b.climbUpLeft();
      
      a.climbDownLeft();
      b.climbDownLeft();
      a.climbDownLeft();
      b.climbDownLeft();
      a.climbDownLeft();
      b.climbDownLeft();
      a.move();
      b.move();
   
   
   }
}