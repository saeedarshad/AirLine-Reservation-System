<%-- 
    Document   : Booking
    Created on : Oct 22, 2017, 3:10:25 PM
    Author     : saeed
--%>
<%
 
    String username=(String)session.getAttribute("username");
    String usertype=(String)session.getAttribute("usertype");
    if(username!=null &&usertype.equals("customer"))
    {
        response.sendRedirect("Home1.jsp");
    }
     else if(username!=null && usertype.equals("admin")==true)
    {
        response.sendRedirect("AdminHome.jsp");
    }
    else if(username!=null && usertype.equals("manager")==true)
    {
        response.sendRedirect("ManagerHome.jsp");
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
      					<li ><a href="SignUp.jsp" ><span class="glyphicon glyphicon-user" ></span> Sign Up</a></li>
      					<li><a href="Login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    				</ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li ><a href="Home.jsp">Home</a></li>
      					<li id="current"><a href="#" >Booking</a></li>
      					<li><a href="AboutUs.jsp">AboutUs</a></li>
      					<li><a href="Contact.jsp">ContactUs</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->

					<div class="booking">
							<div class="bookingform">
							    <form class="form-inline">
							  	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							  	  <div class="line1">
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-plane" ></i></span>
							    		<input id="departure" type="text" class="form-control" name="departure" placeholder="Departure AirPort" >
							  		</div>
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-plane"></i></span>
							    		<input id="arrival" type="text" class="form-control" name="arrival" placeholder="Arrival AirPort">
							  		</div>
							  		<div class="input-group">
							 		 	<span class="input-group-addon"><i class="fa fa-star"></i></span>
							  			<select class="form-control" id="sel1">
							    			<option>Economy</option>
							    			<option>Business</option>
							    			<option>First</option>
							    
							  			</select>
							  		</div></div><br>
								  	<div class="line2">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
								  		<input type="text" class="form-control" id="datepicker" placeholder="dd/mm/yy">
								<script>
							  	$( function() {
									    $( "#datepicker" ).datepicker();
									  } );
 								 </script>
							  </div>
							   
							    
							   <div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
									   <select class="form-control" id="sel1">
									     <option>1</option>
									     <option>2</option>
									     <option>3</option>
									     <option>4</option>
									     <option>5</option>
									     <option>6</option>
									     <option>7</option>
									     <option>8</option>
									     <option>9</option>
									     <option>10</option>
									     <option>11</option>
									     <option>12</option>
									  </select>
								    </div></div>
							  <br><br>
							  	<a href="#showhidden"><button type="button" class="btn btn-primary btn-lg" onclick="toggleMenu()"style="background-color:#5E4485;">Find Flights</button></a>
							</form></div>


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
        <th>Booking</th>
      </tr>
    </thead>
    <tbody>
      <tr>
      	<td>PK-923</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>12:30 am</td>
        <td>Available</td>
        <td><a href="Payment.jsp"><button class="btn btn-primary">Book</button></td></a>
      </tr>
      <tr>
      	<td>PK-903</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>6:30 am</td>
        <td style="color:red;">NotAvailable</td>
        <td><a href="Payment.jsp"><button class="btn btn-primary disabled">Book</button></td></a>
      </tr>
      <tr>
      	<td>PK-526</td>
        <td>Lahore</td>
        <td>NewYork</td>
        <td>09/09/17</td>
        <td>8:00 Pm</td>
        <td>Available</td>
        <td><a href="Payment.jsp"><button class="btn btn-primary">Book</button></td></a>
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