import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLExample {

	public static void main(String[] args) {
		String jdbcurl="jdbc:mysql://localhost:3306/crt";
		String username="root";
		String password="Akhila@13";
		try(Connection c=DriverManager.getConnection(jdbcurl,username,password);
			Statement s = c.createStatement()){
		/*String createTable=	"CREATE TABLE employee(id INT PRIMARY KEY,name VARCHAR(25),email VARCHAR(50))";
		s.execute(createTable);
		System.out.println("Table created successfully");/*
		/*String altertable="ALTER TABLE employee ADD COLUMN PhoneNumber VARCHAR(50)";
		s.execute(altertable);
		System.out.println("Table altered successfully");*/
		/*String dropTable="DROP TABLE employee1";
		s.execute(dropTable);
		System.out.println("Table is dropped");*/
		String insertData="INSERT INTO employee(id,name,email) Values(101,'Akhila','akhi@gmail.com'),(102,'Bhavya','bhavya14@gmail.com')";
		int rowsAffected =s.executeUpdate(insertData);
		System.out.println(rowsAffected+"records inserted successfully");
	    String retrieveData="SELECT * FROM user";
	    s.executeQuery(retrieveData);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
