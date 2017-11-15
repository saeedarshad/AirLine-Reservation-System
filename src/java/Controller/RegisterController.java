/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserFunctions;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Email;
import java.util.Random;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author saeed
 */
public class RegisterController extends HttpServlet {

   


   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       try {
          
           String name = request.getParameter("name");
           String username = request.getParameter("username");
           String email = request.getParameter("email");
           String pass = request.getParameter("psw");
           String pass2 = request.getParameter("psw2");
           Email email1=new Email();
           /// model mvc
           UserFunctions reg = new UserFunctions();
           reg.setName(name);
           reg.setUsername(username);
           reg.setEmail(email);
           reg.setPassword(pass);
           reg.setPasswordconfirm(pass2);
           
           
           
           Random rand=new Random();
             int n = rand.nextInt(9999) + 1000;
         
            String code = Integer.toString(n);
            reg.setConfirm("0");
            reg.setSecurityCode(code);
          
           if (reg.already()){
               reg.RegisterUser();
               email1.send_email(email, code, username);
               //     mails.send_email(email, code, uname);
               //String eror = "Please check your Email ";
               request.setAttribute("", "");
               RequestDispatcher d = request.getRequestDispatcher("Security.jsp");
               d.forward(request, response);
               
           }
           
           
           else {
               
               String error = "User Name or Email already exist";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
               rd.forward(request, response);
               
           }
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);  
       } catch (SQLException ex) {
           Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
       }
           }

  

}
