/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monster
 */
public class DB {
    static String url = "jdbc:mysql://localhost:3306/booklibrary";
    static String username = "root";
    static String password = "berkberk09";
    
    static Connection connection = null;
    
    public static Connection ConnectServer(){
    try {
            connection = DriverManager.getConnection(url,username,password);
            
            System.out.println("Connected to DB");
        } catch (SQLException ex) {
            System.out.println("Error!");
            Logger.getLogger(LibraryApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}
