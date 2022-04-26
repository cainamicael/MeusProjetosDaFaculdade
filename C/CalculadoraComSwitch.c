#include <stdio.h>
void main(){

    //Variáveis:
     char opcao;
     float v1, v2, soma, subtracao, multiplicacao, divisao;

    printf("Bem vindo a calculadora \n");
    printf("Digite a operação que você deseja realizar \n");
    printf("OBS: Essa calculadora realiza somente as operações de +(Soma),-(Subtração),*(Multiplicação) e /(Divisão) \n");
    scanf("%c",&opcao);
    printf("Ótimo. Agora digite o primeiro valor (Lembre-se, em algumas operações, a ordem dos fatores importa!): ");
    scanf("%f",&v1);
    printf("Certo. Agora digite o segundo valor: ");
    scanf("%f",&v2);
    printf("Vamos para os resultados: \n");

    switch(opcao){
        case '+':
            soma = v1+v2;
            printf("\n A soma de %.2f + %.2f resulta em: %.2f",v1,v2,soma);
            break;
        case '-':
            subtracao = v1-v2;
            printf("\n A Subtração de %.2f - %.2f resulta em: %.2f",v1,v2,subtracao);
            break;
        case '*':
            multiplicacao = v1*v2;
             printf("\n A Multiplicação de %.2f * %.2f resulta em: %.2f",v1,v2,multiplicacao);
            break;
        case '/':
            divisao = v1/v2;
             printf("\n A Divisao de %.2f / %.2f resulta em: %.2f",v1,v2,divisao);
            break;
        default:
            printf("Verifique se você escolheu uma opção válida. Essa calculadora não trabalha com operações complexas!");

    }
}