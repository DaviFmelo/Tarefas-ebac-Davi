public class Pessoa {
    private String nome;
    private String genero;
    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    public String getNome(){
        return this.nome;
    }
    public String getGenero(){
        return this.genero;
    }
}
