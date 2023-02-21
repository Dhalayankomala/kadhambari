import java.util.Scanner;
class call
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");
int b=s.nextInt();
call obj=new call();
obj.add(a,b);
obj.sub(a,b);
}
public void add(int a,int b)
{
int c=a+b;
System.out.println("add of two no is" + c); 
diff(c);

}
public void sub(int a,int b)
{
int c=a+b;
System.out.println("sub of two no is" +c);
}
public void diff(int c)
{
int d=c*c;
System.out.println("multiplication of two no is" + d);
}

}