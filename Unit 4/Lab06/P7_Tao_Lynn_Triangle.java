/*****************************************************************
	* A Triangle is a Shape that maintains information about its side. A Triangle
	* knows how to return its side, set its side, calculate and return its 
	* area, and calculate and return its perimeter.
	 
	* @author 
	* @version 
	****************************************************************/
public class P7_Tao_Lynn_Triangle extends Shape
{
   private double mySide;
   /************************************************************* 
   	* Constructs a triangle with initial side specified by x 
 
   	* @param x    initial side
   	**************************************************************/
   public P7_Tao_Lynn_Triangle(double x)
   {
      mySide=x;
   }
   /*************************************************************** 
   	* Returns the triangle's side
   	* @return	 side
   	**************************************************************/
   public double getSide()
   {
      return mySide;
   }
    /*************************************************************** 
   	* Sets the triangle's side to an input number
   	* @return	 side
   	**************************************************************/
   public void setmySide(double x)
   {
      if (x>=0) mySide = x;
   }
    /***************************************************************
   	* Calculates and returns the triangle's area.
   	* @return	 area
	**************************************************************/
   public double findArea()
   {
      return Math.sqrt(3)*Math.pow(mySide, 2)/4;
   }
    /***************************************************************
   	* Calculates and returns the triangle's perimeter.
   	* @return	 perimeter
   ***************************************************************/
   public double findPerimeter()
   {
      return 3*mySide;
   }
}

