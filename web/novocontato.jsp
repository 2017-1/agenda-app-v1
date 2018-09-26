<%-- 
    Document   : novocontato
    Created on : Sep 24, 2018, 7:04:49 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Contato</title>
    </head>
    <body>
        <%@include file="nav.jsp"%>
        <form action="contato.do" method="post">
            <div>
                <label>Nome:</label>
                <input type="text" name="name"/>                
            </div>
            <div>
                <label>Telefone:</label>
                <input type="text" name="phoneNumber" />
            </div>
            <button type="submit">Salvar</button>                
        </form>
    </body>
</html>
