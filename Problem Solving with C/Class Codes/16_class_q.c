#include <stdio.h>
#include <string.h>

void func1(int a[])
{
}
void func2(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void func3()
{
}
int func4(char str[])
{
    int st = 0;
    int ed = strlen(str) - 1;

    while (st < ed)
    {
        if (str[st] != str[ed])
        {
            return 0;
        }
        else
        {
            st++;
            ed--;
        }
    }
    return 1;
}
// void func5(char str[])
// {
//     char
// }
void func6()
{
}

int main()
{
    return 0;
}