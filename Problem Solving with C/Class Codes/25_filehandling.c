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

#include<stdio.h>
int main(){
    FILE *fp;
    fp = fopen("25_file.txt","w");
    fclose(fp);
    return 1;
}