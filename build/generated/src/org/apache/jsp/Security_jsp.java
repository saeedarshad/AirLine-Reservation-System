package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

public final class Security_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Security Code Confirmation\n");
      out.write("        </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: dimgray\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <!-- logo-->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MainNavBar\" >\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"Home.html\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--menu-item-->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"MainNavBar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li ><a href=\"Home.html\">Home</a></li>\n");
      out.write("                        <li ><a href=\"Contact%20US.html\">Contact Us</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("\n");
      out.write("                        <li ><a href=\"HR%20Login.html\">Login</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"Register.jsp\">Register</a></li>\n");
      out.write("                        <!-- <li><a href=\"#\">Logout</a></li>-->\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"modal-dialog\" >\n");
      out.write("            <div class=\"loginmodal-container\" style=\"background-color:whitesmoke\">\n");
      out.write("                <h1>Please Check Your Email for Security Code!!</h1><br>\n");
      out.write("                <form method=\"POST\" action=\"security1\">\n");
      out.write("                    <div style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("                    UserName:\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"user\" placeholder=\"Username\" >\n");
      out.write("                    Security Code:<br/>\n");
      out.write("                    <input  type=\"password\" name=\"pwd\" placeholder=\"Security Code\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"confirm\"  style=\"height: 50px\" class=\"btn btn-primary\"   value=\"Confrim\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <!-- FOOTER -->\n");
      out.write("            <footer>\n");
      out.write("\n");
      out.write("                <p style=\"color:#dddddd\">© 2017 Company, Inc. · <a style=\"color:#dddddd\" href=\"#\">Privacy</a> · <a style=\"color:#dddddd\" href=\"#\">Terms</a></p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
