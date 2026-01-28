public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double largura;
    private double comprimento;

    public CalculadoraSalaRetangular(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + comprimento);
    }
}
