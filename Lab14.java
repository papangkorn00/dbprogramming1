package dbprogramming1;

import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab14 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "butter0025_P";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println("database URL: "+ dbMetaData.getURL());
            System.out.println("database Product name: "+ dbMetaData.getDatabaseProductName());
            System.out.println("database Product version: "+ dbMetaData.getDatabaseProductVersion());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Lab14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
