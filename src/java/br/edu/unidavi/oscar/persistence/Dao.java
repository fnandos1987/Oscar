package br.edu.unidavi.oscar.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.unidavi.oscar.util.Conexao;

public class Dao {

    private Connection connection;

    protected Dao() {
        this.connection = Conexao.getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void execute(String sql, Object... parametros) {
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(sql);

            for (int i = 1; i <= parametros.length; i++) {
                pstmt.setObject(i, parametros[i]);
            }

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected int getSequence(String table, String column) {
        try {
            String sql = "select coalesce(max(" + column + ")) + 1 as sequence from from " + table;
            PreparedStatement pstmt = getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return rs.getInt("sequence");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    protected ResultSet getAllByQuery(String sql) {
        ResultSet resul = null;
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(sql);
            resul = pstmt.executeQuery();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resul;
    }
}
