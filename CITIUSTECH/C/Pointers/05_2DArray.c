#include <stdio.h>

int main()
{
    int arr[2][3]={{10,20,30},{40,60,80}};  
    int (*p)[3] = arr;
    printf("%d \n",p);
    // printf("%d \n",p+1);
    printf("%d \n",*p);
    printf("%d \n",**p);
    // printf("%d \n",**(p+1));
    printf("%d \n",*(*p+2));
    printf("%d \n", *(*(p+1)+1) );

    return 0;
}




