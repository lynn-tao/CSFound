import edu.fcps.karel2.*;
public class Lab12EXT
{
   public static void work_one_row(Workable arg, int n)
   {
      for(int k = 1; k <= n; k++)
      {
         arg.workCorner();
         if(k<n)
         {
            arg.turnToTheRight();
         }
         else if(k==n)
         {
            arg.moveOneBlock(); 
            arg.turnToTheRight();
         }
      }
   }
   public static void work_8x8_square(Workable arg)
   { //precondition: arg must be at lower-left corner of square
      work_one_row(arg, 7);
      for(int k = 7; k >= 1; k--)
      {
         arg.turnToTheRight();
         work_one_row(arg, k);
         arg.turnToTheRight();
         work_one_row(arg, k);
      }
      arg.workCorner();
   }
   public static void main(String[] args)
   {
      Display.openWorld("");
      Display.setSize(23, 23);
      Display.setSpeed(10);
      
      GridLayer g = new GridLayer(1, 1);
      work_8x8_square( g );
      g.turnLeft();
      g.turnLeft();
      g.move();
      g.move();
      g.pickBeeper();
      g.move();
      g.move();
      g.putBeeper();
      g.turnLeft();
      g.move();
      g.putBeeper();
      g.turnLeft();
      g.move();
      g.move();
      g.pickBeeper();
   }
}