package dbprogramming1;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Lab9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "butter0025_P";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql = "INSERT INTO student(studentID,firstName,lastName,email,deptID) "
                    + "VALUES('11222','aaaaa','bbbbb','aaaa@kmutt.ac.th','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
