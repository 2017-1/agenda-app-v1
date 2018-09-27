/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agendaapp.servlets;

import br.edu.fjn.agendaapp.domain.Address;
import br.edu.fjn.agendaapp.domain.Contact;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leonardo
 */
@WebServlet(urlPatterns = "/contato.do")
public class ContatoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String phoneNumber = req.getParameter("phoneNumber");

        String street = req.getParameter("street");
        String number = req.getParameter("number");
        String zipCode = req.getParameter("zipCode");

        Address address = new Address(street, number, zipCode);
        Contact contact = new Contact(name, phoneNumber, address);

        ServletContext ctx = getServletContext();
        ctx.setAttribute("contact", contact);
//        
        resp.sendRedirect("contatos.jsp");
    }

}
