package app;

import java.math.BigDecimal;

public class Servico implements Vendavel {
    private String descricao;
    private BigDecimal valorHora;
    private double duracaoHoras;

    public Servico(String descricao, BigDecimal valorHora, double duracaoHoras) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public BigDecimal calcularPrecoTotal(int quantidade) {
        if (quantidade <= 0) quantidade = 1;
        BigDecimal duracao = BigDecimal.valueOf(duracaoHoras);
        return valorHora.multiply(duracao).multiply(BigDecimal.valueOf(quantidade)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal aplicarDesconto(BigDecimal preco, BigDecimal desconto) {
        if (desconto == null) desconto = BigDecimal.ZERO;
        if (desconto.compareTo(BigDecimal.ZERO) < 0) desconto = BigDecimal.ZERO;
        if (desconto.compareTo(BigDecimal.ONE) > 0) desconto = BigDecimal.ONE;
        return preco.multiply(BigDecimal.ONE.subtract(desconto)).setScale(2, java.math.RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Servico: " + descricao + " | Valor/h: R$" + valorHora + " | Dur: " + duracaoHoras + "h";
    }
}
