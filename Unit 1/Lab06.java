   //Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(12, 12);
      Display.setSpeed(8);
      
      task_01(); //go to the end of the row of beepers
      task_02(); //go to the beeper
      task_03(); //go to the wall
      task_04(); //go to the wall, pick up all the beepers (max one per pile)
      task_05(); //go to the wall, pick up all the beepers
      task_06();
      task_07();
      task_08();
      task_09();
      task_10();
      task_11();
      task_12();//go to the end of the row of beepers, there is one gap
   }
   public static void task_01()	
   { //go to the end of the row of beepers
      Robot temp = new Robot(1, 1, Display.EAST, 0);
      while(temp.nextToABeeper())
         temp.move();
   }
   public static void task_02()	
   { //go to the beeper
      Robot temp = new Robot(1, 2, Display.EAST, 0);
      while(!temp.nextToABeeper())
         temp.move();
   }
   public static void task_03()	
   { //go to the wall
      Robot temp = new Robot(1, 3, Display.EAST, 0);
      while(temp.frontIsClear())
         temp.move();
   }
   public static void task_04()	
   { //go to the wall, picking up the single beepers 
      Robot temp = new Robot(1, 4, Display.EAST, 0);
      int count = 0;
      while(temp.nextToABeeper())
      {
         temp.pickBeeper();
         count++;
      }
      while(temp.frontIsClear())
      {
         temp.move();
         while(temp.nextToABeeper())
         {
            temp.pickBeeper();
            count++;
         }
      }
      System.out.println("The number of beepers is: " + count);
   
   }
   public static void task_05()	
   { //go to the wall, picking up the piles of beepers
      Robot temp = new Robot(1, 5, Display.EAST, 0);
      int beepers = 0; 
      while(temp.frontIsClear())
      {
         temp.move();
         while(temp.nextToABeeper())
         {
            temp.pickBeeper();
            beepers++;
         }
      }
      while(temp.nextToABeeper())
      {
         temp.pickBeeper();
         beepers++;
      }
      System.out.println("The number of beepers is: " + beepers);
   
      
   }
   public static void task_06()
   { //go to the end of the row of beepers, there is one gap
      Robot temp = new Robot(1, 6, Display.EAST, 0);
      while(!temp.nextToABeeper())
      {
         temp.move();
      }
   
      while(temp.nextToABeeper())
      {
         temp.move();
      }
      temp.move();
      while(temp.nextToABeeper())
      {
        
         temp.move();
      }
   }
   public static void task_07()
   { 
      Robot temp = new Robot(1, 7, Display.EAST, 0);
      int count=0;
      while(temp.frontIsClear()&&!temp.nextToABeeper())
      {
         temp.move();
         count++;
      } 
      System.out.println("The number of steps is: " + count);
     
   }
   public static void task_08()
   { 
      Robot temp = new Robot(1, 8, Display.EAST, 6);
      Robot a = new Robot(10, 8, Display.EAST, 0);
      while(!temp.nextToARobot())
      {
         temp.move();
      
      } 
      while(temp.hasBeepers())
         temp.putBeeper();
   
   }
   public static void task_09()
   { 
      Robot temp = new Robot(1, 9, Display.EAST, 20);
      for(int i=0; i<5; i++)
      {
         for(int j=0; j<4; j++)
         {
            temp.putBeeper();
         
         }
         temp.move();
      }
   
   }
   public static void task_10()
   { 
      Robot temp = new Robot(1, 10, Display.EAST, 6);
    
      while(temp.frontIsClear())
      {
         temp.move();
         while(!temp.nextToABeeper())
            temp.putBeeper();
      } 
     
   
   }

   public static void task_11()
   { 
      Robot temp = new Robot(1, 11, Display.EAST, 8);
   
      while(temp.rightIsClear())
      {
         temp.move();
      } 
      while(!temp.rightIsClear())
      {
         temp.putBeeper();
         temp.move();
      }
      if(temp.rightIsClear())
      {
         temp.move();
      } 
      while(!temp.rightIsClear())
      {
         temp.putBeeper();
         temp.move();
      }
      if(temp.rightIsClear())
      {
         temp.move();
      } 
      while(!temp.rightIsClear())
      {
         temp.putBeeper();
         temp.move();
      }
   
   
       
   
         
   
   }
   public static void task_12()
   { 
      Robot temp = new Robot(1, 12, Display.EAST, 6);
      while(!(temp.nextToABeeper()&&!temp.rightIsClear()))
      {
         temp.move();
      
      } 
   
   
   }
}