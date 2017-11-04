<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhe do Elenco</title>
    </head>
    <body>
       <div align="center">
            <p>Elenco</p>
            <table border="1" style="border-collapse: collapse; min-width: 60%">                
                <tr style="background-color: #aaee88">                    
                    <th>Filme</th>                    
                    <th>Pessoa</th>                    
                    <th>Nome</th>                    
                </tr>
                <c:forEach var="elenco" items="${elenco}" varStatus="id">
                    <tr style="background-color: #${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
                        <td>${elenco.filme.titulo}</td>                        
                        <td>${elenco.pessoa.pesCodigo}</td>                        
                        <td>${elenco.pessoa.nome}</td>                        
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
