/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserFunctions;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saeed
 */
public class security1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          
            String email=request.getParameter("email");
            
            String code=request.getParameter("code");
            UserFunctions user = new UserFunctions();
           
        try {           
            if(user.confirm(code, email))            
            {                
                user.changeconfirm(email);
                RequestDispatcher d=request.getRequestDispatcher("Login.jsp");
                d.forward(request, response);
            }
            else{
                
                String error="Incorrect Email or Code. Please try again!!";
                request.setAttribute("error", error);
                
                RequestDispatcher d=request.getRequestDispatcher("Security.jsp");
                d.forward(request, response);
                
            }   
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(security1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
      
    }

}
