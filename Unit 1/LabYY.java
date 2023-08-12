import edu.fcps.karel2.*;
public class LabYY
{
   public static void main(String[] args)
   {
      Display.setSpeed(10);
      final int N = (int)(Math.random()*50+25);
      Display.setSize(N,N);
      WorldBackend.getCurrent().putBeepers((int)(Math.random()*N+1), (int)(Math.random()*N+1), 1);
   	// Display.placeNSWall(1, 1, x);
      // Display.placeBeeper(2, y);
   
      Athlete karel = new Athlete();
      
      for(int k=1; k<=N; k++)
      {
         int l=1;
         while(!karel.nextToABeeper()&&l<N)
         {
            karel.move();
            l++;
         }
         if(!karel.nextToABeeper())
         {
            karel.turnRight();
            karel.move();
            karel.turnRight();
         }
         int j=1;
         while(!karel.nextToABeeper()&&j<N)
         {
            karel.move();
            j++;
         }
         if(!karel.nextToABeeper())
         {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
         }
      }
      karel.pickBeeper();   
      while(!karel.facingSouth())
      {
         karel.turnRight();
      }
      while(karel.frontIsClear())
         karel.move();
      karel.turnRight();
      while(karel.frontIsClear())
         karel.move();         
      karel.putBeeper();
      
   }
}