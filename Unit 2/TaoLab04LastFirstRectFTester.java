public class TaoLab04LastFirstRectFTester{
   public static void main(String[] args) {
      RectF a = new RectF();              //Creating an instance of a RectF using default constructor
      RectF b = new RectF(10, 20.5, 100, 30.5);   //4-parameter constructor left/top/right/bottom
      RectF c = new RectF(b);             //1-argument constructor, passing in a RectF
     //printing out properties - Constructor tests
      System.out.println("default:\t\tleft: " + a.left + ", top: "+a.top + ", right: "+a.right + ", bottom: "+a.bottom);
      System.out.println("4-argument:\t\tleft: " + b.left + ", top: "+b.top + ", right: "+b.right + ", bottom: "+b.bottom);
      System.out.println("1-argument(RectF):\tleft: " + c.left + ", top: "+c.top + ", right: "+c.right + ", bottom: "+c.bottom);
      //print getter methods
      System.out.println("cX:"+b.centerX()+", cY:"+b.centerY()+", width:"+b.getWidth()+", height:"+b.getHeight());
      System.out.println(c);              //using the toString() method
      //test setters
      a.set(11,(float)10.5,100,25); //set to new dimensions: left, top, right, bottom
      System.out.println("4-parameter set(): \t\t\t"+a);              //print new RectF
      a.set(b);                                   //set to new RectF
      System.out.println("set(RectF) {b into a}: \t\t"+a);                      //print new RectF
      b.setEmpty();                               //set d to empty
      System.out.println("b set to empty: \t\t\t\t" +b);                      //print new RectF
      //test movement methods
      b.set(10, 20.5f, 100, 30.5f);
      System.out.println("reset b to 10, 20.5, 100, 30.5: \t"+b);          //print new RectF
      b.offset(20, 50);                                         //move right 20, down 50
      System.out.println("after offset(20,50): \t\t"+b);          //print new RectF
      b.offsetTo(20, 50);                                     //move to (20,50)
      System.out.println("after offsetTo(20,50):  \t"+b);              //print new RectF
      //reset RectF's
      a = new RectF();              
      b = new RectF(10, 20.5, 100, 30.5);
      c = new RectF(-10, -5, 100, 150); 
      //test isEmpty and intersects
      System.out.println("Is a empty? (expected-true): \t\t\t\t"+a.isEmpty());              
      System.out.println("Does a intersect b? (expected-false): \t"+a.intersects(b)); 
      //note if 'a' is empty, it cannot "intersect"
      System.out.println("Does a intersect c? (expected-false): \t"+a+",\t\t\t\t"+c+"\t="+a.intersects(c)); 
      //note a valid RectF can contain an empty RectF
      System.out.println("Does c intersect a? (expected-true): \t"+c+",\t"+a+"\t\t\t="+c.intersects(a));
      System.out.println("Does b intersect c? (expected-true): \t"+b+",\t\t"+c+"\t="+b.intersects(c));
      System.out.println("Does b intersect (0,0,5,5)? (expected-false): \t\t\t\t\t\t\t\t\t\t"+b+"\t="+b.intersects(0,0,5,5));
      System.out.println("Does b intersect (15,25,115,55)? (expected-true): \t\t\t\t\t\t\t\t\t"+b+"\t="+b.intersects(15,25,115,55));
   }
}