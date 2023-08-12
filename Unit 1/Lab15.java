   
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab15
{
   public static void main(String[] args)
   {
      LineDancer weismuller = new LineDancer();
      BeeperDancer fraser = new BeeperDancer();
      WaltzDancer spitz = new WaltzDancer(6, 7, Display.NORTH, 0);
   
      Thread t1 = new Thread( weismuller );
      Thread t2 = new Thread( fraser );
      Thread t3 = new Thread( spitz );
   
      t1.start();
      t2.start();
      t3.start();
   
   }
}