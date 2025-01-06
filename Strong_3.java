/* Task:1
         
         3.Strong Number
         LOgic: 145=1!+4!+5!= 1+24+120=145
         Examples : 1,2,145
        
*/

import java.util.Scanner;
public class Strong_3
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isStrong(n))
        {
            System.out.println(n+" is a Strong number");
        }
        else 
        {
            System.out.println(n+" is not a Strong number");
        }

    }
    
    public static boolean isStrong(int n)
    {
        int pro=1,sum=0,rem=0;
        int original=n;
     while(n>0)
     {
        rem=n%10;
        pro=1;
        for(int i=rem;i>=1;i--)
        {
            pro*=i;
        }
        
        sum+=pro;
        n=n/10;

     }
     if(sum==original)
     {
        return true;
     }
     else 
     {
        return false;
     }
    }
}