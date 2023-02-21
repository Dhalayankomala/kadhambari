class Scored
{ 
   public static void main(String args[])
   {
    int m1=86, m2=87, m3=88;

  if(m1>=35 && m2>=35 && m3>=35)
     {
      System.out.println("Pass");
     
  if(m1>=90 && m2>=90 && m3>=90)
     {
      System.out.println("A Grade");
     }
   else if((m1>=81 && m1<=90) && (m2>=81 && m2<=90) &&  (m3>=81 && m3<=90))
     {
      System.out.println("B Grade");
     } 
   else if((m1>=71 && m1<=80) && (m2>=71 && m2<=80) && (m3>=71 && m3<=80))
     {
      System.out.println("C Grade");
     }
   else
     {
      System.out.println("D Grade");
     }

    

int Total=m1+m2+m3;
int Avg=Total/3;

  System.out.println(Total);
  System.out.println(Avg);

}
}
}

