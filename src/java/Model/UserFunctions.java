/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saeed
 */
public class UserFunctions {
    
    String name;
    String username;
    String email;
    String password;
    String passwordconfirm;
    String confirm;
    String SecurityCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordconfirm() {
        return passwordconfirm;
    }

    public void setPasswordconfirm(String passwordconfirm) {
        this.passwordconfirm = passwordconfirm;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getSecurityCode() {
        return SecurityCode;
    }

    public void setSecurityCode(String SecurityCode) {
        this.SecurityCode = SecurityCode;
    }
    

    
    
   
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////// SQL

    public void RegisterUser() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";

        Connection con = DriverManager.getConnection(connectionURL);
        String query = "INSERT INTO Customer VALUES ('" + this.getName()+ "'   ,   '" + this.getUsername()+ "'   ,   '" + this.getEmail()+ "'   ,   '" + this.getPassword()+ "' ,'"+this.getSecurityCode()+"','"+this.getConfirm()+"')";

        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);


    }

    public boolean already() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select username,email from Customer";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String username = rs.getString("username");
            String usermail=rs.getString("email");
            if (username.equals(this.getUsername())|| usermail.equals(this.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public boolean confirm(String code, String users) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql = "select email,code from Customer";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("email");
            String sec = rs.getString("code");
            if (user.equals(users) && sec.equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void changeconfirm(String user) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);
        String query = "update Customer set confirm='" + 1 + "' where email='"
                + user + "'";
        //out.println("tayyab");

        //     pst.executeUpdate();
        //     String query ="UPDATE UserFunctions SET confiirm='"+1+"' where username='"+user+"'";
        Statement stmt = (Statement) con.createStatement();
        stmt.executeUpdate(query);
//"UPDATE users SET confirm='"+1+"' where username='"+user+"'";

    }

   public boolean  LoginUSer(String users, String pass, String usertype)  throws ClassNotFoundException, SQLException {

         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Airline;user=Testing;password=123456";
        Connection con = DriverManager.getConnection(connectionURL);

        String query = "select * from " + usertype + "";
       //String query = "select username,password from Admin";

        Statement stm = con.createStatement();

        stm.executeQuery(query);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("username");
            String pswd = rs.getString("password");
           
            if (user.equals(users) && pswd.equals(pass)) {
                return true;
            }
        }
        return false; 
       
    }

   
//   public void GetUser() throws ClassNotFoundException,SQLException, InstantiationException
//    {
//            try 
//            {      
//      
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";
//
//                try (Connection con = DriverManager.getConnection(connectionURL)) {
//               //     String query = "SELECT * FROM Register WHERE username = '"+this.getUsername()+"'";
//                    
//            try (Statement stm = con.createStatement()) {
//                stm.executeQuery(query);
//                ResultSet rs = stm.getResultSet();
//                while(rs.next())
//                {
////                    name= rs.getString("name");
////                    username = rs.getString("username");
////                    password= rs.getString("password");
////                    email = rs.getString("email");
////                    phoneno = rs.getString("phoneNo");
//                }
//            }
//                }
//                
//            } catch (SQLException ex) {Logger.getLogger(UserFunctions.class.getName()).log(Level.SEVERE, null, ex);} 
//            
//    }

 
    
    
}
