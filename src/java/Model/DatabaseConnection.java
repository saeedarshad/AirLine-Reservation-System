 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;

/**
 *
 * @author saeed
 */
public class DatabaseConnection implements ServletContextListener{
    
    public void contextInitialized(ServletContextEvent event)
    {
        try {
            ServletContext sc=event.getServletContext();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL=sc.getInitParameter("db");
            Connection con = DriverManager.getConnection(connectionURL);
           // DatabaseConnection d=new  DatabaseConnection (con );
           
            sc.setAttribute("db",con );
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void contextDestroyed(ServletContextEvent event)
    {
        
    }
    
    
}

