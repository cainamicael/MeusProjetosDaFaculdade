#include <stdio.h>
#include <stdlib.h>

typedef struct no{
    int valor;
    struct no *proximo;
}No;

typedef struct lista{
    No *inicio;
    int tam;
}Lista;

void inserirNoInicio(Lista *lista, int valor){
    No *novoNo;
    novoNo = (No*) malloc(sizeof(No)); //criando um novo nó
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

void main(){

    Lista lista;
    lista.inicio = NULL;
    lista.tam = 0;

    int opcao = 0, valor;
    do{
        printf("1 - inserir no inicio \n2 - imprimir\n5 - Sair\n");
        scanf("%d",opcao);
        switch (opcao)
        {
        case 1:
            printf("\nDigite o valor: ");
            scanf("%d", valor);
            inserirNoInicio(&lista, valor);
            break;
        
        case 2:
            imprimirLista(&lista);
            break;
        
        case 5:
            printf("\nSaindo");
            break;
        
        default:
            printf("Opcao invalida");
            break;
        }
    }while(opcao != 5);

   free(novoNo);

}