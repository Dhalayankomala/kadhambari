import java.util.Scanner;
class A
{
  A()
  {
   System.out.println("Hi");
  }
}
class B extends A
{
  B()
  {
    super();
	{
	  System.out.println("Komala");
	}
  }
public static void main(String []args)
{
   B b=new B();
   Scanner s=new Scanner(System.in);
    System.out.println("Enter your mail-id");
	String d=s.next();
	System.out.println("Enter your password");
	int p=s.nextInt();
	System.out.println("Succcessfully Registered");
}
}