/*****************************************************************
	* A Square is a Shape that maintains information about its side. A Square
	* knows how to return its side, set its side, calculate and return its 
	* area, and calculate and return its perimeter and diagonal.
	 
	* @author 
	* @version 
	****************************************************************/
public class P7_Tao_Lynn_Square extends P7_Tao_Lynn_Rectangle
{
   /************************************************************* 
   	* Constructs a square with initial side specified by x 
 
   	* @param x    initial side
   	**************************************************************/
   public P7_Tao_Lynn_Square(double x)
   {
      super(x, x);
   }
   	/*************************************************************** 
   	* Returns the square's side
   	* @return	 side
   	**************************************************************/

   public double getSide()
   {
      return getHeight();
   }
   /*************************************************************** 
   	* Sets the square's side to an input number
   	* @return	 side
   	**************************************************************/

   public void setSide(double x)
   {
      if (x>=0) setHeight(x);
      if (x>=0) setBase(x);
   }
   /***************************************************************
   	* Calculates and returns the square's area.
   	* @return	 area
   	**************************************************************/
 
}

	
