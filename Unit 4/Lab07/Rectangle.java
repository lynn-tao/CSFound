	
public class Rectangle extends Shape
{
   private double myHeight;
   private double myBase;
   public Rectangle(double x, double y)
   {
      myBase=x;
      myHeight=y;
   }
   public double getBase()
   {
      return myBase=30;
   }
   public double getHeight()
   {
      return myHeight=40;
   }
   public void setmyBase(double x)
   {
      if (x>=0) myBase = x;
   }
   public void setmyHeight(double y)
   {
      if (y>=0) myHeight = y;
   }
   public double findArea()
   {
      return myBase*myHeight;
   }
   public double findPerimeter()
   {
      return 2*myBase+2*myHeight;
   }
   public double findDiagonal()
   {
      return Math.sqrt(Math.pow(myBase,2)+Math.pow(myHeight,2));
   }

}

	
