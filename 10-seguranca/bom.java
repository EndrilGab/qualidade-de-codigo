class LoginSqlSeguro {
    String sql() {
        return "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
    }

    void exemploUso(java.sql.Connection conexao, String login, String senha) throws java.sql.SQLException {
        String sql = sql();
        java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, login);
        stmt.setString(2, senha);
        stmt.executeQuery();
        stmt.close();
    }
}
