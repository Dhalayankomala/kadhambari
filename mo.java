class Printnumber
{
public void sub()
{
 System.out.println("Subtraction");
}
public void sub(int a)
{
  System.out.println("Output");
}
public void sub(int a, int b)
{
  System.out.println("Output");
 
}
public void sub(int a, String c)
{
 System.out.println("output 3");
}
public static void main(String []args)
{
  Printnumber p=new Printnumber();
    p.sub();
	p.sub(10);
	p.sub(10,5);
	p.sub(10,"Jeeva");
  
}
}
