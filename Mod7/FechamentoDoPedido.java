public class FechamentoDoPedido {
    public static void main(String[] args) {

        System.out.println("Bem vindo aos Supermecados Laranjeiras!");
        Cliente cliente = new Cliente();
        Produtos produtos = new Produtos();
        MetodoDePagamento metodoDePagamento = new MetodoDePagamento();

        // Informações do Cliente.
        cliente.setEndereço("Rua das Laranjeiras");
        cliente.setCpf("280-642-120-06");
        cliente.setEmail("Davi.Melo@outlook.com");
        cliente.setNome("Davi Melo");

        // Informações da compra.
        produtos.setNomeProduto("Arroz;Leite");
        produtos.setCodigoProduto(43134);
        produtos.setValorProduto1(21.32);
        produtos.setValorProduto2(12.45);
        produtos.setValorTotal(33.77);

        //Informação de Pagamento.
        metodoDePagamento.setDinheiro(43.45);
        metodoDePagamento.setTroco(9.68);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereço());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getEmail());
        System.out.println(produtos.getNomeProduto());
        System.out.println(produtos.getCodigoProduto());
        System.out.println(produtos.getValorProduto1());
        System.out.println(produtos.getValorProduto2());
        System.out.println(produtos.getValorTotal());
        System.out.println(metodoDePagamento.getDinheiro());
        System.out.println(metodoDePagamento.getTroco());
        System.out.println("Tenha um otimo dia!");
    }
}








