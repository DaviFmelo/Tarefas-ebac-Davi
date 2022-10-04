import java.util.ArrayList;
import java.util.List;

public class Separação_Grupos {
    public static void main(String [] args){
        List<Pessoas_Genero> lista = new ArrayList<>();

        lista.add(new Pessoas_Genero("Davi", Genero.Homen));
        lista.add(new Pessoas_Genero("Andressa", Genero.Mulher));
        lista.add(new Pessoas_Genero("Ingrid", Genero.Mulher));
        lista.add(new Pessoas_Genero("Oliver", Genero.Homen));
        lista.add(new Pessoas_Genero("Ricardo", Genero.Homen));
        lista.add(new Pessoas_Genero("Thor", Genero.Homen));

        System.out.println("***** Mulheres ******");

        lista.stream().filter(p-> p.getGenero().equals(Genero.Mulher))
                .forEach(System.out::println);

        System.out.println("\n ***** Homens *****");

        lista.stream().filter(p-> p.getGenero().equals(Genero.Homen))
                .forEach((System.out::println));
    }
}
