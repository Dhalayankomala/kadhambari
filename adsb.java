class A
{
  int a=10;
}
class B extends A
{
 int b=20;
}
class C extends B
{
 int sum=a+b;
}
class D extends C
{
 public static void main(String []args)
 {
   D d=new D();
   System.out.println(d.sum);
 }
} 