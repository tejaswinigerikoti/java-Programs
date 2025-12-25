import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleStatements {

	public static void main(String[] args) {
		String jdbcurl="jdbc:mysql://localhost:3306/crt";
		String username="root";
		String password="Akhila@13";
		try {
			Connection c=DriverManager.getConnection(jdbcurl,username,password);
			Statement s=c.createStatement();
			String createTable="CREATE TABLE user(id INT primary key,name VARCHAR(20))";
			s.execute(createTable);
			System.out.println("Table created Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}