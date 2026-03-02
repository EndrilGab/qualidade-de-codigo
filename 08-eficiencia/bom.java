import java.util.HashSet;
import java.util.Set;

class BuscaEficiente {
    boolean contem(int[] numeros, int valor) {
        Set<Integer> conjunto = new HashSet<>();
        for (int numero : numeros) {
            conjunto.add(numero);
        }
        return conjunto.contains(valor);
    }
}

class ExemploEficienciaBom {
    public static void main(String[] args) {
        int[] dados = {4, 8, 15, 16, 23, 42};
        System.out.println(new BuscaEficiente().contem(dados, 23));
    }
}
