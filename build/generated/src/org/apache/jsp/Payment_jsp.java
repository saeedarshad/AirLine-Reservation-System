package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \t\t\t\t\t<li><a href=\"Login.jsp\" ><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \t\t\t\t\t<li ><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("      \t\t\t\t\t<li id=\"current\"><a href=\"Booking.html\" >Booking</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"AboutUs.jsp\">AboutUs</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Contact.jsp\">ContactUs</a></li>\n");
      out.write("    \t\t\t\t</ul>  \t   \n");
      out.write("        \t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t</div>\n");
      out.write("    \n");
      out.write("\t</nav>\n");
      out.write("\t<!---header End-->\n");
      out.write("\n");
      out.write("<!---Slider start-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"payment\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookingform\">\n");
      out.write("\t\t\t\t\t\t\t    <form class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"container\"style=\"color:black;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"paytable\" >\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t<h1 style=\"text-align:center;color:black;font-size:40px\">Payment Details</h1><br><br>\n");
      out.write("            \n");
      out.write("  \t\t\t\t\t\t\t\t\t\t<table class=\"table .table-condensed table-bordered\" style=\"color:black;font-size:15px\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <tr class=\"info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      \t<th>FlightID</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>From</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>To</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>Time</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>Class</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>Seats</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <th>Fare</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <tr class=\"info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      \t<td>Pk-903</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>Lahore</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>NewYork</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>09/09/17</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>12:30 am</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>Economy</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>3</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        <td>158,000</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      </tr>     \n");
      out.write("\t\t\t\t\t\t\t\t\t\t      \n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("\t\t\t\t\t\t\t  \t  <div class=\"paymentline1\">\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-user-circle-o\" ></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"name\" type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Full Name\" >\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-id-card\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"cnic\" type=\"text\" class=\"form-control\" name=\"cnic\" placeholder=\"CNIC\">\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t\n");
      out.write("\t\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"paymentline2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-envelope\" ></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"email\" type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Email\" >\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-phone\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"phone\" type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"Phone NO.\">\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"paymentline3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-credit-card-alt\" ></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"cardno\" type=\"text\" class=\"form-control\" name=\"cardno\" placeholder=\"CreditCard\" >\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t\n");
      out.write("\t\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  <br><br>\n");
      out.write("\t\t\t\t\t\t\t  \t<a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\" onclick=\"toggleMenu()\"style=\"background-color:#5E4485;\">Payment</button></a>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t\t\n");
      out.write("\t\tfunction toggleMenu() {\t\t\n");
      out.write("\t\t\t\tdocument.getElementById(\"showhidden\").style.visibility = \"visible\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"showhidden\").style.display= \"block\";\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!---Slider End-->\n");
      out.write("\n");
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
