#include <stdio.h>
#include <stdlib.h>
// #include <>

int main() {
    printf("Press the delete key to terminate the program\n");

    while (1) {
        if (_getch() == 127) {
            printf("Program terminated by user.\n");
            exit(0);
        }
    }
    return 0;
}
