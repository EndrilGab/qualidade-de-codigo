/**
 * Serviço responsável por aplicar juros simples em uma simulação financeira.
 */
class ServicoJuros {

    private static final double TAXA_JUROS_MENSAL = 0.05;

    /**
     * Aplica juros simples sobre o valor informado.
     *
     * @param valorPrincipal valor original da simulação
     * @return valor com acréscimo de juros de 5%
     */
    double aplicarJuros(double valorPrincipal) {
        return valorPrincipal * (1 + TAXA_JUROS_MENSAL);
    }
}

class ExemploDocumentacaoBom {
    public static void main(String[] args) {
        ServicoJuros servico = new ServicoJuros();
        System.out.println(servico.aplicarJuros(1000));
    }
}
