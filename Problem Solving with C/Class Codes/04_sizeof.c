#include <stdio.h>
#include <limits.h>
#include<float.h>
int main()
{
    printf("Size of(char) in bytes : %lu \n", sizeof(char));
    printf("Size of(int) in bytes : %lu \n", sizeof(int));
    printf("Size of(float) in bytes : %lu \n", sizeof(float));
    printf("Size of(double) in bytes : %lu \n", sizeof(double));
    printf("Size of(long) in bytes : %lu \n", sizeof(long));

    printf("\nRange of Datatypes");
    printf("\n Max value of int : %d", INT_MAX);
    printf("\n Min value of int : %d", INT_MIN);
    printf("\n Max value of long : %ld", LONG_MAX);
    printf("\n Min value of long : %ld", LONG_MIN);
    printf("\n Max value of char : %d", CHAR_MAX);
    printf("\n Min value of char : %d", CHAR_MIN);
    printf("\n Max value of float : %e", FLT_MAX);
    printf("\n Min value of float : %e", FLT_MIN);
    printf("\n Max value of double : %e", DBL_MAX);
    printf("\n Min value of double : %e", DBL_MIN);
    long num = 2;

    for (int i = 1; i < 32; i++)
    {
        num *= 2;
    }

    printf("\n Max value of int : %ld", num-1);
}