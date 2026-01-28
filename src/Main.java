public class Main {
    public static void main(String[] args) {
        System.out.println("Demo das novas classes e interfaces\n");

        // Conversor de moeda
        ConversorMoeda conversor = new ConversorMoeda(5.25);
        double reais = conversor.converterDolarParaReal(10.0);
        System.out.println("10 USD em R$: " + reais + " (taxa 5.25)");

        // Sala retangular
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(4.0, 6.0);
        System.out.println("Área da sala: " + sala.calcularArea() + " m2");
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro() + " m");

        // Tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(7);
        System.out.println("\nTabuada do 7:");
        tabuada.mostrarTabuada();

        // Conversor de temperatura
        ConversorTemperaturaPadrao tempConv = new ConversorTemperaturaPadrao();
        double f = tempConv.celsiusParaFahrenheit(0);
        double c = tempConv.fahrenheitParaCelsius(32);
        System.out.println("\n0°C em °F: " + f);
        System.out.println("32°F em °C: " + c);

        // Calculavel: Livro e ProdutoFisico
        Livro livro = new Livro("Aprendendo Java", "Autor X", 120.0, 0.1);
        ProdutoFisico prodFis = new ProdutoFisico("Teclado", 250.0, 0.12);
        System.out.println("\n" + livro);
        System.out.println(prodFis);

        // Vendavel: Produto e Servico
        Produto produto = new Produto("Mouse", 80.0, 5, 0.12);
        Servico servico = new Servico("Desenvolvimento", 100.0, 2.5);
        System.out.println("\n" + produto);
        System.out.println("Preço total (3 unidades): R$" + produto.calcularPrecoTotal(3));
        System.out.println(servico);
        System.out.println("Preço serviço (1 pacote): R$" + servico.calcularPrecoTotal(1));

        // Mensagem original do projeto
        System.out.println("\nEsse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        Double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
    }
}