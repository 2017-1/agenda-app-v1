<%-- 
    Document   : contatos
    Created on : Sep 24, 2018, 7:33:21 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="nav.jsp" %>
          
         <div>
             <p>Nome do contato:${contact.name}</p>
             <p>Número do contato:${contact.phoneNumber}</p>
             <p>Rua do contato: ${contact.address.street}</p>
             <p>Número da casa do contato: ${contact.address.number}</p>
             <p>CEP do contato: ${contact.address.zipCode}</p>
         </div>
    </body>        
</html>
