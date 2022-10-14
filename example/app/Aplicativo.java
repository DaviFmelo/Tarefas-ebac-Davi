package refactoring_guru.abstract_factory.example.app;

import refactoring_guru.abstract_factory.example.Carro.Carro;
import refactoring_guru.abstract_factory.example.Cliente.Cliente;
import refactoring_guru.abstract_factory.example.Fabrica.Fabrica;

public class Aplicativo {
    private Carro carro;
    private Cliente cliente;

    public Aplicativo(Fabrica factory) {
        carro = factory.createButton();
        cliente = factory.createCheckbox();
    }

    public void paint() {
        carro.modelo();
        carro.cor();
        carro.motor();
        cliente.pagamento();
        cliente.Parcelamento();
    }
}