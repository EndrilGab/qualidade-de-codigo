interface CalculadoraImposto {
    double calcular(double valorBase);
}

class ImpostoPadrao implements CalculadoraImposto {

    private static final double ALIQUOTA = 0.15;

    @Override
    public double calcular(double valorBase) {
        return valorBase * ALIQUOTA;
    }
}

class Pedido {
    private final CalculadoraImposto calculadoraImposto;

    Pedido(CalculadoraImposto calculadoraImposto) {
        this.calculadoraImposto = calculadoraImposto;
    }

    double calcularImposto(double subtotal) {
        return calculadoraImposto.calcular(subtotal);
    }
}

class ExemploReutilizacaoBom {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new ImpostoPadrao());
        System.out.println("Imposto: " + pedido.calcularImposto(200));
    }
}
