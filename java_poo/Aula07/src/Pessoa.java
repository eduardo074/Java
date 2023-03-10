
// abstract siginifica que essa classe NÃO pode ser instânciada
public abstract class Pessoa{
    private String nome, sexo;
    private int idade;



    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    // Quando é final, NÃO vai poder ser subscrita ou imutável
    public final void fazerAniversario() {
        this.idade++;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
