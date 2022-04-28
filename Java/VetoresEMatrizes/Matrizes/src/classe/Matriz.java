package classe;
import java.util.Scanner;
public class Matriz {

    int matriz[][] = new int [2][2];
    Scanner sc = new Scanner(System.in);

    public void adicionarValor(){
        for (int linha = 0; linha < 2; linha++){
            for (int coluna = 0; coluna < 2; coluna++){
                System.out.printf("Matriz[%d][%d] = ",linha, coluna);
                this.matriz[linha][coluna] = sc.nextInt();
            }
        }
    }

    public void imprimeValor(){
        for (int linha = 0; linha < 2; linha++){
            System.out.println("");
            for (int coluna = 0; coluna < 2; coluna++){
                System.out.printf("%d ", this.matriz[linha][coluna]);
            }
        }
    }

    public static void darEspaco(){
        System.out.printf("%n %n");
    }
    
}
