interface GeradorRelatorio {
    String tipo();

    void gerar();
}

class GeradorPdf implements GeradorRelatorio {
    @Override
    public String tipo() {
        return "PDF";
    }

    @Override
    public void gerar() {
        System.out.println("Gerando PDF");
    }
}

class GeradorCsv implements GeradorRelatorio {
    @Override
    public String tipo() {
        return "CSV";
    }

    @Override
    public void gerar() {
        System.out.println("Gerando CSV");
    }
}

class ServicoRelatorio {
    private final java.util.Map<String, GeradorRelatorio> geradores;

    ServicoRelatorio(java.util.List<GeradorRelatorio> geradoresDisponiveis) {
        this.geradores = new java.util.HashMap<>();
        for (GeradorRelatorio gerador : geradoresDisponiveis) {
            this.geradores.put(gerador.tipo(), gerador);
        }
    }

    void gerar(String tipo) {
        GeradorRelatorio gerador = geradores.get(tipo);
        if (gerador == null) {
            throw new IllegalArgumentException("Tipo não suportado: " + tipo);
        }
        gerador.gerar();
    }
}

class ExemploEscalabilidadeBom {
    public static void main(String[] args) {
        ServicoRelatorio servico = new ServicoRelatorio(java.util.List.of(new GeradorPdf(), new GeradorCsv()));
        servico.gerar("PDF");
    }
}
