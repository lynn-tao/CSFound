import javax.swing.*;  //to access JFrame and JPanel
import java.awt.*;     //to access Graphics and Color
public class TaoLab05B{
   public static void main(String[] arg){
      JFrame frame = new JFrame("T0Lab05bLastFirstProgramMode");
      frame.setSize(816,488);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DrawPanelLab05b());
      frame.setVisible(true);
   }
}
class DrawPanelLab05b extends JPanel {
   int mode = 0;
   int count = 0;
   public void paintComponent(Graphics g) {
      if(mode==0){
         g.setColor(Color.PINK);
         g.fillRect(0,0, getWidth()-1, getHeight()-1);
         g.setColor(Color.black);
         g.drawString("Welcome to the splash page",(int)(.2*getWidth()),(int)(.5*getHeight()));
         if(count++>=30)
            mode++;
      } else if(mode==1){
         g.setColor(Color.magenta);
         g.fillRect(0,0, getWidth()-1, getHeight()-1);
         g.setColor(Color.orange);
         g.drawString("Game is running now",(int)(.2*getWidth()),(int)(.5*getHeight()));
         if(count++>=60)
            mode++;
         if (mode==2)
         {
            g.setColor(Color.BLUE);
            g.fillRect(0,0, getWidth()-1, getHeight()-1);
            g.setColor(Color.GREEN);
            g.drawString("Are you ready?",(int)(.2*getWidth()),(int)(.5*getHeight()));
            if(count++>=90)
               mode++;
         }
      }
      try{Thread.sleep(50);}
      catch(Exception e){}
      repaint();
   }
}