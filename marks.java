import java.util.Scanner;
class Aa
{
   public static void main(String []args)
   {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the 1st :");
	 int m1=s.nextInt();
	 System.out.println("Enter the 2nd :");
	 int m2=s.nextInt();
	 System.out.println("Enter the 3rd :");
	 int m3=s.nextInt();
	 System.out.println("Enter the 4th :");	 
         int m4=s.nextInt(); 
	 System.out.println("Enter the 5th :");
	 int m5=s.nextInt();
	 Aa obj=new Aa();
	 obj.add(m1,m2,m3,m4,m5);
   }
 public void add(int m1, int m2, int m3, int m4, int m5)
    {
	   int total=m1+m2+m3+m4+m5;
	   System.out.println("total is :" +total);
	   B c=new B();
	   c.avg(total);
    }
}
class B
{
     public void avg(int t)
	 {
	        int avg=t/5;
			System.out.println("Average is :" +avg);

System.out.println("Result : "+result(avg));
			
	 }
	 public String result(int avg)
	 {
	   if(avg>50 && avg<100)
	   {
	     String d="A grade";
		 return d;
	   }
	   else
	   {
	     String d="invalid";
		 return (d);
		}
	}
}
	   
	   
	 


   
	 
   
   
   
   
   
   
   
