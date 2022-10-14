package refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica;

import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.Carro;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.BMW;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.Cliente;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.PedidoCarro2;

public class BMWF implements Fabrica {

    @Override
    public Carro createButton() {
        return new BMW();
    }

    @Override
    public Cliente createCheckbox() {
        return new PedidoCarro2();
    }
}
