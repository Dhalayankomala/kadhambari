class Parent
{
  void Pmethod()
  {
    System.out.println("This is Parent class");
  }
}
class Child extends Parent
{
  void Cmethod()
  {
    System.out.println("This is Child class");
  }
}
class C
{
  public static void main(String []args)
  {
    Parent p=new Parent();
	 p.Pmethod();
	 Child c=new Child();
	  c.Cmethod();
	  c.Pmethod();
  }
}