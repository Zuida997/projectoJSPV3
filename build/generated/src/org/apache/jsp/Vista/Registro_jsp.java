package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/StyleRegistro.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"ContenedorR\">\n");
      out.write("            <form class=\"FormR\" action=\"index.html\" method=\"post\">\n");
      out.write("                <label for=\"\">rut</label><br>\n");
      out.write("                <input type=\"text\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">nombre</label><br>\n");
      out.write("                <input type=\"text\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">apellido</label><br>\n");
      out.write("                <input type=\"text\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">fecha de Nacimiento</label><br>\n");
      out.write("                <input type=\"date\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">Domicilio</label><br>\n");
      out.write("                <input type=\"text\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">Renta Liquida</label><br>\n");
      out.write("                <input type=\"text\" name=\"\" value=\"\"><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"\">¿tiene familia?</label><br>\n");
      out.write("                <select class=\"\" name=\"\">\n");
      out.write("                    <option value=\"\">si</option>\n");
      out.write("                    <option value=\"\">no</option>\n");
      out.write("                </select>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
