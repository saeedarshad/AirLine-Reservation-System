<%-- 
    Document   : AdminHome
    Created on : Oct 22, 2017, 8:38:59 PM
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
  <style>
#current a{
	color: black;

}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
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
      					<li><a href="Logout.jsp" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>    				</ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li id="current"><a href="#">Home</a></li>
      					<li><a href="Addflights.jsp" >Add Flights</a></li>
      					<li><a href="Deleteflights.jsp">Delete Flights</a></li>
      					<li><a href="Updateflights.jsp">Update Flights</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->
	
<!---Slider start-->
<div class="adminhome">

					<div class="homebtn" >
							
							<form class="form">
							  	
							  	<a href="Addflights.jsp"><button type="button" class="btn btn-primary btn-lg"  style="margin-left:40%;margin-top:80px">ADD FLIGHTS</button></a><br>
							  	<a href="Deleteflights.jsp"><button type="button" class="btn btn-primary btn-lg" style="margin-left:30%;margin-top:15px" >DELETE FLIGHTS</button></a>
							  	<a href="Updateflights.jsp"><button type="button" class="btn btn-primary btn-lg" style="margin-left:15px;margin-top:15px" >UPDATE FLIGHTS</button></a>
							</form>
						</div>
</div>

<script>
		
		function toggleMenu() {		
				document.getElementById("showhidden").style.visibility = "visible";
				document.getElementById("showhidden").style.display= "block";
							
		}
</script>

	
<!---Slider End-->



<!---Table-->
<div class="container">
	<div id="showhidden">
  <h2 style="text-align:center">'SEARCH RESULT'</h2><br><br>
            
  <table class="table table-hover table-bordered">
    <thead>
      <tr>
      	<th>FlightID</th>
        <th>Departure</th>
        <th>Arrival</th>
        <th>Date</th>
        <th>Time</th>
        <th>Availability</th>     
        <th>Delete</th>

      </tr>
    </thead>
    <tbody>
      <tr>
      	<td>pk-923</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>12:30 am</td>
        <td>Available</td>
        <td><a href="#"><button class="btn btn-danger">Delete</button></td></a>
      </tr>
      <tr>
      	<td>pk-903</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>6:30 am</td>
        <td style="color:red;">Booked</td>
        <td><a href="#"><button class="btn btn-danger">Delete</button></td></a>
      </tr>
      <tr>
      	<td>pk-526</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>8:00 Pm</td>
        <td>Available</td>
        <td><a href="#"><button class="btn btn-danger">Delete</button></td></a>
      </tr>
      
    </tbody>
  </table>
  </div>
</div>

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
