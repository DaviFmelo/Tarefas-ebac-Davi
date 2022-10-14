package refactoring_guru.abstract_factory.example.Cliente;

public class PedidoCarro2 implements Cliente {

    @Override
    public void pagamento() {
        System.out.println("Pagamento concluído");
    }

    @Override
    public void Parcelamento() {
        System.out.println("Parcelado em 24x de 108.856,25");
    }
}
