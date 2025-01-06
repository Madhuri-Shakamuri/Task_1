/* Task:1
         
        46.Print row and column sum of a matrix.
  
*/
import java.util.Scanner;

public class Row_col_sum_46 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Enter the size of the col: ");
        int col=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt(); 
            }
           
        }
        for(int r=0;r<row;r++)
        {
         int sum=0;
         for(int c=0;c<col;c++)
         {
             sum=sum+arr[r][c];
         }
         System.out.println("Row "+(r+1)+" : "+sum);
        } 

        for(int c=0;c<col;c++)
        {
         int sum=0;
         for(int r=0;r<row;r++)
         {
             sum=sum+arr[r][c];
         }
         System.out.println("Col "+(c+1)+" : "+sum);
        } 
       
         
    } 
   
}