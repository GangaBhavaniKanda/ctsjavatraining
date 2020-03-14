package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatevalue {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		// database available outside machines then instead of localhost we need to pass IPaddress of that machine
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
	    String q1="update emp set sal=25000 where emp_no=844342";
	     int count=statement.executeUpdate(q1);
	     System.out.println(count+" row (s) updated.....");
	     
	    /*
	      boolean b=statement.execute(q1);
	      if(b){
	      	System.out.println("resultset available");
	      }
	      else
	      	System.out.println("record is inserted");
	      
	     */
	     statement.close();
	     connection.close();

	}

}
