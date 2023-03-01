#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
    int x = 'z'-'a';
    float y;

    y = x;

    printf("%f\n",y);

    char str[4] = "75a6";
    printf("%s\n",str);

    x = strlen(str);
    printf("%d\n",x);
    return 0;
}