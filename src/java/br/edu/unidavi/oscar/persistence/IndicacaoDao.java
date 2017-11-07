/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unidavi.oscar.persistence;

import br.edu.unidavi.oscar.model.Categoria;
import br.edu.unidavi.oscar.model.Filme;
import br.edu.unidavi.oscar.model.Indicacao;
import br.edu.unidavi.oscar.model.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fernando.schwambach
 */
public class IndicacaoDao extends Dao implements IDao<Integer, Indicacao> {

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
    public Indicacao findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Indicacao> findAllByCategoria(Integer catCodigo) {
        ArrayList<Indicacao> array = new ArrayList<>();

        String sql = "select indicacao.ano,"
                + "          categoria.catcodigo,"
                + "          categoria.descricao,"
                + "          filme.filcodigo,"
                + "          filme.titulo," 
                + "          pessoa.pescodigo," 
                + "          pessoa.nome" 
                + "     from indicacao"
                + "     join categoria"
                + "       on categoria.catcodigo = indicacao.catcodigo"
                + "     join filme"
                + "       on filme.filcodigo = indicacao.filcodigo "
                + "     left join indicacaoelenco"
                + "       on indicacaoelenco.ano = indicacao.ano "
                + "      and indicacaoelenco.filcodigo = indicacao.filcodigo "
                + "      and indicacaoelenco.catcodigo = indicacao.catcodigo "
                + "     left join pessoa"
                + "       on pessoa.pescodigo = indicacaoelenco.pescodigo "
                + "    where indicacao.catcodigo = ? "
                + "    order by indicacao.filcodigo";
        try {
            ResultSet rs = super.getAllByQueryWithParameters(sql, catCodigo);
            while (rs.next()) {
                Categoria categoria = new Categoria(rs.getInt("catcodigo"), rs.getString("descricao"));
                Filme filme = new Filme(rs.getInt("filcodigo"), rs.getString("titulo"));
                Pessoa pessoa = new Pessoa(rs.getInt("pescodigo"), rs.getString("nome"));
                array.add(new Indicacao(rs.getShort("ano"), categoria, filme, pessoa));
            }
        } catch (SQLException ex) {
        }
        return array;
    }
}
