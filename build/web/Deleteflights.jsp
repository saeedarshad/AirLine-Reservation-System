<%-- 
    Document   : Deleteflights
    Created on : Oct 22, 2017, 8:45:03 PM
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
    if(username==null || usertype.equals("admin")==false)
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
  <script src="validation.js" type="text/javascript"></script>
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
      					<li ><a href="AdminHome.jsp">Home</a></li>     					
      					<li ><a href="Addflights.jsp">Add Flights</a></li>
      					<li id="current"><a href="#">Delete Flights</a></li>
      					<li ><a href="Updateflights.jsp">Update Flights</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->

					<div class="delete">
              <div class="bookingform">

                  <form class="form-inline"class="deleteform" METHOD="POST" action="Deleteflight">
                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                  <h1 style="text-align:center;font-size:40px">DELETE FLIGHTS</h1>
                  <div style="color:red;font-size:18px ;text-align:center">${message}</div>
                 
                  <div class="updateline1" style="margin-top:80px">
                      <div style="color:red;font-size:18px ;text-align:center">${error}</div>
                       <div id="message1d"style="color:red;font-size:18px ;text-align:center"></div>
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-plane" ></i></span>
                      <input id="flightid" type="text" class="form-control" name="flightid" placeholder="FlightID"onblur="checkflightidd('flightid');" style="width:177%"required>
                    </div>
                    
                    
                  </div><br>
                    
                 
                  
                                    <br><br>
                <div class="line3">
                  <button id="delete"class="btn btn-primary btn-lg"style="background-color:#5E4485;">DELETE FLIGHT</button>
                </div>
              </form></div>


              </div>


	
<!---Slider End-->




<!---Table-->

<footer class="container-fluid text-center" >
	<div class="row">
		<div class="col-sm-4">
			<h2>Address</h2><br>
			<p>faisal town lahore</p>
		</div>
		<div class="col-sm-4">
			<h2>contact</h2><br>
			<p>m.saeedarshad95@gmail.com</p>
		</div>
		<div class="col-sm-4">
			<h2>Social</h2><br>
			<a href="http://www.facebook.com" class="fa fa-facebook"></a>
			<a href="http://www.twitter.com" class="fa fa-twitter"></a>
			<a href="http://www.instagram.com" class="fa fa-instagram"></a>
			<a href="http://www.linkedin.com" class="fa fa-linkedin"></a>
		</div>
	</div>

</footer>

</body>
</html>
