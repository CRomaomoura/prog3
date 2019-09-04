/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import romao.domain.FormsIns;

/**
 *
 * @author romao
 */
@WebServlet("/cadastro")
public class HttpServerFormulario extends HttpServlet {

    private static final long serialVersionUID = 1L;

  @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String sexo = req.getParameter("sexo");
        String select = req.getParameter("select");
        String[] cursos = req.getParameterValues("cursos");

        FormsIns forms = new FormsIns();
        forms.setNome(nome);
        forms.setEmail(email);
        forms.setSexo(sexo);
        forms.setSelect(select);
        forms.setCursos(cursos);
   
        ServletContext context = getServletContext();
        context.setAttribute("forms", forms);
        resp.sendRedirect("FormInscricao.jsp");      
    }    
}
