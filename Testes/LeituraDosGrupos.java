import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraDosGrupos {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = s.next();
        System.out.println("Digite seu sexo: ");
        String sexo = s.next();
        lista1();
        lista2();
    }
    private static void lista1(){
        List<GrupoMasculino> lista = new ArrayList<GrupoMasculino>();

        GrupoMasculino a = new GrupoMasculino();
        GrupoMasculino b = new GrupoMasculino();
        GrupoMasculino c = new GrupoMasculino();
        GrupoMasculino d = new GrupoMasculino();
        GrupoMasculino e = new GrupoMasculino();
        lista.add (a);
        lista.add (b);
        lista.add (c);
        lista.add (d);
        lista.add (e);
        System.out.println(lista);
    }
    private static void lista2(){
        List<GrupoFeminino> lista2 = new ArrayList<GrupoFeminino>();

        GrupoFeminino a = new GrupoFeminino();
        GrupoFeminino b = new GrupoFeminino();
        GrupoFeminino c = new GrupoFeminino();
        GrupoFeminino d = new GrupoFeminino();
        GrupoFeminino e = new GrupoFeminino();
        lista2.add (a);
        lista2.add (b);
        lista2.add (c);
        lista2.add (d);
        lista2.add (e);
        System.out.println(lista2);
    }

}
