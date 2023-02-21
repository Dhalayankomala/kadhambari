 class Shape
 {
   public void add()
   {
     System.out.println("This is shape");
   }
 }
 class Rectangle extends Shape
 {
  public void sub()
  {
   System.out.println("This is rectangular shape");
  }
 }
 class circle extends Shape
 {
  public void mul()
  {
    System.out.println("This is circular shape");
  }
 }
 class Square extends Rectangle
 {
   public void div()
   {
     System.out.println("Square is a rectangle");
   }
 public static void main(String []ags)
 {
    Square s=new Square();
	s.div();
	s.sub();
	
}
	}
 
 
 