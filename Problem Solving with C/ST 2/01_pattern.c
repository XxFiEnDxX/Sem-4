#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    printf("pattern\n");
    for (int i = n; i > 0; i--)
    {
        // Print left spaces
        for (int k = 1; k < i; k++)
        {
            printf(" ");
        }

        // print left part of the triangle
        // *
        // **
        // ***
        // ****
        // *****
        for (int j = n + 1; j > i; j--)
        {
            printf("*");
        }

        // print right part of the triangle
        for (int l = n; l > i; l--)
        {
            printf("*");
        }
        printf("\n");
    }
    n--;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = n; k >= i; k--)
        {
            printf("*");
        }

        for (int k = n; k > i; k--)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}