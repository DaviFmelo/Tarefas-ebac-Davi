package refactoring_guru.abstract_factory.example.Fabrica;

import refactoring_guru.abstract_factory.example.Carro.Carro;
import refactoring_guru.abstract_factory.example.Carro.BMW;
import refactoring_guru.abstract_factory.example.Cliente.Cliente;
import refactoring_guru.abstract_factory.example.Cliente.PedidoCarro2;

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
