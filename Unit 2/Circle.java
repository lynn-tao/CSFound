import javax.swing.*;                  //to access ImageIcon
import java.awt.*;                     //to access Grpahics and Color
import java.awt.geom.*; 

public class Circle extends Ellipse{      //inherits everything from Ellipse
   private double radius;
   public Circle(){
      super(null);
   }
   public Circle(double left, double top, double right, double bottom) {
      super(left,top,right,bottom); 
   }
   public Circle(double centerX, double centerY, double radius){
   
   }
   public Circle(RectF rect){
      super(rect);
   }
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      g.drawOval((int)left,(int)top,(int)getWidth(),(int)getHeight());
   }
   public boolean contains(double x, double y){
      return !isEmpty()  && x >= left && x < right && y >= top && y < bottom;
   }
   public boolean intersects(Circle c){
      if(c==null||isEmpty()) 
         return false;
      return this.right>c.left && this.left < c.right && this.top<c.bottom &&this.bottom>c.top;
   }
   public boolean intersects(Sprite s){
      if(s==null||isEmpty()) 
         return false;
      return this.right>s.left && this.left < s.right && this.top<s.bottom &&this.bottom>s.top;
   }                                           //https://yal.cc/rectangle-circle-intersection-test/
   public boolean intersects(RectF r){
      if(r==null||isEmpty()) 
         return false;
      return this.right>r.left && this.left < r.right && this.top<r.bottom &&this.bottom>r.top;
   }
   public double getRadius(){
      return radius;
   }
   public void setRadius(double r){
      radius = r;
   }
   public String toString() {
      return "Circle(" + left + ", " + top + ", " + right + ", " + bottom + ")";
   }
}