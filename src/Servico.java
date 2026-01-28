public class Servico implements Vendavel {
    private String descricao;
    private double valorHora;
    private double duracaoHoras;

    public Servico(String descricao, double valorHora, double duracaoHoras) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        // quantidade para serviços interpreta-se como multiplicador (ex: pacotes)
        if (quantidade <= 0) quantidade = 1;
        return valorHora * duracaoHoras * quantidade;
    }

    @Override
    public double aplicarDesconto(double preco, double desconto) {
        if (desconto < 0) desconto = 0;
        if (desconto > 1) desconto = 1;
        return preco * (1 - desconto);
    }

    @Override
    public String toString() {
        return "Servico: " + descricao + " | Valor/h: R$" + valorHora + " | Dur: " + duracaoHoras + "h";
    }
}
