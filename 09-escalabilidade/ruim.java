class RelatorioRuim {

    void gerar(String tipo) {
        if ("PDF".equals(tipo)) {
            System.out.println("Gerando PDF");
        } else if ("CSV".equals(tipo)) {
            System.out.println("Gerando CSV");
        } else {
            throw new IllegalArgumentException("Tipo não suportado");
        }
    }
}
