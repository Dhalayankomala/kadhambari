import java.util.Scanner;
class C
{
  public static void main(String [] args)
  {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
                   
  int sum=0;
   for(int i=1; i<=10; i++)
   {
	   int a=s.nextInt();
    sum=sum+a;
	
	
   }
   
   System.out.println(sum);
   
  }
}