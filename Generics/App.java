import Carros.BMW;
import Carros.Dodge;
import Carros.ListaCarro;
import Carros.Pagani;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String args []) {
        System.out.println("***** Lista dos carros disponiveis *****");

        List<ListaCarro> listaCarros = new ArrayList<>();
        listaCarros.add(new BMW());
        listaCarros.add(new Dodge());
        listaCarros.add(new Pagani());
        imprimirCarros(listaCarros);
    }

    public static void imprimirCarros(List<ListaCarro> lista) {
        for (ListaCarro listaCarro : lista) {
            System.out.println(listaCarro);
        }
    }
}


