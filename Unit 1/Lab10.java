import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab10
{
   public static void followWallsRight(Athlete a)
   {
      while(!a.nextToABeeper())
      {
         if(a.rightIsClear())
         {
            a.turnRight();
            a.putBeeper();
            a.move();
         }
         else if(a.frontIsClear())
         {
            a.putBeeper();
            a.move();
         }
         else if(a.leftIsClear())
         {
            a.turnLeft(); 
            a.putBeeper();
            a.move();
         }
         else
         {
            a.turnAround();
            while(a.frontIsClear())
            {
               a.move();
               a.pickBeeper();
            }
            if(a.rightIsClear())
            {
               a.turnRight();
               a.move();
               a.pickBeeper();
            }
            if(!a.rightIsClear())
            {
               a.move();
               a.pickBeeper();
               a.turnLeft();
            }
         
         }
      } 
     
   }
   public static void followWallsLeft(Athlete a)
   {
      while(!a.nextToABeeper())
      {
         if(a.leftIsClear())
         {
            a.turnLeft();
            a.move();
         }
         else if(a.frontIsClear())
         {
            a.move();
         }
         else if(a.rightIsClear())
         {
            a.turnRight(); 
            a.move();
         }
         else
         {
            a.turnAround();
            a.move();
         }
      }
   
   }

   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      /*if(Math.random() < 0.5)
      {
         followWallsRight(new Athlete() );
      }
      else
      {
         followWallsLeft( new Athlete() );
      }*/
   
      followWallsRight(new Athlete() );
   
   }
}
