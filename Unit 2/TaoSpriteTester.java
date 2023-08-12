import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
public class TaoSpriteTester{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab06LastFirstSpriteTester");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DrawPanelLab06Sprite());
      frame.setVisible(true);
   }
}
class DrawPanelLab06Sprite extends JPanel 
{
   private Sprite s = new Sprite(100, 100, 150, 150);
   public void paintComponent(Graphics g) 
   {
      g.setColor(Color.PINK);
      g.fillRect(0,0, getWidth()-1, getHeight()-1);
      s.setColor(Color.BLUE);
      s.setImage("skull.png");
      s.draw(g);
      update();
      try{
         Thread.sleep(30);                  //pause 30 milliseconds
      } catch(Exception e){}               //do nothing if exception is thrown
      repaint();
   }
   public void update(){
      if(s.right  > getWidth()){//right edge of greenRect plus next step hits eastern wall
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
      s.offset(s.getdx(),s.getdy());
   }


}