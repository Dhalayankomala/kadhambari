import java.util.Scanner;
class Bank
{
   public static void main(String args[])
   {
          Scanner s=new Scanner(System.in);
              int Tmb_acc=123;
              int Bob_acc=231;
              int Iob_acc=321;
          System.out.println("Enter the bank name: ");
              String Bank=s.next();
          System.out.println("Enter the account no: ");
              int Account=s.nextInt();
          System.out.println("Enter the branch: ");
              String Branch=s.next();
      if(Bank.equals("Tmb"))
        {
           if(Account==Tmb_acc)
            {
              if(Branch.equals("Tirunelveli"))
              {
                System.out.println("Balance: 15000");
               }
           else
               {
                 System.out.println("Invalid branch no: ");
                }      
             } 
          else
             {
                System.out.println("Invalid Account no: ");
             }
          }
      if(Bank.equals("Bob"))
        {
            if(Account==Bob_acc)
               {
                 if(Branch.equals("Chennai"))
                    {
                      System.out.println("Balance: 20000");
                     }
               else
                   {
                     System.out.println("Invalid branch no: ");
                    }
               }
           else
              {
               System.out.println("Invalid Account no: ");
              }
        }

    }
}