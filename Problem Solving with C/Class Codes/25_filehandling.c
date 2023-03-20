// fopen()
// fclose()
// getc()
// putc()
// fscanf()
// fprintf()
// getw()
// putw()
// fseek()
// rewind()
// Modes-> r w a r+ w+ a+ rb ab rb+ wb+ ab+

#include <stdio.h>
int main()
{
    FILE *fp,*fp2;
    fp = fopen("25_file.txt", "w");
    char cnt[100];

    fputs("Todays is Monday.\nI am chitkara university.",fp);

    fp2 = fopen("25_file.txt","r");
    if (fp2 == NULL)
    {
        printf("File is Empty!");
    }
    else
    {
        printf("111");
        while (fgets(cnt, 100, fp2))
        {
            printf("%s", cnt);
        }
    }

    fclose(fp);
    fclose(fp2);
    return 1;
}