/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author saeed
 */
public class Flights {
    
           String username;
           String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
         String seats;
         int fare;
         String classs;

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
           String flightid ;
           String departure ;
           String arrival  ;
           String date ;
           String time ;
           int economyseat ;
           int economyfare ;
           int businessseat ;
           int businessfare ;
           int firstseat ;
           int firstfare ;
           int totalseats;
           String seattype ;
           int numberofseats ;

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getEconomyseat() {
        return economyseat;
    }

    public void setEconomyseat(int economyseat) {
        this.economyseat = economyseat;
    }

    public int getEconomyfare() {
        return economyfare;
    }

    public void setEconomyfare(int economyfare) {
        this.economyfare = economyfare;
    }

    public int getBusinessseat() {
        return businessseat;
    }

    public void setBusinessseat(int businessseat) {
        this.businessseat = businessseat;
    }

    public int getBusinessfare() {
        return businessfare;
    }

    public void setBusinessfare(int businessfare) {
        this.businessfare = businessfare;
    }

    public int getFirstseat() {
        return firstseat;
    }

    public void setFirstseat(int firstseat) {
        this.firstseat = firstseat;
    }

    public int getFirstfare() {
        return firstfare;
    }

    public void setFirstfare(int firstfare) {
        this.firstfare = firstfare;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public int getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

   
    
    
    
    public boolean already() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select flightid from Flights";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String flightidd = rs.getString("flightid");
            if (flightidd.equals(this.getFlightid())) 
            {
                return false;
            }
        }
        return true;
    }
     public boolean already_notification() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select flightid,Actionn from Notifications";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String flightidd = rs.getString("flightid");
            String act= rs.getString("Actionn");
            
            
            if (flightidd.equals(this.getFlightid())) 
            {
                return false;
            }
        }
        return true;
    }
     
     
     
     public ResultSet add_del_notification() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select *from Flights where flightid='"+this.getFlightid()+"'";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
        return rs;
     }
       
           public void delnotif() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
    String query = "INSERT INTO Notifications VALUES ('" + this.getFlightid()+ "'   ,   '" + this.getDeparture()+ "'   ,   '" + this.getArrival()+ "'   ,   '" + this.getDate()+ "' ,'"+this.getTime()+"','"+this.getEconomyseat()+"',   '" + this.getBusinessseat()+ "' ,   '" + this.getFirstseat()+ "' ,     '" + this.getEconomyfare()+ "' ,   '" + this.getBusinessfare()+ "' ,   '" + this.getFirstfare()+ "' ,'"+ this.getAction()+"')";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }         
                    
        
         
    
     public void Addflight() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        String query = "INSERT INTO Flights VALUES ('" + this.getFlightid()+ "'   ,   '" + this.getDeparture()+ "'   ,   '" + this.getArrival()+ "'   ,   '" + this.getDate()+ "' ,'"+this.getTime()+"','"+this.getEconomyseat()+"',   '" + this.getBusinessseat()+ "' ,   '" + this.getFirstseat()+ "' ,      '" + this.getEconomyfare()+ "' ,   '" + this.getBusinessfare()+ "' ,   '" + this.getFirstfare()+ "')";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }
      public void addnotification() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        this.setAction("update");
        String query = "INSERT INTO Notifications VALUES ('" + this.getFlightid()+ "'   ,   '" + this.getDeparture()+ "'   ,   '" + this.getArrival()+ "'   ,   '" + this.getDate()+ "' ,'"+this.getTime()+"','"+this.getEconomyseat()+"',   '" + this.getBusinessseat()+ "' ,   '" + this.getFirstseat()+ "' ,      '" + this.getEconomyfare()+ "' ,   '" + this.getBusinessfare()+ "' ,   '" + this.getFirstfare()+ "' ,'"+ this.getAction()+"')";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }
      public void updatenotification() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        this.setAction("update");
        String query = "update Notifications set flightid='" + this.getFlightid()+ "'   ,departure='" + this.getDeparture()+ "'   , arrival='" + this.getArrival()+ "'   , date='" + this.getDate()+ "' ,time='"+this.getTime()+"',economyseat='"+this.getEconomyseat()+"',   businessseat='" + this.getBusinessseat()+ "' ,   firstseat='" + this.getFirstseat()+ "' ,   economyfare='" + this.getEconomyfare()+ "' ,businessfare='" + this.getBusinessfare()+ "' ,   firstfare='" + this.getFirstfare()+ "' ,actionn='"+ this.getAction()+"'where flightid='"+this.getFlightid()+"'";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }
     
      public boolean flightexist() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;
        if(this.getSeattype().equals("Economy"))
        {
            
            sql="select flightid from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"' AND economyseat>='"+this.getNumberofseats()+"'";
        }
        else if(this.getSeattype().equals("Business"))
        {
            sql="select flightid from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND businessseat>='"+this.getNumberofseats()+"'";
        }
        else
            sql="select flightid from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND firstseat>='"+this.getNumberofseats()+"'";
        

        

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
            int count=0;
        while (rs.next()) {
            count++;
            }
        if(count>0)
            return true;
        else
         return false;
    }
      public ResultSet Searchflight() throws ClassNotFoundException, SQLException,InstantiationException {
      
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getArrival());
         System.out.println("Date");
         System.out.println(this.getDeparture());
         System.out.println(this.getDate());
         System.out.println(this.getSeattype());
         System.out.println(this.getNumberofseats());
        Connection con = DriverManager.getConnection(connectionURL);
       
        String query ;
        if(this.getSeattype().equals("Economy"))
        {
            query ="select* from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND economyseat>='"+this.getEconomyseat()+"'";
        }
        else if(this.getSeattype().equals("Business"))
        {
            query ="select * from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND businessseat>='"+this.getBusinessseat()+"'";
        }
        else
            query ="select *from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND firstseat>='"+this.getFirstseat()+"'";
        
        
        Statement stm = con.createStatement();

       stm.executeQuery(query);
        ResultSet result= stm.getResultSet();
        
        return result;


    }

    public void Bookflight() throws ClassNotFoundException, SQLException,InstantiationException{
       
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);
        String query = "INSERT INTO Booking VALUES ('" + this.getFlightid()+ "'   ,   '" + this.getUsername()+"'   ,   '" + this.getSeats()+  "')";
       
        Statement stm = con.createStatement();
         
        int executeUpdate = stm.executeUpdate(query);
