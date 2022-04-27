package classes;

public class Filme {
    private int id;
    private String filme;
    private String categoria;
    private String tempo;

    public Filme(int id, String filme, String categoria, String tempo){
        this.id = id;
        this.categoria = categoria;
        this.filme = filme;
        this.tempo = tempo;
    }
    public void mostrarInformacoes(){
        System.out.printf("O id é %d, o nome é %s, a categoria é %s, o tempo é %s",this.id,this.filme,this.categoria,this.tempo);
    }
    
}
