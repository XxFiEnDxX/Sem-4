#include <stdio.h>

int chara(int ch)
{
    return ch;
}

int add(int a)
{
    return a + a;
}

int mul(int a)
{
    return a * a;
}

void func(int (*ptr)(int))
{

   // int x = (*ptr)()
    // printf("%d", x);
}

int main()
{
    int (*ptr)(int) = chara;
    int (*ptr2)(int) = add;
    int (*ptr3)(int) = mul;

    int n;

    scanf("%d", &n);
    func(ptr);
    return 0;
}