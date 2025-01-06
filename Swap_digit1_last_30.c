/*Task:1
30.C program to Interchange of number.  ex: 3456 to 6453
*/
#include<stdio.h>
#include<math.h>
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    int temp=n,count=0;
    while(temp>0)
    {
        temp=temp/10;
        count++;
    }
    int last=n%10;
    int first=(int)n/pow(10,count-1);
    
    int add_last=n/10;
    add_last=add_last*10+first;
    int add_first=(add_last%(int)pow(10,count-1));
    int x=(int)pow(10,count-1)*last+add_first;
    printf("\n%d",x);
    

}
