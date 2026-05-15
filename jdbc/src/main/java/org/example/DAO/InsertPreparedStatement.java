package org.example.DAO;

import java.sql.*;

public class InsertPreparedStatement {

    private static Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/escola";
        String user = "root";
        String password = "admin";

        return DriverManager.getConnection(jdbcUrl, user, password);
    }

    private static void inserirAluno(Connection connection) throws SQLException {
        String insertSql = "INSERT INTO alunos (matricula, nome) VALUES (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

        preparedStatement.setString(1, "1234509876");
        preparedStatement.setString(2, "José da Silva");

        preparedStatement.executeUpdate();
        preparedStatement.close();

        System.out.println("Aluno inserido com sucesso!");
    }

    private static void listarAlunos(Connection connection) throws SQLException {
        String selectSql = "SELECT matricula, nome FROM alunos";

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectSql);

        System.out.println("\nLista de alunos:");

        while (rs.next()) {
            String matricula = rs.getString("matricula");
            String nome = rs.getString("nome");

            System.out.println("Matrícula: " + matricula + ", Nome: " + nome);
        }

        rs.close();
        stmt.close();
    }

    public static void main(String[] args) {

        try (Connection connection = getConnection()) {

            inserirAluno(connection);
            listarAlunos(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}