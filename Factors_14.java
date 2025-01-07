/* Task:1
         
         14.Factors
         Highlight: 12 -->1,2,3,4,6
  
*/
import java.util.Scanner;

public class Factors_14 
{
     public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Factors: ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)  
            {
                
                System.out.println(i);
                
              
            }
        }
    } 
    
}
