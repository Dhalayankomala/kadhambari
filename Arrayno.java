import java.util.Scanner;
class Arrayno
{
   public static void main(String []args)
   {
      int a[]=new int[10];
	  int count=0;
	  Scanner s=new Scanner(System.in);
	  for(int i=0; i<10; i++)
	  {
	    System.out.println("Enter the Number");
		a[i]=s.nextInt();
	  }
	   System.out.println("Enter the Number to find");
	    int b=s.nextInt();
		 for(int i=0; i<10; i++)
		 {
		   if(a[i]==b)
		   {
		     count++;
			 System.out.println("Number is found in  a["+i+"]");
		   }
		 }
		 if(count==0)
		 {
		 System.out.println("Number is not found in Array");
		 
	  }
   }
}
