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
    if(username==null || usertype.equals("customer")==false )
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
      					<li id="current"><a href="#">Home</a></li>
      					
      					<li><a href="AboutUs1.jsp">AboutUs</a></li>
      					<li><a href="Contact1.jsp">ContactUs</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<!---Slider start-->
<div class="overlay">
					
					<div class="searchflights">
							<div class="bookingform">
							    <form class="form-inline"name="searchflightform"METHOD="POST" action="Searchflight">
							  	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							  	  <div class="line1" style="margin-top:135px">
                                                                      <div style="color:red;font-size:18px ;text-align:center">${error}</div>
                                                                      <div id="message1h" style="color:red;font-size:14px ;text-align:center"></div>
                                                                      <div id="message3h" style="color:red;font-size:14px ;text-align:center"></div>
                                                                      <div id="message2h" style="color:red;font-size:14px ;text-align:center"></div>
							  		<div class="input-group">
                                                                            
							    		<span class="input-group-addon"><i class="fa fa-plane" ></i></span>
							    		<input id="departure" type="text" class="form-control" name="departure" placeholder="Departure AirPort" onblur="checkdeparturecityh('departure');" required>
							  		</div>
							  		<div class="input-group">
                                                                            
							    		<span class="input-group-addon"><i class="fa fa-plane"></i></span>
							    		<input id="arrival" type="text" class="form-control" name="arrival" placeholder="Arrival AirPort" onblur="checkarrivalcityh('arrival');"required>
							  		</div>
							  		<div class="input-group">
							 		 	<span class="input-group-addon"><i class="fa fa-star"></i></span>
							  			<select class="form-control" name="seattype"id="seattype">
							    			<option value="Economy">Economy</option>
							    			<option valur="Business">Business</option>
							    			<option value="First">First</option>
							    
							  			</select>
							  		</div></div><br>
								  	<div class="line2">
                                                                            
								<div class="input-group">
                                                                    
									<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
								  			<input  class="form-control" type="date"id="date" name="date" placeholder="dd/mm/yy"  onblur="checkdateh('date');"required >
							  </div>
							   
							    
							   <div class="input-group">
								  		<span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
									   <select class="form-control" name="seatno"id="seatno">
									     <option value="1">1</option>
									     <option value="2">2</option>
									     <option value="3">3</option>
									     <option value="4">4</option>
									     <option value="5">5</option>
									     <option value="6">6</option>
									     <option value="7">7</option>
									     <option value="8">8</option>
									     <option value="9">9</option>
									     <option value="10">10</option>
									     <option value="11">11</option>
									     <option value="12">12</option>
									  </select>
								    </div></div>
							  <br><br>
							  	<button  id ="search"class="btn btn-primary btn-lg"  style="background-color:#5E4485;">Find Flights</button></a>
							</form></div>


							</div>


</div>
<script>
		
		function toggleMenu() {		
				document.getElementById("showhidden").style.visibility = "visible";
				document.getElementById("showhidden").style.display= "block";
							
		}
</script>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"> </li>
			<li data-target="#myCarousel" data-slide-to="1" > </li>
			<li data-target="#myCarousel" data-slide-to="2" > </li>
		</ol>
		<div  class="carousel-inner" role="Listbox">
			<div class="item active"><!---First picture-->
				<img src="CustomerImages/slider1.jpg" class="img-responsive" style="height:560px;width:1500px;opacity:0.8">
				<div class="container">
				 	<div class="carousel-caption">					
				    </div>
				</div>
			</div>
			<div class="item "><!---second picture-->
				<img src="CustomerImages/slider2.jpg" class="img-responsive"style="height:560px;width:1500px" >
				<div class="container">
				   <div class="carousel-caption">
					</div>
				</div>
			</div>
			<div class="item "><!---third picture-->
				<img src="CustomerImages/slider3.jpg" class="img-responsive" style="height:560px;width:1500px">
				<div class="container">
				   <div class="carousel-caption">
					</div>
				</div>
			</div>
		</div>
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">next</span>
			</a>
	</div>
<!---Slider End-->


<!---popular destinations start-->
<div class="container text-center">
	<h1>Popular Destinations</h1>
	<div class="row" style="margin-top:7%;margin-bottom:5%">
		<div class="col-md-4 ">
			<img src="CustomerImages/pd1.jpg"  class="bas"style="height:300px">
			<b><h4>	NEWYORK</h4></b>
		</div>
		<div class="col-md-4 ">
			<img src="CustomerImages/pd2.jpg"  class="bas" style="height:300px " >
			<b><h4>DUBAI</h4></b>
		</div>
		<div class="col-md-4 " >
			<img src="CustomerImages/pd3.jpg"   class="bas"style="height:300px" >
			<b><h4>LONDAN</h4></b>
		</div>

	</div>
</div>

<!---popular destinations End-->


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
