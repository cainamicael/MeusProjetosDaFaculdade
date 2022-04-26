

import metematico.Calculadora;
public class App {
    public static void main(String[] args) throws Exception {
        
        Calculadora c1 = new Calculadora();
        c1.coletaDeDados();
        
        if (c1.opcao == '+'){
            System.out.println("A soma dos valores dá: ");
            System.out.println(c1.soma());
        }else if (c1.opcao == '-'){
            System.out.println("A soubtração dos valores dá: ");
            System.out.println(c1.subtracao());
        }else if (c1.opcao == '*'){
            System.out.println("A Multiplicação dos valores dá: ");
            System.out.println(c1.multiplicacao());
        }else if (c1.opcao == '/'){
            System.out.println("A Divisão dos valores dá: ");
            System.out.println(c1.divisao());
        }else if (c1.opcao == 'p'){
            System.out.println("O primeiro valor elevado ao segundo valor dá: ");
            System.out.println(c1.potencia());
        }else if (c1.opcao == 'f'){
            System.out.println("O fatorial do primeiro valor é: ");
           // System.out.println(c1.fatorial());
        }else{
            System.out.println("Opção inválida!");
        }
    }
}
