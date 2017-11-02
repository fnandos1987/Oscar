package br.edu.unidavi.oscar.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoTeste {

    public static void main(String[] args) {
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement("select coalesce(max(catcodigo), 0) + 1 as sequence from categoria");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Sequence: " + rs.getInt("sequence"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
