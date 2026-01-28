public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;
    private int estoque;
    private double imposto; // proporção

    public Produto(String nome, double precoUnitario, int estoque, double imposto) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.estoque = estoque;
        this.imposto = imposto;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        if (quantidade <= 0) return 0;
        if (quantidade > estoque) quantidade = estoque; // vende só o que tem
        double precoBruto = precoUnitario * quantidade;
        return precoBruto * (1 + imposto);
    }

    @Override
    public double aplicarDesconto(double preco, double desconto) {
        if (desconto < 0) desconto = 0;
        if (desconto > 1) desconto = 1;
        return preco * (1 - desconto);
    }

    public boolean emEstoque() {
        return estoque > 0;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço unit: R$" + precoUnitario + " | Estoque: " + estoque;
    }
}
