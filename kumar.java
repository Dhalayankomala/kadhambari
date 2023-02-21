import java.util.Scanner;

class E
{
  public static void main(String args[])
   {
      Scanner S=new Scanner(System.in);
       int a=S.nextInt();
       int b=S.nextInt();
      if(a>b)
       
        {
          for (int i=a; i>=b; i--)
          {
            System.out.println(i);
          }
        }
        
   }
}