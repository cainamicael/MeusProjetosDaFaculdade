import classes.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        int id = 10;
        String filme = "Madagascar 3";
        String categoria = "Infantil";
        String tempo = "01:54:00";
        Filme filme1 = new Filme(id, filme, categoria, tempo);
        filme1.mostrarInformacoes();
    }
}
