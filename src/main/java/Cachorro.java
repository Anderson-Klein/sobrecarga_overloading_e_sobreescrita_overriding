public class Cachorro {

    private String nome;
    private int idade;


    public void Cachorro(){

    }
    public void Cachorro(String nome){
        this.nome = nome;
    }
    public void Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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
}
