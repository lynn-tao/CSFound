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
      label.setFont(new Font("Serif", Font.BOLD, 75));
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
      
      JButton negate  = new JButton("Negate");
      negate.addActionListener(new NegListener());
      add(negate);
      
      JButton abs  = new JButton("Absolute Value");
      abs.addActionListener(new AbsListener());
      add(abs);
      
      JButton rounddown  = new JButton("Round Down");
      rounddown.addActionListener(new RoundDownListener());
      add(rounddown);
      
      JButton roundup  = new JButton("Round Up");
      roundup.addActionListener(new RoundListener());
      add(roundup);
   
      JButton roundnear  = new JButton("Round Nearest");
      roundnear.addActionListener(new RoundDListener());
      add(roundnear);
      
      JButton hundred  = new JButton("Random 100");
      hundred.addActionListener(new RoundoneListener());
      add(hundred);
   
      JButton sine  = new JButton("Sine");
      sine.addActionListener(new SineListener());
      add(sine);
      
      JButton log  = new JButton("Log2");
      log.addActionListener(new LogListener());
      add(log);
   
   
   
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
   private class NegListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+-1*Double.parseDouble(label.getText()));
      }
   }

   private class AbsListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+ Math.abs(Double.parseDouble(label.getText())));
      }
   }
   private class RoundListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+ Math.ceil(Double.parseDouble(label.getText())));
      }
   }
   private class RoundDownListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+ Math.floor(Double.parseDouble(label.getText())));
      }
   }

   private class RoundDListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+ Math.round(Double.parseDouble(label.getText())));
      }
   }
   private class RoundoneListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.random()*200 - 100;
         label.setText(""+x);
      }
   }

   private class SineListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText(""+ Math.sin(Double.parseDouble(label.getText())));
      }
   }
   private class LogListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.log(Double.parseDouble(label.getText()))/Math.log(2);
         label.setText(""+x);
      }
   }
  



}