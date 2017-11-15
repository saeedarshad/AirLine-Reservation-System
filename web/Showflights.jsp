<%-- 
    Document   : Searchresult
    Created on : Nov 4, 2017, 11:52:59 PM
    Author     : saeed
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.Searchflight" %>
<%@page import="Model.Flights" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% ResultSet result = (ResultSet) session.getAttribute("result");%>
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
      					<li><a href="Login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
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
							    
							    	<div class="container"style="color:black;">
										<div id="paytable" >
  										<h1 style="text-align:center;color:black;font-size:40px">Search Result</h1><br><br>
            
  <table class="table .table-condensed table-bordered" style="color:black;font-size:15px">
    <thead>
      <tr class="info">
      	<th>Flight ID</th>
        <th>Departure</th>
        <th>Arrival</th>
        <th>Date</th>
        <th>Time</th>
        <th>Class</th>
        <th> Seats</th>
        <th> Fare</th>
        
         
        
      </tr>
       </thead>
      <% while(result.next()){ %>
            
                <form  >
        <input type="hidden" name="flightid" value=<%= result.getString("flightid") %>>
        <input type="hidden" name="departure" value=<%= result.getString("departure") %>>
        <input type="hidden" name="arrival" value=<%= result.getString("arrival") %>>
        <input type="hidden" name="date" value=<%= result.getString("date") %>>
        <input type="hidden" name="time" value=<%= result.getString("time") %>>
         <input type="hidden" name="class" value=${classs}  >
        <input type="hidden" name="seats" value=${seats} >
    
                
        <%! String t="Economy" ;%>
    
        <% if(t.equals("Economy")){ %>
         <input type="hidden" name="fare" value=<%= result.getString("economyfare") %>>  
        <% }%>
        <% if(t .equals("Business")){ %>
         <input type="hidden" name="fare" value=<%= result.getString("Businessfare") %>>  
        <% }%>
        <% if(t .equals("First")){ %>
         <input type="hidden" name="fare" value=<%= result.getString("firstfare") %>>  
        <% }%>
           
       
        
        
       
        <TD style="color:lightskyblue"><b> <%= result.getString("flightid") %> </b></td>
                <TD style="color:lightskyblue"> <%= result.getString("departure") %></TD>
                <TD style="color:lightskyblue"> <%= result.getString("arrival") %></TD>
                <TD style="color:lightskyblue"> <%= result.getString("date") %></TD>
                <TD style="color:lightskyblue"> <%= result.getString("time") %></TD>
                <TD style="color:lightskyblue"> ${classs}</TD>
                <TD style="color:lightskyblue"> ${seats}</TD>
                
                
                <% if(t .equals("Economy")){ %>
                   <TD style="color:lightskyblue"> <%= Integer.parseInt(result.getString("economyfare"))%></TD> 
                <% }%>
                <% if(t .equals("Business")){ %>
                    <TD style="color:lightskyblue"> <%= result.getString("businessfare") %></TD> 
                <% }%>
                <% if(t .equals("First")){ %>
                    <TD style="color:lightskyblue"> <%= result.getString("firstfare") %></TD>  
                <% }%>
            
                    
                </form>
                </tr>
                
            <% } %>
   
    
      
     </table>
    
  
										 </div>
									</div>
							  	


							</div></div>




	
<!---Slider End-->


</body>
</html>
















<!---Table-->


<!---Table-->

