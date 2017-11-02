/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unidavi.oscar.persistence;

import br.edu.unidavi.oscar.model.Categoria;
import br.edu.unidavi.oscar.model.Filme;
import br.edu.unidavi.oscar.model.Indicacao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author fernando.schwambach
 */
public class IndicacaoDao extends Dao implements IDao<Indicacao>{

    @Override
    public void save(Indicacao entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Indicacao entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Indicacao entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Indicacao> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Indicacao findById(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Indicacao> findAllByCategoria(Integer catCodigo) {
        ArrayList<Indicacao> array = new ArrayList<>();

        String sql = "select categoria.catcodigo," +
                     "       categoria.descricao," +
                     "       filme.filcodigo," +
                     "       filme.titulo" +
                     "  from indicacao" +
                     "  join categoria" +
                     "    on categoria.catcodigo = indicacao.catcodigo" +
                     "  join filme" +
                     "    on filme.filcodigo = indicacao.filcodigo " +
                     " where indicacao.catcodigo = ?";        
        try {           
            ResultSet rs = super.getAllByQueryWithParameters(sql, catCodigo);
            if (rs instanceof ResultSet) {
                while (rs.next()) {
                    Categoria categoria = new Categoria(rs.getInt("catcodigo"), rs.getString("descricao"));
                    Filme filme = new Filme(rs.getInt("filcodigo"), rs.getString("titulo"));                    
                    array.add(new Indicacao(categoria, filme));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return array;        
    }    
}
