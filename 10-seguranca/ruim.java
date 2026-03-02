class LoginSqlRuim {
    String montarQuery(String login, String senha) {
        return "SELECT * FROM usuarios WHERE login = '" + login + "' AND senha = '" + senha + "'";
    }
}
