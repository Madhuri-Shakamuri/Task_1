/* Task:1
         
         17.Fibonocci Series
         Examples: 0,1,1,2,3,5....
  
*/
import java.util.Scanner;

public class Fibonocci_Pattern_17 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,sum=0;
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Fibonocci Series: ");
        System.out.println(a+"\n"+b);
        for(int i=3;i<=n;i++)
        {
            sum=a+b;        
            a=b;
            b=sum;
            System.out.println(sum);
        }
        
        
        
    } 
}
