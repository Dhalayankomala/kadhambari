import java.util.Scanner;
class A
{
     public static void main(String args[])
    {
     Scanner S=new Scanner(System.in);
      int n= S.nextInt();  
 

if (n>50)
{
System.out.println("fail");
}
else if(n==50)
{
System.out.println("E-Grade");
}
else  if(n>=51 && n<=59)
{
System.out.println("D-Grade");
}
else if(n>=60 && n<=69)
{
System.out.println("C-Grade");
}
else if(n>=70 && n<=79)
{
System.out.println("B-Grade");
}
else if(n>=80 && n<=89)
{
System.out.println("A-Grade");
}
else if(n>=90 && n<=100)
{
System.out.println("S-Grade");
}
else if(n>100)
{
System.out.println("Invalid");
}
}  
}