<%-- 
    Document   : Logout
    Created on : Oct 23, 2017, 10:33:35 PM
    Author     : saeed
--%>

<%
 
     String username=(String)session.getAttribute("username");
     String usertype=(String)session.getAttribute("usertype");
      
    if(username!=null)
     {
            session.removeAttribute("username");
            session.removeAttribute("usertype"); 
            session.invalidate();
     }
    response.sendRedirect("Home.jsp");
 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    </body>
</html>

