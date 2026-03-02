import java.util.regex.Pattern;

class CadastroUsuario {

    private static final Pattern EMAIL_VALIDO = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    void cadastrar(String email) {
        if (email == null || email.isBlank() || !EMAIL_VALIDO.matcher(email).matches()) {
            throw new IllegalArgumentException("E-mail inválido.");
        }

        System.out.println("Usuário cadastrado: " + email.trim().toLowerCase());
    }
}

class ExemploRobustezBom {
    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.cadastrar("Pessoa.Silva@Empresa.com");
    }
}
