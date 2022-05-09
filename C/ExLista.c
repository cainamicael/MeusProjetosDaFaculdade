#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int valor;
    struct no *proximo;
}No;

typedef struct lista {
    No *inicio;
    int tam;
}Lista;

void inserirNoInicio(Lista *lista, int valor){
    No *novoNo = (No*) malloc(sizeof(No)); //criando um novo nó
    novoNo->valor = valor;
    novoNo->proximo = lista->inicio; // joga ele pra segundo,
    lista->inicio = novoNo; // o primeiro elemento vai ser o recém digitado
    lista->tam++;
}
void imprimirLista(Lista *lista){
    No *inicio = lista->inicio;
    while(inicio != NULL){
        printf("%d", inicio -> valor);
        inicio = inicio -> proximo;
    }
    printf("\n\n");
}


void main (){

    Lista lista;
    lista.inicio = NULL;
    lista.tam = 0;

    

}