//         String query1="select *from Flights where flightid='"+this.getFlightid()+"'";
//           Statement stm1 = con.createStatement();
//         
//         stm.executeUpdate(query1);
//        ResultSet result= stm.getResultSet();
        
              
    }
    
public ResultSet updatesearch() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;
       
            sql="select * from flights where flightid='"+this.getFlightid()+"'";
        

        

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
        return rs;
    }
public boolean updatesearch_exist() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;
       
            sql="select * from flights where flightid='"+this.getFlightid()+"'";
        

        

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
         int count=0;
        while (rs.next()) {
            count++;
            }
        if(count>0)
            return true;
        else
         return false;
    }

    public ResultSet shownotification() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
               Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;

            sql="select * from Notifications";
        
        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
        return rs;
    }    
    
     public boolean shownotification_check() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
               Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;

            sql="select * from Notifications";
        
        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
         int count=0;
        while (rs.next()) {
            count++;
            }
        if(count>0)
            return true;
        else
         return false;
    }    


public void updateflight() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        this.setAction("update");
        String query = "update Flights set flightid='" + this.getFlightid()+ "'   ,departure='" + this.getDeparture()+ "'   , arrival='" + this.getArrival()+ "'   , date='" + this.getDate()+ "' ,time='"+this.getTime()+"',economyseat='"+this.getEconomyseat()+"',   businessseat='" + this.getBusinessseat()+ "' ,   firstseat='" + this.getFirstseat()+ "' ,     economyfare='" + this.getEconomyfare()+ "' ,businessfare='" + this.getBusinessfare()+ "' ,   firstfare='" + this.getFirstfare()+ "'where flightid='"+this.getFlightid()+"'";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);
        System.out.println("execute");


    }


public void deleteflight() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        this.setAction("update");
        String query = "Delete from Flights where flightid='"+this.getFlightid()+"'";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }
public void deletion() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
        this.setAction("update");
        String query = "Delete from Notifications where flightid='"+this.getFlightid()+"'";
         System.out.println("Afterinsert");
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }


////////////////////////////////////////////////////////////////////////////////

 public int caltotalseats() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);int n;
        String sql;
        if(this.getSeattype().equals("Economy"))
        {
            
            sql="select *from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"' AND economyseat>='"+this.getNumberofseats()+"'";
        }
        else if(this.getSeattype().equals("Business"))
        {
            sql="select * from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND businessseat>='"+this.getNumberofseats()+"'";
        }
        else
            sql="select *from flights where departure='"+this.getDeparture()+"' AND arrival='"+this.getArrival()+"'  AND firstseat>='"+this.getNumberofseats()+"'";
        

        

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();
           int cals=0;
           while (rs.next()) {
                System.out.println("calsss");
               System.out.println(Integer.parseInt(rs.getString("economyseat")));
               
               if(this.getSeattype().equals("Economy"))
                 {
            
                        cals = Integer.parseInt(rs.getString("economyseat"));                 }
                else if(this.getSeattype().equals("Business"))
                {
                        cals = Integer.parseInt(rs.getString("businessseat"));                }
                else
                        cals = Integer.parseInt(rs.getString("businessseat"));        
           

            
        }
        return cals;
    }
 
 public void updateseats() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
         System.out.println(this.getBusinessfare());
        Connection con = DriverManager.getConnection(connectionURL);
         String query;
        this.setAction("update");
         if(this.getSeattype().equals("Economy"))
        {
            query = "update Flights set economyseat='" + this.getEconomyseat()+ "'where departure='"+this.getDeparture()+"'AND arrival='"+this.getArrival()+"'";
        }
        else if(this.getSeattype().equals("Business"))
        {
            query = "update Flights set businessseat='" + this.getBusinessseat()+ "'where departure='"+this.getDeparture()+"'AND arrival='"+this.getArrival()+"'";
        }
        else
        query = "update Flights set firstseat='" + this.getFirstseat()+ "'where departure='"+this.getDeparture()+"'AND arrival='"+this.getArrival()+"'";
       
        
        
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);
        System.out.println("execute");


    }
 
}

