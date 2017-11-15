<%-- 
    Document   : Payment
    Created on : Oct 22, 2017, 8:49:23 PM
    Author     : saeed
--%>
<%@page import="java.sql.ResultSet"%>
<% ResultSet result = (ResultSet) session.getAttribute("result");%>
<%
   
String username=(String)session.getAttribute("username");  

    String usertype=(String)session.getAttribute("usertype"); 
    if(username==null || usertype.equals("admin")==false )
      {
           response.sendRedirect("AdminHome.jsp");
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

					<div class="payment">
						
							<div class="bookingform">
							    <form class="form-inline"name="m" METHOD="POST" action="MainUpdate">
							    	<div class="container"style="color:black;">
										<div id="paytable" >
  										<h1 style="text-align:center;color:black;font-size:40px">Payment Details</h1><br><br>
            <div style="color:red;font-size:18px ;text-align:center">${message}</div>
  										<table class="table .table-condensed table-bordered" style="color:black;font-size:15px">
										    <thead>
										      <tr class="info">
										      	<th>Flight ID</th>
        <th>Departure</th>
        <th>Arrival</th>
        <th>Date</th>
        <th>Time</th>
        <th>EconomySeats</th>
        <th>BusinessSeats</th>
        <th> FirstSeats</th>
        <th>EconomyFare</th>
        <th>BusinessFare</th>
        <th> FirstFare</th>
        
         <th>Update</th>
										      </tr>
										    </thead>
                                                                                                             <input type="hidden" name="flightid" value=<%= request.getParameter("flightid") %>>
                                                                                                             <input type="hidden" name="departure" value=<%= request.getParameter("departure") %>>
                                                                                                             <input type="hidden" name="arrival" value=<%= request.getParameter("arrival") %>>
                                                                                                           <input type="hidden" name="date" value=<%= request.getParameter("date") %>>
                                                                                                          <input type="hidden" name="time" value=<%= request.getParameter("time") %>>
                                                                                                           <input type="hidden" name="economyseat" value=<%= Integer.parseInt(request.getParameter("economyseat")) %>  >
                                                                                                          <input type="hidden" name="businessseat" value=<%= request.getParameter("businessseat") %>>
                                                                                                          <input type="hidden" name="firstseat" value=<%= request.getParameter("firstseat") %>>  

                                                                                                           <input type="hidden" name="economyfare" value=<%= request.getParameter("economyfare") %>>   
                                                                                                           <input type="hidden" name="businessfare" value=<%= request.getParameter("businessfare") %>>  
                                                                                                           <input type="hidden" name="firstfare" value=<%= request.getParameter("firstfare") %>> 
                                                         
       
                                                                                      
										    <tbody>
										      <tr class="info">
                                                                                         <TD style="color:lightskyblue"><b><%= request.getParameter("flightid") %> </b></td>
                <TD style="color:lightskyblue"> <input type="text"name="departurem" style="width:60px"value="<%= request.getParameter("departure") %>"required></TD>
                <TD style="color:lightskyblue"> <input type="text" name="arrivalm"style="width:60px"value="<%= request.getParameter("arrival") %>"required></TD>
                <TD style="color:lightskyblue"> <input type="text"name="datem"style="width:80px" value="<%= request.getParameter("date") %>"required></TD>
                <TD style="color:lightskyblue"> <input type="text"name="timem"style="width:50px" value="<%=request.getParameter("time") %>"required></TD>
                <TD style="color:lightskyblue"><%=Integer.parseInt( request.getParameter("economyseat"))%></TD> 
            
               
                    <TD style="color:lightskyblue"> <input type="text"name="businessseatm"style="width:50px" value="<%= request.getParameter("businessseat") %>"required></TD> 
                
                    <TD style="color:lightskyblue"> <input type="text"name="firstseatm" style="width:50px"value="<%= request.getParameter("firstseat") %>"required></TD>
   
                   <TD style="color:lightskyblue"><input type="text"name="economyfarem" style="width:50px"value="<%= request.getParameter("economyfare")%>"required></TD> 
            
               
                    <TD style="color:lightskyblue"><input type="text"name="businessfarem"style="width:50px" value="<%= request.getParameter("businessfare") %>"required></TD> 
                
                    <TD style="color:lightskyblue"><input type="text"name="firstfarem"style="width:50px" value="<%= request.getParameter("firstfare") %>"required></TD> 
                    
                                    <td class="text-center"><button style="margin-left:15px"class="btn btn-success btn-md" type="submit">Update</button></td>

										      </tr>     
										      
										    </tbody>
										 </table>
										 </div>
									</div>
							  	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							  	  
	
<!---Slider End-->


</body>
</html>
