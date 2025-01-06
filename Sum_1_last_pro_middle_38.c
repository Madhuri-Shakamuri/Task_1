/* Task :1
        38.Sum of the first and last digits of a number and product the middle numbers
*/
#include<stdio.h>
#include<math.h>
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    int original=n,temp=n,count=0;
    while(temp>0)
    {
        temp=temp/10;
        count++;
    }
    int first=(int)(n /pow(10,count-1));
    
    int last=n%10;
    
    printf("Sum of first and last: %d",(first+last));
    int middle=(n%(int)pow(10,count-1))/10;
    
    int rem=0,pro=1;
    while(middle>0)
    {
        rem=middle%10;
        pro*=rem;
        middle=middle/10;
    }
    printf("\nProduct of middle elements: %d",pro);
    
    

}
