import java.util.Scanner;
class Double
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int n = s.nextInt();
       for(int i=9; i>n; i--)
        {
          if(i%2==1)
          {
             System.out.println(i);
           }
         }
    }
}