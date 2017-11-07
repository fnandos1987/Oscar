/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unidavi.oscar.controller;

import br.edu.unidavi.oscar.persistence.PessoaDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.schwambach
 */
public class DetalharPessoa implements IAction{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Integer pesCodigo = Integer.parseInt(req.getParameter("pescodigo"));

        req.setAttribute("pessoa", new PessoaDao().findById(pesCodigo));
        
        return "detalhePessoa.jsp";
    }    
}