#include<stdio.h>
void main(){
    int i,j,n;
    printf("enter the value of n: ");
    scanf("%d",&n);
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j <= i; j++)
      {
        printf(" ");   
      }
      for ( j = 0; j <= n-i-1; j++)
      {
        printf(" *");
      }
      printf("\n");
    }
    }
