/*s
 * To change f license header, choose License Headers in Project Properties.
 * To change f template file, choose Tools | Templates
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

/**
 *
 * @author saeed
 */
public class Deleteflight extends HttpServlet {

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String flightid = request.getParameter("flightid");
           
           
           Flights f=new Flights();
           f.setFlightid(flightid);
           
        try {
            if(f.updatesearch_exist())
                 {
              if(f.already_notification())
            {
                
                ResultSet rs=f.add_del_notification();
                 while (rs.next()) {
                    String flightidd = rs.getString("flightid");
                    String dep=rs.getString("departure");
                    String arr=rs.getString("arrival");
                    String dat=rs.getString("date");
                    String timee=rs.getString("time");
                    int    ecs=Integer.parseInt(rs.getString("economyseat"));
                    int bs=Integer.parseInt(rs.getString("businessseat"));
                    int fs=Integer.parseInt(rs.getString("firstseat"));
                   int ef=Integer.parseInt(rs.getString("economyfare"));
                   int bf=Integer.parseInt(rs.getString("businessfare"));
                   int ff=Integer.parseInt(rs.getString("firstfare"));
                    int dts=bs+ecs+fs;
                    System.out.println(bs);
                    f.setFlightid(flightidd);
                   f.setArrival(arr);
                   f.setDeparture(dep);
                   f.setTime(timee);
                   f.setDate(dat);
                   f.setEconomyseat(ecs);
                   f.setBusinessseat(bs);
                   f.setFirstseat(fs);
                   f.setEconomyfare(ef);
                   f.setBusinessfare(bf);
                   f.setFirstfare(ff);
                   f.setTotalseats(dts);
                    f.setAction("Delete");
                 }
                    f.delnotif();
                String message = "Request for Deletion of flight is sent to Manager";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("Deleteflights.jsp");
                d.forward(request, response);
            }
            else
              {
                String message = "Request to delete this flight is Already sent to Manager";
                request.setAttribute("message", message);
                 
                RequestDispatcher d = request.getRequestDispatcher("Deleteflights.jsp");
                d.forward(request, response);
            }
                 }
              else
            {
                 
               String error = "Flight with this ID Does Not exist";
               request.setAttribute("error", error);
               RequestDispatcher rd = request.getRequestDispatcher("Deleteflights.jsp");
               rd.forward(request, response);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deleteflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Deleteflight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
