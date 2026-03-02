interface RepositorioPagamento {
    void salvar(double valor);
}

class ServicoPagamento {

    private final RepositorioPagamento repositorio;

    ServicoPagamento(RepositorioPagamento repositorio) {
        this.repositorio = repositorio;
    }

    void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo.");
        }
        repositorio.salvar(valor);
    }
}

class ExemploTestabilidadeBom {
    public static void main(String[] args) {
        RepositorioPagamento repositorioMemoria = valor ->
                System.out.println("Pagamento salvo em memória: " + valor);

        ServicoPagamento servico = new ServicoPagamento(repositorioMemoria);
        servico.pagar(250.0);
    }
}
