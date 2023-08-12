import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Odometer extends JPanel
{
   private JLabel label1, label2, label3;
   private int counter=997;
   public Odometer()
   {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel);
      panel.setBackground(Color.black);
     
      label1 = new JLabel("9");
      label1.setFont(new Font("Serif", Font.BOLD, 100));
      label1.setForeground(Color.white);
      label1.setBackground(Color.black);
      label1.setOpaque(true);
      panel.add(label1);
   
      label2 = new JLabel("9");
      label2.setFont(new Font("Serif", Font.BOLD, 100));
      label2.setForeground(Color.white);
      label2.setBackground(Color.black);
      label2.setOpaque(true);
      panel.add(label2);
        
      label3 = new JLabel("7");
      label3.setFont(new Font("Serif", Font.BOLD, 100));
      label3.setForeground(Color.black);
      label3.setBackground(Color.white);
      label3.setOpaque(true);
      panel.add(label3);
      
      JButton button3 = new JButton("Step");
      button3.addActionListener(new Listener());
      add(button3);
   
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         counter++;
         if(counter > 999)
         {
          counter=0;
         }
         label3.setText("" + counter % 10);
      
         label2.setText("" + (counter % 100) / 10);
                 
         label1.setText("" + counter / 100);
         
        
        
      
      }
   }
}

   /*public void update()
   {
      counter++;
      label3.setText("" + counter % 10);
   
      label2.setText("" + (counter % 100) / 10);
                 
      label1.setText("" + counter / 100);
   
   }
}*/


