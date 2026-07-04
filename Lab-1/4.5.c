#include<stdio.h>
void main(){
    int i,j,n;
    printf("enter the number: ");
    scanf("%d",&n);
    for ( i = 0; i < n/2+1; i++)
    {
        for ( j = 0; j < n/2-i; j++)
        {
            printf(" ");
        }
        for ( j = 0; j <= i; j++)
        {
            printf(" *");
        }
        printf("\n");
    }
    int b=0,a=1;
    for ( i = n/2+1; i < n; i++)
    {
        for ( j = 0; j < a && a<=n/2 ; j++)
        {
            printf(" ");
            
        }
        a++;
        for ( j=n/2-b; j>0 ; j--)
        {
            printf(" *");
            
        }
        b++;
         printf("\n");
    }
}