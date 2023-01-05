#include <stdio.h>
#define num 5000 //Another way to define constants;
float f = 95.123456789;  //global

int main()
{
    int d = 10;
    const float pie = 3.14; //const
    char ch = 'A';
    double db = 10.123456789;

    printf("%d\n",d);
    printf("%d\n",num);
    printf("%2f\n",pie);
    printf("%c\n",ch);
    printf("hello world\n");
    printf("%f\n",f);
    printf("%lf\n",db);

    // "dl" int long
    // "fl" float long
    return 0;
}