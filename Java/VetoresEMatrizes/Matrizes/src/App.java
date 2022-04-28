import classe.Matriz;
public class App {
    public static void main(String[] args) throws Exception {

        Matriz matriz1; 
        matriz1 = new Matriz();
        matriz1.adicionarValor();
        matriz1.imprimeValor();

        Matriz.darEspaco();

        Matriz matriz2;
        matriz2 = new Matriz();
        matriz2.adicionarValor();
        matriz2.imprimeValor();
        
    }
}
