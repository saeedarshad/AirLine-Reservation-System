package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

 
    String username=(String)session.getAttribute("username");
    String usertype=(String)session.getAttribute("usertype");
    if(username!=null && usertype.equals("customer")==true)
    {
        response.sendRedirect("Home1.jsp");
    }
    else if(username!=null && usertype.equals("admin")==true)
    {
        response.sendRedirect("AdminHome.jsp");
    }
    else if(username!=null && usertype.equals("manager")==true)
    {
        response.sendRedirect("ManagerHome.jsp");
    }
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Pakistan Airline</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"favicon.ico\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome.min.css\">\n");
      out.write("  <link href=\"login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("#current a{\n");
      out.write("  color: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <!---header start-->\n");
      out.write("  <nav class=\"navbar navbar-inverse\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MyNavbar\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><img src=\"logo.png\" ></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"MyNavbar\">\n");
      out.write("          <div class=\"signup\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li id=\"current\"><a href=\"#\" ><span class=\"glyphicon glyphicon-user\" ></span> Sign Up</a></li>\n");
      out.write("                <li><a href=\"Login.jsp\" ><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li ><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"Booking.jsp\" >Booking</a></li>\n");
      out.write("                <li><a href=\"AboutUs.jsp\">AboutUs</a></li>\n");
      out.write("                <li><a href=\"Contact.jsp\">ContactUs</a></li>\n");
      out.write("            </ul>      \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("<div class=\"vid-container\">\n");
      out.write("  \n");
      out.write("  <div class=\"inner-container\">\n");
      out.write("    \n");
      out.write("    <div class=\"box\">\n");
      out.write("      <h1>SignUp</h1>\n");
      out.write("      <form class=\"SignUp\" METHOD=\"POST\" action=\"RegisterController\" >\n");
      out.write("          <div style=\"color:red;font-size:18px ;text-align:center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <input type=\"text\" placeholder=\"FullName\" name=\"name\" required/>\n");
      out.write("        <input type=\"text\" placeholder=\"Username\" name=\"username\" required/>\n");
      out.write("        <input type=\"email\" placeholder=\"Email\" name=\"email\" required/>\n");
      out.write("        <input type=\"password\" placeholder=\"Password\" name=\"psw\" required/>\n");
      out.write("        <input type=\"password\" placeholder=\"ConfirmPassword\" name=\"psw2\" required/>\n");
      out.write("        <button>SignUp</button>\n");
      out.write("        <p>Already have an account? <span><a href=\"Login.jsp\" style=\"color:#5E4485\">Login</a></span></p>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
