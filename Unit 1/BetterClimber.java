import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class BetterClimber extends Athlete
{
   public BetterClimber()
   {
      super();
   }
   public BetterClimber(int x)
   {
      super(x, 1, Display.NORTH, 1);
   }
   public void climbUpRight()
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
   public void climbUpLeft()
   {
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
   public void climbDownRight()
   {
      move();
      turnRight();
      move();
      move();
      turnLeft();
   }
   public void climbDownLeft()
   {
      move();
      turnLeft();
      move();
      move();
      turnRight();    
   }
   public void climbMountainRight()
   {
      climbUpRight();
      climbUpRight();
      climbUpRight();
      climbDownRight();
      climbDownRight();        
      climbDownRight();
      
   }
   public void climbMountainLeft()
   {
      turnLeft();
      move();
      climbUpLeft();
      climbUpLeft();
      climbUpLeft();
      climbDownLeft();
      climbDownLeft();
      climbDownLeft();
     
   }


}