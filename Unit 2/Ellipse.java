import javax.swing.*;                  //to access ImageIcon
import java.awt.*;                     //to access Grpahics and Color
import java.awt.geom.*; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;               //to access Ellipse2D and Rectangle2D
public class Ellipse extends Sprite
{   
   private double xRadius,yRadius;
   public Ellipse()
   {
      super(null);
   }
   public Ellipse(double left, double top, double right, double bottom) {
      super(left,top,right,bottom); 
   }
   public Ellipse(RectF rect){
      super(rect);
   }
   public void draw(Graphics2D g2)
   {
      g2.setColor(getColor());
      g2.drawOval((int)left,(int)top,(int)getWidth(),(int)getHeight());
   }
   public void update(){
      offset(getdx(),getdy());
   }
   public void update(RectF r){
      if(this.right > r.right)
      {
         setdx(getdx()*-1);                  //reverses horizontal direction
      }
      if(this.left < r.left){          //left edge of greenRect plus next step hits western wall
         setdx(getdx()*-1);                  //reverses horizontal direction
      }
      if(this.bottom  > r.bottom)//bottom edge of greenRect + next step hits southern wall
         setdy(getdy()*-1);                       //reverses horizontal direction
      if(this.top  < r.top)            //bottom edge of greenRect + next step hits northern wall
         setdy(getdy()*-1); 
         
      offset(getdx(), getdy()); 
   }
   public double getxRadius() {
      return xRadius;
   }
   public void setxRadius(double xRadius) {
      this.xRadius = xRadius;
   }
   public double getyRadius() {
      return yRadius;
   }
   public void setyRadius(double yRadius) {
      this.yRadius = yRadius;
   }
   public String toString() {
      return "Ellipse(" + left + ", " + top + ", " + right + ", " + bottom + ")";
   }
   public boolean intersects(RectF r){
      if(r==null||isEmpty()) 
         return false;
      return this.right>r.left && this.left < r.right && this.top<r.bottom &&this.bottom>r.top;
   
   }    
   public boolean contains(double x, double y) 
   {
      return !isEmpty()  && x >= left && x < right && y >= top && y < bottom;
   }
   public boolean contains(double left, double top, double right, double bottom) {
      return !isEmpty()&& this.left <= left && this.top <= top && this.right >= right && this.bottom >= bottom;
   }
   public boolean contains(RectF r) {
      return !isEmpty()&& left <= r.left && top <= r.top && right >= r.right && bottom >= r.bottom;
   }

}