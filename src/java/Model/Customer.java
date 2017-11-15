/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author saeed
 */
public class Customer {
           String departure ;
           String arrival ;
           String date;
           String seattype ;
           String numberofseats ;

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public String getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(String numberofseats) {
        this.numberofseats = numberofseats;
    }
    
    
    public void Searchflight() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getArrival());
         System.out.println(this.getDeparture());
         System.out.println(this.getDate());
         System.out.println(this.getSeattype());
         System.out.println(this.getNumberofseats());
        Connection con = DriverManager.getConnection(connectionURL);
       // String query = "INSERT INTO Flights VALUES ('" + this.getFlightid()+ "'   ,   '" + this.getDeparture()+ "'   ,   '" + this.getArrival()+ "'   ,   '" + this.getDate()+ "' ,'"+this.getTime()+"','"+this.getEconomyseat()+"',   '" + this.getBusinessseat()+ "' ,   '" + this.getFirstseat()+ "' ,   '" + this.getTotalseats()+ "' ,   '" + this.getEconomyfare()+ "' ,   '" + this.getBusinessfare()+ "' ,   '" + this.getFirstfare()+ "')";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        //int executeUpdate = stm.executeUpdate(query);


    }
    
}
