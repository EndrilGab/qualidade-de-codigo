record Pedido(int id, String clienteEmail, double valor) {}

interface RepositorioPedido {
    void salvar(Pedido pedido);
}

interface ServicoEmail {
    void enviarConfirmacao(Pedido pedido);
}

interface GeradorNotaFiscal {
    void gerar(Pedido pedido);
}

class ProcessadorPedido {

    private final RepositorioPedido repositorio;
    private final ServicoEmail servicoEmail;
    private final GeradorNotaFiscal geradorNota;

    ProcessadorPedido(
            RepositorioPedido repositorio,
            ServicoEmail servicoEmail,
            GeradorNotaFiscal geradorNota) {
        this.repositorio = repositorio;
        this.servicoEmail = servicoEmail;
        this.geradorNota = geradorNota;
    }

    void processar(Pedido pedido) {
        repositorio.salvar(pedido);
        geradorNota.gerar(pedido);
        servicoEmail.enviarConfirmacao(pedido);
    }
}

class ExemploManutenibilidadeBom {
    public static void main(String[] args) {
        RepositorioPedido repositorio = pedido -> System.out.println("Pedido salvo: " + pedido.id());
        ServicoEmail email = pedido -> System.out.println("E-mail enviado para: " + pedido.clienteEmail());
        GeradorNotaFiscal nota = pedido -> System.out.println("Nota fiscal gerada para valor: " + pedido.valor());

        ProcessadorPedido processador = new ProcessadorPedido(repositorio, email, nota);
        processador.processar(new Pedido(101, "cliente@empresa.com", 899.90));
    }
}
