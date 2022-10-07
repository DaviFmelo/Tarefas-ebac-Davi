import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("***** Separar nomes por ordem alfabética *****");
        System.out.println("\n Digite pelo menos 5 nomes");
        s.next();
        ArrayList<Pessoas> lista = new ArrayList<Pessoas>();
        for (int i = 0; i < 5; i++) {
            lista.add(new Pessoas(s.nextLine()));
        }

        System.out.println();
        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome() + " ");
        }
        s.close();
    }
}