import java.util.Scanner;
class Scannerex
{
public static void main (String[] args)
{
Scannerex s1=new Scannerex();
s1.total();
}
public void total()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the five values");

int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
int total=a+b+c+d+e;
System.out.print("AVG : "+Avg(total));
}
public int Avg(int a)
{

int Avg=a/5;
return Avg;

}
}
