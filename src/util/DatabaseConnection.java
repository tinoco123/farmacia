/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author tinoc
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5486074?serverTimeZone='America/Mexico_City'";
    private static String username = "sql5486074";
    private static String password = "djFkwjFvDi";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        
        return DriverManager.getConnection(url, username, password);
    }
}
