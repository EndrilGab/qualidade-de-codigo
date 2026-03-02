class Funcionario {

    private final String nome;
    private final double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String getNome() {
        return nome;
    }

    double getSalario() {
        return salario;
    }
}

class ExemploPadronizacaoBom {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 4500);
        System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
    }
}
