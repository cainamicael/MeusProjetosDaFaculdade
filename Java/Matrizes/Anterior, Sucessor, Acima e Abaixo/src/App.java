import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz: ");
        int linha = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz: ");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++){
            System.out.printf("%n%n");
            for (int c = 0; c < coluna; c++){
                System.out.printf("Digite o elemento correspondente a linha %d e a coluna %d: %n",i+1,c+1);
                matriz[i][c] = sc.nextInt();
            }
        }
        System.out.println("A matriz digitada foi: ");
        for (int i = 0; i < linha; i++){
            System.out.printf("%n");
            for (int c = 0; c < coluna; c++){
                System.out.printf(matriz[i][c] + " ");
            }
        }

        System.out.printf("%n%nEscolha um número para podermos ver os elementos que o cercam: ");
        int numero =  sc.nextInt();

        for (int l = 0; l < linha; l++){
            System.out.printf("%n");
            for (int c = 0; c < coluna; c++){
                if (matriz[l][c] == numero){
                    if (c > 0){
                        System.out.printf("%nO antecessor dele é: %d",matriz[l][c-1]);
                    }
                  /*  else {
                        System.out.printf("%nEle não tem antecessor!");
                    } */
                    if (c < coluna){
                        System.out.printf("%nO sucessor dele é: %d",matriz[l][c+1]);
                    }
                    /*else {
                        System.out.println("%nEle não tem sucessor!");
                    }*/
                    if (linha > 0){
                        System.out.printf("%nO elemento acima dele é: %d",matriz[l-1][c]);
                    }
                    /*else {
                        System.out.println("%nEle não tem elemento acima!");
                    }*/
                    if (l < coluna){
                        System.out.printf("%nO elemento abaixo dele é: %d",matriz[l+1][c]);
                    }
                    /*else {
                        System.out.println("%nEle não tem elemento abaixo!");
                    }*/
                }
            }
        }

    }
}
