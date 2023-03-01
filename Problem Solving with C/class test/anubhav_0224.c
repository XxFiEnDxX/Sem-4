#include <stdio.h>
void question_1()
{

    char chArr[] = {'a', 'E', 's', 'w', 'q', 'r', 'p'};
    int size = 7;
    char ch;
    printf("Enter the character you want to search: ");
    scanf("%c", &ch);
    printf("\n");
    int flag = 0;
    for (int i = 0; i < size; i++)
    {
        if (chArr[i] == ch)
        {
            flag = 1;
            break;
        }
    }
    if (!flag)
        printf("Not found !!!!");
    else
        printf("Found !!!");
}

void question_2()
{
    int arr[] = {88, 123, 458, 5, 469, 724, 368, 2, 45, 78, 64, 3};
    int mini = arr[0];
    int index = 0;
    for (int i = 1; i < 12; i++)
    {
        if (arr[i] < mini)
        {
            mini = arr[i];
            index = i;
        }
    }

    printf("The minimum value is: %d and it's position is %d: ", mini, index + 1);
}

void question_3()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= 2 * n - 1; j++)
        {
            if (i == (n / 2) && j >= n - i && j <= n + i)
                printf("A");
            else
            {
                if (j == n - i || j == n + i)
                    printf("A");
                else
                    printf(" ");
            }
        }
        printf("\n");
    }
}

void question_4()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf("%d", j + 1);
        }
        printf("\n");
    }
    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            printf("%d", j + 1);
        }
        printf("\n");
    }
}

void question_5()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf("%d", j + 1);
        }
        for (int j = 0; j < (n - i - 1) * 2; j++)
        {
            printf(" ");
        }
        for (int j = 0; j < i + 1; j++)
        {
            printf("%d", i + 1 - j);
        }
        printf("\n");
    }
}

int main()
{
    // question_1();
    //  question_2();
    // question_3();
    //  question_4();
    //  question_5();

    return 0;
}