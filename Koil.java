abstract class komala
{

komala()
{
	System.out.println("Jeba");
}

abstract void add();
abstract void mul();

public void sub()
{
System.out.println("Java");
}
}

class Koil extends komala 
{
	
	void mul()
	{
		
		System.out.println("mul");	

	}

void add()
{
System.out.println("Add");	
}
public static void main(String [] ar)
{

Koil k=new Koil();

k.add();
k.sub();
k.mul();


}
Koil()
{
	super();
}
}
