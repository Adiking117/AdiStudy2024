
#include <stdio.h>

void increment(int* a){
        *a += 1;
        printf("The value of a is %d and address is %d \n", a , &a);
    }

void increment(int a){
        a += 1;
        printf("The value of a is %d and address is %d \n", a , &a);
    }
    
int main() {
    int a = 101;
    increment(a);
    increment(&a);
    printf("The value of a is %d and address is %d \n", a , &a);
}




