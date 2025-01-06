/* Task:1
         
         16.Neon number
         Highlight:9 = 9*9=81 ---->8+1=9
         Examples: 1,9
  
*/

import java.util.Scanner;

public class Neon_num_16
{
   public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isNeon(n))
          System.out.println(n+" is Neon num");
        else
        System.out.println(n+" is not Neon num"); 
          
    }   
    public static boolean isNeon(int n)
    {
        int sq=n*n;
        int rem=0,sum=0;
        while (sq>0) 
        {
         rem=sq%10;
         sum+=rem;
         sq/=10;
            
        }
        if(n==sum) return true;
        else return false;
    }
    
}
