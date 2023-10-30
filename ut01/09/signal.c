#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

void sigint_handler(int signo) {
    printf("Holo!\n");
}

void salta(int signo) {
    printf("Boing!\n");
}

void corre(int signo) {
    printf("Arrggg!!!!\n");
}

int main() {
    // Registrar un manejador de señales para SIGINT usando la función signal
    //signal(SIGINT, sigint_handler);
    signal(SIGKILL, sigint_handler);
    signal(SIGUSR1, salta);
    signal(SIGUSR2, corre);

    printf("Ejecuta este programa y presiona Ctrl + C para generar una señal SIGINT.\n");

    // Mantén el programa en ejecución para recibir la señal
    while (1) {
        printf(".");
        fflush(stdout);
        sleep(1);
        //raise(2);
        //sigint_handler(2);
    }

    return 0;
}