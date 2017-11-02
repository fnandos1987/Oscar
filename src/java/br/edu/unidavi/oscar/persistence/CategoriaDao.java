package br.edu.unidavi.oscar.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.unidavi.oscar.model.Categoria;

public class CategoriaDao extends Dao implements IDao<Categoria> {

    public void save(Categoria entity) {
        entity.setCatCodigo(getSequence("CATEGORIA", "catcodigo"));
        String sql = "insert into categoria(catcodigo, descricao) values (?,?)";
        execute(sql, entity.getCatCodigo(), entity.getDescricao());
    }

    public void update(Categoria entity) {
        String sql = "update categoria set descricao = ? where catcodigo = ?";
        execute(sql, entity.getDescricao(), entity.getCatCodigo());
    }

    public void delete(Categoria entity) {
        String sql = "delete from categoria where catcodigo = ?";
        execute(sql, entity.getCatCodigo());

    }

    public ArrayList<Categoria> findAll() {
        ArrayList<Categoria> array = new ArrayList<Categoria>();

        try {
            String query = "select * from categoria";
            ResultSet rs = getAllByQuery(query);
            if (rs instanceof ResultSet) {
                while (rs.next()) {
                    array.add(new Categoria(rs.getInt("catcodigo"), rs.getString("descricao")));

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return array;
    }

    public Categoria findById(Object object) {
        // TODO Auto-generated method stub
        return null;
    }
}
