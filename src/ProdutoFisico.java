package app;

import java.math.BigDecimal;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private BigDecimal precoBase;
    private BigDecimal taxaAdicional; // ex: frete ou imposto em proporção (0.1 = 10%)

    public ProdutoFisico(String nome, BigDecimal precoBase, BigDecimal taxaAdicional) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        BigDecimal taxa = taxaAdicional == null ? BigDecimal.ZERO : taxaAdicional;
        if (taxa.compareTo(BigDecimal.ZERO) < 0) taxa = BigDecimal.ZERO;
        return precoBase.multiply(BigDecimal.ONE.add(taxa)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço final: R$" + calcularPrecoFinal();
    }
}
