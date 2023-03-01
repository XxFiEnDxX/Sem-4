#include<stdio.h>

int minIndex(int arr[],int i,int j){
    if (i == j)
    {
        return i;
    }

    int min = minIndex(arr,i+1,j);

    if(arr[min] < arr[i]){
        return min;
    }
    return i;
}

void recurSelection(int arr[],int n,int index){
    if(index == n){
        return;
    }

    int min = minIndex(arr,index,n-1);

    if(min != index){
        int temp = arr[min];
        arr[min] = arr[index];
        arr[index] = temp;
    }

    recurSelection(arr,n,index+1);
}

void selectionSort(int arr[],int n){
    int i = 0;
    int minI;
    int temp;

    for (int i = 0; i < n; i++)
    {
        minI = i;
        for (int j = i+1; j < n; j++)
        {
            if(arr[j] < arr[minI]){
                minI = j;
            }
        }
            temp  = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
    }
    
}
int main(){
    int n;
    int arr[100];

    scanf("%d",&n);

    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }

    // selectionSort(arr,n);
    recurSelection(arr,n,0);

    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    
    return 0;
}