package refactoring_guru.abstract_factory.example.Carro;

public class Pagani implements Carro {
    @Override
    public void modelo() {
        System.out.println("Modelo: Pagani Zonda R");
    }
    @Override
    public void cor() {
        System.out.println("Cor: Cinza");
    }

    @Override
    public void motor() {
        System.out.println("Motor: 6.0 V12 de 739 cavalos de potência");
    }

}
