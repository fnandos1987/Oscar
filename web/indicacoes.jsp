<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Indicações</title>
    </head>
    <body>
        <div align="center">
            <p>Indicações</p>
            <table border="1" style="border-collapse: collapse; min-width: 60%">                
                <tr style="background-color: #aaee88">
                    <th>Categoria</th>
                    <th>Filme</th>                    
                    <th>Titulo</th>                    
                    <th>Indicado</th>                    
                    <th>Detalhe Indicado</th>                    
                </tr>
                <c:forEach var="indicacao" items="${indicacoes}" varStatus="id">
                    <tr style="background-color: #${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
                        <td>${indicacao.categoria.descricao}</td>
                        <td>${indicacao.filme.filCodigo}</td>
                        <td>${indicacao.filme.titulo}</td>                        
                        <td>${indicacao.pessoa.nome}</td>                        
                        <td>
                            <c:if test="${indicacao.pessoa.pesCodigo != ''}">
                                <a href="action?act=DetalharPessoa&pescodigo=${indicacao.pessoa.pesCodigo}">visualizar</a>                            
                            </c:if>
                        </td>                        
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
