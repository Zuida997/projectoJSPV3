package org.apache.jsp.Vista.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/catalogo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.min.css\">\r\n");
      out.write("        <title>Bienvenido al Catalogo</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      <!-- header -->\r\n");
      out.write("      <div class=\"container-fluid header\">\r\n");
      out.write("        <header>\r\n");
      out.write("          CATALOGO DE CABAÑAS\r\n");
      out.write("          <p>Bienvenido Usuario</p>\r\n");
      out.write("        </header>\r\n");
      out.write("      </div>\r\n");
      out.write("  <!-- end header -->\r\n");
      out.write("\r\n");
      out.write("  <!-- content -->\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"content row\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <img src=\"../assets/img/cabana-2.jpg\" alt=\"imagen1\" width=\"850px\">\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n");
      out.write("              <br><br><a type=\"button\" name=\"button\" class=\"btn btn-success\" href=\"#\">Arrendar</a>\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n");
      out.write("              <br><br><a type=\"button\" name=\"button\" class=\"btn btn-success\" href=\"#\">Arrendar</a>\r\n");
      out.write("            </p>\r\n");
      out.write("            <img src=\"../assets/img/img-2.jpg\" alt=\"imagen2\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <img src=\"../assets/img/img-3.jpg\" alt=\"imagen3\">\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n");
      out.write("              <br><br><a type=\"button\" name=\"button\" class=\"btn btn-success\" href=\"#\">Arrendar</a>\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("   <!-- footer -->\r\n");
      out.write("      <footer>©2019</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
