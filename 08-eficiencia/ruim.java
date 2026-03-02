class BuscaRuim {
    boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}
