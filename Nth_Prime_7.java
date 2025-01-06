/* Task:1
         
         7.N th Prime 
         LOgic: number is divible by itself and 1
         Examples : 5 th prime = 11
        
*/
import java.util.Scanner;
public class Nth_Prime_7 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int prime_num=0;
        for(int i=1;i<=100;i++)
        {
            if(isPrime(i))
            {
              prime_num++;

            }
            if(n==prime_num)
            {
                System.out.println(n+" th prime is "+i);
                break;
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


