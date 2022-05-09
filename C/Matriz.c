#include <stdio.h>
#include <stdlib.h>

void soma (int** M, int linhas, int coluna, int direcao){
    int l,c;
    int linha;
    int coluna;
    int direcao;
    int soma;
    int somaDeLinha [linha], somaDeColuna [coluna];
    switch (direcao){
        case 1:
            for (l = 0; l < linha; l++){
                soma = 0;
                for (c = 0; c < coluna; c++){
                    soma += M[linha][coluna];
                }
                somaDeLinha[linha] = soma;
            } 
            break;
        case 2:
            for (c = 0; c < linha; c++){
                soma = 0;
                for (l = 0; l < coluna; l++){
                    soma += M[linha][coluna];
                }somaDeColuna[coluna] = soma;
            }
            break;
        default:
            printf("\nAlgo deu errado! ");
    }
    for (l = 0; l < linha)
        
}

void main () {

}