package refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica;

import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.Carro;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.Pagani;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.Cliente;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.PedidoCarro1;

public class PaganiF implements Fabrica {

    @Override
    public Carro createButton() {
        return new Pagani();
    }

    @Override
    public Cliente createCheckbox() {
        return new PedidoCarro1();
    }
}