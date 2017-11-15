/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Flights;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
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
public class ManagerNotifications extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
       
        try {
            Flights f=new Flights();
            if(f.shownotification_check())
            {
                ResultSet result = f.shownotification();
                HttpSession session=request.getSession();
                session.setAttribute("result",result);
                response.sendRedirect("Notifications.jsp");
            }
            else
            {
                String error = "No New notification";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Notifications.jsp");
               rd.forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerNotifications.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }

    
}
