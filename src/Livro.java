public class Livro implements Calculavel {
    private String titulo;
    private String autor;
    private double precoBase;
    private double desconto; // entre 0 e 1

    public Livro(String titulo, String autor, double precoBase, double desconto) {
        this.titulo = titulo;
        this.autor = autor;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        if (desconto < 0) desconto = 0;
        if (desconto > 1) desconto = 1;
        return precoBase * (1 - desconto);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " - " + autor + " | Preço final: R$" + calcularPrecoFinal();
    }
}
