import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;      //to access Graphics and Color
public class TaoEllipseTester{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab06LastFirstEllipseTester");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DrawPanelLab06Ellipse());
      frame.setVisible(true);
   }
}
class DrawPanelLab06Ellipse extends JPanel 
{
   private Ellipse s = new Ellipse(125, 125, 200, 150);
   private Ellipse e = new Ellipse(15, 15, 50, 75);
   private RectF r = new RectF(0, 0, 400, 400);
   public void paintComponent(Graphics g) 
   {
      g.setColor(Color.PINK);
      g.fillRect(0,0, getWidth()-1, getHeight()-1);
      s.setColor(Color.RED);
      e.setColor(Color.BLUE);
      Graphics2D g2 = (Graphics2D)g;
      s.draw(g2);
      e.draw(g2); 
      update(0, 0, 800, 450);
      try{
         Thread.sleep(30);                  //pause 30 milliseconds
      } catch(Exception e){}               //do nothing if exception is thrown
      repaint();
   }
   public void update(int left, int top, int right, int bottom){
      if(e.intersects(s)){
         s.setdx(s.getdx()*-1); //reverse all directions on collision
         s.setdy(s.getdy()*-1);
         e.setdx(e.getdx()*-1); //reverse all directions on collision
         e.setdy(e.getdy()*-1);
      }
      if(s.right > getWidth()){//right edge of greenRect plus next step hits eastern wall
         s.setdx(s.getdx()*-1);                  //reverses horizontal direction
      }
      if(s.left < 0){          //left edge of greenRect plus next step hits western wall
         s.setdx(s.getdx()*-1);                  //reverses horizontal direction
      }
      if(s.bottom  > getHeight())
      {//bottom edge of greenRect + next step hits southern wall
         s.setdy(s.getdy()*-1);  
      }                     //reverses horizontal direction
      if(s.top < 0)      
      {      //bottom edge of greenRect + next step hits northern wall
         s.setdy(s.getdy()*-1); 
      }                     //reverses horizontal direction       
      if(e.right > getWidth()){//right edge of greenRect plus next step hits eastern wall
         e.setdx(e.getdx()*-1);                  //reverses horizontal direction
      }
      if(e.left < 0){          //left edge of greenRect plus next step hits western wall
         e.setdx(e.getdx()*-1);                  //reverses horizontal direction
      }
      if(e.bottom  > getHeight())
      {//bottom edge of greenRect + next step hits southern wall
         e.setdy(e.getdy()*-1);  
      }                     //reverses horizontal direction
      if(e.top < 0)      
      {      //bottom edge of greenRect + next step hits northern wall
         e.setdy(e.getdy()*-1); 
      }                     //reverses horizontal direction       
      s.offset(s.getdx(),s.getdy());
      e.offset(e.getdx(),e.getdy());
   
   
   }

}