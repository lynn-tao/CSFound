import javax.swing.*;                           //access ImageIcon
import java.awt.*;                              //to access Grpahics and Color
public class Sprite extends RectF{     //inherits everything from RectF
   private double dx,dy;
   private ImageIcon mImage;
   private Color mColor=Color.green;
   
   public Sprite(double left, double top, double right, double bottom) 
   {
      super(left,top,right,bottom); 
      dy = dx = 5.0;            //calls parent's constructor to build a RectF foundation
   }
   public Sprite(RectF rect){
      super(rect);                              //calls parent's constructor to build a RectF foundation
   }
   public double getdx(){
      return dx;
   }
/**
 * Set the Sprite's horizontal speed
 * @param dX The horizontal speed
 */
   public void setdx(double dx){
      this.dx=dx;
   }
/**
 * @return vertical speed
 */
   public double getdy(){
      return dy;
   }
/**
 * Set the Sprite's vertical speed
 * @param dY The vertical speed
 */
   public void setdy(double dy){
      this.dy=dy;
   }
   public Color getColor(){
      return mColor;
   }
/**
 * Set the Sprite's color
 * @param c The color of the Sprite
 */
   public void setColor(Color c){
      mColor=c;
   }
   public ImageIcon getImage(){
      return mImage;
   }
/**
 * Set the Sprite's image
 * @param i The name of the image (including extension)
 */
   public void setImage(String i){
      mImage=new ImageIcon(getClass().getResource(i));
   }
   public String toString() {
      return "Sprite(" + left + ", " + top + ", " + right + ", " + bottom + ")";
   }
   public void draw(Graphics g){ //draw itself
      if(getImage()!=null){                            //if the sprite has an image
         g.drawImage(getImage().getImage(),(int) left,(int) top,(int) getWidth(),(int) getHeight(), null); 
      } else {
         g.setColor(getColor());
         if(getWidth()>0)
            g.drawRect((int)left, (int)top, (int)getWidth(), (int)getHeight());
         else
            g.fillRect((int)left, (int)top, 2, 2);
      }
   }
}