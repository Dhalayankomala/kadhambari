class Degree
{
 public void getDegree()
 {
   System.out.println("I got a degree");
 }
}
class Undergraduate extends Degree
{
  public void getDegree()
  {
    System.out.println("I am an undergraduate");
  }
}
class Postgraduate extends Undergraduate
{
  public void getDegree()
  {
     System.out.println("I am a postgraduate");
  }
  
}
 class E
 {
    public static void main(String []args)
	{
	    Postgraduate d1=new Postgraduate();
		 d1.getdegree;
		 
		
	}
 }