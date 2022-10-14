package refactoring_guru.abstract_factory.Padrão_de_objetos_1.Fabrica;

import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Carro.Carro;
import refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente.Cliente;

public interface Fabrica {
    Carro createButton();
    Cliente createCheckbox();
}