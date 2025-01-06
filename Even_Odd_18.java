/* Task:1
         
        18.Even or odd
         Highlight:9 = 9*9=81 ---->8+1=9
         Examples: 1,9
  
*/
import java.util.Scanner;

public class Even_Odd_18 
{
   public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0)
        System.out.println(n+" is Even");
        else 
        System.out.println(n+" is Odd");
    } 
}
