public class Alunos implements Comparable<Alunos>{

    private String nome;
    private String sexo;

    public Alunos(String nome, String sexo){
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
        return "Aluno= " + nome +
                ", sexo= " + sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

        @Override
        public int compareTo(Alunos alunos) {
            return this.nome.compareTo(alunos.getNome());
        }
    }
