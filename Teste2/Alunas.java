public class Alunas implements Comparable<Alunas> {
    private String nome;
    private String sexo;

    public Alunas(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
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
        return "Aluna= " + nome +
                ", sexo= " + sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public int compareTo(Alunas alunas) {
        return this.nome.compareTo(alunas.getNome());
    }
}
