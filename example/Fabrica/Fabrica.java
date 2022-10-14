package refactoring_guru.abstract_factory.example.Fabrica;

import refactoring_guru.abstract_factory.example.Carro.Carro;
import refactoring_guru.abstract_factory.example.Cliente.Cliente;

public interface Fabrica {
    Carro createButton();
    Cliente createCheckbox();
}