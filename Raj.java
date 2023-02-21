interface ins1
{
void add();
public void sub();

}

interface ins2
{
void add1();
public void sub1();
}

class Raj implements ins1,ins2
{
	public void add()
	{
		System.out.println("Add");
	}
	public void sub()
	{
		System.out.println("Sub");
	}
public static void main(String [] ar)
{	
	Raj r=new Raj();
	r.add();
	r.sub();
}
}