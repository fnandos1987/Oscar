/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unidavi.oscar.persistence;

import br.edu.unidavi.oscar.model.Elenco;
import br.edu.unidavi.oscar.model.Filme;
import br.edu.unidavi.oscar.model.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fernando.schwambach
 */
public class ElencoDao extends Dao implements IDao<Elenco>{

    @Override
    public void save(Elenco entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Elenco entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Elenco entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Elenco> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Elenco findById(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Elenco> findAllByFilme(Integer filCodigo) {
        ArrayList<Elenco> array = new ArrayList<>();

        String sql = "select filme.filcodigo,"
                + "          filme.titulo," 
                + "          pessoa.pescodigo," 
                + "          pessoa.nome" 
                + "     from elenco"
                + "     join filme"
                + "       on filme.filcodigo = elenco.filcodigo "                
                + "     join pessoa"
                + "       on pessoa.pescodigo = elenco.pescodigo "
                + "    where elenco.filcodigo = ? "
                + "    order by pessoa.pescodigo";
        try {
            ResultSet rs = super.getAllByQueryWithParameters(sql, filCodigo);
            while (rs.next()) {
                Filme filme = new Filme(rs.getInt("filcodigo"), rs.getString("titulo"));
                Pessoa pessoa = new Pessoa(rs.getInt("pescodigo"), rs.getString("nome"));
                array.add(new Elenco(pessoa, filme));
            }
        } catch (SQLException ex) {
        }
        return array;
    }
    
}