import java.util.Scanner;
import classes.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários: ");
        int n = sc.nextInt();

        int id;
        String nome;
        double salario;

        Funcionario[] f = new Funcionario[n];
        for (int i = 0; i < n; i++){
            System.out.printf("%nFuncionário(a) %d:%n",i+1);
            System.out.printf("%nDigite o Id do funcionário:");
            id = sc.nextInt();
            System.out.printf("%nDigite o Nome do funcionário:");
            nome = sc.next();
            System.out.printf("%nDigite o Salário do funcionário:");
            salario = sc.nextDouble();
            f[i] = new Funcionario(id, nome, salario);
            System.out.printf("%n------------------------------%n");
        }
        System.out.printf("%nDigite a porcentagem de aumento salarial: ");
        double x = sc.nextDouble();
        System.out.printf("%nDigite o Id de quem vai receber o aumento: ");
        int idcontemplado = sc.nextInt();
        for (int i = 0; i < n; i++){
            if(f[i].getId() == idcontemplado){
                double novosalario = f[i].incrementoSalarial(x);
                f[i].setSalario(novosalario);
                System.out.printf("%n O salário novo de %s é: R$ %.2f",f[i].getNome(),f[i].getSalario());
            }
        } 
        for (int i = 0; i < n; i++){
            System.out.printf("%n%n");
            System.out.printf("Nome funcionario %d: %s%n Salario: %.2f",i+1,f[i].getNome(),f[i].getSalario());
        }

    }
}
