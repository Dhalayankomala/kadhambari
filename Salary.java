import java.util.Scanner;
class Salary
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter age");
int age=s.nextInt();
System.out.println("Enter gender");
String gender=s.next();
System.out.println("Enter maritial status");
String status=s.next();
String male;
String unmarried;
if(gender==male)
{
if(age >20 && age <30 && status==unmarried)
{
System.out.println("salary is 15000");
}
else
{
System.out.println("salary is 20000");
}
}
else{
if(age > 20 && age <30 && status==unmarried)
{
System.out.println("salary is 20000");
}
else
{
System.out.println("salary is 30000");
}
}
}
}

