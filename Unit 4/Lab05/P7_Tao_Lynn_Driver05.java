//Name:    Date:
public class P7_Tao_Lynn_Driver05
{
   public static final int TRIALS = 100;
   public static void main(String[] args)
   {
      P7_Tao_Lynn_Dice d = new P7_Tao_Lynn_Dice();
      // Experiment  1
      int count = 0;
      do
      {
         d.roll();
         count = count + 1;
      }while(d.total() != 12);
      System.out.println("It took " + count + " rolls to get boxcars.");
   
   
      // Experiment  2
      int number = 0;
      int y;
      do
      {
         d.roll();
         y = d.total()/2;
         number = number + 1;
      }while(d.doubles() != true);
      System.out.println("It took " + number + " rolls to get doubles: {"+y+","+y+"}");
      
   
      
      // Experiment  3
      int[] a = new int[13]; 
      for(int i=0; i<100; i++)
      {
         d.roll();
         int total=d.total();
         a[total]=a[total]+1;
      }
      for(int x = 2; x <= 12; x++)
      {
         System.out.println((x)+"'s: "+ a[x]);
      }
      
      int doubles = 0;
      for(int i=0; i<TRIALS; i++)
      {
         d.roll();
         if(d.doubles()==true)
         {
            doubles = doubles + 1;
         }
      }
      System.out.println("Number of doubles in 100 rolls: " + doubles);
   
   		
   }
}
/******
 It took 35 rolls to get boxcars.
 It took 4 rolls to get doubles: {1, 1}
 2's:  6
 3's:  6
 4's:  5
 5's:  10
 6's:  12
 7's:  20
 8's:  17
 9's:  6
 10's:  10
 11's:  4
 12's:  4
 Number of doubles in 100 rolls: 18
 ********/