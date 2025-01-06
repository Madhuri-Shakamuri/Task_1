/* Task:1
         
         39.Missing numbers in array.
  
*/
import java.util.Scanner;
import java.util.Arrays;
public class Missing_num_arr_39
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
        System.out.println("Missed Elements: ");
        int i=0;
        while(i<n)
        {
          int correct=arr[i]-1;
          if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[correct])
          {
           swap(arr,i,correct);
           
          }
          else 
          {
            i++;
          }
          
        }
        for (i = 0; i < n; i++)
         {
            if (arr[i] != i + 1) 
            {
                System.out.println(i + 1);
            }
        }
        
        

    }
    public static int[] swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
    
}
