// a sum of even number 1D array
#include<stdio.h>
void main(){
    int n,sum=0;
    printf("enter the arr size: ");
    scanf("%d",&n);
    int arr[n];
    for ( int i = 0; i < n; i++)
    {
        printf("enter the elements: ");
        scanf("%d",&arr[i]);
        if (arr[i]%2==0)
        {
            sum=sum+arr[i];
        }
        
    }
    printf("%d",sum);
}