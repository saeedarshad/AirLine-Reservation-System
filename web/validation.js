/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function checkflightid(id)
{
     uadd=document.getElementById(id);
     
    var letters = /^[0-9a-zA-Z]+$/; 
    
    if(uadd.value.match(letters))  
    {    
        document.getElementById("message1").innerHTML="";
         document.getElementById("add").disabled = false;
          
         
        return true;  
       
    }  
    else  
    {  
         document.getElementById("message1").innerHTML="Flight id must ontains numbers and alphabets only";
         document.getElementById("add").disabled = true;
         
        return false;  
    }  
 
}
function checkflightidu(id)
{
     uadd=document.getElementById(id);
     
    var letters = /^[0-9a-zA-Z]+$/; 
    
    if(uadd.value.match(letters))  
    {    
        document.getElementById("message1u").innerHTML="";
         document.getElementById("update").disabled = false;
          
         
        return true;  
       
    }  
    else  
    {  
         document.getElementById("message1u").innerHTML="Flight id must ontains numbers and alphabets only";
         document.getElementById("update").disabled = true;
         
        return false;  
    }  
 
}
function checkflightidd(id)
{
     uadd=document.getElementById(id);
     
    var letters = /^[0-9a-zA-Z]+$/; 
    
    if(uadd.value.match(letters))  
    {    
        document.getElementById("message1d").innerHTML="";
         document.getElementById("delete").disabled = false;
          
         
        return true;  
       
    }  
    else  
    {  
         document.getElementById("message1d").innerHTML="Flight id must ontains numbers and alphabets only";
         document.getElementById("delete").disabled = true;
         
        return false;  
    }  
 
}
function checkdeparturecity(id)
{
     uadd=document.getElementById(id);
     
     
    var letters = /^[a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message2").innerHTML="";
         document.getElementById("add").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message2").innerHTML="Departure City name must contains alphabets only";
         document.getElementById("add").disabled = true;
        return false;  
    }  
 
}
function checkarrivalcity(id)
{
     uadd=document.getElementById(id);
     
     
    var letters = /^[a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message3").innerHTML="";
         document.getElementById("add").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message3").innerHTML="Arrival City name must contains alphabets only";
         document.getElementById("add").disabled = true;
        return false;  
    }  
 
}


function checkbusinessfare(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id);
if(numb.value.match(numbers))  
{  
    
        document.getElementById("bfare").innerHTML="";
         document.getElementById("add").disabled = false;
        return true;  
}  
else  
{  
        document.getElementById("bfare").innerHTML="Fare must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;   
}  
} 
function checkeconomyfare(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id);
if(numb.value.match(numbers))  
{  
    
        document.getElementById("efare").innerHTML="";
         document.getElementById("add").disabled = false;
        return true; 
}  
else  
{  
document.getElementById("efare").innerHTML="Fare must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;    
}  
} 
function checkfirstfare(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id);
if(numb.value.match(numbers))  
{  
    
document.getElementById("ffare").innerHTML="";
         document.getElementById("add").disabled = false;
        return true; 
}  
else  
{  
 document.getElementById("ffare").innerHTML="Fare must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;    
}  
} 
function checkeconomyseat(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id);
if(numb.value.match(numbers))  
{  
 document.getElementById("eseat").innerHTML="";
         document.getElementById("add").disabled = false;
        return true;   
}  
else  
{  
document.getElementById("eseat").innerHTML="seat must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;    
}  
} 

function checkfirstseat(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id);
if(numb.value.match(numbers))  
{  
  document.getElementById("fseat").innerHTML="";
         document.getElementById("add").disabled = false;
        return true;   
}  
else  
{  
document.getElementById("fseat").innerHTML="seat must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;  
} 
}
function checkbusinessseat(id)  
{   
var numbers = /^[0-9]+$/;  
numb=document.getElementById(id).value;

if(numb.value.match(numbers))  
{  
 document.getElementById("bseat").innerHTML="";
         document.getElementById("add").disabled = false;
        return true;   
}  
else  
{  
document.getElementById("bseat").innerHTML="seat must contains Numbers only";
         document.getElementById("add").disabled = true;
        return false;  
        }
        }

