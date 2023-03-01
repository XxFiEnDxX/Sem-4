#include <stdio.h>
int main()
{
    int n, c = 1;
    scanf("%d", &n);

    printf("pattern\n");

    for (int i = 0; i < n; i++)
    {
        for (int j = 1; j < n - i; j++)
        {
            printf(" ");
        }

        for (int j = 0; j <= i; j++)
        {
            if (j == 0 || i == 0)
            {
                c = 1;
            }
            else
            {
                c = c * (i - j + 1) / j;
            }
            printf("%2d", c);
        }
        printf("\n");
    }
}