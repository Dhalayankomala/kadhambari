class Parent
{
 Parent()
 {
   System.out.println("Sivam");
 }
  int a=30;
  int b=60;
  void add()
  {
    int c=a+b;
	System.out.println(c);
  }
}
class Child extends Parent
{
  Child()
  {
	  super();
   System.out.println("Komala");
  }
  public static void main(String []args)
  {
    Child d=new Child();
	  d.add();
  }
}