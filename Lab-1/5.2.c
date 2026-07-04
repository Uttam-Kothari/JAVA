#include<stdio.h>
void main(){
    int i,j,n,k=1;
    printf("enter n: ");
    scanf("%d",&n);
    for ( i = 0; i <n ; i++)
    {
        for ( j = 0; j < n-i; j++)
        {
            printf(" ");
        }
        for ( j = 0; j < i+1; j++)
        {
            printf("%d ",k);
        }
        k++;
        printf("\n");
    }
}