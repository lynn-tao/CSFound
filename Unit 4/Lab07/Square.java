public class Square extends Shape
{
   private double mySide;
   public Square(double x)
   {
      mySide=x;
   }
   public double getSide()
   {
      return mySide=50;
   }
   public void setmySide(double x)
   {
      if (x>=0) mySide = x;
   }
   public double findArea()
   {
      return Math.pow(mySide, 2);
   }
   public double findPerimeter()
   {
      return 4*mySide;
   }
   public double findDiagonal()
   {
      return Math.sqrt(2*Math.pow(mySide,2));
   }
}

	
