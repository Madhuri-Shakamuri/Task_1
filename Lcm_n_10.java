/* Task:1
         
         10.LCM of n numbers
         LCM= (a*b)/HCF;
  
*/

import java.util.Scanner;

public class Lcm_n_10 
{

   public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n Value : ");
        int n=sc.nextInt();
        System.out.println("Enter n Values: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }   
        int lcm=arr[0];
         for(int i=0;i<n;i++)
        { 
            lcm=lcm(lcm,arr[i]);
        }
        System.out.println("Lcm: :"+lcm);
        


    } 
    public static int lcm(int n1,int n2)
    {
        int a=n1;
        int b=n2;
        int rem=0;
        while(n1%n2!=0)
        {
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        
        return (a*b)/n2;
    }
}
