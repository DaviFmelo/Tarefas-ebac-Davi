public class Pessoas implements Comparable<Pessoas> {
    private String nome;

    public Pessoas(String pNome) {
        nome = pNome;
    }

    @Override
    public int compareTo(Pessoas outro) {
        int compareInt = this.nome.compareTo(outro.nome);
        if (compareInt < 0) return -1;
        if (compareInt > 0) return 1;
        return 0;
    }

    public String getNome() {
        return nome;
    }
}