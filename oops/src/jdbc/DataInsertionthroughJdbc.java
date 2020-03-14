package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsertionthroughJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		// database available outside machines then instead of localhost we need to pass IPaddress of that machine
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
	    String q1="insert into emp values (84442,'bhanu','pat','567678','2019-12-27',20000,'200',30)";
	    int count=statement.executeUpdate(q1);
	    System.out.println(count+ "record (s) inserted..");
	    statement.close();
	    connection.close();
	}

}
