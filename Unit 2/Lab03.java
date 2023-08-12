import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Lab03
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Unit2, Lab12: Prize Panel");
      frame.setSize(450, 450);
      frame.setLocation(200, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PrizePanel());
      frame.setVisible(true);
   }
}
class PrizePanel extends JPanel
{
   private static final int FRAME = 450;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t;
   private int hits;
      //constructor  
   public PrizePanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
     
      ball = new Ball(100, 100, 50, Color.BLACK);
     
      pd = new Polkadot(200, 200, 20, Color.WHITE);
     
      t = new Timer(5, new Listener());
      t.start();
        
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {      
         ball.move(FRAME, FRAME);
         collide(ball, pd);
      
         ball.draw(myBuffer);
         pd.draw(myBuffer);
      
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.setColor(Color.BLACK);
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
      
         repaint();
          
      }
   }  
   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY()); 
      if( d <= 25 + 10 )
      {
         pd.jump(FRAME, FRAME);
         hits++;
           
           
      }
     
       
   }
   private double distance(double x1, double y1, double x2, double y2)
   {
      return (Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2)));
   }
}



