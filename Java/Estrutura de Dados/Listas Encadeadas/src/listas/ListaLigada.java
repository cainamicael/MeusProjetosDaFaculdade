package listas;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    
    public ListaLigada() {
        this.tamanho = 0;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            tamanho++;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        tamanho++;
    }

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (atual == this.primeiro && atual == this.ultimo){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == this.primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == this.ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
       
    }

    public Elemento get(int posicao){ //mostra o elemento na posição correspondente
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void imprime(){ //eu que fiz
        Elemento atual = this.primeiro;
        System.out.println(this.primeiro.getValor());
        for (int i = 0; i < this.tamanho; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
                System.out.println(atual.getValor());
            }
        }
    }

}
