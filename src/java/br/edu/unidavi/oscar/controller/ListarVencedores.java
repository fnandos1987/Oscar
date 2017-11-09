package br.edu.unidavi.oscar.controller;

import br.edu.unidavi.oscar.persistence.VencedorDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.schwambach
 */
public class ListarVencedores implements IAction{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
        req.setAttribute("vencedores", new VencedorDao().findAll());
        return "listaVencedores.jsp";
    }    
}