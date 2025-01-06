/* Task:1
         
        40.Printing duplicates count of elements in an array.
  
*/
import java.util.Arrays;
import java.util.Scanner;

public class Duplicates_40 
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
        duplicates_count(arr);
    }
    public static void duplicates_count(int[] arr)
    {
     int n=arr.length;
     int[] freq=new int[n];
     boolean[] b=new boolean[n];
     Arrays.fill(b,true);
     for(int i=0;i<n;i++)
     {
        freq[i]=1;
        for(int j=i+1;j<n;j++)
        {
         if(arr[i]==arr[j])
         {
           freq[i]++;
           b[j]=false;
         }
        }
     }
     System.out.println("Duplicate Elements");
     for(int i=0;i<n;i++)
     {
        if(b[i]==true && freq[i]>1)
        System.out.println(arr[i]+":"+freq[i]);
     }
    }
    
}
