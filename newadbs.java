class A
{
  int a=10;
}
class B extends A
{
  int b=5;
}
class C
{
  B o=new B();
    int sum=o.a+o.b;
}
class D extends C
{
  int d=5+sum;
}
class E
{
 public static void main(String []args)
 {
   
    
	 D o2=new D();
	  System.out.println(o2.d);
	  C o3=new C();
	  System.out.println(o3.sum);
   
 }
}
