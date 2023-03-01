#include <stdio.h>
int isHappy(int num)
{
    int rem = 0;
    int sum = 0;

    while (num > 0)
    {
        rem = num % 10;
        sum += (rem * rem);
        num = num / 10;
    }
    return sum;
}
int main()
{
    int num, res;

    scanf("%d", &num);

    res = num;

    while (res != 1 && res != 4)
    {
        res = isHappy(res);
    }

    if (res == 1)
    {
        printf("%d is a happy number.", num);
    }
    else
    {
        printf("%d is not a happy number.", num);
    }
    return 0;
}