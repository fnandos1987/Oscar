<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Categorias de Premiação</title>
    </head>
    <body>
        <div align="center">
            <P>Lista de Categorias</P>
            <jsp:useBean id="dao" class="br.edu.unidavi.oscar.persistence.CategoriaDao"/>
            <table border="1">                
                <c:forEach var="categoria" items="${dao.findAll()}">
                    <tr>
                        <td>${categoria.catCodigo}</td>
                        <td>${categoria.descricao}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <a href="index.jsp">Voltar</a>

    </body>
</html>
