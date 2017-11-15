package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    if(username==null || usertype.equals("customer")==false )
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
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome.min.css\">\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("#current a{\n");
      out.write("\tcolor: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!---header start-->\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("  \t\t<div class=\"container-fluid\">\n");
      out.write("    \t\t<div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("    \t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MyNavbar\">\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("    \t\t\t</button>\n");
      out.write("\n");
      out.write("    \t\t\t<a class=\"navbar-brand\" href=\"#\"><img src=\"logo.png\" ></a>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"collapse navbar-collapse\" id=\"MyNavbar\">\n");
      out.write("    \t\t\t<div class=\"signup\">\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                       <li ><a href=\"Profile.jsp\" ><span class=\"glyphicon glyphicon-user\" ></span> ");
      out.print(username);
      out.write("</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Logout.jsp\" ><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \t\t\t\t\t<li id=\"current\"><a href=\"#\">Home</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Booking1.jsp\" >Booking</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"AboutUs1.jsp\">AboutUs</a></li>\n");
      out.write("      \t\t\t\t\t<li><a href=\"Contact1.jsp\">ContactUs</a></li>\n");
      out.write("    \t\t\t\t</ul>  \t   \n");
      out.write("        \t\t</div>\n");
      out.write("\n");
      out.write("   \t\t\t</div>\n");
      out.write("    \n");
      out.write("\t</nav>\n");
      out.write("\t<!---header End-->\n");
      out.write("\n");
      out.write("<!---Slider start-->\n");
      out.write("<div class=\"overlay\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"searchflights\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bookingform\">\n");
      out.write("\t\t\t\t\t\t\t    <form class=\"form-inline\"name=\"searchflightform\"METHOD=\"POST\" action=\"Searchflight\">\n");
      out.write("\t\t\t\t\t\t\t  \t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("\t\t\t\t\t\t\t  \t  <div class=\"line1\" style=\"margin-top:135px\">\n");
      out.write("                                                                      <div style=\"color:red;font-size:18px ;text-align:center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-plane\" ></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"departure\" type=\"text\" class=\"form-control\" name=\"departure\" placeholder=\"Departure AirPort\" >\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t<span class=\"input-group-addon\"><i class=\"fa fa-plane\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input id=\"arrival\" type=\"text\" class=\"form-control\" name=\"arrival\" placeholder=\"Arrival AirPort\">\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t \t\t \t<span class=\"input-group-addon\"><i class=\"fa fa-star\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t  \t\t\t<select class=\"form-control\" name=\"seattype\"id=\"seattype\">\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t<option value=\"Economy\">Economy</option>\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t<option valur=\"Business\">Business</option>\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t<option value=\"First\">First</option>\n");
      out.write("\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t  \t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t  \t\t</div></div><br>\n");
      out.write("\t\t\t\t\t\t\t\t  \t<div class=\"line2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-calendar\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t<input type=\"text\" class=\"form-control\" name=\"datepicker\"id=\"datepicker\" placeholder=\"dd/mm/yy\">\n");
      out.write("\t\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t  \t$( function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t    $( \"#datepicker\" ).datepicker();\n");
      out.write("\t\t\t\t\t\t\t\t\t  } );\n");
      out.write(" \t\t\t\t\t\t\t\t </script>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t   <div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t<span class=\"input-group-addon\"><i class=\"fa fa-user-circle-o\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <select class=\"form-control\" name=\"seatno\"id=\"seatno\">\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"10\">10</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"11\">11</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t     <option value=\"12\">12</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t    </div></div>\n");
      out.write("\t\t\t\t\t\t\t  <br><br>\n");
      out.write("\t\t\t\t\t\t\t  \t<button  id =\"search\"class=\"btn btn-primary btn-lg\"  style=\"background-color:#5E4485;\">Find Flights</button></a>\n");
      out.write("\t\t\t\t\t\t\t</form></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\t\t\n");
      out.write("\t\tfunction toggleMenu() {\t\t\n");
      out.write("\t\t\t\tdocument.getElementById(\"showhidden\").style.visibility = \"visible\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"showhidden\").style.display= \"block\";\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t}\n");
      out.write("</script>\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"> </li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\" > </li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\" > </li>\n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<div  class=\"carousel-inner\" role=\"Listbox\">\n");
      out.write("\t\t\t<div class=\"item active\"><!---First picture-->\n");
      out.write("\t\t\t\t<img src=\"CustomerImages/slider1.jpg\" class=\"img-responsive\" style=\"height:560px;width:1500px;opacity:0.8\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t \t<div class=\"carousel-caption\">\t\t\t\t\t\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item \"><!---second picture-->\n");
      out.write("\t\t\t\t<img src=\"CustomerImages/slider2.jpg\" class=\"img-responsive\"style=\"height:560px;width:1500px\" >\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t   <div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item \"><!---third picture-->\n");
      out.write("\t\t\t\t<img src=\"CustomerImages/slider3.jpg\" class=\"img-responsive\" style=\"height:560px;width:1500px\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t   <div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t<span class=\"sr-only\">previous</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t<span class=\"sr-only\">next</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("<!---Slider End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---popular destinations start-->\n");
      out.write("<div class=\"container text-center\">\n");
      out.write("\t<h1>Popular Destinations</h1>\n");
      out.write("\t<div class=\"row\" style=\"margin-top:7%;margin-bottom:5%\">\n");
      out.write("\t\t<div class=\"col-md-4 \">\n");
      out.write("\t\t\t<img src=\"CustomerImages/pd1.jpg\"  class=\"bas\"style=\"height:300px\">\n");
      out.write("\t\t\t<b><h4>\tNEWYORK</h4></b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 \">\n");
      out.write("\t\t\t<img src=\"CustomerImages/pd2.jpg\"  class=\"bas\" style=\"height:300px \" >\n");
      out.write("\t\t\t<b><h4>DUBAI</h4></b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 \" >\n");
      out.write("\t\t\t<img src=\"CustomerImages/pd3.jpg\"   class=\"bas\"style=\"height:300px\" >\n");
      out.write("\t\t\t<b><h4>LONDAN</h4></b>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!---popular destinations End-->\n");
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
