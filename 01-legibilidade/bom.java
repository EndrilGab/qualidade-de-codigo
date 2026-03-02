class CalculadoraDesconto {

    private static final double TAXA_DESCONTO_PADRAO = 0.10;

    double calcularValorFinal(double precoUnitario, int quantidade) {
        double valorTotal = precoUnitario * quantidade;
        double valorDesconto = valorTotal * TAXA_DESCONTO_PADRAO;
        return valorTotal - valorDesconto;
    }
}

class ExemploLegibilidadeBom {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double resultado = calculadora.calcularValorFinal(50.0, 3);
        System.out.println("Valor final: " + resultado);
    }
}
