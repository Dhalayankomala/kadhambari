abstract class Voice
{
   abstract int add(int a, int b);
   abstract void sub();
   void mul()
   {
    System.out.println("Multiplication");
   }
   void div()
   {
     System.out.println("Division");
   }
}
 class Jeevan extends Voice
 {
	
    int add(int a, int b)
	{
	  int ad=a+b;
	  return ad;
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String []args)
	{
	   Jeevan v=new Jeevan();
	   
	   int k= v.add(2,2);
	   System.out.println(k);
		v.sub();
		v.mul();
		v.div();
	}
 }