class Box
{
  Box()
  {
    System.out.println("Box");
  }
  int a=10;
  int b=20;
   int add()
   {
     int c=a+b;
	 return c;
   }
}

class Pen extends Box
{
  Pen()
  {
    super();
    System.out.println("Pencil");
  }
  int a=30;
  int b=30;
  int add()
  {
    int c=a+b;
	System.out.println(c);
	return c;
  }
public static void main(String []args)
{
  Pen d=new Pen();
  d.add();
}
}




