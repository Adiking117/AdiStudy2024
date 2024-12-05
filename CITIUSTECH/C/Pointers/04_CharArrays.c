
#include <stdio.h>

void print(char c[]){
    int i= 0;
    while(c[i] != '\0'){
        printf("%c",c[i]);
        i++;
    }
}

void print(char* c){
    int i= 0;
    while(*c != '\0'){
        printf("%c",*c);
        c++;
    }
}

int main()
{
    char C[6]= "Aditya";
    print(C);
}



