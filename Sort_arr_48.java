/* Task:1
         
      48.Write a program that uses a function to sort an array of integers
         Used(Highlight): Bubble sort
*/
import java.util.Scanner;
import java.util.Arrays;
public class Sort_arr_48
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
        System.out.println(Arrays.toString(bubble_sort(arr)));
         
    } 
    public static int[] bubble_sort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<=n-i+1;i++)
        {
            for(int j=1;j<n;j++)
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
