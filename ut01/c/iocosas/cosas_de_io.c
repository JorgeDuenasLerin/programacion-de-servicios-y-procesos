#include <stdio.h>
#include <string.h>
#define BUFF 1024

int main(void)
{
    char saludo[BUFF];
    
    fscanf(stdin, "%s", saludo);
    
    if(strlen(saludo)>2){
        fprintf(stdout, "la cadena tiene n %d caracteres\n", (int) strlen(saludo));
    }else {
        fprintf(stderr, "Cadena demasiado corta\n");
    }

    return 0;
}