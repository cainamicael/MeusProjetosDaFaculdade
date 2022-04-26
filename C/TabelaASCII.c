#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void tabelaasc2(){

    unsigned char i;
    for (i=32; i<255; i++)
        printf("\n%c equivale a %4d na tabela ASCII\n",i,i);
}

void main(){

    int c;
    printf("Olá. Vamos lhe mostras a tabela ASCII");
    tabelaasc2();
    printf("\nDigite agora a sua frase para mostrarmos o valor de cada caractere na tabela ASCII\n");
    char frase[51];
    gets(frase);
    for (c=0; c <= strlen(frase); c++){
        if (frase[c] != '\0'){
            printf("\nO caractere %c representa o valor %4d na tabela ASCII\n",frase[c],frase[c]);
        }
    }

}
