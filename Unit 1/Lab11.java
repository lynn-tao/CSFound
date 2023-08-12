import edu.fcps.karel2.Display;

public class Lab11
{
   public static void main(String[] args) 
   {
      Display.openWorld("");
    
      
      /* Digit first = new One(1, 10);
      Digit second = new Four(7, 10);
      Digit third = new Nine(13, 10);
      Digit fourth = new Five(19, 10);
      Digit fifth = new Three(25, 10);
      Digit sixth = new Three(31, 10);
      Digit seventh = new Three(37, 10);
   
      first.display();
      second.display();
      third.display();
      fourth.display();
      fifth.display();
      sixth.display();
      seventh.display();*/
   
      Display.setSize(45,30);
      Display.setSpeed(10);
   
   
   
      new One(1, 10).display();
      new Four(7, 10).display();
      new Nine(13, 10).display();
      new Five(19, 10).display();
      new Three(25, 10).display();
      new Three(31, 10).display();
      new Three(37, 10).display();
   
   
   
      
   
   }
}