/* Task:1
         
         7.N th Prime 
         LOgic: number is divible by itself and 1
         Examples : 5 th prime = 11
        
*/
import java.util.Scanner;
public class Main 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int prime_count=0;
        for(int i=1;i<=Integer.MAX_VALUE;i++)
	    {
	   if(isPrime(i))
	   {
	         prime_count++; 
	         if(prime_count==n)
	         System.out.println(i);
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


