/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ROG ZEPHYRUS
 */
public class DBConnection {
    
    public static final String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
    public static final String dbUserName = "root";
    public static final String dbPassword = "root";
    
    
    public static Connection getConnection() {
        Connection connection = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
            System.out.println("Database connection success");
            
            
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return connection;
    }
}
