package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
    response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
    String username=(String)session.getAttribute("username");  
if ( username==null) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
   rd.forward(request, response);
}    
    String usertype=(String)session.getAttribute("usertype"); 
    if(username==null || usertype.equals("admin")==false)
      {
           response.sendRedirect("Home.jsp");
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
      out.write("<li ><a href=\"Profile.jsp\" ><span class=\"glyphicon glyphicon-user\" ></span> ");
      out.print(username);
      out.write("</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Logout.jsp\" ><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \t\t\t\t\t<li id=\"current\"><a href=\"#\">Home</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Addflights.jsp\" >Add Flights</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Deleteflights.jsp\">Delete Flights</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Updateflights.jsp\">Update Flights</a></li>\n");
      out.write("    \t\t\t\t</ul>  \t   \n");
      out.write("        \t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t</div>\n");
      out.write("    \n");
      out.write("\t</nav>\n");
      out.write("\t<!---header End-->\n");
      out.write("\t\n");
      out.write("<!---Slider start-->\n");
      out.write("<div class=\"adminhome\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"homebtn\" >\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t  \t\n");
      out.write("\t\t\t\t\t\t\t  \t<a href=\"Addflights.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg\"  style=\"margin-left:40%;margin-top:80px\">ADD FLIGHTS</button></a><br>\n");
      out.write("\t\t\t\t\t\t\t  \t<a href=\"Deleteflights.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg\" style=\"margin-left:30%;margin-top:15px\" >DELETE FLIGHTS</button></a>\n");
      out.write("\t\t\t\t\t\t\t  \t<a href=\"Updateflights.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg\" style=\"margin-left:15px;margin-top:15px\" >UPDATE FLIGHTS</button></a>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("</div>\n");
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
      out.write("\n");
      out.write("<!---Table-->\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div id=\"showhidden\">\n");
      out.write("  <h2 style=\"text-align:center\">'SEARCH RESULT'</h2><br><br>\n");
      out.write("            \n");
      out.write("  <table class=\"table table-hover table-bordered\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("      \t<th>FlightID</th>\n");
      out.write("        <th>Departure</th>\n");
      out.write("        <th>Arrival</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("        <th>Time</th>\n");
      out.write("        <th>Availability</th>     \n");
      out.write("        <th>Delete</th>\n");
      out.write("\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("      \t<td>pk-923</td>\n");
      out.write("        <td>Lahore</td>\n");
      out.write("        <td>NewYork</td>\n");
      out.write("        <td>09/09/17</td>\n");
      out.write("        <td>12:30 am</td>\n");
      out.write("        <td>Available</td>\n");
      out.write("        <td><a href=\"#\"><button class=\"btn btn-danger\">Delete</button></td></a>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("      \t<td>pk-903</td>\n");
      out.write("        <td>Lahore</td>\n");
      out.write("        <td>NewYork</td>\n");
      out.write("        <td>09/09/17</td>\n");
      out.write("        <td>6:30 am</td>\n");
      out.write("        <td style=\"color:red;\">Booked</td>\n");
      out.write("        <td><a href=\"#\"><button class=\"btn btn-danger\">Delete</button></td></a>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("      \t<td>pk-526</td>\n");
      out.write("        <td>Lahore</td>\n");
      out.write("        <td>NewYork</td>\n");
      out.write("        <td>09/09/17</td>\n");
      out.write("        <td>8:00 Pm</td>\n");
      out.write("        <td>Available</td>\n");
      out.write("        <td><a href=\"#\"><button class=\"btn btn-danger\">Delete</button></td></a>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!---Table-->\n");
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
