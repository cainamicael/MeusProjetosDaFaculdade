//import classes.Conta;
import java.util.Scanner;

import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double first = 0;
        int control = -1;

        System.out.printf("Olá, Bem vindo ao nosso banco!%n");
        System.out.printf("%n Vamos abrir a sua conta!%n");
        System.out.printf("%n Primeiramente, digite o número da sua conta: %n");
        int accountNumber = sc.nextInt();
        System.out.printf("%n Ok. Agora digite o seu nome: %n");
        String fullName = sc.next();
        System.out.printf("%nAgora digite S se você deseja fazer um depósito inicial ou digite N para pular essa etapa: ");
        String option = sc.next();
        switch (option){
            case "S":
                System.out.println("Digite o valor que você vai adicionar: ");
                first = sc.nextDouble();
                break;
            case "s":
                System.out.println("Digite o valor que você vai adicionar: ");
                first = sc.nextDouble();
                break;
            case "N":
                System.out.println("Você criou a conta sem depórito inicial");
                first = 0;
                break;
                case "n":
                System.out.println("Você criou a conta sem depórito inicial");
                first = 0;
                break;
            default:
                System.out.println("Digite uma opção válida! ");
        }
        System.out.printf("%nConta criada com sucesso!%n ");
        
        Conta conta1 = new Conta(accountNumber,fullName ,first);
        System.out.println(conta1.toString());

        do{ 
            System.out.printf("%nEscolha uma das opções abaixo: %n");
            System.out.printf("%nPara alterar o nome, digite 1%n");
            System.out.printf("%nPara depositar, digite 2%n");
            System.out.printf("%nPara sacar, digite 3 (a taxa de saque é R$ 5,00)%n");
            System.out.printf("%nPara sair, digite 4%n");
            System.out.println("Escolha a sua opção: ");
            int option2 = sc.nextInt();
            switch (option2){
                case 1:
                    System.out.printf("%nDigite o novo nome: %n");
                    conta1.alterarNome(sc.next());
                    System.out.println(conta1.toString());
                    break;
                case 2:
                    System.out.printf("%nDigite quanto voce quer depositar%n");
                    conta1.deposito(sc.nextDouble());
                    System.out.println(conta1.toString());
                    break;
                case 3:
                System.out.printf("%nDigite quanto voce quer sacar%n");
                conta1.saque(sc.nextDouble());
                System.out.println(conta1.toString());
                    break;
                case 4:
                    System.out.println(conta1.toString());
                    control = 0;
                    break;
                default:
                    System.out.println("Erro");
                
            }
        }while(control != 0);
        sc.close();
    }
}
