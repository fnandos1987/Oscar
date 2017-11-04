<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Filmes</title>
    </head>
    <body>
        <div align="center">
            <p>Filmes</p>
            <table border="1" style="border-collapse: collapse; min-width: 80%">                
                <tr style="background-color: #aaee88">
                    <th>Filme</th>                    
                    <th>Título</th>                    
                    <th>Gênero</th>                    
                    <th>Pais Origem</th>                    
                    <th>Estreia</th>                    
                    <th>Duração (min)</th>                    
                    <th>Sinopse</th>                    
                    <th>Elenco</th>                    
                </tr>
                <c:forEach var="filme" items="${filmes}" varStatus="id">
                    <tr style="background-color: #${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
                        <td>${filme.filCodigo}</td>
                        <td>${filme.titulo}</td>
                        <td>${filme.descricaoGenero}</td>                        
                        <td>${filme.paisOrigem}</td>                        
                        <td><fmt:formatDate value="${filme.estreia}" pattern="dd/MM/yyyy"/></td>                        
                        <td>${filme.duracao}</td>                        
                        <td style="width: 500px">${filme.sinopse}</td>                                                
                        <td><a href="action?act=DetalharElenco&filcodigo=${filme.filCodigo}">listar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
