#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(void) {
    pid_t id_mi_hijo; // Declaro variable para almacenar ids de procesos
    pid_t que_pasa_si;

    id_mi_hijo = fork();
    que_pasa_si = fork();

    fprintf(stdout,"Hola soy el proceso %d mi hijo es %d y que pasa es %d\n", getpid(), id_mi_hijo, que_pasa_si);

    return 0;
}