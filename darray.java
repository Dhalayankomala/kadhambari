class Darray
{
    public static void main(String []args)
	{
	  int a[]={1,2,3,4};
	  int b[]=new int [4];
	
	  for(int i=0; i<a.length;i++)
	  {
	      b[i]=a[i];
	  }
	  for(int i=a.length-1; i>=0; i--)
	  {
	    System.out.println(b[i]);
	  }
	}
}