package refactoring_guru.abstract_factory.Padrão_de_objetos_1;

import refactoring_guru.abstract_factory.Padrão_de_objetos_1.app.Aplicativo;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica.Fabrica;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica.PaganiF;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica.BMWF;

import java.util.Scanner;

public class Demo {
    private static Aplicativo configureApplication() {
        Scanner s = new Scanner(System.in);
        Aplicativo app;
        Fabrica factory;
        String alterando = s.next();
        if (alterando.equals("1")) {
            factory = new PaganiF();
        } else {
            factory = new BMWF();
        }
        app = new Aplicativo(factory);
        return app;
    }

    public static void main(String[] args) {
        Aplicativo app = configureApplication();
        app.paint();
    }
}

