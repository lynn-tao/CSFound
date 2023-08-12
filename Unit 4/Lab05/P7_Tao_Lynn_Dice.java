//Name:    Date:
public class P7_Tao_Lynn_Dice
{
   private int myOne, myTwo;
   public P7_Tao_Lynn_Dice()
   {
      myOne = random();
      myTwo = random();
   }
   public void roll()
   {
      myOne = random();
      myTwo = random();
   }
   public int total()
   {
      return myOne + myTwo;
   }
   public boolean doubles()
   {
      return myOne == myTwo;
      
   }
   public String toString()
   {
      return "{" + myOne + ", " + myTwo + "}";
   }
   private int random()
   {
      return (int)(Math.random() * 6 + 1);
   }
}