/*Task:1 
     29.Give input year,month and print number of days in a month.
 */

import java.util.Scanner;

public class No_days_year_29
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the year: ");
       int year=sc.nextInt();
       System.out.println("Enter the month: ");
       String month=sc.next().toLowerCase();
       System.out.println(no_of_days(year, month));
    }
    public static int no_of_days(int year,String month)
    {
        switch (month) 
       {
        case "january":
        case "march":
        case "may":
        case "july":
        case "august":
        case "october":
        case "december":
              return 31;
        case "april":
        case "june":
        case "september":
        case "november":
              return 30; 
        case "february":
              if(year%4==0 && (year%100!=0 || year%400==0 ))
              {
               return 29;
              }
              else
              return 28;
       
        default:
            return 0;
       }
    }
    
}
