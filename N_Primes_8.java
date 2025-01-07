/* Task:1
         
         8.N_Primes
         Logic: number is divible by itself and 1
         Examples :n=5 2,3,5,7,11
        
*/
import java.util.Scanner;
public class N_Primes_8   
{  public static void main(String[] args)
     
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(n+" Prime numbers : ");
        int prime_count=1;
	    for(int i=1;i<=Integer.MAX_VALUE;i++)
	    {
	        if(prime_count<=n)
	        {
	         if(isPrime(i))
	        {
	         prime_count++; 
	         System.out.println(i);
	        }  
	        }
	  
	    }
    }

    public static boolean isPrime(int n)
    {
        if(n==0 || n==1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;

        }
        return true;
    }
    
}
