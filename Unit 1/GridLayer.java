import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class GridLayer extends Robot implements Workable
{
   public GridLayer(int x, int y)
   {
      super(x, y, Display.EAST, Display.INFINITY);
   }
   public GridLayer()
   {
      super(1, 1, Display.EAST, Display.INFINITY);
   }
   public void workCorner()
   {
      putBeeper();
      move();
      putBeeper();
      turnLeft();
      move();
      putBeeper();
      turnLeft();
      move();
      putBeeper();
      turnToTheRight();
      move();
      move();
    
   }
   public void moveOneBlock()
   {
      move();
   
     
   }
   public void turnToTheRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   public void turnToTheNorth()
   {
      while(!facingNorth())
         turnLeft();
   }
}
