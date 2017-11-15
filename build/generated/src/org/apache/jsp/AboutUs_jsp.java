package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tcolor: black;\n");
      out.write("\n");
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
      out.write("\t<!---header start-->\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("  \t\t<div class=\"container-fluid\">\n");
      out.write("    \t\t<div class=\"navbar-header\">\n");
      out.write("    \t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MyNavbar\">\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t</button>\n");
      out.write("    \t\t\t<a class=\"navbar-brand\" href=\"#\"><img src=\"logo.png\" ></a>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"collapse navbar-collapse\" id=\"MyNavbar\">\n");
      out.write("    \t\t\t<div class=\"signup\">\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \t\t\t\t\t<li ><a href=\"#\" onclick=\"document.getElementById('signupform').style.display='block'\"><span class=\"glyphicon glyphicon-user\" ></span> Sign Up</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"#\" onclick=\"document.getElementById('Loginform').style.display='block'\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      \t\t\t\t\t\n");
      out.write("    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \t\t\t\t\t<li ><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                                        <li ><a href=\"Booking.jsp\" >Booking</a></li>\n");
      out.write("                                        <li id=\"current\"><a href=\"#\">AboutUs</a></li>\n");
      out.write("                                        <li><a href=\"Contact.jsp\">ContactUs</a></li>\n");
      out.write("    \t\t\t\t</ul>  \t   \n");
      out.write("        \t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t</div>\n");
      out.write("    \n");
      out.write("\t</nav>\n");
      out.write("\t<!---header End-->\n");
      out.write("\t<!---Signup Start-->\n");
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
      out.write("\t<!---Signup end-->\n");
      out.write("\t<!---LoginStart-->\n");
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
      out.write("\t<!---Login end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---Slider start-->\n");
      out.write("<div class=\"about\">\n");
      out.write("\t\t\t\n");
      out.write("</div>\n");
      out.write("<div class=\"aboutparagraphs\" style=\"width:70%;margin-left:15%;margin-right:15%;margin-bottom:25px\">\n");
      out.write("  <h1 style=\"color:black;text-align:center\">ABOUT US</h1><br>\n");
      out.write("    <p style=\"color:black;text-align:center\">Founded in 2016, Pak Airways  is commercial air carrier serving international business and leisure travelers with daily non-stop services to across countries. Founded by a long-time veteran of the aviation industry ? Pak Airways aims to take the hassle out of flying. Our mission is to become Chicago?s gateway to Pakistan's  premier air-service. We are committed to providing reliable, safe, and affordable service with a smile ? at Pak Airways , our customers are our number 1 priority.</p><br>\n");
      out.write("    <h3 style=\"color:black;text-align:center\">Ethics and compliance</h3><br>\n");
      out.write("    <p style=\"color:black;text-align:center\">We understand that our reputation is judged by how we act. This is why our core values emphasise the importance of doing business with integrity and taking responsibility to do what is right and ethical at all times. These values underpin the Pak Airways Code of Business Conduct  / and are central to how we interact with our customers and suppliers.\n");
      out.write("\n");
      out.write("To ensure our continued compliance with our Code of Business Conduct, Pak's Ethics Line is designed to allow employees, customers, members of the public and other stakeholders to raise concerns and report potential breaches of our values.</p><br><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!---Slider End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\" >\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>Address</h2><br>\n");
      out.write("\t\t\t<p>faisal town lahore</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>contact</h2><br>\n");
      out.write("\t\t\t<p>m.saeedarshad95@gmail.com</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>Social</h2><br>\n");
      out.write("\t\t\t<a href=\"http://www.facebook.com\" class=\"fa fa-facebook\"></a>\n");
      out.write("\t\t\t<a href=\"http://www.twitter.com\" class=\"fa fa-twitter\"></a>\n");
      out.write("\t\t\t<a href=\"http://www.instagram.com\" class=\"fa fa-instagram\"></a>\n");
      out.write("\t\t\t<a href=\"http://www.linkedin.com\" class=\"fa fa-linkedin\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
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
