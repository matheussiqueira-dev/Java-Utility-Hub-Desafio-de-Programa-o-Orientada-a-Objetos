public class ConversorMoeda implements ConversaoFinanceira {
    private double taxaDolarParaReal;

    public ConversorMoeda(double taxaDolarParaReal) {
        this.taxaDolarParaReal = taxaDolarParaReal;
    }

    public ConversorMoeda() {
        this.taxaDolarParaReal = 5.0; // taxa padrão
    }

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * taxaDolarParaReal;
    }

    public void setTaxaDolarParaReal(double taxa) {
        this.taxaDolarParaReal = taxa;
    }
}
