import java.util.Scanner;
class Array
{
  public static void main(String []args)
  {
      Scanner s=new Scanner(System.in);
	    int a [] []=new int [3] [3];
		int b [] []=new int [3] [3];
		for(int i=0; i<3; i++)
		{
		  for(int j=0; j<3; j++)
		  {
		    System.out.println("Enter the Array Numbers");
			 a[i][j]=s.nextInt();
			 b[i][j]=a[i][j];
		  }
		}
		for(int i=0; i<3;i++)
		{
		   for(int j=0; j<3; j++)
		   {
		     System.out.println(b[i][j]);
		   }
		   System.out.println();
		}
  }
}


