import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.*;
public class Lab03IL
{
   public static void main(String[] args)
   {
      SuperHero sh = new SuperHero("007", Color.RED, 150, true);
      System.out.println(sh.getCodename());
      System.out.println(sh.getCostumeColor());
      System.out.println(sh.getHeight());
      System.out.println(sh.getAlignment());
      sh.doGood(true);
      Woman w = sh.revert();
      sh.mutate(2);
      System.out.println(sh.getHeight());
   
      sh.setCodename("008");
      sh.setCostumeColor(Color.BLUE);
      sh.setHeight(160);
      sh.setAlignment(false);
   }
}
class Woman
{
}
class SuperHero extends Woman
{
   private String codename;
   private Color costumeColor;
   private int height;
   private boolean alignment;
   private Timer timer;
   private int timeRemaining = 10;
   
   public SuperHero(String s, Color c, int h, boolean a)
   {
      super();
      codename=s;
      costumeColor=c;
      height=h;
      alignment=a;
      timer = new Timer(1000, new Listener());
      timer.start();
   }
   public String getCodename()
   {
      return codename;
   }
   public Color getCostumeColor()
   {
      return costumeColor;
   }
   public int getHeight()
   {
      return height;
   }
   public boolean getAlignment()
   {
      return alignment;
   }
   public void setCodename(String cn)
   {
      codename=cn;
   }
   public void setCostumeColor(Color c)
   {
      costumeColor=c;
   }
   public void setHeight(int h)
   {
      height=h;
   }
   public void setAlignment(boolean a)
   {
      alignment=a;
   }

   public void doGood(boolean a)
   {
      if(alignment == a)
         System.out.println("You look pretty!");
      else
         System.out.println("If Johnny has 4 apples and eats 1 apple, solve for the radius of the sun. >:)");
   }
   public Woman revert()
   {
      return (Woman)this;
   }
   public void mutate(int factor)
   {
      height=height*factor;
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         timeRemaining--;
         if(timeRemaining <=0)
            timer.stop();
      }
   }
}