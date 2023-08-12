import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab09

{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(18, 16);
      Display.setSpeed(10);
     
      Athlete a = new Athlete(1, 1, Display.EAST, 0);
        
      for(int i = 1; i<8; i++) 
      {
         a.move();
      }
      a.turnAround();
      while(a.frontIsClear())
      {
         while(!a.nextToABeeper())
         {
            a.move();
         } 
         while(a.nextToABeeper())
         {
            a.pickBeeper();
         }
         a.turnAround();
         a.move();
         while(a.hasBeepers())
         {
            a.putBeeper();
         }
         a.turnAround();
         a.move();
         while(!(a.nextToABeeper()||!a.frontIsClear()))
         {
            a.move();
         }
      }
      if(a.nextToABeeper())
      {
         {
            a.pickBeeper();
         }
         a.turnAround();
         a.move();
         if(a.hasBeepers())
         {
            a.putBeeper();
         }
         a.turnAround();
         a.move();
      }
   
    
   }

}




