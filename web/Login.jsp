<%-- 
    Document   : Login
    Created on : Oct 22, 2017, 7:04:10 PM
    Author     : saeed
--%>
<%
 
    String username=(String)session.getAttribute("username");
    String usertype=(String)session.getAttribute("usertype");
    if(username!=null && usertype.equals("customer")==true)
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
  <link rel="stylesheet" type="text/css" href="font-awesome.min.css">
  <link href="login.css" rel="stylesheet" type="text/css"/>
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
                <li ><a href="SignUp.jsp" ><span class="glyphicon glyphicon-user" ></span> Sign Up</a></li>
                <li id="current"><a href="#" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
          </div>
            <ul class="nav navbar-nav navbar-right">
                <li ><a href="Home.jsp">Home</a></li>
                
                <li><a href="AboutUs.jsp">AboutUs</a></li>
                <li><a href="Contact.jsp">ContactUs</a></li>
            </ul>      
            </div>

        </div>
    
  </nav>

<div class="vid-container">
  
  <div class="inner-container">
    
    <div class="box">
      <h1>Login</h1>
      <form class="Login" METHOD="POST" action="LoginServlet" >
          <div style="color:red;font-size:18px ;text-align:center">${error}</div>
            <div class="input-group" style="width:70%;margin-left:15% ">
                    <span class="input-group-addon"><i class="fa fa-user-circle-o"></i></span>
               <select class="form-control" name="usertype"id="sel1">
                 <option value="default">-select user type-</option>
                 <option value="customer">Customer</option>
                 <option value="admin">Admin</option>
                 <option value="manager">Manager</option>
                 
              </select>
	    </div>
        <input type="text" placeholder="Please Enter username" name="username" required/>
        <input type="password" placeholder="Password" name="psw" required/>
        
        <button>LogIn</button>
        <p>Don't have an account? <span><a href="SignUp.jsp" style="color:#5E4485">SignUp</a></span></p>
      </form>
    </div>
  </div>
</div>
</body>

