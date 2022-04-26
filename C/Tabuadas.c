#include <stdio.h>
void main(){

    //variáveis
    int lado1, lado2;
    int matriz[10][10];

    //Atribui o valor a matriz e imprime o valor
     for (lado1 = 1; lado1<=10; lado1++){
        printf("\n");
        for (lado2 = 1; lado2<=10; lado2++){
            matriz[lado1][lado2]=lado1*lado2;
            printf("\n%d * %d = %d | Matriz[%d][%d] = %d\n", lado1, lado2, lado1*lado2, lado1, lado2, matriz[lado1][lado2]);
        }
    }

}