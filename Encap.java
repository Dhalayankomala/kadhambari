 class Encap
{
  public static void main(String args[])
  {
     Encapsul o=new Encapsul("Java", "123");
	   o.setAge(24);
	   String n=o.getname();
	   String p=o.getpass();
	   int a=o.getAge();
	   System.out.println("Name: "+n+"\npass: "+p+"\nAge: "+a);
  }
}