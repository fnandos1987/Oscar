package br.edu.unidavi.oscar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexao {

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/oscar", "postgres", "postgres");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
