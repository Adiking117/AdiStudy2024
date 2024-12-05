#include <stdio.h>
#include <stdlib.h>

int* Add(int *a,int *b){
    int c = (*a) + (*b);
    return &c;
}

int* Add(int *a,int *b){
    int *c = (int *)malloc(sizeof(int));
    *c = (*a) + (*b);
    return c;
}

int* Add(int *a,int *b,int *c){
    *c = (*a) + (*b);
}

int main()
{
    int a = 2 , b = 9, result;
    //printf("The address of a and b in Main is %d , %d \n",&a,&b);   
    //printf("The sizes of a and b in Main is %d , %d \n",sizeof(a),sizeof(b));
    int *c = Add(&a,&b,&c);
    printf("The sum is %d \n",*c);

    Add(&a,&b,&result);
    printf("The sum is %d \n",result);



    return 0;
}