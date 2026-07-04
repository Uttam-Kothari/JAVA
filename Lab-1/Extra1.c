/*
    hollo diamond (n==5)
      *
     * *
    *   *
   *     *
  *       *
   *     *
    *   *
     * *
      * 
*/

#include <stdio.h>
void main()
{
    int n;
    printf("Enter number of row: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i; j++)
        {
            printf(" ");
        }
        for (int j = 0; j < i + 1; j++)
        {
            if (j == 0 || j == i)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf(" ");
        }
        for (int j = 0; j < n - i; j++)
        {
            if (j == 0 || j == n - i - 1)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
}