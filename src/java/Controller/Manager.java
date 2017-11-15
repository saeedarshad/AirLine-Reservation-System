/*
 * To chaange this license header, choose License Headers in Project Properties.
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
public class Manager extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String flightid;
           flightid = request.getParameter("flightid");
           String departure = request.getParameter("departure");
           String arrival = request.getParameter("arrival");
           String date = request.getParameter("date");
           String time = request.getParameter("time");
           String actionn= request.getParameter("Actionn");
           int economyseat = Integer.parseInt(request.getParameter("economyseat"));
           int economyfare = Integer.parseInt(request.getParameter("economyfare"));
           int businessseat = Integer.parseInt(request.getParameter("businessseat"));
           int businessfare = Integer.parseInt(request.getParameter("businessfare"));
           int firstseat = Integer.parseInt(request.getParameter("firstseat"));
           int firstfare = Integer.parseInt(request.getParameter("firstfare"));
           
           
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
           flight.setAction(actionn);
           
           if(actionn.equals("update"))
           {
           try {
               flight.updateflight();
               flight.deletion();
               String message = "Flight Updated Successfuly";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("ManagerHome.jsp");
                d.forward(request, response);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
           else if (actionn.equals("Delete"))
           {
           try {
               flight.deleteflight();
               flight.deletion();
               String message = "Flight Deleted Successfuly";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("ManagerHome.jsp");
                d.forward(request, response);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
           
    }

    
}
