package jdbc;

import java.sql.*;


import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
			// database available outside machines then instead of localhost we need to pass IPaddress of that machine
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			
			String query="insert into stud values (?,?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter address");
			String address=sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter id");
			int id=sc.nextInt();
			pst.setString(1,name);
			pst.setInt(2, id);
			pst.setString(3,address);
			int c=pst.executeUpdate();
			System.out.println(c+"records inserted");
			
		}
		catch(Exception e) {}

	}

}
