package jdbc;
import java.sql.*;
public class ScrollableResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");

	}
		catch(Exception e) {}
	}

}
