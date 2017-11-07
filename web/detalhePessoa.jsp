<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhe de Pessoa</title>
    </head>
    <style>
        .tableDetalhePessoa{
            border: solid 1px black;
            border-collapse: collapse;
        }

        .tableDetalhePessoa td{
            border: solid 1px black;            
        }

        .tableDetalhePessoa tr:nth-child(odd) {
            background: #aaee88;
        }

        .label{
            width: 140px;
        }

        .valor{
            width: 200px;
        }
    </style>
    <body>
        <div align="center">
            <c:set var="pessoa" scope="request" value="${pessoa}"/>
            <table class="tableDetalhePessoa">
                <tr>
                    <td class="label">Pessoa:</td>
                    <td class="valor">${pessoa.pesCodigo}</td>
                </tr>
                <tr>
                    <td class="label">Nome</td>
                    <td class="valor">${pessoa.nome}</td>
                </tr>
                <tr>
                    <td class="label">Anos de Carreira:</td>
                    <td class="valor">${pessoa.anosCarreira}</td>
                </tr>
                <tr>
                    <td class="label">Nomeações:</td>
                    <td class="valor">${pessoa.nomeacoes}</td>
                </tr>
                <tr>
                    <td class="label">Conquistas:</td>
                    <td class="valor">${pessoa.conquistas}</td>
                </tr>
            </table>
        </div>
    </body>
</html>