function checkdate(id)
{
   uadd=document.getElementById(id).value;
     var q = new Date();
var m = q.getMonth();
var d = q.getDate();
var y = q.getFullYear();
var date = new Date(y,m,d);
var mydate=new Date(uadd);

if(mydate>date)
{
   document.getElementById("bdate").innerHTML="";
         document.getElementById("add").disabled = false;
        return true; 
}
else
{
    document.getElementById("bdate").innerHTML="Please select the correct date";
         document.getElementById("add").disabled = true;
        return false;  
        }
}
     
     
function checkname(id)
{
     uadd=document.getElementById(id);
     
     
    var letters = /^[a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message1s").innerHTML="";
         document.getElementById("sign").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message1s").innerHTML="Name  must contains alphabets only";
        document.getElementById("sign").disabled = true;
        return false;  
    }  
 
}     
function checkusername(id)
{
     uadd=document.getElementById(id);
     
     
    var letters =/^[0-9a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message2s").innerHTML="";
         document.getElementById("sign").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message2s").innerHTML="username must contains alphabets and digits only";
        document.getElementById("sign").disabled = true;
        return false;  
    }  
 
}     
    function checkemail(id)
{
     uadd=document.getElementById(id);
     
     
    var letters =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message3s").innerHTML="";
         document.getElementById("sign").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message3s").innerHTML="Invalid Email";
        document.getElementById("sign").disabled = true;
        return false;  
    }  
 
}   
function checkpassword(id)
{
     uadd=document.getElementById(id);
     var passid_len = uadd.value.length;  
     if (passid_len >= 10 || passid_len < 6)  
      { 
          document.getElementById("message4s").innerHTML="Password Length should be between 6 and 10";
        document.getElementById("sign").disabled = true;
        return false;  
 
    }  
    else  
    {  
        document.getElementById("message4s").innerHTML="";
         document.getElementById("sign").disabled = false;
        return true;  
    }  
 
}     
    
    function checkpassword2(id,id1)
{
     uadd=document.getElementById(id);
     uadd1=document.getElementById(id1).value;
     
    if(uadd.value.match(uadd1))  
    {  
         document.getElementById("message5s").innerHTML="";
         document.getElementById("sign").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message5s").innerHTML="Password doesn't match";
        document.getElementById("sign").disabled = true;
        return false;  
    }  
 
}     
    
    
   function checkdeparturecityh(id)
{
     uadd=document.getElementById(id);
     
     
    var letters = /^[a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message1h").innerHTML="";
         document.getElementById("search").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message1h").innerHTML="Departure City name must contains alphabets only";
         document.getElementById("search").disabled = true;
        return false;  
    }  
 
}
function checkarrivalcityh(id)
{
     uadd=document.getElementById(id);
   
     
     
    var letters = /^[a-zA-Z]+$/;  
    if(uadd.value.match(letters))  
    {  
         document.getElementById("message2h").innerHTML="";
         document.getElementById("search").disabled = false;
        return true; 
       
    }  
    else  
    {  
        document.getElementById("message2h").innerHTML="Arrival City name must contains alphabets only";
         document.getElementById("search").disabled = true;
        return false;  
    }  
 
}
 
 function checkdateh(id)
{
   uadd=document.getElementById(id).value;
     var q = new Date();
var m = q.getMonth();
var d = q.getDate();
var y = q.getFullYear();
var date = new Date(y,m,d);
var mydate=new Date(uadd);

if(mydate>date)
{
   document.getElementById("message3h").innerHTML="";
         document.getElementById("search").disabled = false;
        return true; 
}
else
{
    document.getElementById("message3h").innerHTML="This date has passed";
         document.getElementById("search").disabled = true;
        return false;  
        }
}
     
     
    
    
 

