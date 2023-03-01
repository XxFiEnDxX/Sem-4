
#include<stdio.h>
extern var;
void main(){
    int arr[5][5];


    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            scanf("%d",arr[i][j]);
        }
        
    }
    
    int Lar = arr[0][0];
    int secLar = arr[0][0];

    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if(arr[i][j] > Lar){
                secLar = Lar;
                Lar = arr[i][j];
            }
        }
        
    }
    
    int secSma = arr[1][1];
    
    
}