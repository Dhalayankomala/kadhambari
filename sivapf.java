import java.util.Scanner;
class Sivam
{
    public static void main (String args[])
    {
      int pass=0;
      int fail=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the tamil marks");
      int T=s.nextInt();
      System.out.println("Enter the english marks");
      int E=s.nextInt();
      System.out.println("Enter the maths marks");
      int M=s.nextInt();
      System.out.println("Enter the science marks");
      int Sc=s.nextInt();
      System.out.println("Enter the social-science marks");
      int Ss=s.nextInt();

   if(T>=35 && E>=35 && M>=35 && Sc>=35 && Ss>=35)
     {
      System.out.println("Pass");
      int total=T+E+M+Sc+Ss;
      System.out.println(total);
      int avg=total/5;
      System.out.println(avg);
      if(avg>90)
      {
       System.out.println("A Grade");
       }
        else if(avg>80 && avg<=90)
        {
          System.out.println("B Grade");
         }
        else if(avg>70 && avg<=80)
        {
          System.out.println("C Grade");
         }
         else {
           System.out.println("D Grade");
             }
       }
     else
         {
           System.out.println("fail");
           if(T>=35)
            {
              pass++;
             }
            else
                {
                 fail++;
                 }
           if(E>=35)
             {
               pass++;
              }
             else
                 {
                  fail++;
                 }
           if(M>=35)
              {
               pass++;
              }
             else
                {
                 fail++;
                 }
          if(Sc>=35)
              {
                pass++;
               }
             else
                 {
                  fail++;
                  }
         if(Ss>=35)
             {
              pass++;
             }
            else
                {
                  fail++;
                }
      System.out.println("No.of passed subjects" +pass);
      System.out.println("No.of failed subjects" +fail);

    }
}
}