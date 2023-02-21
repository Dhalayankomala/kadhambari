import java.util.Scanner;
class Bank
{
    public static void main(String args[])
    {
             Scanner s=new Scanner(System.in);
               int Tacc=123;
               int Bacc=321;
               int Kacc=231;
            System.out.println("Enter the bank name: ");
             String bank=s.next();
            System.out.println("Enter the account no: ");
             String account=s.next();
            System.out.println("Enter the branch name: ");
             String branch=s.next();
         if(bank.equals("Tmb"))
         {
            if(account==Tacc)
              {
                if(branch.equals("Thirunelveli"))
                {
                 System.out.println("account :123");
                }
                else
                {
                 System.out.println("Invalid acc no");
                 }
              }
             else
               {
                system.out.println("Invalid branch");
                }
              
         }
    else if(bname.equals("Bacc"))
      {
          if(accno.equals(Baccno))
            {
              if(branch.equals("Chennai"))
              {
               System.out.println("acc no:321");
              }     
              else
               {
                System.out.println("Invalid acc no");
                }
             }
               else
                 {
                  System.out.println("Invalid branch");
                  }
             
         }
}
}
