package refactoring_guru.abstract_factory.example.Carro;

public class BMW implements Carro {
    @Override
    public void motor() {
        System.out.println("Motor: BMW P60B40 4.0 L V8 engine");
    }
    @Override
    public void cor() {
            System.out.println("Cor: Cinza");
        }

    @Override
    public void modelo() {
        System.out.println("Modelo: BMW M3 GTR");
    }
}