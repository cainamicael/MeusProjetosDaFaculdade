package metematico;
import java.util.Scanner;

public class Calculadora {

    public double valor1;
    private double valor2;
    public char opcao;
    Scanner sc = new Scanner(System.in);

    public void coletaDeDados(){
        System.out.println("Digite o primeiro valor: ");
        this.valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        this.valor2 = sc.nextDouble();
        System.out.println("Escolha a operação desejada(+,-,*,/,p,f) ");
        this.opcao = sc.next().charAt(0);
    }
    public double soma(){
        double v1 = this.valor1;
        double v2 = this.valor2;
        return v1+v2;
    }
    public double subtracao(){
        double v1 = this.valor1;
        double v2 = this.valor2;
        return v1-v2;
    }
    public double multiplicacao(){
        double v1 = this.valor1;
        double v2 = this.valor2;
        return v1*v2;
    }
    public double divisao(){
        double v1 = this.valor1;
        double v2 = this.valor2;
        return v1/v2;
    }
    public double potencia(){
        double v1 = this.valor1;
        double v2 = this.valor2;
        return Math.pow(v1, v2);
    }
}
