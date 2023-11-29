
#include <stdio.h>
#include <string.h>
#include <openssl/evp.h>
#include "magia.c"

/*

Para verificar que funciona:

echo -ne "hola" | md5sum -

*/

int main(int arc, char *argv[]) {
    char *string = argv[1];

    unsigned char result[EVP_MAX_MD_SIZE];
    unsigned int result_len;

    // Calcular el hash
    // Comprobar con el segundo parámetro
    // Escribir un mensaje

    generateMD5(string, result);

    printf("MD5(\"%s\") = %s\n", string, result);
    printf("Segundo param %s\n", argv[2]);

    if(0 == strcmp(result, argv[2])){
        printf("MD5 correcto");
    } else {
        printf("Error en los datos");
    }
   
    printf("\n");

    return 0;
}