import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista_Alunos {
    public static void main(String [] args) {
        lista1();
        lista2();
    }
    private static void lista1(){
        System.out.println("***** Alunos *****");
        List<Alunos> lista = new ArrayList<Alunos>();

        Alunos a = new Alunos("Davi", "M");
        Alunos b = new Alunos("Davidson", "M");
        Alunos c = new Alunos("José", "M");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
    private static void lista2(){
        System.out.println("***** Alunas *****");
        List<Alunas> lista2 = new ArrayList<Alunas>();

        Alunas a = new Alunas("Ingrid", "F");
        Alunas b = new Alunas("Andressa", "F");
        lista2.add(a);
        lista2.add(b);
        Collections.sort(lista2);
        System.out.println(lista2);
        System.out.println("");
    }
}
