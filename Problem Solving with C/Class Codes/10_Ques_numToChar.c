#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void main()
{
    int num = 1001, r;

    int cnt = 0;

    int arr[10];

    if (num == 0)
    {
        printf(" Zero ");
    }
    while (num != 0)
    {

        arr[cnt++] = num % 10;
        num/=10;
    }

    for (int i = cnt - 1; i >= 0; i--)
    {
        // printf("%d ", arr[i]);
        r = arr[i];

        switch (r)
        {

        case 1:
            printf(" One ");
            break;
        case 2:
            printf(" Two ");
            break;
        case 3:
            printf(" Three ");
            break;
        case 4:
            printf(" Four ");
            break;
        case 5:
            printf(" Five ");
            break;
        case 6:
            printf(" Six ");
            break;
        case 7:
            printf(" Seven ");
            break;
        case 8:
            printf(" Eight ");
            break;
        case 9:
            printf(" Nine ");
            break;
        case 0:
            printf(" Zero ");
            break;
        default:
            printf(" Zero ");
            break;
        }
    }
}