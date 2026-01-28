package app;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorMoeda implements ConversaoFinanceira {
    private BigDecimal taxaDolarParaReal;

    public ConversorMoeda(BigDecimal taxaDolarParaReal) {
        this.taxaDolarParaReal = taxaDolarParaReal;
    }

    public ConversorMoeda() {
        this.taxaDolarParaReal = BigDecimal.valueOf(5.0); // taxa padrão
    }

    @Override
    public BigDecimal converterDolarParaReal(BigDecimal valorDolar) {
        if (valorDolar == null) return BigDecimal.ZERO;
        return valorDolar.multiply(taxaDolarParaReal).setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setTaxaDolarParaReal(BigDecimal taxa) {
        this.taxaDolarParaReal = taxa;
    }
}
