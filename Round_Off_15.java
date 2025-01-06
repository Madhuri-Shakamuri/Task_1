/* Task:1
         
         15.Round off
        logic : round off to nearest value
  
*/
import java.util.Scanner;
import java.lang.Math;
public class Round_Off_15 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a float value: ");
        float n=sc.nextFloat();
        System.out.println("Round of value: ");
        System.out.println(Math.round(n));  
    } 
}
