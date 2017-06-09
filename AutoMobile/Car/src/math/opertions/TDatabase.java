/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.opertions;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin
 */
public class TDatabase {
    
    public static void main(String args []) throws SQLException{
        String userName = "sa";
        String password = "admin";
        Connection conn = null;
        
        String url = "jdbc:sqlserver://edwin-pc\\SQLEXPRESS;databaseName=salesdb";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException ex) {
            Logger.getLogger(TDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            if(!conn.isClosed()){
                System.out.println("Connected");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
    }
    
}
