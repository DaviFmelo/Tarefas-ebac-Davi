import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Demo {
    @Test
    public static void main(String args[]){
        List<Pessoa> lista = new Pessoa().pessoas();
        lista.stream()
                .filter(pessoa -> pessoa.genero.equals("Feminino"))
                .forEach(pessoa -> System.out.println(pessoa));
        Assert.assertEquals("Feminino", 0);
    }
}