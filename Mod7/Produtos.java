public class Produtos {
    private String nomeProduto;
    private int codigoProduto;
    private double valorProduto1;
    private double valorProduto2;

    private double valorTotal;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto1() {
        return valorProduto1;
    }

    public void setValorProduto1(double valorProduto1) {
        this.valorProduto1 = valorProduto1;
    }

    public double getValorProduto2() {
        return valorProduto2;
    }

    public void setValorProduto2(double valorProduto2) {
        this.valorProduto2 = valorProduto2;
    }
}
