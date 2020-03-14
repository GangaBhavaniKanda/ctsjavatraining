package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRow {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		// database available outside machines then instead of localhost we need to pass IPaddress of that machine
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
	    String q1="delete from emp where emp_no="+id;
	    int count=statement.executeUpdate(q1);
	    
	    System.out.println(count+ "record (s) deletes..");
	    statement.close();
	    connection.close();

	}

}
