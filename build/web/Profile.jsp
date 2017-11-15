<%-- 
    Document   : Profile
    Created on : Oct 24, 2017, 1:52:22 AM
    Author     : saeed
--%>

<%-- 
    Document   : Home1
    Created on : Oct 23, 2017, 9:43:09 PM
    Author     : saeed
--%>
<%
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
    if(username==null )
      {
           response.sendRedirect("Home.jsp");
      }
    
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Pakistan Airline</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
  <link rel="stylesheet" type="text/css" href="style.css">
  <link rel="stylesheet" type="text/css" href="font-awesome.min.css">
  
  <style>
#current a{
	color: black;

}
  </style>
</head>
<body>
	<!---header start-->
	<nav class="navbar navbar-inverse">
  		<div class="container-fluid">
    		<div class="navbar-header">

    			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MyNavbar">
    				<span class="icon-bar"></span>
    				<span class="icon-bar"></span>
    				<span class="icon-bar"></span>
    			</button>

    			<a class="navbar-brand" href="#"><img src="logo.png" ></a>
    		</div>
    		<div class="collapse navbar-collapse" id="MyNavbar">
    			<div class="signup">
    				<ul class="nav navbar-nav navbar-right">
                                       <li ><a href="Profile.jsp" ><span class="glyphicon glyphicon-user" ></span> <%=username%></a></li>
      					<li><a href="Logout.jsp" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    				</ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li id="current"><a href="#">Home</a></li>
      					
      					<li><a href="AboutUs1.jsp">AboutUs</a></li>
      					<li><a href="Contact1.jsp">ContactUs</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->
<h1>Hello <%=username%></h1>
</body>
</html>

