public class ProdutoFisico implements Calculavel {
    private String nome;
    private double precoBase;
    private double taxaAdicional; // ex: frete ou imposto em proporção (0.1 = 10%)

    public ProdutoFisico(String nome, double precoBase, double taxaAdicional) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        if (taxaAdicional < 0) taxaAdicional = 0;
        return precoBase * (1 + taxaAdicional);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço final: R$" + calcularPrecoFinal();
    }
}
