/*Task:1 
        37.Sum,multiply of two matrix
*/
import java.util.Scanner;
import java.util.Arrays;
public class Sum_Pro_Matrix_37 
{
    public static void main(String... args)
    {
      Scanner sc=new Scanner(System.in);
      int[][] a={{1,2},{3,4}};
      int[][] b={{5,6},{7,8}};
      
       
      System.out.println("Sum of Matrices: ");
      print_matrix(sum(a,b));
      System.out.println("Product of Matrices: ");
      print_matrix(product(a,b));
         
   } 
   public static int[][] sum(int[][] a,int[][] b)
   {
    int[][] c=new int[a.length][a[0].length]; 
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
       c[i][j]=a[i][j]+b[i][j];

      }
    }
    return c;
   }
   public static int[][] product(int[][] a,int[][] b)
   {
    int[][] c=new int[a.length][a[0].length]; 
    int x=a[0].length;
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        c[i][j]=0;
       for(int k=0;k<x;k++)
       {
        c[i][j]+=a[i][k]*b[k][j];
       }

      }
    }
    return c;
   }
   public static void print_matrix(int[][] c)
   {
    for(int i=0;i<c.length;i++)
    {
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
    }
   }
   
    
}
