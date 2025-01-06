/* Task:1
         
         2.Perfect Number
         LOgic: factors 1+2+3=6    n==6
         Examples : 6,28,496
*/

import java.util.Scanner;
public class Perfect_2 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isPerfect(n))
        {
            System.out.println(n+" is a Perfect number");
        }
        else 
        {
            System.out.println(n+" is not a Perfect number");
        }

    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
      for(int i=1;i<=n/2;i++)
      {
        if(n%i==0)
        {
            sum+=i;
        }
      }
      if(n==sum)
         return true;
      else 
       return false;
    }
}
