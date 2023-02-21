import java.util.Scanner;
class A
{
 

public static void main(String [] ar)
{
 String s1;
   do
    {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the NO 1:");
	     int a=s.nextInt();
		 System.out.println("Enter the No 2:");
		 int b=s.nextInt();
		 int c=a+b;
		 System.out.println("Result: "+c);
		 System.out.println("Do you want to continue (y/n)?");
		 s1=s.next();
	}while(s1.equals("yes"));
}
}