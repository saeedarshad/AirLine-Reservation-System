<%-- 
    Document   : Security
    Created on : Oct 22, 2017, 4:20:39 PM
    Author     : saeed
--%>

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
                <li id="current"><a href="#" ><span class="glyphicon glyphicon-user" ></span> Sign Up</a></li>
                <li><a href="Login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
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
      <h1>Check your Email for security Code</h1>
      <form class="SignUp" METHOD="POST" action="security1" >
          <div style="color:red;font-size:18px ;text-align:center">${error}</div>
        <input type="email" placeholder="Email" name="email" required/>
        <input type="text" placeholder="Code" name="code" required/>
        <button>Confirm</button>
      </form>
    </div>
  </div>
</div>
</body>
