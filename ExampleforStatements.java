import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ExampleforStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String jdbcurl = "jdbc:mysql://localhost:3306/crt";
	     String username = "root";
	     String password = "Akhila@13";
	     try {
	    	 Connection c=DriverManager.getConnection(jdbcurl,username,password);
	    	 Statement s=c.createStatement();
	    	 /*String createTable = "CREATE TABLE user1(id INT primary key,name VARCHAR(500) NOT NULL)";
	    	 s.execute(createTable);
	    	 System.out.println("TABLE created successfully");
	    	c.close();*/
	    	 String insertData="INSERT INTO user(id,name) Values(1,'anupama'),(2,'avani')";
	    	 int rowsAffected=s.executeUpdate(insertData);
	    	 System.out.println(rowsAffected+"records inserted successfully");
	    	  String retrieveData= "SELECT * FROM user";
	    	  s.executeQuery(retrieveData);
	    	  s.close();
	    	  c.close();
	     }
	     catch(SQLException e) {
	    	 e.printStackTrace();
	    	 
	     }

	}

}