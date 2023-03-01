#include<stdio.h>

enum days{sun=1,mon,tue,wed,thurs,fri,sat};
enum num{cnt1=7 , cnt2=6, cnt3=9};

int main(){
    for (int i = sun; i <= sat; i++)
    {
        printf("%d\n",i);
    }

    enum  num myCnt=cnt2;
    printf("count3 is %d \n",cnt3);
    printf("count is %d \n",myCnt);
    // printf("count1 is %d ",cnt1);
    
    return 0;
}