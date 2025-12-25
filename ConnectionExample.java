import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/crt";
        String username = "root";
        String password = "Akhila@13";
        try {
            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("Connection successfully done");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}