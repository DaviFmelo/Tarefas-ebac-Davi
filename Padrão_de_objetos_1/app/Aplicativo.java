package refactoring_guru.abstract_factory.Padrão_de_objetos_1.app;

import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.Carro;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.Cliente;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica.Fabrica;

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