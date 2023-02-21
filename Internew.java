class A
{
  int a=10;
  void m()
  {
    System.out.println("Sum");
  }
}
class B extends A
{
  int a=20;
  void m()
  {
    System.out.println("Add");
   }
  public static void main(String []args)
  {
  A obj=new B();
  System.out.println(obj.a);
  obj.m();

   }  
} 
