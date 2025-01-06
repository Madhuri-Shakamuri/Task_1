/*Task:1
        45.Transpose of a matrix
*/
import java.util.Scanner;
import java.util.Arrays;
public class Transpose_45 
{
    public static void main(String[] args) 
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
        int[][] trans=new int[col][row];
        System.out.println("Transpose: ");
        for(int i=0;i<row;i++)
        {
            
            for(int j=0;j<col;j++)
            {
                 
                 trans[j][i]=arr[i][j];
            }
           
        }
        for(int i=0;i<col;i++)
        {
            
            for(int j=0;j<row;j++)
            {
               
             System.out.print(trans[i][j]+" ");
            }
            System.out.println();
           
        }
        
    }
}
