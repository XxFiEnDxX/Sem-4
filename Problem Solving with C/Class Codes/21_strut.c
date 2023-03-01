#include <stdio.h>

struct scorecard{
    char pname[100];
    int run;
};

struct scorecard arr[100];
int main()
{
    int n;
    printf("Enter the number of players: ");
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        struct scorecard s;
        printf("Enter the name of player %d: ", i+1);
        scanf("%s", &s.pname);
        printf("Enter the run of player %d: ", i+1);
        scanf("%d", &s.run);
        arr[i] = s;
    }
    for(int i = 0; i < n; i++){
        printf("Name: %s\nRuns: %d\n", arr[i].pname, arr[i].run);
    }
    return 0;
}