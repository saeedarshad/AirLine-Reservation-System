<%-- 
    Document   : Payment
    Created on : Oct 22, 2017, 8:49:23 PM
    Author     : saeed
--%>
<%@page import="java.sql.ResultSet"%>
<% ResultSet result = (ResultSet) session.getAttribute("result");%>
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
    if(username==null || usertype.equals("customer")==false )
      {
           response.sendRedirect("Home.jsp");
      }
    request.setAttribute("username",username);
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
      					<li><a href="Login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    				</ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li id="current"><a href="Home.jsp">Home</a></li>
      					
      					<li><a href="AboutUs.jsp">AboutUs</a></li>
      					<li><a href="Contact.jsp">ContactUs</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->

					<div class="payment">
						
							<div class="bookingform">
							    <form class="form-inline"name="paymentform" METHOD="POST" action="Booking">
							    	<div class="container"style="color:black;">
										<div id="paytable" >
  										<h1 style="text-align:center;color:black;font-size:40px">Payment Details</h1><br><br>
                                                                                    <div style="color:red;font-size:18px ;text-align:center">${error}</div>
  										<table class="table .table-condensed table-bordered" style="color:black;font-size:15px">
										    <thead>
										      <tr class="info">
										      	<th>FlightID</th>
										        <th>From</th>
										        <th>To</th>
										        <th>Date</th>
										        <th>Time</th>
										        <th>Class</th>
										        <th>Seats</th>
										        <th>Fare</th>
										      </tr>
										    </thead>
                                                                                     <input type="hidden" name="flightid" value=<%= request.getParameter("flightid") %>>
                                                                                      <input type="hidden" name="username" value=<%= (String)session.getAttribute("username") %>>
                                                                                      <input type="hidden" name="departure" value=<%= request.getParameter("departure") %>>
                                                                                      <input type="hidden" name="arrival" value=<%= request.getParameter("arrival") %>>
                                                                                      <input type="hidden" name="date" value=<%= request.getParameter("date") %>>
                                                                                      <input type="hidden" name="time" value=<%= request.getParameter("time") %>>
                                                                                      <input type="hidden" name="class" value=<%= request.getParameter("class") %>>
                                                                                      <input type="hidden" name="seats" value=<%= request.getParameter("seats") %>>
                                                                                      <input type="hidden" name="fare" value=<%= Integer.parseInt(request.getParameter("fare"))*Integer.parseInt(request.getParameter("seats")) %>>
                                                                                      
										    <tbody>
										      <tr class="info">
                                                                                          <td><%=request.getParameter("flightid")%></td>
										        <td><%=request.getParameter("departure")%></td>
										        <td><%=request.getParameter("arrival")%></td>
												<td><%=request.getParameter("date")%></td>
										        <td><%=request.getParameter("time")%></td>
                                                                                        <td><%=request.getParameter("class")%></td>
										        <td><%=request.getParameter("seats")%></td>
										        <td><%=Integer.parseInt(request.getParameter("fare"))*Integer.parseInt(request.getParameter("seats"))%></td>
										      </tr>     
										      
										    </tbody>
										 </table>
										 </div>
									</div>
							  	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							  	  <div class="paymentline1">
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-user-circle-o" ></i></span>
							    		<input id="name" type="text" class="form-control" name="name" placeholder="Full Name(required)"required >
							  		</div>
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-id-card"></i></span>
							    		<input id="cnic" type="text" class="form-control" name="cnic" placeholder="CNIC(Optional)">
							  		</div>
							  		
							  	</div>
								<div class="paymentline2">
									<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-envelope" ></i></span>
							    		<input id="emailpay" type="text" class="form-control" name="emailpay" placeholder="Email(required)" required>
							  		</div>
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-phone"></i></span>
							    		<input id="phone" type="text" class="form-control" name="phone" placeholder="Phone NO(optional)">
							  		</div>
							   
								</div>
								<div class="paymentline3">
									<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-credit-card-alt" ></i></span>
							    		<input id="cardno" type="text" class="form-control" name="cardno" placeholder="CreditCard(required)" required>
							  		</div>
							  		
							   
								</div>
							  <br>
                                                                 
							  	<button id="pay"class="btn btn-primary btn-lg" style="background-color:#5E4485;">Payment</button>
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


</body>
</html>
