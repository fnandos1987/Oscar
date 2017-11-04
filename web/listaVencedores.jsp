<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Vencedores</title>
    </head>
    <body>
       <div align="center">
            <p>Vencedores</p>
            <table border="1" style="border-collapse: collapse; min-width: 60%">                
                <tr style="background-color: #aaee88">
                    <th>Ano</th>
                    <th>Categoria</th>
                    <th>Filme</th>                    
                    <th>Titulo</th>                    
                    <th>Indicado</th>                    
                </tr>
                <c:forEach var="vencedor" items="${vencedores}" varStatus="id">
                    <tr style="background-color: #${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
                        <td>${vencedor.ano}</td>
                        <td>${vencedor.categoria.descricao}</td>
                        <td>${vencedor.filme.filCodigo}</td>
                        <td>${vencedor.filme.titulo}</td>                        
                        <td>${vencedor.pessoa.nome}</td>                        
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
