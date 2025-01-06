/* Task:1
         
        20.Sum of even and product odd number
  
*/
import java.util.Scanner;

public class Sum_even_Pro_Odd_20 
{
    public static void main(String... args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int rem=0,sum=0,pro=1;
    while(n>0)
    {
        rem=n%10;
        if(rem%2==0)
        {
            sum+=rem;
        }
        else 
        pro*=rem;
        n=n/10;

    }
    System.out.println("Sum of even: "+sum+" \n"+"Product of odd : "+pro);
}
}

