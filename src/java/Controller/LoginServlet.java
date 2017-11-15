/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserFunctions;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author saeed
 */
public class LoginServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usertype = request.getParameter("usertype");
        String username= request.getParameter("username");   
        String psw = request.getParameter("psw");
        UserFunctions reg = new UserFunctions();
        if(usertype.equals("customer"))
        {
            try {
                if (reg.LoginUSer(username, psw,usertype))
                {
                    HttpSession session = request.getSession();
                    
                    session.setAttribute("usertype",usertype);
                    session.setAttribute("username",username);
                    request.setAttribute("usertype", usertype);
                    request.setAttribute("username", username);
                    //RequestDispatcher d = request.getRequestDispatcher("Home1.jsp");
                    //d.forward(request, response);
                    //response.encodeRedirectURL("Home1.jsp");
                    
                    response.sendRedirect("Home1.jsp");
                }
                else 
                {               
                    String error = "Incorrect username or password";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);        
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(usertype.equals("admin"))
        {
            try {
                if (reg.LoginUSer(username, psw,usertype))
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("usertype",usertype);
                    session.setAttribute("username",username);
                    request.setAttribute("usertype", usertype);
                    request.setAttribute("username", username);
                    //RequestDispatcher d = request.getRequestDispatcher("AdminHome.jsp");
                    //d.forward(request, response);
                    response.sendRedirect("AdminHome.jsp");
                }
                else 
                {               
                    String error = "Incorrect username or password";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);        
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(usertype.equals("manager"))
        {
            try {
                if (reg.LoginUSer(username, psw,usertype))
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("usertype",usertype);
                    session.setAttribute("username",username);
                    request.setAttribute("usertype", usertype);
                    request.setAttribute("username", username);
                    //RequestDispatcher d = request.getRequestDispatcher("ManagerHome.jsp");
                    //d.forward(request, response);
                    response.sendRedirect("ManagerHome.jsp");
                }
                else 
                {               
                    String error = "Incorrect username or password";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);        
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
                    String error = "Select user type";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);
        }
        
        }
       
   

}
