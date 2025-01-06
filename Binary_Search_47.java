 /* Task:1
         
       47.Binary_Search 
         Used(Highlight): must be Sorted array
*/
import java.util.Scanner;
public class Binary_Search_47 
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
        System.out.println("Enter the element to be searched: ");
        int ser_ele=sc.nextInt();

        int res=binary(arr,ser_ele);
        if(res==-1)
        System.out.println("Element Not found ");
        else 
        System.out.println("Element found at index:"+res);
         
    }  
    public static int binary(int[] arr,int ele)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;  
            if(ele>arr[mid])
            {
                start=mid+1;
            }
            else if(ele<arr[mid])
            {
                end=mid-1;
            }
            else 
            {
                return mid;
            }

        }
        return -1;
    }
}
