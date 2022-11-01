import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    @Test
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Scanner s = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
            System.out.println("\nDigite o nome da pessoa(Digite sair para fechar o programa): ");
            String nome = s.next();
            if(nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite apenas o gênero feminino: ");
            String genero = s.next();
            Pessoa a = new Pessoa(nome, genero);
            lista.add(a);
            if (!"Feminino".equals(genero)) {
                System.out.println("Gênero Invalido");
                return;
            }
        }

        System.out.println("****** Grupo Feminino ******");
        for(Pessoa grupo: lista) {
            System.out.println("\n" + grupo.getNome() + "," + grupo.getGenero() + ".");
            System.out.println();
            lista.stream()
                    .filter(pessoa -> pessoa.getGenero().equals("Feminino"));
            Assert.assertEquals("Feminino", grupo.getGenero());
        }
    }
}
