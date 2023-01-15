#include<stdio.h>
#include<stdlib.h>

void main(){
    // scanf("%c",&ch);
    // fflush(stdin);

    // char ch[10];
    // gets(ch);
    // // printf("The CHaracter is : %c\n",ch);
    // puts(ch);

    char str[20];
    fgets(str,20,stdin);
    printf("user enter string is %s",str);
}