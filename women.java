import java.util.Scanner;

class C
{

    public static void main(String ar[])

{
    Scanner S=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=S.nextInt();
    System.out.println("Enter the gender");
    String gen=S.next();
    System.out.println("Enter the marital status: ");
    String status=S.next();
 if (gen.equals("male"))
{
 if (age>=20 && age<=30 && status.equals("no"))
    {
     System.out.println("Salary: 15000");
    }
    else if(age>=40 && age<=60 && status.equals("yes"))
    {
     System.out.println("Salary: 20000");
    }
    else
    {
      System.out.println("performance");
    }
}
   else if(gen.equals("female"))
 {
  if (age>=20 && age<=30 && status.equals("no"))
   {
    System.out.println("Salary: 20000");
v   }
   else if(age>=40 && age<=60 && status.equals("yes"))
   {
   System.out.println("Salary: 30000");
   }
   else
   {
    System.out.println("performance");
   }

}
}
}