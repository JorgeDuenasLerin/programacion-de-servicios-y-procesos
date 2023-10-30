#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

#define N 10

void imprimeTabla(int t) {
    for (int i = 1; i <= N; i++)
    {
        fprintf(stdout, "%d x %d = %d\n", t, i, t*i);
    }
}


int main(void) {
    pid_t id_hijo;
    for (int hijos = 1; hijos <= N; hijos++)
    {
        id_hijo = fork();
        if(id_hijo == 0){
            imprimeTabla(hijos);
            exit(0);
        }
    }
    
    for (int hijos = 1; hijos <= N; hijos++)
    {
        wait(NULL);
    }
}
