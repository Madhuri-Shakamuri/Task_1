/* Task:1
         
         25.Lcm and hcf of given 2 numbers
  
*/

import java.util.Scanner;

public class Lcm_Hcf_25
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n1=sc.nextInt();
        System.out.println("Enter num2: ");
        int n2=sc.nextInt();
        System.out.println("LCM of "+n1+" and "+n2+": "+lcm(n1,n2));
        System.out.println("HCF of "+n1+" and "+n2+": "+hcf(n1,n2));

     }
     public static int lcm(int n1,int n2)
     {
        int h=hcf(n1,n2);
        int lcm=(n1*n2)/h;
        return lcm;
     }

     public static int hcf(int n1,int n2)
     {
        int rem=0;
      while(n1%n2!=0)
      {
        rem=n1%n2;
        n1=n2;
        n2=rem;

      }
      return n2;
     }
}
