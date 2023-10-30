#include <stdio.h>

int main(int argc, char *argv[]) {
    // El primer argumento (argv[0]) es el nombre del programa
    printf("Nombre del programa: %s\n", argv[0]);

    // Verificar si se proporcionaron argumentos adicionales
    if (argc > 1) {
        printf("Argumentos adicionales:\n");
        // Recorrer los argumentos adicionales y mostrarlos
        for (int i = 0; i < argc; i++) {
            printf("Argumento %d: %s\n", i, argv[i]);
        }
    } else {
        printf("No se proporcionaron argumentos adicionales.\n");
    }

    return 0;
}