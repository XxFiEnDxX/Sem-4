#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);

    printf("pattern\n");
    for (int i = 1; i <= n; i++)
    {

        for (int j = i; j < n; j++)
        {
            printf(" ");
        }
        
        for (int j = 1; j <= i; j++)
        {
            printf("%d",j);
        }
        
        for (int j = i; j > 1; )
        {
            printf("%d",--j);
        }
        
        printf("\n");
        
    }
    
}