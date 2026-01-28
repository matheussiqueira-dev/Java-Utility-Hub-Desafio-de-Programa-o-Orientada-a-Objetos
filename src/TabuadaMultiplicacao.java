public class TabuadaMultiplicacao implements Tabuada {
    private int numero;
    private int maxMultiplicador;

    public TabuadaMultiplicacao(int numero) {
        this(numero, 10);
    }

    public TabuadaMultiplicacao(int numero, int maxMultiplicador) {
        this.numero = numero;
        this.maxMultiplicador = maxMultiplicador > 0 ? maxMultiplicador : 10;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= maxMultiplicador; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
