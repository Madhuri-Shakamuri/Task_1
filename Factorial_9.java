/* Task:1
         
         9.Factorial of a number
         Logic: 5!=5*4*3*2*1=120
  
*/
import java.util.Scanner;

public class Factorial_9
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int pro=1;
        for(int i=n;i>=1;i--)
        {
            pro*=i;
        }
        System.out.println("Factorial of "+n);
        System.out.println(pro);
    }
}
