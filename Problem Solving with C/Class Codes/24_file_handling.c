#include <stdio.h>
int main()
{
    FILE *ptr = NULL;
    char string[40];
    ptr = fopen("test.txt", "r");
    fscanf(ptr, "%s", string);
    printf("%s", string);
    return 0;
}