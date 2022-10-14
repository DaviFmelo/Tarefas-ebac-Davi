package refactoring_guru.abstract_factory.example.Cliente;

public class PedidoCarro1 implements Cliente {
    @Override
    public void pagamento() {
        System.out.println("Pagamento concluído");
    }

    @Override
    public void Parcelamento() {
        System.out.println("Parcelado em 24x de 328.856,25");
    }
}
