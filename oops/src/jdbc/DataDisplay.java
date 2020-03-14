package jdbc;
import java.sql.*;
public class DataDisplay {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		// database available outside machines then instead of localhost we need to pass IPaddress of that machine
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		Statement statement=connection.createStatement();
		String query="select * from account_master";
		 ResultSet resultset=statement.executeQuery(query);
		 while(resultset.next()) {
			System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getInt(4)); 
		 }
		 resultset.close();
		 statement.close();
		 connection.close();
	}

}
