import java.util.List;

public class Demo {
    public static void main(String args[]){
        List<Pessoa> lista = new Pessoa().pessoas();

        lista.stream()
                .filter(pessoa -> pessoa.genero.equals("Feminino"))
                .forEach(pessoa -> System.out.println(pessoa));
    }
}
