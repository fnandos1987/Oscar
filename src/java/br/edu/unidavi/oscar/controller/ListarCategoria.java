package br.edu.unidavi.oscar.controller;

import br.edu.unidavi.oscar.model.Categoria;
import br.edu.unidavi.oscar.persistence.CategoriaDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.schwambach
 */
public class ListarCategoria implements IAction {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
        ArrayList<Categoria> lista = new CategoriaDao().findAll();

        req.setAttribute("categorias", lista);

        return "categoria.jsp";
    }
}
