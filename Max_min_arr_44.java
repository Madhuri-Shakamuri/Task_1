/* Task:1
         
         44.Max & min element in an array  
  
*/
import java.util.Scanner;

public class Max_min_arr_44 
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
        System.out.println("Maximum element in the array: "+max(arr));
        System.out.println("Minimum element in the array: "+min(arr));
        

    }
    public static int min(int[] arr)
    {
        int min_ele=arr[0]; 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min_ele)
            {
                min_ele=arr[i];
            }
        }
        return min_ele;
    }
    public static int max(int[] arr)
    {
        int max_ele=arr[0]; 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max_ele)
            {
                max_ele=arr[i];
            }
        }
        return max_ele;
    }
    

}
