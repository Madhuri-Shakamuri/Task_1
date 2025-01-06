
/* Task:1
         
        42.Ascending order of an array
  
*/
import java.util.Scanner;
import java.util.Arrays;
public class ASC_order_arr_42 
{
    public static void main(String... args)
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
        System.out.println("ascending_order: ");
        System.out.println(Arrays.toString(ascending_order(arr)));
    }
    public static int[] ascending_order(int[] arr)
    {
     
     for(int i=0;i<arr.length-i+1;i++)
     {
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]<arr[j-1])
            {
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
            }
        }
        
     }

     return arr;
    }
    
}
