import java.util.Scanner;

class S

{
   public static void main(String ar[])
   {
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int sum=0;

  for (int i=1; i<=n; i++)
{
   sum=sum+i;
   System.out.println(sum);
}
  
  }
}