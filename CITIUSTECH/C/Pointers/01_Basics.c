#include <stdio.h>

int main() {
    int a = 1025;
    int* p;
    p = &a;
    printf("The value of *p is %d \n",*p);
            // p is pointer to int , 
            // Memeory : 00000000 00000000 00000100 00000001
    printf("The value of p is %d \n",p);
    printf("The value of p+1 is %d \n",p+1);
    
    char* pc;
    pc = (char*)p;
    printf("The value of pc is %d \n",pc);
    printf("The value of *pc is %d \n",*pc); 
            // since pc is pointer to character only 1Byte is stored :    00000001  -> Hex: 1
    printf("The value of pc+1 is %d \n",(pc+1));         
    printf("The value of *(pc+1) is %d \n",*(pc+1));   
            // pc+1 will point to next Byte in memory i.e :
            // 00000100 -> Hex: 4
    void* vp;
    vp = p;
    printf("The address of vp is %d \n ", vp);
    
            
}



