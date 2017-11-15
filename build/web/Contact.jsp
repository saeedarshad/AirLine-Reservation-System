<%-- 
    Document   : Contact
    Created on : Oct 22, 2017, 3:12:24 PM
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
.contacts a{
  text-decoration:none;
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
                <li ><a href="SignUp.jsp" ><span class="glyphicon glyphicon-user" ></span> Sign Up</a></li>
      					<li><a href="Login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                
            </ul>
          </div>
            <ul class="nav navbar-nav navbar-right">
                <li ><a href="Home.jsp">Home</a></li>
                
                <li ><a href="AboutUs.jsp">AboutUs</a></li>
                <li id="current"><a href="#">ContactUs</a></li>
            </ul>      
            </div>

        </div>
    
  </nav>
  <!---header End-->
  

      
<div id="contacts" class="contacts">
     <div class="container">
         <h1 style="color:black;">CONTACT US</h1><br>
         
         <div class="row">
             <div class="col-lg-4 col-md-4 " >
                 <i class="fa fa-phone fa-5x contact-icon" aria-hidden="true"></i>
                 <h4 style="color:black;">CALL</h4>
                 <p ><a href="">+92 335 4404002</a></p>
             </div>
             <div class="col-lg-4 col-md-4 " >
                 <i class="fa fa-envelope fa-5x contact-icon" aria-hidden="true"></i>
                 <h4 style="color:black;">EMAIL</h4>
                 <p ><a href="">m.saeedarshad95@gmail.com</a></p>
             </div>
             <div class="col-lg-4 col-md-4 " >
                 <i class="fa fa-twitter fa-5x contact-icon" aria-hidden="true"></i>
                  <h4 style="color:black;">Twitter</h4>
                  <p ><a href="https://twitter.com/m_saeed95">GO</a></p>
                 
             </div>
         </div>
     </div>
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
