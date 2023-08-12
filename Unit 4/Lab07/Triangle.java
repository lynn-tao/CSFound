public class Triangle extends Shape
{
   private double mySide;
   public Triangle(double x)
   {
      mySide=x;
   }
   public double getSide()
   {
      return mySide=37;
   }
   public void setmySide(double x)
   {
      if (x>=0) mySide = x;
   }
   public double findArea()
   {
      return Math.sqrt(3)* Math.pow(mySide, 2)/4;
   }
   public double findPerimeter()
   {
      return 3*mySide;
   }
}

