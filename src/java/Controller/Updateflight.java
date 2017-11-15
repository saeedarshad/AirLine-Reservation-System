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
public class Updateflight extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String flightid = request.getParameter("flightid");
           
           
           Flights f=new Flights();
           f.setFlightid(flightid);
           System.out.println("checkingerrors");
           
           
           
        try {
                 if(f.updatesearch_exist())
                 {
                    ResultSet result=f.updatesearch();               
                    HttpSession session=request.getSession();
                    session.setAttribute("result",result);
                    
                    response.sendRedirect("Updateresult.jsp");
                 }
                else
            {
                 
               String error = "Flight with this ID Does Not exist";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Updateflights.jsp");
               rd.forward(request, response);
            }
                
                } catch (ClassNotFoundException ex) {
            Logger.getLogger(Searchflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Searchflight.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                
                
                
           
    }

    
}
