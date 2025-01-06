/* Task:1
         
         22.C program to sum of last 3 digits of a number and check if the sum is palindrome or not?
  
*/
#include<stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d",&n);
    int x_3=n%1000;
    int rem=0,sum=0;
    //sum
    while(x_3>0)
    {
        rem=x_3%10;
        sum+=rem;
        x_3=x_3/10;
    }
    int temp=sum,rev=0;
    rem=0;
    
    //reverse
    while(sum>0)
    {
        rem=sum%10;
        rev=rev*10+rem;
        sum=sum/10;
    }
    if(rev==temp)
    {
        printf("%d is a Palindrome",temp);
    }
    else 
    
        printf("%d is not a Palindrome",temp);
    
    
    
    
    
}