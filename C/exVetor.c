#include <stdio.h>
#include <stdlib.h>

int bin2dec (int *s, int n){
    s[n];
    int valor;
    int i;
    for (i = 0; i < n; i++){
        printf("\nDigite o valor a ser adicionado: ");
        scanf("%d", &valor);
        if (valor != 0 && valor != 1){
            while (valor != 0 && valor != 1){
                printf("\nO valor não foi nem 0 nem 1. Digite novamente o valor");
                scanf("%d",&valor);
            }
        }else {
            s[i] = valor;
        }
    }
}


void main (){


}