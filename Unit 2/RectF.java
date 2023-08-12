//Unit 2:  Graphics - RectF class
//Tra 11/15/18
class RectF {
   public double left, top, right, bottom;
   public int centerX, centerY;
   public RectF()
   {                                 
      left = top = right = bottom = 0;
   }
   public RectF(RectF rectF) 
   {
      if (rectF == null)
      {                
         left = top = right = bottom = 0;
      } 
      else 
      {
         left = rectF.left;              
         top = rectF.top;
         right = rectF.right;
         bottom = rectF.bottom;
      }     
   }
   public RectF(double left, double top, double right, double bottom) {
      this.left=left;
      this.top=top;
      this.right=right;
      this.bottom=bottom;
   }
   public double centerX() {
      return (left + right) * 0.5;
   }
    
   public double centerY() {
      return (top + bottom) * 0.5;
   }
     
   public double getWidth() {
      return right - left;
   }
    
   public double getHeight() {
      return bottom - top;
   }
   public String toString() {
      return "RectF(" + left + ", " + top + ", " + right + ", " + bottom + ")";
   }      
   public void set(float left, float top, float right, float bottom) {
   
      this.left   = left;
      this.top    = top;
      this.right  = right;
      this.bottom = bottom;
   }
   public void setCenterX( int x) {
      centerX = x;
   }
    
   public void setCenterY(int y) {
      centerY = y;
   }

   public void set(RectF src) {
      this.left   = src.left;
      this.top    = src.top;
      this.right  = src.right;
      this.bottom = src.bottom;
   }
   public void setEmpty() 
   {
      left = 0;
      top=0;
      right=0;
      bottom=0;
   }
   public void offset(double dx, double dy) {
   
      left    += dx;
      top     += dy;
      right   += dx;
      bottom  += dy;
   }
   public void offsetTo(double newLeft, double newTop) {
   
      right += newLeft - left;
      bottom += newTop - top;
      left = newLeft;
      top = newTop;
   }
   public boolean isEmpty() {
      return left >= right || top >= bottom;
   }
   public boolean intersects(float left, float top, float right, float bottom) {
      if(isEmpty()) 
         return false;
      return this.right>left && this.left <right && this.top<bottom &&this.bottom>top;
   
   }
   public boolean intersects(RectF r) {
      if(r==null||isEmpty()) 
         return false;
      return this.right>r.left && this.left < r.right && this.top<r.bottom &&this.bottom>r.top;
   }
   public boolean contains(double x, double y) {
     
      return !isEmpty()  && x >= left && x < right && y >= top && y < bottom;
   }
   public boolean contains(double left, double top, double right, double bottom) {
               
      return !isEmpty()&& this.left <= left && this.top <= top && this.right >= right && this.bottom >= bottom;
   }
   public boolean contains(RectF r) 
   {         
      return !isEmpty()&& left <= r.left && top <= r.top && right >= r.right && bottom >= r.bottom;
   }
    

}