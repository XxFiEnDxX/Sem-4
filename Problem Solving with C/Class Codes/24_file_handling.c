#include <stdio.h>
int main()
{
    FILE *ptr = NULL;
    char str[100];
    ptr = fopen("25_file.txt", "r");
    fgets(str , 100, ptr);
    fgets(str , 100, ptr);
    printf("%s", str);
    fclose(ptr);
    return 0;
}