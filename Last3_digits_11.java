/* Task:1
         
         11.Extract Last 3 digit number in a number and check if it is divisible by 3 or not
         Logic:  n%1000 
  
*/
import java.util.Scanner;

public class Last3_digits_11
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int last_3=n%1000;
        if(last_3%3==0) 
        System.out.println("Last 3 digit of the number is divisible by 3");
        else 
        System.out.println("Last 3 digit of the number is not divisible by 3");
    }
}
