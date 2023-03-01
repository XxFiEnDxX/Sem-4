#include <stdio.h>
#include <string.h>
struct Student
{
    char name[25];
    int age;
    char branch[10];
    char gender;
};

int main()
{
    struct Student s3;
    // s3.name = "amit";  this will give an error
    strcpy(s3.name, "Amit Kumar Singh");

    s3.age = 20;

    // s3.branch = "CSE";
    strcpy(s3.branch, "CSE");

    s3.gender = 'M';

    printf("%s\n",s3.name);
    printf("%d\n",s3.age);
    printf("%c\n",s3.gender);
    printf("%s\n",s3.branch);
    return 0;
}