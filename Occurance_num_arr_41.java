/* Task:1
         
         41.Occurrence of a number in given array
        
*/
import java.util.Scanner;

public class Occurance_num_arr_41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();  
        }
        System.out.println("Enter the element to be searched for no of occurances: ");
        int ser_ele=sc.nextInt();
        int repeat=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ser_ele)
            {
             repeat++;
            }
        }
        System.out.println(ser_ele+" has occured "+repeat+" times");


    }
    
}
