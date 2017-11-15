<%-- 
    Document   : Addflights
    Created on : Oct 22, 2017, 8:41:18 PM
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
      					<li id="current"><a href="#">Add Flights</a></li>
      					<li><a href="Deleteflights.jsp">Delete Flights</a></li>
      					<li><a href="Updateflights.jsp">Update Flights</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->

					<div class="add">
							<div class="bookingform">

							    <form class="form-inline" name="addflightform"METHOD="POST" action="Addflight">
							  	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							  	<div style="color:red;font-size:18px ;text-align:center">${error}</div>
                                                                <div style="color:red;font-size:18px ;text-align:center">${message}</div>
							  	<div class="ADDline1" style="margin-top:100px">
                                                                     <div id="message1" style="color:red;font-size:14px ;text-align:center"></div>
							  		<div class="input-group">
                                                                      
							    		<span class="input-group-addon"><i class="fa fa-plane" ></i></span>
                                                              
							    		<input id="flightid" type="text" class="form-control" name="flightid" placeholder="FlightID" onblur="checkflightid('flightid');" required >
							  		</div>
							  		
							  		
							  	</div><br>
							  	  <div class="line11">
                                                                      <div id="e" style="color:red;font-size:12px "><p id="message2"style="text-align:left"></p><p id="message3"style="text-align:right"></p></div>
                                                                     
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-plane" ></i></span>
							    		<input id="departure" type="text" class="form-control" name="departure" placeholder="Departure AirPort"onblur="checkdeparturecity('departure');" required >
							  		</div>
							  		<div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-plane"></i></span>
							    		<input id="arrival" type="text" class="form-control" name="arrival" placeholder="Arrival AirPort"onblur="checkarrivalcity('arrival');"required >
							  		</div>
							  		
							  		
							  	</div><br>
							  	<div class="line22">
                                                                    <div id="bdate"style="color:red;font-size:12px ;text-align:left"></div>
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
								  		<input  class="form-control" type="date"id="date" name="date" placeholder="dd/mm/yy"  onblur="checkdate('date');"required >
								
							  </div>
							   <div class="input-group">
							    		<span class="input-group-addon"><i class="fa fa-clock-o" ></i></span>
							    		<input id="time" type="time" class="form-control" name="time" value="00:00:00"placeholder="Time i.e 3:00pm"required  >
							  		</div>
							    
							   </div><br>

							  	<div class="line4">
                                                                    <div id="eseat"style="color:red;font-size:12px ;text-align:left"></div>
                                                                    <div id="efare"style="color:red;font-size:12px ;margin-left:50%"></div>
							  	<div class="input-group">
							 		 	<span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
							    		<input id="economyseat" type="text" class="form-control" name="economyseat" placeholder=" No.of economy class seats" onblur="checkeconomyseat('economyseat');"required >
                                                                </div>
							  		<div class="input-group">
							 		 	<span class="input-group-addon"><i class="fa fa-money"></i></span>
                                                                                <input id="economyfare" type="text" class="form-control" name="economyfare" placeholder=" Fare" onblur="checkeconomyfare('economyfare');"required >
							  			
							  		</div>
                                                                    <div id="bseat"style="color:red;font-size:12px ;text-align:left"></div>
                                                                    <div id="bfare"style="color:red;font-size:12px ;margin-left:50%"></div>
							  		<div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
									   <input id="businessseat" type="text" class="form-control" name="businessseat" placeholder=" No.of Business class seats"onblur="checkbusinessseat('businessseat');"required >
                                                                           
								    </div>
                                                                    <div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-money"></i></span>
									   <input id="businessfare" type="text" class="form-control" name="businessfare" placeholder=" Fare"onblur="checkbusinessfare('businessfare');"required >
                                                                           
								    </div>
                                                                    <div id="fseat"style="color:red;font-size:12px ;text-align:left"></div>
                                                                    <div id="ffare"style="color:red;font-size:12px ;margin-left:50%"></div>
                                                                    <div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
									   <input id="firstseat" type="text" class="form-control" name="firstseat" placeholder=" No.of First class seats"onblur="checkfirstseat('firstseat');"required >
                                                                           
								    </div>
                                                                    <div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-money"></i></span>
									   <input id="firstfare" type="text" class="form-control" name="firstfare" placeholder=" Fare"onblur="checkfirstfare('firstfare');"required >
                                                                           
								    </div>
							  	</div>
								  								  <br><br>
							  <div class="line3">
							  	<button class="btn btn-primary btn-lg" id="add" style="background-color:#5E4485;">Add Flight</button>
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
