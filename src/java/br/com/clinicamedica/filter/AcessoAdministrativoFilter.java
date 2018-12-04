package br.com.clinicamedica.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.PerfilDeAcesso;
import model.Usuario;

public class AcessoAdministrativoFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession sessaoUsuario = ((HttpServletRequest) request).getSession();
        Usuario usuario = (Usuario) sessaoUsuario.getAttribute("usuarioAutenticado");
        
        if(usuario != null && usuario.getPerfil().equals(PerfilDeAcesso.ADMINISTRADOR)){
            chain.doFilter(request, response);
        }else{
            ((HttpServletResponse) response).sendRedirect("../index.jsp");
        }
    }

    @Override
    public void destroy() {
       
    }
    
}
