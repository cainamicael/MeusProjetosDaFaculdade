import listas.ListaLigada;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Lista Encadeada");

        ListaLigada lista = new ListaLigada();

        lista.adicionar("Acre");
        lista.adicionar("Bahia");
        lista.adicionar("Ceará");
        lista.adicionar("Df");
        lista.adicionar("Pernambuco");
        lista.adicionar("sergipe");

        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        System.out.printf("Elemento na posição 2: " + lista.get(2).getValor() + "%n%n");
        
        lista.imprime();
        lista.remover("Acre");
        System.out.printf("%n%n");

//outra forma de imprimir
        for (int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

    }
}
