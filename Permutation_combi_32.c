/* Task :1
32.C program to permutations and combinations
   Highlight: permutations n!/(n-r)!
             combinations  n!/(n-r)!*r!

*/
#include<stdio.h>
int  fact(int n)
{
    int fact=1;
    for(int i=n;i>=1;i--)
    {
        fact*=i;
    }
    return fact;
}

int main()
{
    int n,r;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    printf("Enter the value of r: ");
    scanf("%d",&r);

    printf("Permuatation: %d",fact(n)/fact(n-r));
    printf("\n Combination: %d",fact(n)/(fact(r)*fact(n-r)));
    


}
