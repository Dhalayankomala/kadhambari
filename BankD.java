abstract class Bank
{
 abstract void getBalance();
 
}
class BankA
{
 void getBalance()
 {
   System.out.println("100 is deposited");
 }
}
class BankB
{
  void getBalance()
  {
    System.out.println("150 is deposited");
  }
}
class BankC
{
 void getBalance()
 {
  System.out.println("200 is deposited");
 }
}
class BankD
{
  public static void main(String []args)
  {
   BankA a=new BankA();
     a.getBalance();
   BankB b=new BankB();
      b.getBalance();
    BankC c=new BankC();
      c.getBalance();	
  }
}