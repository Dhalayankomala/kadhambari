abstract class Parent
{
 abstract void message();
}
class Child1 extends Parent
{
   void message()
   {
     System.out.println("This is first class");
   }
}
class Child2 extends Parent
{
  void message()
  {
    System.out.println("This is second class");
  }
}
class Child3
{
  public static void main(String []args)
  {
     Child1 c=new Child1();
	 c.message();
	 Child2 d=new Child2();
	 d.message();
	 
  }
} 


