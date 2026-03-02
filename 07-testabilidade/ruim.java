class BancoDados {
    void salvarPagamento() {
        System.out.println("Pagamento salvo");
    }
}

class ServicoPagamentoRuim {

    void pagar() {
        BancoDados bancoDados = new BancoDados();
        bancoDados.salvarPagamento();
    }
}
