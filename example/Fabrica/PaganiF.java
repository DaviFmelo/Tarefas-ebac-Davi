package refactoring_guru.abstract_factory.example.Fabrica;

import refactoring_guru.abstract_factory.example.Carro.Carro;
import refactoring_guru.abstract_factory.example.Carro.Pagani;
import refactoring_guru.abstract_factory.example.Cliente.Cliente;
import refactoring_guru.abstract_factory.example.Cliente.PedidoCarro1;

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