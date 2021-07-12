package Oracle;
import java.sql.*;
public class SqlConnection {

	public static void main(String[]args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //driver path
		System.out.println("driver loaded");
		//connection path for oracle
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rohit");
		  System.out.println("connection established");
		  
		  	Statement s=c1.createStatement(); //interaction with database
		  System.out.println("Statement created");
		  int w=s.executeUpdate("insert into student values('jdbc connecion',20,'Mba',9889906096)");
		  
		  }
		catch(ClassNotFoundException e) {
			System.out.println("driver not loaded");
			
		}
		catch(SQLException s) {
			System.out.println("connection not established");
		}
		
	}
}
