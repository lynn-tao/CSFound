	/*****************************************************************
	* A Circle is a Shape that maintains information about its radius. A Circle
	* knows how to return its radius, set its radius, calculate and return its 
	* area, and calculate and return its circumference.
	 
	* @author 
	* @version 
	****************************************************************/
public class Circle extends Shape
{
   private double myRadius;
   public Circle(double x)
   {
      myRadius = x;
   }
   public double getRadius()
   {
      return myRadius;
   }
		
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
   public void setRadius(double x)
   {
      if (x>=0) myRadius = x;
   }
   public double findArea()
   {
      getRadius();
      return Math.PI * Math.pow(myRadius, 2.0);
   }
   public double findCircumference()
   {
      return Math.PI * 2 * myRadius;
   }
}