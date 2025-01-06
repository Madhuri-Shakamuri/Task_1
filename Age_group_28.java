
/*Task:1 
     28.Write a program to read the age of hundred (100) person and count the  number of person in the age group 50 to 60
     Highlight: Variable length arguments
 */
import java.util.Scanner;

public class Age_group_28 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of people: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        
        System.out.println("Enter the ages: ");
        for (int i = 0; i < n; i++) 
        {
            ages[i] = sc.nextInt();
        }
        System.out.println(ages_between(ages));
        
    }
    public static int ages_between(int... ages) 
    {
        int count=0;
        for(int age:ages)
        {
        if(age>=50 && age<=60)
        {
            count++;

        }
        else 
        {
            continue;
        }
    }
        return count;
        
    }
}
