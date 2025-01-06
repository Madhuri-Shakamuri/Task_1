/* Task:1
         
         4.Prime Number
         LOgic: number is divible by itself and 1
         Examples : 2 prime   --->2,3,5,7....
        
*/

import java.util.Scanner;
public class Prime_4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is a Prime number");
        }
        else 
        {
            System.out.println(n+" is not a Prime number");
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
              return false;
            }
        }
        return true;
    }
}
