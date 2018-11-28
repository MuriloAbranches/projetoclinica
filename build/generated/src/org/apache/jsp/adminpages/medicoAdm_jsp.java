package org.apache.jsp.adminpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.clinicamedica.model.Especialidade;
import java.util.ArrayList;
import java.util.List;
import br.com.clinicamedica.model.Medico;

public final class medicoAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Clínica Médica - Médicos</title>\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/logo1.png\" >\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"../adminpages/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Add custom CSS here -->\n");
      out.write("        <link href=\"../adminpages/css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../adminpages/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Page Specific CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("         ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Clínica Médica</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                        <li><a href=\"../adminpages/index.jsp\"><i class=\"fa fa-dashboard\"></i> Inicio</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"../administrativo/medicos\"><i class=\"fa fa-edit\"></i> Médicos</a></li>\n");
      out.write("                        <li><a href=\"../administrativo/pacientes\"><i class=\"fa fa-edit\"></i> Pacientes</a></li>\n");
      out.write("                        <li><a href=\"../administrativo/consultas\"><i class=\"fa fa-edit\"></i> Agendamentos</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <!--Mensagens -->\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("                        <li class=\"dropdown user-dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> ");
      out.print( PC_login );
      out.write(" <b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Perfil</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> Inbox</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Sair</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1>Médicos</h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"../adminpages/index.jsp\"><i class=\"fa fa-dashboard\"></i> Inicio</a></li>\n");
      out.write("                            <li class=\"active\"><i class=\"fa fa-edit\"></i> Médicos</li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- /.row -->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        List<Medico> medicos = (ArrayList<Medico>) request.getAttribute("listaMedicos");
                        List<Especialidade> especialidades = (ArrayList<Especialidade>) request.getAttribute("listaEspecialidades");
                    
      out.write("\n");
      out.write("                    <div class=\"col-lg-6\"> <!--12-->\n");
      out.write("                        <h2>Médico</h2>      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <form method=\"POST\" action=\"../medico\"> \n");
      out.write("                                <label>Nome Completo:\n");
      out.write("                                    <input name=\"nomeCompleto\" type=\"text\" id=\"nomeCompleto\" size=\"60\" maxlength=\"150\" class=\"form-control\"/></label><br />\n");
      out.write("                                <label>CPF:\n");
      out.write("                                    <input name=\"cpf\" type=\"text\" id=\"cpf\" size=\"25\"  maxlength=\"11\" class=\"form-control\"/></label>\n");
      out.write("                                <label>RG:\n");
      out.write("                                    <input name=\"rg\" type=\"text\" id=\"rg\" size=\"26\" class=\"form-control\" /></label><br />\n");
      out.write("                                <label>CRM:\n");
      out.write("                                    <input name=\"crm\" type=\"text\" id=\"crm\" size=\"25\"  maxlength=\"20\" class=\"form-control\"/></label><br /><br />\n");
      out.write("                                <label>Especialidade:</label><br>\n");
      out.write("                                <select class=\"form-control\" name=\"especialidades\">\n");
      out.write("                                    ");

                                        for (Especialidade especialidade : especialidades) {
                                    
      out.write(" \n");
      out.write("                                    <option value=\"");
      out.print( especialidade.getId());
      out.write("\" >");
      out.print( especialidade.getNome());
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select><br /><br />  \n");
      out.write("                                <label>Contato:</label><br />\n");
      out.write("                                <label>DDD:\n");
      out.write("                                    <input name=\"ddd\" type=\"tel\" id=\"ddd\" size=\"1\" maxlength=\"2\"  class=\"form-control\" /></label> \n");
      out.write("                                <label>Telefone:\n");
      out.write("                                    <input name=\"telefone\" type=\"tel\" id=\"telefone\" size=\"17\" maxlength=\"9\"  class=\"form-control\" /></label><br /> \n");
      out.write("                                <label>Email:\n");
      out.write("                                    <input name=\"email\" type=\"email\" id=\"email\" size=\"60\" maxlength=\"50\" class=\"form-control\"/></label><br />\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Endereço:</label><br />\n");
      out.write("                                    <label>CEP:\n");
      out.write("                                        <input name=\"cep\" type=\"text\" id=\"cep\" value=\"\" size=\"10\" maxlength=\"9\" class=\"form-control\" /></label><br />\n");
      out.write("                                    <label>Rua:\n");
      out.write("                                        <input name=\"logradouro\" type=\"text\" id=\"logradouro\" size=\"60\" class=\"form-control\"/></label><br />\n");
      out.write("                                    <label>Número:\n");
      out.write("                                        <input name=\"numero\" type=\"text\" id=\"numero\" size=\"8\"  class=\"form-control\"/></label>\n");
      out.write("                                    <label>Bairro:\n");
      out.write("                                        <input name=\"bairro\" type=\"text\" id=\"bairro\" size=\"43\" class=\"form-control\" /></label><br />\n");
      out.write("                                    <label>Cidade:\n");
      out.write("                                        <input name=\"cidade\" type=\"text\" id=\"cidade\" size=\"49\"  class=\"form-control\" /></label> \n");
      out.write("                                    <label>Estado:\n");
      out.write("                                        <input name=\"estado\" type=\"text\" id=\"estado\" size=\"2\"  class=\"form-control\"/></label><br />\n");
      out.write("                                </div>\n");
      out.write("                                <div  class=\"form-action\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\" name=\"opcao\" value=\"salvar\">Salvar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!---------------------------------->\n");
      out.write("                    <div class=\"col-lg-6\"> <!--12-->\n");
      out.write("                        <h2>Consultar Médicos</h2>\n");
      out.write("                        <form method=\"POST\" action=\"../medico\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Buscar por CRM:\n");
      out.write("                                    <input name=\"crmBusca\" type=\"text\" id=\"crmBusca\" size=\"10\" maxlength=\"11\" class=\"form-control\" /></label>\n");
      out.write("                                <button type=\"submit\" name=\"opcao\" value=\"buscar\" class=\"btn btn-default>\"><i class=\"fa fa-search\"></i> Buscar</button><br />\n");
      out.write("                                <h4>Lista de Médicos</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-hover table-striped tablesorter\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Nome</th>\n");
      out.write("                                                <th>CRM</th>\n");
      out.write("                                                <th>Especialidade</th>\n");
      out.write("                                                <th>Telefone</th>\n");
      out.write("                                                <th>Email</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");

                                                for (Medico medico : medicos) {
                                            
      out.write("     \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.print( medico.getNomeCompleto());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( medico.getCrm());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( medico.getEspecialidade().getNome());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( medico.getContato().getTelefone().getDdd());
      out.write('-');
      out.print( medico.getContato().getTelefone().getNumero());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( medico.getContato().getEmail());
      out.write("</td>\n");
      out.write("                                            </tr>   \n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div><!-- /.row -->\n");
      out.write("\n");
      out.write("            </div><!-- /#page-wrapper -->\n");
      out.write("        </div><!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- JavaScript -->\n");
      out.write("        <script src=\"../adminpages/js/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page Specific Plugins -->\n");
      out.write("        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("        <script src=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/morris/chart-data-morris.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/tablesorter/jquery.tablesorter.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/tablesorter/tables.js\"></script>\n");
      out.write("        <!--[if lte IE 8]><script src=\"js/excanvas.min.js\"></script><![endif]-->\n");
      out.write("        <script src=\"../adminpages/js/flot/jquery.flot.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/flot/jquery.flot.tooltip.min.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/flot/jquery.flot.pie.js\"></script>\n");
      out.write("        <script src=\"../adminpages/js/flot/chart-data-flot.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
