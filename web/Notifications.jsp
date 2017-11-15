<%-- 
    Document   : Searchresult
    Created on : Nov 4, 2017, 11:52:59 PM
    Author     : saeed
--%>
<%
    

String username=(String)session.getAttribute("username");  

    
    String usertype=(String)session.getAttribute("usertype"); 
    if(username==null || usertype.equals("manager")==false )
      {
           response.sendRedirect("AdminHome.jsp");
      }
    
%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.Searchflight" %>
<%@page import="Model.Flights" %>

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
               <li ><a href="Profile.jsp" ><span class="glyphicon glyphicon-user" ></span> <%=username%></a></li>
      					<li><a href="Logout.jsp" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
            </ul>
    			</div>
    				<ul class="nav navbar-nav navbar-right">
      					<li ><a href="ManagerHome.jsp">Home</a></li>
      					
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
  										<h1 style="text-align:center;color:black;font-size:40px">Notifications</h1><br><br>
           <div style="color:red;font-size:18px ;text-align:center">${error}</div> 
  <table class="table .table-condensed table-bordered" style="color:black;font-size:12px">
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
         <th> Request</th>
        <th>Approved</th>
        
        
      </tr>
       </thead>
      <% while(result.next()){ %>
      <tr>
            
       <form action="Manager" Method="post" >
        <input type="hidden" name="flightid" value=<%= result.getString("flightid") %>>
        <input type="hidden" name="departure" value=<%= result.getString("departure") %>>
        <input type="hidden" name="arrival" value=<%= result.getString("arrival") %>>
        <input type="hidden" name="date" value=<%= result.getString("date") %>>
        <input type="hidden" name="time" value=<%= result.getString("time") %>>
         <input type="hidden" name="economyseat" value=<%= Integer.parseInt(result.getString("economyseat")) %>  >
        <input type="hidden" name="businessseat" value=<%= result.getString("businessseat") %>>
        <input type="hidden" name="firstseat" value=<%= result.getString("firstseat") %>>  

         <input type="hidden" name="economyfare" value=<%= result.getString("economyfare") %>>   
         <input type="hidden" name="businessfare" value=<%= result.getString("businessfare") %>>  
         <input type="hidden" name="firstfare" value=<%= result.getString("firstfare") %>>  
         <input type="hidden" name="Actionn" value=<%= result.getString("Actionn") %>> 
       
  
        <TD style="color:#5E4485"><b> <%= result.getString("flightid") %> </b></td>
                <TD style="color:#5E4485"> <%= result.getString("departure") %></TD>
                <TD style="color:#5E4485"> <%= result.getString("arrival") %></TD>
                <TD style="color:#5E4485"> <%= result.getString("date") %></TD>
                <TD style="color:#5E4485"> <%= result.getString("time") %></TD>
                <TD style="color:#5E4485"> <%= result.getString("economyseat")%></TD> 
            
               
                    <TD style="color:#5E4485"> <%= result.getString("businessseat") %></TD> 
                
                    <TD style="color:#5E4485"> <%= result.getString("firstseat") %></TD>
   
                   <TD style="color:#5E4485"> <%= result.getString("economyfare")%></TD> 
            
               
                    <TD style="color:#5E4485"> <%= result.getString("businessfare") %></TD> 
                
                    <TD style="color:#5E4485"> <%= result.getString("firstfare") %></TD> 
                    <TD style="color:#5E4485"> <%= result.getString("Actionn") %></TD> 
                
            
                <td class="text-center"><button style="margin-left:15px"class="btn btn-success btn-md" type="submit">Approve</button></td>
                
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

