/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agendaapp.servlets;

import br.edu.fjn.agendaapp.domain.Contato;
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
public class ContatoServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
       
        String name = req.getParameter("name");
        String phoneNumber = req.getParameter("phoneNumber");
        
        Contato contact = new Contato(name, phoneNumber);
        
        req.setAttribute("contact", contact);
        req.getRequestDispatcher("contatos.jsp")
                .forward(req, resp);
        
//      ServletContext ctx = getServletContext();
//      ctx.setAttribute("contact", contact);
        
//      resp.sendRedirect("contatos.jsp");
    }
    
    
    
}
