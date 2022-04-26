package classes;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        
    }
    public void deposito(double valor){
        this.saldo = saldo+=valor;
    }
    public void saque(double valor){
        this.saldo = (saldo-=valor)-5;
    }
    public String toString(){
        System.out.printf("%n");
        return nome + " O número da sua conta é: " + numero + " e o seu saldo atual é: R$" + saldo;
    }
    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }
}
