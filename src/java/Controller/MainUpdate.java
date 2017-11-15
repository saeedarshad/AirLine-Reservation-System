/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Flights;
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

/**
 *
 * @author saeed
 */
public class MainUpdate extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String flightid;
           flightid = request.getParameter("flightid");
           String departure = request.getParameter("departurem");
           String arrival = request.getParameter("arrivalm");
           String date = request.getParameter("datem");
           String time = request.getParameter("timem");
           int economyseat = Integer.parseInt(request.getParameter("economyseat"));
           int economyfare = Integer.parseInt(request.getParameter("economyfarem"));
           int businessseat = Integer.parseInt(request.getParameter("businessseatm"));
           int businessfare = Integer.parseInt(request.getParameter("businessfarem"));
           int firstseat = Integer.parseInt(request.getParameter("firstseatm"));
           int firstfare = Integer.parseInt(request.getParameter("firstfarem"));
           int totalseats=economyseat+businessseat+firstseat;
           
            Flights flight=new Flights();
            
           flight.setFlightid(flightid);
           flight.setArrival(arrival);
           flight.setDeparture(departure);
           flight.setTime(time);
           flight.setDate(date);
           flight.setEconomyseat(economyseat);
           flight.setBusinessseat(businessseat);
           flight.setFirstseat(firstseat);
           flight.setEconomyfare(economyfare);
           flight.setBusinessfare(businessfare);
           flight.setFirstfare(firstfare);
           flight.setTotalseats(totalseats);
           
        try {
            if(flight.already_notification())
            {
                
                flight.addnotification();
                String message = "Request for updation of flight is sent to Manager";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("Mainupdate.jsp");
                d.forward(request, response);
            }
            else
            {
                  
                  flight.updatenotification();
                String message = "Request for updation of flight is sent to Manager";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("Mainupdate.jsp");
                d.forward(request, response);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
    }

    

}
