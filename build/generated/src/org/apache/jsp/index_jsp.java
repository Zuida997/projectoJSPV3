package org.apache.jsp;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"Vista/assets/css/index2.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"Vista/assets/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <section class=\"login-block\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <!-- SECCION DE LOGIN -->\n");
      out.write("          <div class=\"login-sec\">\n");
      out.write("              <h2 class=\"text-center\">INGRESO</h2>\n");
      out.write("                <form class=\"login-form\" method=\"post\" action=\"#\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" class=\"text-uppercase\">Usuario</label>\n");
      out.write("                  <input type=\"text\" name=\"usuario\" class=\"form-control\" placeholder=\"\" size=\"30px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputPassword1\" class=\"text-uppercase\">Contraseña</label>\n");
      out.write("                  <input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-login float-right\">Ingresar</button>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"copy-text\">¿No tienes un cuenta? <a href=\"#\">Registrate aquí</a></div>\n");
      out.write("           </div>\n");
      out.write("           <!-- FIN SECCION DE login -->\n");
      out.write("           <!-- BANNER SLIDER -->\n");
      out.write("           <div class=\"banner-sec\">\n");
      out.write("             <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("               <ol class=\"carousel-indicators\">\n");
      out.write("                 <li data-target=\"#carouselExampleControls\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                 <li data-target=\"#carouselExampleControls\" data-slide-to=\"1\"></li>\n");
      out.write("                 <li data-target=\"#carouselExampleControls\" data-slide-to=\"2\"></li>\n");
      out.write("               </ol>\n");
      out.write("               <div class=\"carousel-inner\">\n");
      out.write("                 <div class=\"carousel-item active\">\n");
      out.write("                   <img class=\"d-flex w-100\" src=\"Vista/assets/img/img-1.jpg\" width=\"1000px\" alt=\"First slide\">\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"carousel-item\">\n");
      out.write("                   <img class=\"d-block w-100\" src=\"Vista/assets/img/img-2.jpg\" width=\"1000px\" alt=\"Second slide\">\n");
      out.write("                   <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                     <div class=\"banner-text\">\n");
      out.write("                       <h2>CABAÑA N°1</h2>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"carousel-item\">\n");
      out.write("                   <img class=\"d-block w-100\" src=\"Vista/assets/img/img-3.jpg\" alt=\"Third slide\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                       <div class=\"banner-text\">\n");
      out.write("                         <h2>CABAÑA N°2</h2>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                 <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                 <span class=\"sr-only\"></span>\n");
      out.write("               </a>\n");
      out.write("               <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                 <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                 <span class=\"sr-only\">Siguiente</span>\n");
      out.write("               </a>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("           <!-- FIN BANNER SLIDER -->\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      <script type=\"text/javascript\" src=\"Vista/assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"Vista/assets/js/bootstrap.min.js\"></script>\n");
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
