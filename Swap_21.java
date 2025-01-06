/* Task:1
         
         21.Swap without 3 rd variable
        logic : We can also use XOR (^) 
  
*/

import java.util.Scanner;
public class Swap_21 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values: ");
        int n1=sc.nextInt();  // 8
        int n2=sc.nextInt();  // 2
        
        n1=n1+n2;  //n1=10           
        n2=n1-n2; // n2=10-2=8
        n1=n1-n2; // n1=10-8=2
        System.out.println("Swap:");
        System.out.println(n1+"\n"+n2);


    }
    
}
