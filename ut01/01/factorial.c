#include <stdio.h>

int main(void)
{
    int n;

    /*
    do {
        n = -1;
        printf("Dame un número: ");
        scanf("%d", &n);
    } while(n < 0);
    */
    // asegurar que n es positivo.

    printf("Dame un número positivo: ");
    scanf("%d", &n);
    while(n < 0){
        printf("Tiene que ser positivo. Dame un número: ");
        scanf("%d", &n);
    }

}
