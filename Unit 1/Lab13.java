//group members: Lynn Tao and Kavyesh Pasham
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab13
{
   public static void diagonalBeepers(Orderer arg)
   {
      while(!arg.facingNorth())
         arg.turnLeft();
      arg.putBeeper();
      while(arg.frontIsClear())
      {
         arg.move();
         arg.turnRight();
         arg.move();
         arg.putBeeper();
         arg.turnLeft();
      }
   }
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(20, 20);
      Display.setSpeed(10);
   
      Orderer p = new Placer();
      
      p.seekBeepers();
      diagonalBeepers(p);
      
      Orderer t = new Taker();
      t.seekBeepers();
      System.out.println("My toys!");
   }
}