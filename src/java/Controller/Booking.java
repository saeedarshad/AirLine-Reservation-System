/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Email;
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
public class Booking extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String username = request.getParameter("username");
           String flightid = request.getParameter("flightid");
           String departure = request.getParameter("departure");
           String arrival = request.getParameter("arrival");
           String date = request.getParameter("date");
           String time = request.getParameter("time");
           String classs = request.getParameter("class");
           String seats = request.getParameter("seats");
           String email=request.getParameter("emailpay");
           int fare=Integer.parseInt(request.getParameter("fare"))*1;
            System.out.println("Date");
           Email email1=new Email();
           Flights f=new Flights();
           
           f.setUsername(username);
           f.setFlightid(flightid);
           f.setSeats(seats);
           f.setDeparture(departure);
           f.setArrival(arrival);
           f.setDate(date);
           f.setTime(time);
           f.setClasss(classs);
           f.setFare(fare);
           
           
           System.out.println(f.getFlightid());
           String invoice="this.getFlightid()";
        try {
            f.Bookflight();
           
            email1.send_email_invoice(email, flightid,departure,arrival,date,time,classs,fare,seats, username);
            System.out.println("after function call");
             String error = "Congratulations ! Flight is Booked";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Payment.jsp");
               rd.forward(request, response);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
          
       
    }

    

}
