#include<stdio.h>
void main(){
    int dd,mm,yy;
    scanf("%d%d%d",&dd,&mm,&yy);

    //check year
    if (yy>= 1900 & yy <= 9999)
    {
        if (mm>=1 && mm<=12)
        {
            if ((dd>=1 && dd<=31) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm ==12))
            {
                /* code */
            }
            
        }
        
    }
    
}