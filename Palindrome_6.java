/* Task:1
         
         6.Palindrome  
         LOgic: reverse 
         Examples: num --> 121==121  
                   str --> madam==madam
         
        
*/
import java.util.Scanner;

public class Palindrome_6
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter a String: ");
        String str=sc.next();

        
        if(isPalindrome_num(n) )
        {
            System.out.println(n+" is a Palindrome ");
        }
        else 
        {
            System.out.println(n+" is  not  a Palindrome ");
        }
        if(isPalindrome_str(str))
        {
            System.out.println(str+" is a Palindrome ");
        }
        else 
        {
            System.out.println(str+" is  not  a Palindrome ");
        }
        
        

    }
    public static boolean isPalindrome_num(int n)
    {
        int temp=n,sum=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==temp) return true;
        else return false ;


    }
    public static boolean isPalindrome_str(String str)
    {
        str=str.toLowerCase();
        char ch=' ';
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ch=str.charAt(i);
            rev+=ch;
        }
        if(str.equals(rev)) return true;
        else return false; 

    }
}
