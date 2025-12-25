import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) {
		String jdbcurl="jdbc:mysql://localhost:3306/crt";
		String username="root";
		String password="Akhila@13";
		/*int id=5;
		String name="Akhila";
		String email="akhi@gmail.com";*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		System.out.println("Enter the employee name:");
		String name=sc.next();
		System.out.println("Enter the employee email:");
		String email=sc.next();
		String insert="INSERT INTO employee(id,name,email) VALUES (?,?,?)";
		try(Connection c=DriverManager.getConnection(jdbcurl,username,password);
		PreparedStatement ps = c.prepareStatement(insert)){
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			int rowsAffected=ps.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("Records inserted successfully");
			}
			else {
				System.out.println("failed to insert the record");
			}
			c.close();
			}
			catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
