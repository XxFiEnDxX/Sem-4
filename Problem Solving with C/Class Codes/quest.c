#include<stdio.h>
int main(){
    int num1;
    char ch;
    scanf("%c",&ch);
    fflush(stdin);
    scanf("%d",&num1);
    fflush(stdin);
    printf("\nval of char is %c", ch);   //crashing here
    printf("\nval of num1 is %d", num1);
    
}