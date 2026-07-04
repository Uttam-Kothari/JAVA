// enter the n: 5
//     *
//    * *
//   *   *
//  *     *
// * * * * *

#include <stdio.h>
void main()
{
    int i, j, n;
    printf("enter the n: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n - i; j++)
        {
            printf(" ");
        }
        for (j = 1; j <= i; j++)
        {
            if (i != n)
            {
                if (i > j && j != 1)
                {
                    printf("  ");
                }
                else
                {
                    printf("* ");
                }
            }
            else
            {
                printf("* ");
            }
        }
        printf("\n");
    }
}