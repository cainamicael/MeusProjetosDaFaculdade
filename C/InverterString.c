#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main () {
    char frase[40];
    printf("Digite uma frase com ate 39 caracteres: ");
    gets(frase);

    if (strlen(frase) > 40 ){
        printf("Erro. Você digitou uma frase maior que o suportado. Digite novamente");
        gets(frase);
        while (strlen(frase) > 40)
        {
        printf("Erro. Você digitou uma frase maior que o suportado. Digite novamente");
        gets(frase);
        }
    } 

    printf("\nVamos ver a frase ao contrário: ");
    int i;
    for (i = strlen(frase); i > 0; i--){
        printf("%c",frase[i-1]);
    }
    
    
}