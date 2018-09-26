<%-- 
    Document   : contatos
    Created on : Sep 24, 2018, 7:33:21 PM
    Author     : leonardo
--%>

<%@page import="br.edu.fjn.agendaapp.domain.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="nav.jsp" %>
        <% 
//             Contato contato = (Contato) application.getAttribute("contact");
               Contato contato = (Contato) request.getAttribute("contact");
         %>
         
         <div>
             <p>Nome do contato: <%=contato.getName()%></p>
             <p>Número do contato: <%=contato.getPhoneNumber()%></p>
         </div>
    </body>
</html>
