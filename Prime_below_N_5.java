/* Task:1
         
         5.Prime  Number below n
         LOgic: number is divible by itself and 1
         Examples :n=10 2,3,5,7
        
*/
import java.util.Scanner;
public class Prime_below_N_5
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Prime numbers below n: ");
        for(int i=1;i<n;i++)
        {
            if(isPrime(i))
            System.out.println(i);
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
