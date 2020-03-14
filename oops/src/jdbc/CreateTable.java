package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
				DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
				// database available outside machines then instead of localhost we need to pass IPaddress of that machine
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
				Statement statement=connection.createStatement();
				String query="create table stud(name varchar(20),id int(5),address varchar(20))";
				 int c=statement.executeUpdate(query);
				 System.out.println(c+" table is created");
				 statement.close();
				 connection.close();

	}

}
