import java.util.List;

public class Pessoa {

    String nome;
    String genero;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Pessoa (String nome, String genero) {
        this.nome = nome;
        this.genero = genero;

    }

    @Override
    public String toString() {
        return "nome = " + nome +
                ", genero = " + genero;
    }

    public List<Pessoa> pessoas() {
        Pessoa pessoa1 = new Pessoa("Davi", "Masculino");
        Pessoa pessoa2 = new Pessoa("Andressa", "Feminino");
        Pessoa pessoa3 = new Pessoa("Davidson", "Masculino");
        Pessoa pessoa4 = new Pessoa("Ingrid", "Feminino");
        Pessoa pessoa5 = new Pessoa("Isaac", "Masculino");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);

    }
}
