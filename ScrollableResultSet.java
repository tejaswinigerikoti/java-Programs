import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ScrollableResultSet {

	public static void main(String[] args) {
		String jdbcurl="jdbc:mysql://localhost:3306/crt";
		String username="root";
		String password="Akhila@13";
		try(Connection c=DriverManager.getConnection(jdbcurl,username,password);
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY))
		{
			String retrieve="SELECT studentId,FirstName,LastName from student";
			ResultSet result=s.executeQuery(retrieve);
			result.last();
			String lastid=result.getString("studentID");
			String fname=result.getString("FirstName");
			String lname=result.getString("Lastname");
			System.out.println("StudentID : "+lastid+ ", First Name : " + fname + ", Last Name : "+lname);
			result.absolute(3);
			String firstid=result.getString("studentID");
		    fname=result.getString("FirstName");
		    lname=result.getString("Lastname");
			System.out.println("StudentID : "+ firstid +", First Name : "+ fname +", Last Name : "+ lname);
		}
	    catch(Exception e) {
	    	e.printStackTrace();
	   	
	    	
	    }
	

	}

}