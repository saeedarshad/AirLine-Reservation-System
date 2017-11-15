/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Flights;
import java.io.IOException;
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
public class Searchflight extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           
           String departure = request.getParameter("departure");
           String arrival = request.getParameter("arrival");
           String date = "saeed";
           String seattype = request.getParameter("seattype");
           int numberofseats =Integer.parseInt (request.getParameter("seatno"));
           
           Flights f=new Flights();
           f.setArrival(arrival);
           f.setDeparture(departure);
           f.setDate(date);
           f.setSeattype(seattype);
           f.setNumberofseats(numberofseats);
           
           
        try {
                if (f.flightexist())
                {
                    ResultSet result=f.Searchflight();     
                    int c=f.caltotalseats();
                    if(seattype.equals("Economy"))
                    {
                        f.setEconomyseat(c-numberofseats);
                    }
                    else if(seattype.equals("Business"))
                    {
                        f.setBusinessseat(c-numberofseats);
                    }
                    else
                        f.setFirstseat(c-numberofseats);
                     f.updateseats();
                      
                    HttpSession session=request.getSession();
                    session.setAttribute("result",result);
                    session.setAttribute("seats", f.getNumberofseats());
                    session.setAttribute("classs", f.getSeattype());
                    
                    response.sendRedirect("Searchresult.jsp");
                }
                else
                {
                    String error = "No Flight Available";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Home1.jsp");
               rd.forward(request, response);
                }
                
                } catch (ClassNotFoundException ex) {
            Logger.getLogger(Searchflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Searchflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Searchflight.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                
                
                
             
    }
           
           
        
    }   
    


