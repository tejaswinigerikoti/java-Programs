import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Example2forStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String jdbcurl = "jdbc:mysql://localhost:3306/crt";
	     String username = "root";
	     String password = "Akhila@13";
	     try {
	    	 Connection c=DriverManager.getConnection(jdbcurl,username,password);
	    	 Statement s=c.createStatement();
	    	 String retrieveData= "SELECT FirstName,LastName,Phone,Email from student";
	    	 ResultSet result=s.executeQuery(retrieveData);
	    	 while(result.next()) {
	    		 String FirstName=result.getString("FirstName");
	    		 String LastName=result.getString("LastName");  
	    		 String Phone=result.getString("Phone");
	    		 String Email=result.getString("Email");
	    		 System.out.println("FirstName: "+FirstName+", LastName: "+LastName+", Phone: "+ Phone+", Email: "+Email);
	    	 }
	    	 s.close();
	    	 s.close();
	     }
	     catch(SQLException e) {
	    	 e.printStackTrace();
	    	 
	     }

	}

}