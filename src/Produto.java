package app;

import java.math.BigDecimal;

public class Produto implements Vendavel {
    private String nome;
    private BigDecimal precoUnitario;
    private int estoque;
    private BigDecimal imposto; // proporção, ex: 0.12

    public Produto(String nome, BigDecimal precoUnitario, int estoque, BigDecimal imposto) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.estoque = estoque;
        this.imposto = imposto;
    }

    @Override
    public BigDecimal calcularPrecoTotal(int quantidade) {
        if (quantidade <= 0) return BigDecimal.ZERO;
        if (quantidade > estoque) quantidade = estoque; // vende só o que tem
        BigDecimal qtd = BigDecimal.valueOf(quantidade);
        BigDecimal precoBruto = precoUnitario.multiply(qtd);
        return precoBruto.multiply(imposto.add(BigDecimal.ONE)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal aplicarDesconto(BigDecimal preco, BigDecimal desconto) {
        if (desconto == null) desconto = BigDecimal.ZERO;
        if (desconto.compareTo(BigDecimal.ZERO) < 0) desconto = BigDecimal.ZERO;
        if (desconto.compareTo(BigDecimal.ONE) > 0) desconto = BigDecimal.ONE;
        return preco.multiply(BigDecimal.ONE.subtract(desconto)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    public boolean emEstoque() {
        return estoque > 0;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço unit: R$" + precoUnitario + " | Estoque: " + estoque;
    }
}
