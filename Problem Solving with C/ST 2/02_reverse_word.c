#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    char str2[100];
    int s = 0;
    // char str[] = "S = i.like.this.program.very.much";
    scanf("%s\n", str2);

    // for (int i = strlen(str); i > 0; i--)
    // {
    //     str2[s++] = str[i - 1];
    // }
    // str2[s] = '\0';

    int a = 0;
    int b = 0;

    printf("%s\n", str2);
    for (int i = 0; i < strlen(str2); i++)
    {
        b = i - 1;
        if (str2[i] == '.')
        {
            while (a < b)
            {
                int t = str2[a];
                str2[a] = str2[b];
                str2[b] = t;
                a++;
                b--;
            }
            a = i + 1;
            // b = i + 1;
        }
    }

    printf("%s\n", str2);
    return 0;
}