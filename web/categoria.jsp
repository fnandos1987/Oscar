<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Categorias de Premiação</title>
    </head>
    <body>
        <div align="center">
            <p>Lista de Categorias</p>
            <table border="1" style="border-collapse: collapse; width: 20%">                
                <tr style="background-color: #aaee88">
                    <th>Categoria</th>
                    <th>Descrição</th>                    
                    <th>Indicações</th>                    
                </tr>
                <c:forEach var="categoria" items="${categorias}" varStatus="id">
                    <tr style="background-color: #${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
                        <td>${categoria.catCodigo}</td>
                        <td>${categoria.descricao}</td>
                        <td><a href="action?act=ListarIndicacoes&catcodigo=${categoria.catCodigo}">listar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
