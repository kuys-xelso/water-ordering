/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

public class connect1 {
    public static Connection con(){
    
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/water_ordering_system1?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            
            return con;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connect1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(connect1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            
       
    }
    
    }
