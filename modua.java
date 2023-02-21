import java.util.Scanner;
 class E
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
              int d=s.nextInt();
       
     for(int i=0; i<200; i++)
      {
         i++;
         if(i%6==1)
         {
          System.out.println(i);
          }
       }
    }

}