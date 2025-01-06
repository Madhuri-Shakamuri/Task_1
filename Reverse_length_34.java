/* Task:1
         
        34.Reverse a number and its length
  
*/

import java.util.Scanner;

public class Reverse_length_34 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int rem=0,rev=0,digit=0;
        while(n>0)
        {
            rem=n%10;
            digit++;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse: "+rev+"\nLength: "+digit);
    }
    
}   
