import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
    
public class TaoLab05{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab05LastFirstUsingRectF");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DrawPanelLab05());
      frame.setVisible(true);
   }
}

class DrawPanelLab05 extends JPanel{
   private RectF redRect = new RectF(0,0, 20,40);
   private RectF greenRect = new RectF(100,0, 120,140);
   private Timer t;
   private int hits;
   private double dXg=6,dYg=4,dXr=5,dYr=6;
   public DrawPanelLab05()
   {
      t = new Timer(5, new Listener());
      t.start();
   }
   public void paintComponent(Graphics g){
      g.setColor(Color.PINK);
      g.fillRect(0,0, getWidth()-1, getHeight()-1);
      update();
      g.setColor(Color.red);
      ImageIcon rainbow = new ImageIcon("rainbow.png");
      g.drawImage(rainbow.getImage(), (int)redRect.left, (int)redRect.top, (int)redRect.getWidth(), (int)redRect.getHeight(), null);
      g.setColor(Color.green);
      g.fillRect((int)greenRect.left, (int)greenRect.top, (int)greenRect.getWidth(), (int)greenRect.getHeight());
      g.setFont(new Font("Monospaced", Font.BOLD, 24));
      g.setColor(Color.BLACK);
      g.drawString("Collisions: " + hits, 450 - 150, 25);
     
      repaint();
   
      try{
         Thread.sleep(30);                  //pause 30 milliseconds
      } catch(Exception e){}               //do nothing if exception is thrown
      repaint();//repaints the surface by calling paintComponent(), causing an infinite loop or the animation loop
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
                      
      }
   }     
   public void update(){
      if(redRect.intersects(greenRect)){
         dXr*=-1; //reverse all directions on collision
         dYr*=-1;
         dXg*=-1;
         dYg*=-1;
         hits++;
      }
      //red rectangle wall bounce
      if(redRect.right + dXr > getWidth())
      {//right edge of redRect plus next step hits eastern wall
         redRect.left = 0;
         redRect.right = 20;
         redRect.top = redRect.top;
         dXr = dXr;                  //reverses horizontal direction
      }
      if(redRect.left + dXr < 0){          //left edge of redRect plus next step hits western wall
         dXr = dXr *-1;                  //reverses horizontal direction
      }
      if(redRect.bottom + dYr > getHeight())//bottom edge of redRect + next step hits southern wall
         dYr*=-1;                       //reverses horizontal direction
      if(redRect.top + dYr < 0)            //bottom edge of redRect + next step hits northern wall
         dYr*=-1;                       //reverses horizontal direction
       
      if(greenRect.right + dXg > getWidth()){//right edge of greenRect plus next step hits eastern wall
         dXg = dXg *-1;                  //reverses horizontal direction
      }
      if(greenRect.left + dXg < 0){          //left edge of greenRect plus next step hits western wall
         dXg = dXg *-1;                  //reverses horizontal direction
      }
      if(greenRect.bottom + dYg > getHeight())//bottom edge of greenRect + next step hits southern wall
         dYg*=-1;                       //reverses horizontal direction
      if(greenRect.top + dYg < 0)            //bottom edge of greenRect + next step hits northern wall
         dYg*=-1;                      //reverses horizontal direction 
      redRect.offset(dXr, dYr);
      greenRect.offset(dXg, dYg);             //move based on current dX and dY
   }
}
