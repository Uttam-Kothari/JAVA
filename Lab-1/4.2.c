#include<stdio.h>
void main(){
    int i=0,j=0,n;
    printf("enter the value of n: ");
    scanf("%d",&n);
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < n-i; j++)
      {
        printf(" ");   
      }
      for ( j = 0; j <= i; j++)
      {
        printf(" *");
      }
      printf("\n");
    }
    }
