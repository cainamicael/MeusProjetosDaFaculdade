package classes;
//superclasse
public abstract class Pessoa { //public abstract class Não posso instanciar Pessoa
    protected String nome;
    protected int idade;
    protected String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    public void fazerAniversario(){
        this.idade ++;
    }
    
}
