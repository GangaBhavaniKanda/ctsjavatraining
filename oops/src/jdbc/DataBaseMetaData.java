package jdbc;

import java.sql.*;

public class DataBaseMetaData {

	public static void main(String[] args) {
		try {
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		//String query="select * from stud";
		//PreparedStatement pst=connection.prepareStatement(query);
		DatabaseMetaData dm=connection.getMetaData();
		System.out.println(dm.getDatabaseProductName());
		System.out.println(dm.getDriverName());
		System.out.println(dm.getDatabaseProductVersion());
		System.out.println(dm.getDriverVersion());
		System.out.println(dm.getDriverMajorVersion());
		System.out.println(dm.getDriverMinorVersion());
	}
		catch(Exception e) {}
	}

}
