import java.util.Scanner;
public class App {
    public static void imprimiVetor(int vetor[]){
        int c = 0;
        for (int elementos : vetor){
            c++;
            System.out.printf("%nO valor na posição [%d] é igual a : (%d) ",c,elementos);
        }
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos criar um vetor: ");
        int vetor1[] = new int[10];
        for (int c = 0; c  < vetor1.length; c++){
            System.out.printf("%nDigite o valor para a posição %d: ",c+1);
            vetor1[c] = sc.nextInt();
        }
        imprimiVetor(vetor1);
    }
}
