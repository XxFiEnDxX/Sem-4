#include<stdio.h>
void main(){
    int i = 1,num;
    num = 6;

    // while (i<11)
    // {
    //     printf("%d x %d = %d\n",num,i,i*num);
    //     i++;
    // }

    do
    {
        printf("%d x %d = %d\n",num,i,i*num);
        i++;
    } while (i<11);
    
    
}