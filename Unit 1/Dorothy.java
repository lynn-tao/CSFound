
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Dorothy extends Athlete
{
   public Dorothy()
   {
      super(1, 1, Display.EAST, Display.INFINITY);
   }
   public Dorothy(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void followPath()
   {
      while(nextToABeeper())
         move();
      turnAround();
      move();
      turnAround();
      while(nextToABeeper())
      {
         if(facingEast())
         {
            while(!facingNorth())
            {
               turnLeft();
            }
            move();
            if(nextToABeeper())
            {
               while(nextToABeeper()&&frontIsClear())
               {
                  move();
               }
               turnAround();
               move();
            }
            else
            {
               turnAround();
               move();
               while(!facingSouth())
               {
                  turnLeft();
               }
               move();
               if(nextToABeeper())
               {
                  while(nextToABeeper()&&frontIsClear())
                     move();
                  turnAround();
                  move();
               }
               else
               {
                  turnAround();
                  move();
                  while(!facingWest())
                  {
                     turnLeft();
                  }
                  move();
                  if(nextToABeeper())
                  {
                     while(nextToABeeper()&&frontIsClear())                      
                        move();
                     turnAround();
                     move();
                  }
               }
            }
         }
         else if(facingNorth())
         {
            while(!facingEast())
            {
               turnLeft();
            }
            move();
            if(nextToABeeper())
            {
               while(nextToABeeper())
                  move();
               turnAround();
               move();
            }
            else
            {
               turnAround();
               move();
               while(!facingWest())
               {
                  turnLeft();
               }
               move();
               if(nextToABeeper())
               {
                  while(nextToABeeper())
                     move();
                  turnAround();
                  move();
               }
               else
               {
                  turnAround();
                  move();
                  while(!facingSouth())
                  {
                     turnLeft();
                  }
                  move();
                  if(nextToABeeper())
                  {
                     while(nextToABeeper())
                        move();
                     turnAround();
                     move();
                  }
               }
            }
         
         }
         else if(facingWest())
         {
            while(!facingNorth())
            {
               turnLeft();
            }
            move();
            if(nextToABeeper())
            {
               while(nextToABeeper())
                  move();
               turnAround();
               move();
            }
            else
            {
               turnAround();
               move();
               while(!facingSouth())
               {
                  turnLeft();
               }
               move();
               if(nextToABeeper())
               {
                  while(nextToABeeper()&&frontIsClear())                   
                     move();
                  if(frontIsClear())
                  {
                     turnAround();
                     move();
                  }
                  else
                     turnAround();
               }
               else
               {
                  turnAround();
                  move();
                  while(!facingEast())
                  {
                     turnLeft();
                  }
                  move();
                  if(nextToABeeper())
                  {
                     while(nextToABeeper())
                        move();
                     turnAround();
                     move();
                  }
               }
            }
         
         }
         else if(facingSouth())
         {
            while(!facingNorth())
            {
               turnLeft();
            }
            move();
            if(nextToABeeper())
            {
               while(nextToABeeper())
                  move();
               turnAround();
               move();
            }
            else
            {
               turnAround();
               move();
               while(!facingEast())
               {
                  turnLeft();
               }
               move();
               if(nextToABeeper())
               {
                  while(nextToABeeper())
                     move();
                  turnAround();
                  move();
               }
               else
               {
                  turnAround();
                  move();
                  while(!facingWest())
                  {
                     turnLeft();
                  }
                  move();
                  if(nextToABeeper())
                  {
                     while(nextToABeeper())
                        move();
                     turnAround();
                     move();
                  }
               }
            }
         }
           
      }   
   }
}
