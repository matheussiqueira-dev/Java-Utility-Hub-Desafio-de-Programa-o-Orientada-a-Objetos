package app;

import java.math.BigDecimal;

public interface Vendavel {
    BigDecimal calcularPrecoTotal(int quantidade);
    BigDecimal aplicarDesconto(BigDecimal preco, BigDecimal desconto);
}
