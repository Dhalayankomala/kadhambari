class Parent1
{
  Parent1()
  {
     System.out.println("Sakthi");
  }

        int a=40;
        int b=20;
        int add()
        {
         int c=a+b;
         return c;
        }
}
class Child extends Parent1
{
     Child()
	 {
	  super();
	  System.out.println("Sivam");
	 }
	 int a=5;
	 int add()
	 {
	 int d=super.add();
	 int f=d-a;
	 System.out.println(f);
	 return f;
	 }
	 
	 public static void main(String []args)
	 {
	    Child e=new Child();
		  e.add();
	 }
}
