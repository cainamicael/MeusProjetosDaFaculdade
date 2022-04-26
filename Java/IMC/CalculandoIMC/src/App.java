import classes.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        System.out.printf("%n %s, Digite o seu peso em kg : ",nome);
        double peso = sc.nextDouble();
        System.out.printf("%n %s, Digite a sua altura (use vírgula): ",nome);
        double altura = sc.nextDouble();
        Pessoa p1 = new Pessoa(nome, peso, altura);
        System.out.println(p1);
        System.out.println(p1.classificacao(p1.calculoImc()));

    }
}
