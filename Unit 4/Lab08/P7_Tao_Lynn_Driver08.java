 //name:    date:  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class P7_Tao_Lynn_Driver08
{
   public static void main(String[] args) throws Exception
   {
      try
      {
         Scanner string = new Scanner( new File("words.txt") );
         String array[] = new String[45382];
         for(int x = 0; x < 45382; x++)
         {          
            array[x] = string.next();
         }
         while(true)
         {
         
            String myWord = JOptionPane.showInputDialog("Word? (Type -1 to quit:)");
            if(myWord.equals("-1"))
               break;
            int index=0;
            boolean flag = false;
            for(int x = 1; x < 45382; x++)
            {          
               if(myWord.toLowerCase().equalsIgnoreCase(array[x]))
               {
                  index=x;
                  flag = true;
               }
            }
            if(flag)
               System.out.println("Yes, " + myWord + " is a word, " + "#"+ index + ".");
            else
               System.out.println("No, " + myWord + " is not a word.");
         } 
      
      
      }
      catch(FileNotFoundException e) 
      {
         JOptionPane.showMessageDialog(null, "Cmon, watch your typing!");
         System.exit(0);
      }
            
           
   }
}
