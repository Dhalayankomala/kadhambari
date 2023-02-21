class mod
{
  public void add(int n, char c)
  {int a=n;
  char b=c;
    System.out.println(a+b);
  }
  public void add(char c, int n)
  {int a=n;
  char b=c;
    System.out.println(a+b);
  }
  public static void main(String args[])
  {
    mod s=new mod();
	 s.add(12,'s');
	 s.add('s', 13);
  }
}