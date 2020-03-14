package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
			// database available outside machines then instead of localhost we need to pass IPaddress of that machine
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			String q1="select * from stud where id=?";
			PreparedStatement pst=connection.prepareStatement(q1);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
				if(rs.next())
			          System.out.println(rs.getInt(2)+" "+rs.getString(1)+" "+rs.getString(3));
				else
					System.out.println("id not found");
			
		}
		catch(Exception e){}
	}

}
