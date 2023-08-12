
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab09EXTT

{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(7, 7);
      Display.setSpeed(10);
     
      Athlete a = new Athlete(1, 1, Display.NORTH, 0);
     
      int columnOne = 0;
      while(a.nextToABeeper())
      {
         a.pickBeeper();
         columnOne++;
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
      a.turnLeft();
     
      a.move();
      int columnTwo = 0;
      a.turnLeft();
      while(a.nextToABeeper())
      {
         a.pickBeeper();
         columnTwo++;
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
      a.turnLeft();
     
    
      a.move();
      int columnThree = 0;
      a.turnLeft();
      while(a.nextToABeeper())
      {
         a.pickBeeper();
         columnThree++;
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
      a.turnLeft();
   
     
      a.move();
      int columnFour = 0;
      a.turnLeft();
      while(a.nextToABeeper())
      {
         a.pickBeeper();
         columnFour++;
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
      a.turnRight();
      while(a.frontIsClear())
         a.move();
      a.turnRight();
     
     
      for(int k=1; k<=3; k++)
      {
         a.move();
      }
      a.turnRight();
      for(int i=0; i<columnOne; i++)
      {
         a.putBeeper();
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
   
      a.turnLeft();
      a.move();
      a.turnLeft();
      for(int l=0; l<columnTwo; l++)
      {
         a.putBeeper();
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
   
      a.turnLeft();
      a.move();
      a.turnLeft();
      for(int m=0; m<columnThree; m++)
      {
         a.putBeeper();
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
     
     
      a.turnLeft();
      a.move();
      a.turnLeft();
      for(int s=0; s<columnFour; s++)
      {
         a.putBeeper();
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
         a.move();
   
   
   
   
   
   
   }
}

