package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.Searchflight;
import Model.Flights;

public final class Searchresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("  \t\t\t\t\t\t\t\t\t\t<h1 style=\"text-align:center;color:black;font-size:40px\">Search Result</h1><br><br>\n");
      out.write("            \n");
      out.write("  <table class=\"table .table-condensed table-bordered\" style=\"color:black;font-size:15px\">\n");
      out.write("    <thead>\n");
      out.write("      <tr class=\"info\">\n");
      out.write("      \t<th>Flight ID</th>\n");
      out.write("        <th>Departure</th>\n");
      out.write("        <th>Arrival</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("        <th>Time</th>\n");
      out.write("        <th>Economy Seats</th>\n");
      out.write("        <th>Business Seats</th>\n");
      out.write("        <th>First class Seats</th>\n");
      out.write("        <th>Total Seats</th>\n");
      out.write("        <th>Economy Fare</th>\n");
      out.write("        <th>Business Fare</th>\n");
      out.write("        <th>First class  Fare</th>\n");
      out.write("         <th>Booking</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("       </thead>\n");
      out.write("      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("      \n");
      out.write("     \n");
      out.write("    \n");
      out.write("  </table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  \t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!---Slider End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---Table-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---Table-->\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.searchresult}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("flight");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          <tbody>\n");
          out.write("          <tr class=\"info\">\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.getFlightid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.departure}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.arrival}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.economyseat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.businessseat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.firstseat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.totalseats}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.economyfare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.businessfare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.firstfare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td><a href=\"../Payment.jsp\"><button id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.getFlightid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"btn btn-primary\"style=\"margin-left:10px\">Book</button></td></a>\n");
          out.write("          </tr>\n");
          out.write("          </tbody>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
