/* Task:1
         
         49.Fibonocci Series
         Examples: n=10 0,1,1,2,3,5....
  
*/
import java.util.Scanner;

public class Fibonocci_below_n_49
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,sum=0;
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Fibonocci Series: ");
        System.out.println(a);

        while (b < n) 
        { 
            System.out.println( b);
            sum = a + b;
            a = b;
            b = sum;
        }
        
        
    } 
}
