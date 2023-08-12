//Lynn Tao Period 7
import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import javax.swing.*;
public class TTaoLynnPanel01 extends JPanel
{
   private BufferedImage myImage;
   public TTaoLynnPanel01()
   {
      myImage = new BufferedImage(600, 460, BufferedImage.TYPE_INT_RGB);
      Graphics g = myImage.getGraphics();
      
      //BEGIN GRAPHICS HERE
      
      //background image
      ImageIcon halloween = new ImageIcon("halloween.png");
      g.drawImage(halloween.getImage(), 0, 0, 600, 500, null);
      
      //yellow lines
      g.setColor(Color.YELLOW);
      for(int k = 0; k <= 50; k++)
      {
         g.drawLine(50 * k, 0, 50 * k, 500);
      }
      //moon
      ImageIcon moon = new ImageIcon("moon.png");
      g.drawImage(moon.getImage(), 500, 10, 80, 80, null);
     
      //castle walls
      g.setColor(Color.BLACK);
      g.fillRect(125, 300, 50, 150);
      g.fillRect(175, 250, 75, 175);
      
      //red dome
      g.setColor(Color.RED);
      g.fillOval(250, 115, 100, 100);
      
      //more walls
      g.setColor(Color.BLACK);
      g.fillRect(250, 150, 100, 250);
      g.fillRect(350, 200, 75, 250);
      g.fillRect(425, 250, 50, 200);
      
      //castle outlines
      g.setColor(Color.LIGHT_GRAY);
      g.drawLine(125, 300, 125, 450);
      g.drawLine(175, 250, 175, 500);
      g.drawLine(250, 150, 250, 500);
      g.drawLine(350, 150, 350, 500);
      g.drawLine(425, 250, 425, 500);
      g.drawLine(475, 250, 475, 500);
      g.drawLine(125, 300, 175, 300);
      g.drawLine(175, 250, 250, 250);
      g.drawLine(250, 150, 350, 150);
      g.drawLine(350, 200, 425, 200);
      g.drawLine(425, 250, 475, 250);
   
      //roof
      g.setColor(Color.RED);
      drawHelper(g, 125, 150, 175, 300, 275, 300);
      drawHelper(g, 175, 212, 250, 250, 215, 250);
      drawHelper(g, 350, 388, 425, 200, 175, 200);
      drawHelper(g, 425, 450, 475, 250, 225, 250);
   
      //door
      g.setColor(new Color(139,69,19));
      g.fillRect(275, 325, 50, 100);
      g.fillOval(275, 300, 50, 50);
      
      g.setColor(Color.RED);
      g.drawLine(275, 325, 325, 325);
      g.drawLine(275, 325, 275, 425);
      g.drawLine(325, 325, 325, 425);
      g.drawLine(300, 325, 300, 425);
      
      //grass
      g.setColor(Color.GREEN.darker());
      g.fillOval(0, 400, 600, 150);
      
      //text background
      g.setColor(Color.BLACK);
      g.fillRect(42, 25, 325, 55);
      
      //windows
      g.setColor(new Color(238,232,170));
      for(int l = 0; l <= 65; l+= 25)
      {
         g.fillRect(270+l, 215, 15, 20);
         g.fillRect(270+l, 265, 15, 20);
         g.fillRect(270+l, 165, 15, 20);
      }
   
      //brother :)
      ImageIcon eric = new ImageIcon("eric.png");
      g.drawImage(eric.getImage(), 360, 300, 60, 60, null);
      g.drawImage(eric.getImage(), 185, 300, 60, 60, null);
      
      //pumpkin
      g.setColor(Color.GREEN.darker());
      g.fillRect(63, 365, 10, 15);
      g.setColor(Color.ORANGE);
      g.fillOval(50, 375, 35, 70);
      g.fillOval(37, 377, 35, 65);
      g.fillOval(62, 377, 35, 65);
      g.fillOval(27, 379, 35, 60);
      g.fillOval(73, 379, 35, 60);
      
      //skull
      ImageIcon skull = new ImageIcon("skull.png");
      g.drawImage(skull.getImage(), 125, 415, 50, 50, null);
      g.drawImage(skull.getImage(), 375, 415, 50, 50, null);
   
      //text
      g.setFont(new Font("Serif",
                               Font.ITALIC, 40));
      g.drawString("Happy Halloween!", 55, 60);
         
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   public void drawHelper(Graphics g, int a, int b, int c, int d, int e, int f)
   {
      int aPoints[] = {a, b, c};
      int bPoints[] = {d, e, f};
      g.fillPolygon(aPoints, bPoints, 3);
   }
}
