#include <stdio.h>

struct student
{
    char name[30];
    int age;
    int roll_no;
    char sex[5];
    int total_marks;
};

union details
{
    struct student st;
};

int main()
{
    union details set[5];

    for (int i = 0; i < 5; i++)
    {
        scanf("%s", set[i].st.name);
        scanf("%d", &set[i].st.roll_no);
        scanf("%d", &set[i].st.age);
        scanf("%s", set[i].st.sex);
        scanf("%d", &set[i].st.total_marks);
    }

    for (int i = 0; i < 5; i++)
    {
        printf("%s\n", set[i].st.name);
        printf("%d\n", set[i].st.roll_no);
        printf("%d\n", set[i].st.age);
        printf("%s\n", set[i].st.sex);
        printf("%d\n", set[i].st.total_marks);
        printf("\n");
    }

    return 0;
}