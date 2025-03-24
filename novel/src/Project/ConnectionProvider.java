/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;

/**
 *
 * @author Hanna Ailan
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            // Load the JDBC driver (optional for modern drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Updated connection URL with allowPublicKeyRetrieval=true
            String url = "jdbc:mysql://localhost:3306/project";
            String user = "root"; // Replace with your MySQL username
            String password = "123456"; // Replace with your MySQL password

            // Return the connection object
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            // Print exception for debugging
            System.out.println("Error while establishing connection:");
            e.printStackTrace();
            return null;
        }
    }
}
