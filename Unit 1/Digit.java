import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;


public abstract class Digit
{
   private Robot myLED;
   public Digit(int x, int y)
   {
      myLED = new Robot(x, y, Display.EAST, Display.INFINITY);
   } 
   public abstract void display();  
   public void segment1_On()
   {
      for(int i=1; i<=3; i++)
      {
         myLED.move();
         myLED.putBeeper();
      }
      myLED.move();
   
   }
   public void segment1_Off()
   {
      for(int i=1; i<=4; i++)
      {
         myLED.move();
      }
   
   
   }
   public void segment2_On()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
      }
     
   
     
   }
   public void segment2_Off()
   {
     
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.move();
      }
   
   }

   public void segment3_On()
   {
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
      }
   
     
   }
   public void segment3_Off()
   {
      for(int i=1; i<=4; i++)
      {
         myLED.move();
      }
   }

   public void segment4_On()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
      }
   
     
   }
   public void segment4_Off()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.move();
        
      }
   }

   public void segment5_On()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
        
        
      }
   
   }
   public void segment5_Off()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.move();
        
      }
   }

   public void segment6_On()
   {
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
        
      }
   
   }
   public void segment6_Off()
   {
      for(int i=1; i<=4; i++)
      {
         myLED.move();
        
      }
   
   }
   public void segment7_On()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      for(int i=1; i<=4; i++)
      {
         myLED.move();
        
      }
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.putBeeper();
         myLED.move();
      }
   
   }
   public void segment7_Off()
   {
      myLED.turnLeft();
      myLED.turnLeft();
      for(int i=1; i<=4; i++)
      {
         myLED.move();
        
      }
      myLED.turnLeft();
      myLED.move();
      for(int i=1; i<=3; i++)
      {
         myLED.move();
      }
   
   }

}



