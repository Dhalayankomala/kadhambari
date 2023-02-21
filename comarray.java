class Comarray
{
 public static void main(String []args)
 {
   int a[]={1,2,3};
   int b[]={3,3,3};
   
   for (int i=0; i<3; i++)
   {
	   int count=0;
   for(int j=0; j<3; j++)
   {
   if(a[i]==b[j])
   {
     count++;
	
   }
   
 }
 System.out.println(count);
 }
 }
}