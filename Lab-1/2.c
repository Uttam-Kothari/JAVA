//  find a sum of numbers entered by user. (E.g: 582=5+8+2=15)
#include<stdio.h>
void main(){
    int n,sum=0;
    printf("enter the number: ");
    scanf("%d",&n);
    while (n!=0)
    {
        int x=n%10;
        sum=sum+x;
        n=n/10;
    }
    printf("%d",sum);
}