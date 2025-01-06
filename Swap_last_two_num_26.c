/* Task: 1
         26.C program swap last two digit of given  number ex:  input as 2323  and output as 2332
         */

    #include<stdio.h>
    int main()
    {
        int n;
        printf("Enter a number: ");
        scanf("%d",&n);
        int temp=n%100;
        n=n/100;
        int rem=0,rev=0;
        while(temp>0)
        {
            rem=temp%10;
            n=n*10+rem;
            temp=temp/10;
        }
        printf("\n%d",n);
        

    }
