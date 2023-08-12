import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
import java.awt.event.*;
import java.awt.geom.*; 
import javax.swing.Timer; //to access Listeners
public class T0Lab07LastFirstMouseListener{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab07LastFirstMouseListener");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DrawPanelLab07());
      frame.setVisible(true);
   }
}
class DrawPanelLab07 extends JPanel implements MouseListener, MouseMotionListener {
   private Sprite s = new Sprite(168, 170, 185, 190);
   private Ellipse e = new Ellipse(15, 15, 50, 75);
   private Timer t;

   GeneralPath line = new GeneralPath();  //declare and instantiate a new GeneralPath
   public DrawPanelLab07(){
      t = new Timer(5, new TimerListener());
      t.start();
   
      addMouseListener(this);             //handles mouse click related events
      addMouseMotionListener(this); 
      addKeyListener(new Key());
      setFocusable(true);      //handles mouse motion events
   }
   @Override public void mousePressed(MouseEvent e) {
      if(e.getButton()==MouseEvent.BUTTON1)     //If left-click
         line.moveTo(e.getX(),e.getY());        //picks up pen and places it at the clicked location
   }
   @Override public void mouseReleased(MouseEvent e) {}
   @Override public void mouseClicked(MouseEvent e) {
      double half_width = s.getWidth()/2;
      double half_height = s.getHeight()/2;
      int x = e.getX();
      int y = e.getY();
      s.set(x - (int)half_width, y - (int)half_height, x + (int)half_width, y + (int)half_height);
      repaint();
   
   }
   @Override public void mouseEntered(MouseEvent ee) {
   
   }
   @Override public void mouseExited(MouseEvent e) {}
  
   public void mouseDragged(MouseEvent ee){
      line.lineTo(ee.getX(),ee.getY());  
      double width = e.getWidth()/2;
      double height = e.getHeight()/2;
      int a = ee.getX();
      int b = ee.getY();
      e.set(a - (int)width, b - (int)height, a + (int)width, b + (int)height);
      repaint();      //connects previous point to current dragged location
      repaint();                            //redraws the JPanel to illustrate the current line
   }  
   public void mouseMoved(MouseEvent e){} 
   @Override
   public void paintComponent(Graphics g)//called each time the image needs to be refreshed
   { 
      g.setColor(Color.PINK);
      g.fillRect(0,0, getWidth()-1, getHeight()-1);            
      Graphics2D g2D = (Graphics2D)g;           //down cast to Graphics2D
      g.setColor(Color.blue);
      Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
      g2D.setStroke(dashed);
      g2D.draw(line);
      
      s.setImage("skull.png");
      s.draw(g);
      checkCollisions();
      e.setColor(Color.BLACK);
      e.draw(g);
      e.update();
   }
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         repaint();               
      }
   } 
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode() == KeyEvent.VK_UP)
         {
            s.top = s.top - 10;
            s.bottom = s.bottom - 10;
         }
         if(e.getKeyCode() == KeyEvent.VK_DOWN)
         {
            s.top = s.top + 10;
            s.bottom = s.bottom + 10;
         }
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
         {
            s.left = s.left - 10;
            s.right = s.right - 10;
         }
         if(e.getKeyCode() == KeyEvent.VK_RIGHT)
         {
            s.left = s.left + 10;
            s.right = s.right + 10;
         }
      }
   }
   public void checkCollisions()
   {
      if(e.intersects(s)){
         s.setdx(s.getdx()*-1); //reverse all directions on collision
         s.setdy(s.getdy()*-1);
         e.setdx(e.getdx()*-1); //reverse all directions on collision
         e.setdy(e.getdy()*-1);
      }
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
      }
   
   }
}

