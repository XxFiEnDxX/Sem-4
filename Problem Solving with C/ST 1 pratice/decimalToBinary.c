#include<stdio.h>
int main(){
    int num;
    int rem = 0;
    int arr[20];
    int i = 0;

    scanf("%d",&num);

    while (num)
    {
        rem = num%2;
        num = num/2;

        arr[i++] = rem;
    }
    
    for (int j = i-1; j >= 0; j--)
    {
        printf("%d ",arr[j]);
    }
    
    
    return 0;
}