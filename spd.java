class Sum
{
   int sum;
   public int sum(int a, int b)
   {
     sum=a+b;
	 return sum;
   }
   
}
class Prod
{
  int prod;
  public int prod(int a, int b)
  {
    prod=a*b;
	return prod;
  }
}
class Diff
{
  int diff;
  public void diff(int sum, int prod)
  {
    diff =prod-sum;
	System.out.println(diff);
  }
}
class A
{
   public static void main(String args[])
   {
     int a=10, b=5;
	  Sum s=new Sum();
	  int x=s.sum(a,b);
	  Prod p=new Prod();
	  int y=p.prod(a,b);
	  int v=x+y;
	  System.out.println(v);
	  Diff d=new Diff();
	  d.diff(x,y);
	
   }

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             





