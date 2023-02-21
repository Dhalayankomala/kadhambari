import java.util.Scanner;
class Encapsule
{
 public static void main(String []args)
 {
    Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Name ");
	 String name=s.next();
	 System.out.println("Enter the Count ");
	 int a=s.nextInt();
	 System.out.println("Enter the Amount");
	 int a2=s.nextInt();

   Encapse c=new Encapse();
     c.setName(name);
     c.setCount(a);
     c.setAmount(a2);
     c.setTotal();
    String Name=c.getName();
          int b = c.getCount();
          int b2 = c.getAmount();
          int b3 = c.getTotal();
     System.out.println(name);
     System.out.println(b);
System.out.println(b2);
System.out.println(b3);
}
}