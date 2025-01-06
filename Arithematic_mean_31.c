/* Task :1
31.C Program to Calculate Arithmetic Mean
*/
#include<stdio.h>
int main()
{
    int n;
    printf("Enter no of elements: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements: ");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
    int mean=sum/n;
    printf("A.M is %d",mean);
}