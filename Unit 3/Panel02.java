import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel
{
   private JLabel label;
   public Panel02()
   {
      setLayout(new FlowLayout());
      
      label = new JLabel("0.000000");
      label.setFont(new Font("Serif", Font.BOLD, 200));
      label.setForeground(Color.blue);
      add(label);
   
      JButton random  = new JButton("Random");
      random.addActionListener(new RandomListener());
      add(random);
      
      JButton cube  = new JButton("Cube Root");
      cube.addActionListener(new CBRListener());
      add(cube);
      
      JButton b  = new JButton("Reciprocal");
      b.addActionListener(new ReciListener());
      add(b);
   
      JButton quit  = new JButton("Quit");
      quit.addActionListener(new QuitListener());
      add(quit);
   
   
   }
   private class RandomListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.random();
         label.setText(""+x);
      }
   }

   private class CBRListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.pow(Double.parseDouble(label.getText()), 1.0/3);
         label.setText(""+x);
      }
   }
   private class ReciListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.pow(Double.parseDouble(label.getText()), -1);
         label.setText(""+x);
      }
   }
   private class QuitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }

}