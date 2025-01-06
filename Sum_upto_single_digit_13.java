/* Task:1
         
         13.Sum of number upto single digit
         Highlight: count n 
  
*/
import java.util.Scanner;

public class Sum_upto_single_digit_13 
{   
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum_value=sum(n);
        while(sum_value>10)
        {
          sum_value=sum(sum_value);
        }
        System.out.println("Sum upto single digit: "+sum_value);
        
    }

    public static int sum(int n)
    {
        int sum=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n=n/10;
        } 
        return sum;
        
    }
}
