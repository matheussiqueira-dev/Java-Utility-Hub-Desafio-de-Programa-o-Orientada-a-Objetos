package app;

import java.math.BigDecimal;

public class Livro implements Calculavel {
    private String titulo;
    private String autor;
    private BigDecimal precoBase;
    private BigDecimal desconto; // entre 0 e 1

    public Livro(String titulo, String autor, BigDecimal precoBase, BigDecimal desconto) {
        this.titulo = titulo;
        this.autor = autor;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        BigDecimal d = desconto == null ? BigDecimal.ZERO : desconto;
        if (d.compareTo(BigDecimal.ZERO) < 0) d = BigDecimal.ZERO;
        if (d.compareTo(BigDecimal.ONE) > 0) d = BigDecimal.ONE;
        return precoBase.multiply(BigDecimal.ONE.subtract(d)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " - " + autor + " | Preço final: R$" + calcularPrecoFinal();
    }
}
