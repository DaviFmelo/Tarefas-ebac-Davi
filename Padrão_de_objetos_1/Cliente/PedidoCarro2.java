package refactoring_guru.abstract_factory.Padrão_de_objetos_1.Cliente;

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
