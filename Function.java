class X{
public static void main(String args[])
{
int sum=Y.add(5,3);
System.out.println(sum);
int sub=Y.sub(5,3);
System.out.println(sub);
Y obj = new Y();
obj.add("Ko","mala");
int result=obj.sub(20,10);
System.out.println(result);
}
}
