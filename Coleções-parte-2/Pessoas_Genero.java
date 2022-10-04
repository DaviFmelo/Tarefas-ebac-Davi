enum Genero {
    Homen, Mulher
}
public class Pessoas_Genero{
    private String nome;
    private Genero genero;

    public Pessoas_Genero(String nome, Genero genero){

        super();
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome= " + nome  +
                ", genero= " + genero +
                '}';
    }
}
