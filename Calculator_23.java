/* Task:1
         
        23.A program that simulates a simple calculator with basic arithmetic operations
  
*/
import java.util.Scanner;

public class Calculator_23
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Simpel Calculator: ");
        System.out.println("Enter Two values:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res=0;
        char ch=sc.next().charAt(0);
        switch (ch) 
        {
            case '+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            case '/':
                res=n1/n2;
                break;
            case '%':
                res=n1%n2;
                break;
            default:
                break;
        }
        System.out.println(res);

    }
    
}
