/* Task:1
         
         12.Sum of natural numbers
         Highlight: Natural nums starts from 1  
  
*/
import java.util.Scanner;
public class Sum_Natural_num_12 
{
     public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of n natural numbers: "+sum);
    }
}
