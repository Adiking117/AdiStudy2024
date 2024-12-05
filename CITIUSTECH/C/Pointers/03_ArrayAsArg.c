// Online C compiler to run C program online
#include <stdio.h>

int SumOfElements(int* A){
    int sum = 0;
    int size = sizeof(A)/sizeof(A[0]);
    for(int i=0;i<size ; i++){
        sum += i;
    }
    return sum;
}
int main() {
    int A[5] = {1,2,4,7,3};
    int* p;
    p = A;
    // printf("Value %d , Address %d \n ",*p,p);
    // printf("Value %d , Address %d \n ",*A+1,p+1);
    
    printf("Sum is %d \n ",SumOfElements(A));
    
    
    
}



