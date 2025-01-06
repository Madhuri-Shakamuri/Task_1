
/* Task:1
         
         1.Armstrong Number
         Logic: 1^3 + 5^3 +3^3 = 1+125+27=153 
         Highlight : Math.pow --> returns a double value so use explicit typecasting
         Examples : 153,370,371
*/ 
import java.util.Scanner;
import java.lang.Math;
public class Armstrong_1 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isArmstrong(n))
        {
            System.out.println(n+" is an Armstrong number");
        }
        else 
        {
            System.out.println(n+" is not an Armstrong number");
        }

    }
    public static boolean isArmstrong(int n)   
    {
    int digits=0;
    int temp=n,original=n;
    int rem=0,sum=0;
     while(temp>0)
     {
       temp=temp/10;
       digits++;
     }
     while(n>0)
     {
        rem=n%10;
        sum+=(int)Math.pow(rem,digits);
        n=n/10;
     }
     if(sum==original)
      return true;
     else 
     return false;
     
    }

}