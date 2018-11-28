package org.apache.jsp.adminpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Clínica Médica - Administrativo</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/logo1.png\" >\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Add custom CSS here -->\r\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Page Specific CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            String PC_login = null;
            HttpSession PC_sessao = request.getSession(false);
            if (PC_sessao != null) {

                PC_login = (String) PC_sessao.getAttribute("Login");
                if (PC_login == null) {
                    PC_sessao.setAttribute("mensagem", "Acesso proibido sem login!");
                    response.sendRedirect("index.html");
                }
            } else {
                PC_sessao.removeAttribute("mensagem");
                PC_sessao.removeAttribute("Login");
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Clínica Médica</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav side-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\"><i class=\"fa fa-dashboard\"></i> Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"../administrativo/medicos\"><i class=\"fa fa-edit\"></i> Médicos</a></li>\r\n");
      out.write("                        <li><a href=\"../administrativo/pacientes\"><i class=\"fa fa-edit\"></i> Pacientes</a></li>\r\n");
      out.write("                        <li><a href=\"../administrativo/consultas\"><i class=\"fa fa-edit\"></i> Agendamentos</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Mensagens-->\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right navbar-user\">\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown user-dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> ");
      out.print( PC_login );
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Perfil</a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> Inbox</a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"../index.html\"><i class=\"fa fa-power-off\"></i> Sair</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!-- /.navbar-collapse -->\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <h1>Administrativo</h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"active\"><i class=\"fa fa-dashboard\"></i> Inicio</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"panel panel-info\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <i class=\"fa fa-medkit fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"../administrativo/medicos\">\r\n");
      out.write("                                <div class=\"panel-footer announcement-bottom\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-xs-6\">\r\n");
      out.write("                                            Médicos\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                            <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"panel panel-warning\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <i class=\"fa fa-user fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"../administrativo/pacientes\">\r\n");
      out.write("                                <div class=\"panel-footer announcement-bottom\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-xs-6\">\r\n");
      out.write("                                            Pacientes\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                            <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"panel panel-danger\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <i class=\"fa fa-hospital-o fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"../administrativo/consultas\">\r\n");
      out.write("                                <div class=\"panel-footer announcement-bottom\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-xs-6\">\r\n");
      out.write("                                            Agendamentos\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                            <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div><!-- /.row -->                \r\n");
      out.write("            </div><!-- /#page-wrapper -->\r\n");
      out.write("        </div><!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScript -->\r\n");
      out.write("        <script src=\"js/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Specific Plugins -->\r\n");
      out.write("        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\r\n");
      out.write("        <script src=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.js\"></script>\r\n");
      out.write("        <script src=\"js/morris/chart-data-morris.js\"></script>\r\n");
      out.write("        <script src=\"js/tablesorter/jquery.tablesorter.js\"></script>\r\n");
      out.write("        <script src=\"js/tablesorter/tables.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
