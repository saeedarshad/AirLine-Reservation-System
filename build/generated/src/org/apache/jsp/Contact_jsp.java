package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("  <style>\n");
      out.write("#current a{\n");
      out.write("  color: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".contacts a{\n");
      out.write("  text-decoration:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!---header start-->\n");
      out.write("  <nav class=\"navbar navbar-inverse\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MyNavbar\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><img src=\"logo.png\" ></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"MyNavbar\">\n");
      out.write("          <div class=\"signup\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li ><a href=\"#\" onclick=\"document.getElementById('signupform').style.display='block'\"><span class=\"glyphicon glyphicon-user\" ></span> Sign Up</a></li>\n");
      out.write("                <li><a href=\"#\" onclick=\"document.getElementById('Loginform').style.display='block'\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li ><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li ><a href=\"Booking.html\" >Booking</a></li>\n");
      out.write("                <li ><a href=\"AboutUs.html\">AboutUs</a></li>\n");
      out.write("                <li id=\"current\"><a href=\"#\">ContactUs</a></li>\n");
      out.write("            </ul>      \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("  </nav>\n");
      out.write("  <!---header End-->\n");
      out.write("  <!---Signup Start-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"signupform\" class=\"modal\">\n");
      out.write("  <span onclick=\"document.getElementById('signupform').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("  <form class=\"modal-content animate\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <label style=\"color:#FFF\"><b>Email</b></label><br>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required style=\"width:65%\"><br>\n");
      out.write("\n");
      out.write("      <label style=\"color:#FFF\"><b>Password</b></label><br>\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required style=\"width:65%\"><br>\n");
      out.write("\n");
      out.write("      <label style=\"color:#FFF\"><b>Repeat Password</b></label><br>\n");
      out.write("      <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required style=\"width:65%\"><br>\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\"> <label style=\"color:#FFF\"> Remember me</label>\n");
      out.write("      <p style=\"color:#FFF\">By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("      <div class=\"clearfix\">\n");
      out.write("        <button type=\"button\" onclick=\"document.getElementById('signupform').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("        <button type=\"submit\" class=\"signupbtn\">Sign Up</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("var modal1= document.getElementById('signupform');\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal1) {\n");
      out.write("        modal1.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  <!---Signup end-->\n");
      out.write("  <!---LoginStart-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"Loginform\" class=\"modal\">\n");
      out.write("  <span onclick=\"document.getElementById('signupform').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("  <form class=\"modal-content animate\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <label style=\"color:#FFF\"><b>Email</b></label><br>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required style=\"width:65%\"><br>\n");
      out.write("\n");
      out.write("      <label style=\"color:#FFF\"><b>Password</b></label><br>\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required style=\"width:65%\"><br>\n");
      out.write("\n");
      out.write("      <p style=\"color:#FFF\"><a href=\"#\" style=\"text-decoration:none\">Forget Password </a></p>\n");
      out.write("\n");
      out.write("      <div class=\"clearfix\">\n");
      out.write("        <button type=\"button\" onclick=\"document.getElementById('Loginform').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("        <button type=\"submit\" class=\"signupbtn\">Login</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("var modal = document.getElementById('Loginform');\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  <!---Login end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---Slider start-->\n");
      out.write("\n");
      out.write("      \n");
      out.write("<div id=\"contacts\" class=\"contacts\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("         <h1 style=\"color:black;\">CONTACT US</h1><br>\n");
      out.write("         \n");
      out.write("         <div class=\"row\">\n");
      out.write("             <div class=\"col-lg-4 col-md-4 \" >\n");
      out.write("                 <i class=\"fa fa-phone fa-5x contact-icon\" aria-hidden=\"true\"></i>\n");
      out.write("                 <h4 style=\"color:black;\">CALL</h4>\n");
      out.write("                 <p ><a href=\"\">+92 335 4404002</a></p>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-lg-4 col-md-4 \" >\n");
      out.write("                 <i class=\"fa fa-envelope fa-5x contact-icon\" aria-hidden=\"true\"></i>\n");
      out.write("                 <h4 style=\"color:black;\">EMAIL</h4>\n");
      out.write("                 <p ><a href=\"\">m.saeedarshad95@gmail.com</a></p>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-lg-4 col-md-4 \" >\n");
      out.write("                 <i class=\"fa fa-twitter fa-5x contact-icon\" aria-hidden=\"true\"></i>\n");
      out.write("                  <h4 style=\"color:black;\">Twitter</h4>\n");
      out.write("                  <p ><a href=\"https://twitter.com/m_saeed95\">GO</a></p>\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("<!---Slider End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\" >\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h2>Address</h2><br>\n");
      out.write("      <p>faisal town lahore</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h2>contact</h2><br>\n");
      out.write("      <p>m.saeedarshad95@gmail.com</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h2>Social</h2><br>\n");
      out.write("      <a href=\"http://www.facebook.com\" class=\"fa fa-facebook\"></a>\n");
      out.write("      <a href=\"http://www.twitter.com\" class=\"fa fa-twitter\"></a>\n");
      out.write("      <a href=\"http://www.instagram.com\" class=\"fa fa-instagram\"></a>\n");
      out.write("      <a href=\"http://www.linkedin.com\" class=\"fa fa-linkedin\"></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
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
