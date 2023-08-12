/*****************************************************************
	* A Rectangle is a Shape that maintains information about its height and base. A Rectangle
	* knows how to return its base and height, set its base and height, calculate and return its 
	* area, and calculate and return its perimeter.
	 
	* @P7_Tao_Lynn_Rectangle 
	* @version 
	****************************************************************/
public class P7_Tao_Lynn_Rectangle extends Shape
{
   private double myHeight;
   private double myBase;
   /************************************************************* 
   	* Constructs a rectangle with initial base specified by x 
      and initial  height specified by y.
   	* @param x    initial height initial base
   	**************************************************************/
   public P7_Tao_Lynn_Rectangle(double x, double y)
   {
      myBase=x;
      myHeight=y;
   }
   
   	/*************************************************************** 
   	* Returns the rectangles's base
   	* @return	 base
   	**************************************************************/

   public double getBase()
   {
      return myBase;
   }
   /*************************************************************** 
   	* Returns the rectangle's height
   	* @return	 height
   	**************************************************************/

   public double getHeight()
   {
      return myHeight;
   }
   /***************************************************************
   	* Sets the base to the input number.
   	* @param x	 assigns x to myBase
   	**************************************************************/

   public void setBase(double x)
   {
      if (x>=0) myBase = x;
   }
    /***************************************************************
   	* Sets the height to the input number.
   	* @param x	 assigns x to myHeight
   	**************************************************************/

   public void setHeight(double y)
   {
      if (y>=0) myHeight = y;
   }
   	/***************************************************************
   	* Calculates and returns the rectangle's area.
   	* @return	 area
   	**************************************************************/
   public double findArea()
   {
      return myBase*myHeight;
   }
   	/***************************************************************
   	* Calculates and returns the rectangle's perimeter.
   	* @return	 perimeter
   	**************************************************************/

   public double findPerimeter()
   {
      return 2*myBase+2*myHeight;
   }
   /***************************************************************
   	* Calculates and returns the rectangle's diagonal.
   	* @return	 diagonal
   	**************************************************************/

   public double findDiagonal()
   {
      return Math.sqrt(Math.pow(myBase,2)+Math.pow(myHeight,2));
   }

}

	
