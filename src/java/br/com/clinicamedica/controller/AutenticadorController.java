package br.com.clinicamedica.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "autenticador", urlPatterns = {"/autenticador"})
public class AutenticadorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession PC_sessao = request.getSession(false);

            if (PC_sessao == null) {
                response.sendRedirect("index.jsp");
                return;
            }
            PC_sessao.removeAttribute("Login");
            /* recupera e valida as credenciais do usuário */
            String usr = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            
            if ("admin".equals(usr) && "admin".equals(senha)) {
                PC_sessao.setAttribute("Login", usr);
                response.sendRedirect("adminpages/index.jsp");
            } else {
                /* se a autenticação falhar, coloca uma mensagem na sessão e redireciona para índex */
                PC_sessao.setAttribute("mensagem", "Erro na autenticação");
                response.sendRedirect("index.jsp");
            }
    

        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
            response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
