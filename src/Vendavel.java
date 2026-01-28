public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    double aplicarDesconto(double preco, double desconto); // desconto em proporção (0.1 = 10%)
}
