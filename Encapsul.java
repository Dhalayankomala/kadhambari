public class Encapsul
{
                private String name;
		private String pass;
		private int age;
	Encapsul(String names, String pass)
	{
	  name=names;
	  this.pass=pass;
	}
	public void setAge(int age)
	{
	   this.age=age;
	}
	public String getname()
	{
	  return name;
	}
	public String getpass()
	{
	   return pass;
	}
	public int getAge()
	{
	   return age;
	}
}