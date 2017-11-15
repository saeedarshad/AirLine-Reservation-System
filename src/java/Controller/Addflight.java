/*
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
public class Addflight extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           String flightid;
           flightid = request.getParameter("flightid");
           String departure = request.getParameter("departure");
           String arrival = request.getParameter("arrival");
           String date = request.getParameter("date");
           String time = request.getParameter("time");
           int economyseat = Integer.parseInt(request.getParameter("economyseat"));
           int economyfare = Integer.parseInt(request.getParameter("economyfare"));
           int businessseat = Integer.parseInt(request.getParameter("businessseat"));
           int businessfare = Integer.parseInt(request.getParameter("businessfare"));
           int firstseat = Integer.parseInt(request.getParameter("firstseat"));
           int firstfare = Integer.parseInt(request.getParameter("firstfare"));
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
            if(flight.already())
            {
              //  if()
                System.out.println("hel");
                flight.Addflight();
                System.out.println("whyisthis");
                String message = "Flight added successfuly";
                request.setAttribute("message", message);
                RequestDispatcher d = request.getRequestDispatcher("Addflights.jsp");
                d.forward(request, response);
               // response.sendRedirect("Addflights.jsp");
            }
            else
            {
                 
               String error = "Flight with this ID already exist";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Addflights.jsp");
               rd.forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addflight.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
           
    }

}
