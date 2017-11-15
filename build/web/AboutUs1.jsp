<%-- 
    Document   : AboutUs1
    Created on : Oct 23, 2017, 10:27:48 PM
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
    if(username==null || usertype.equals("customer")==false)
      {
           response.sendRedirect("AboutUs.jsp");
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
      					<li><a href="Logout.jsp" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      					
    				</ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li ><a href="Home1.jsp">Home</a></li>
                                       
                                        <li id="current"><a href="#">AboutUs</a></li>
                                        <li><a href="Contact1.jsp">ContactUs</a></li>
    				</ul>  	   
        		</div>

   			</div>
    
	</nav>
	<!---header End-->

<div class="about">
			
</div>
<div class="aboutparagraphs" style="width:70%;margin-left:15%;margin-right:15%;margin-bottom:25px">
  <h1 style="color:black;text-align:center">ABOUT US</h1><br>
    <p style="color:black;text-align:center">Founded in 2016, Pak Airways  is commercial air carrier serving international business and leisure travelers with daily non-stop services to across countries. Founded by a long-time veteran of the aviation industry ? Pak Airways aims to take the hassle out of flying. Our mission is to become Chicago?s gateway to Pakistan's  premier air-service. We are committed to providing reliable, safe, and affordable service with a smile ? at Pak Airways , our customers are our number 1 priority.</p><br>
    <h3 style="color:black;text-align:center">Ethics and compliance</h3><br>
    <p style="color:black;text-align:center">We understand that our reputation is judged by how we act. This is why our core values emphasise the importance of doing business with integrity and taking responsibility to do what is right and ethical at all times. These values underpin the Pak Airways Code of Business Conduct  / and are central to how we interact with our customers and suppliers.

To ensure our continued compliance with our Code of Business Conduct, Pak's Ethics Line is designed to allow employees, customers, members of the public and other stakeholders to raise concerns and report potential breaches of our values.</p><br><br>
</div>



	
<!---Slider End-->






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
