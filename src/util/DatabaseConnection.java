package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    private static String url = "jdbc:sqlite:farmacia.sqlite";
    
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        
        return DriverManager.getConnection(url);
    }
}
