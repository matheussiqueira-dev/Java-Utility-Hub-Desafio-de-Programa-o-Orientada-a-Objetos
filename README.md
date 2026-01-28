# Java Utility Hub — Desafio de Programação Orientada a Objetos

> Projeto de demonstração de conceitos de Programação Orientada a Objetos em Java: interfaces, implementações, cálculos e exemplos práticos.

---

## Visão geral

Este repositório contém uma coleção de pequenas utilidades e exercícios em Java para demonstrar o uso de interfaces e classes concretas. O código acompanha uma classe `Main` com exemplos que ilustram o comportamento das implementações.

Funcionalidades presentes:
- Conversão de dólar para real (`ConversorMoeda` / `ConversaoFinanceira`).
- Cálculo de área e perímetro de sala retangular (`CalculadoraSalaRetangular` / `CalculoGeometrico`).
- Impressão de tabuada (`TabuadaMultiplicacao` / `Tabuada`).
- Conversões de temperatura (`ConversorTemperaturaPadrao` / `ConversorTemperatura`).
- Modelos de preço final (`Calculavel` com `Livro` e `ProdutoFisico`).
- Lógica de venda (`Vendavel` com `Produto` e `Servico`).

---

## Estrutura do projeto (resumida)

- `src/`
  - `Main.java` — ponto de entrada com demonstrações.
  - `ConversaoFinanceira.java` / `ConversorMoeda.java`
  - `CalculoGeometrico.java` / `CalculadoraSalaRetangular.java`
  - `Tabuada.java` / `TabuadaMultiplicacao.java`
  - `ConversorTemperatura.java` / `ConversorTemperaturaPadrao.java`
  - `Calculavel.java` / `Livro.java` / `ProdutoFisico.java`
  - `Vendavel.java` / `Produto.java` / `Servico.java`

---

## Como compilar e executar

Requisitos: JDK (11+ recomendado). No PowerShell (Windows):

1) Abrir o terminal no diretório do projeto (onde está a pasta `src`).

2) Compilar todos os fontes:

```powershell
javac -d out src\*.java
```

3) Executar a aplicação (recomendo forçar UTF-8 para evitar problemas de acentuação no terminal do Windows):

```powershell
chcp 65001; java -Dfile.encoding=UTF-8 -cp out Main
```

Dica: se você não quiser alterar a página de código do terminal, ainda assim o programa funciona; apenas alguns acentos podem aparecer incorretos na saída.

---

## Saída de exemplo (exibida pelo `Main`)

Abaixo há uma saída de exemplo que ilustra o comportamento do programa quando executado com sucesso (valores de exemplo):

```
Demo das novas classes e interfaces

10 USD em R$: 52.5 (taxa 5.25)
Área da sala: 24.0 m2
Perímetro da sala: 20.0 m

Tabuada do 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

0°C em °F: 32.0
32°F em °C: 0.0

Livro: Aprendendo Java - Autor X | Preço final: R$108.0
Produto: Teclado | Preço final: R$280.0

Produto: Mouse | Preço unit: R$80.0 | Estoque: 5
Preço total (3 unidades): R$268.8
Servico: Desenvolvimento | Valor/h: R$100.0 | Dur: 2.5h
Preço serviço (1 pacote): R$250.0

Esse é o Screen Match
Filme: Top Gun: Maverick
Ano de lançamento: 2022
8.033333333333333
```

---

## Descrição das principais classes e assinaturas

- Interface `ConversaoFinanceira`
  - `double converterDolarParaReal(double valorDolar)`
- Classe `ConversorMoeda` implements `ConversaoFinanceira`
  - Construtor: `ConversorMoeda()` e `ConversorMoeda(double taxaDolarParaReal)`
  - `void setTaxaDolarParaReal(double taxa)`

- Interface `CalculoGeometrico`
  - `double calcularArea()`
  - `double calcularPerimetro()`
- Classe `CalculadoraSalaRetangular` implements `CalculoGeometrico`
  - Construtor: `CalculadoraSalaRetangular(double largura, double comprimento)`

- Interface `Tabuada`
  - `void mostrarTabuada()`
- Classe `TabuadaMultiplicacao` implements `Tabuada`
  - Construtor: `TabuadaMultiplicacao(int numero)` e `TabuadaMultiplicacao(int numero, int maxMultiplicador)`

- Interface `ConversorTemperatura`
  - `double celsiusParaFahrenheit(double celsius)`
  - `double fahrenheitParaCelsius(double fahrenheit)`
- Classe `ConversorTemperaturaPadrao` implements `ConversorTemperatura`

- Interface `Calculavel`
  - `double calcularPrecoFinal()`
- `Livro` e `ProdutoFisico` implementam `Calculavel` (aplicam desconto/taxas conforme construtor)

- Interface `Vendavel`
  - `double calcularPrecoTotal(int quantidade)`
  - `double aplicarDesconto(double preco, double desconto)`
- `Produto` e `Servico` implementam `Vendavel` (lógica específica por tipo)

---

## Recomendação sobre valores monetários

Atualmente o projeto utiliza `double` por simplicidade. Para produção/precisão financeira, recomenda-se migrar para `BigDecimal` e aplicar regras de arredondamento (por exemplo `RoundingMode.HALF_EVEN`). Posso ajudar a fazer essa migração se desejar.

---

## Inclusão de screenshot

O repositório contém um espaço destinado ao screenshot: `docs/screenshot.png`.

- Se você já tiver a imagem do terminal executando o projeto, coloque o arquivo em `docs/screenshot.png` e rode os comandos:

```powershell
git add docs/screenshot.png
git commit -m "Add execution screenshot"
git push
```

- Para criar um screenshot do terminal no Windows rapidamente, procedimento sugerido:
  1. Execute o comando de execução recomendado acima: `chcp 65001; java -Dfile.encoding=UTF-8 -cp out Main`.
  2. Abra a Ferramenta de Captura (Snipping Tool) ou pressione `Win + Shift + S` para capturar a tela.
  3. Salve a imagem como `docs/screenshot.png` dentro do repositório.
  4. Use os comandos Git acima para enviar a imagem para o repositório.

Observação: por motivos de segurança eu não posso subir a imagem no seu repositório sem credenciais; se quiser eu posso instruir passo-a-passo ou, se você me fornecer a imagem via upload aqui, eu posso commitar e dar push por você (desde que haja autorização e credenciais apropriadas configuradas no ambiente).

---

## .gitignore sugerido

Conteúdo recomendado para `.gitignore` (adicione na raiz do projeto):

```
# build
out/

# IDE
.idea/
*.iml

# sistema
Thumbs.db
.DS_Store

# arquivos do usuário
*.log
```

Para aplicar: crie `.gitignore`, remova arquivos indesejados do índice (`git rm --cached <arquivos>`) e faça commit.

---

## Contribuição

- Fork the repo, faça suas alterações e envie um Pull Request.
- Antes de submeter mudanças, garanta que o código compile: `javac -d out src\*.java` e que os exemplos do `Main` rodem como esperado.

---

## Licença

Este projeto foi entregue como exercício; adicione a licença desejada (por exemplo MIT) se for abrir/compartilhar publicamente.

---

Se quiser, posso:
- adicionar o screenshot se você fizer upload da imagem aqui, e então eu commito e faço push;
- aplicar `.gitignore` e remover arquivos da IDE do histórico e empurrar as mudanças;
- migrar as representações monetárias para `BigDecimal`.

Diga qual ação prefere que eu execute em seguida.
