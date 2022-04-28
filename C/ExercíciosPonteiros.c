#include <stdio.h>
void main(){

    int *p, valor, y;
    p = &valor;
    valor = 35;
    y = &p;

    printf("O valor de valor eh: = %d\n",valor);
    printf("O valor de valor apontado por p eh: = %d\n",*p);
    printf("O endereco de p que está na variável y eh: = %p\n",y);
    y = *p;
    printf("Y agora está com o valor que p aponta, ou seja, está com o mesmo valor da variável valor. y = %d\n",y);

    // experimentos

    *p = 40;
    printf("O valor da variável valor foi alterado? Valor = %d\n",valor);
    printf("O endereço de y eh  = %p\n",&y);
    *p = &y;
    printf("O valor da variável valor foi alterado? Valor = %d\n",valor);

}