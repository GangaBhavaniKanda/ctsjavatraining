//database connection taking from properties class and display table values only using table name(don't know the cols name and no.of cols in table)
package jdbc;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
import java.io.*;
public class Dynamic {

	public static void main(String[] args) {
		try {
			FileInputStream fs=new FileInputStream("C:\\javatraining\\ctsdb.properties");
			Properties p=new Properties();
			p.load(fs);
			String dname=(String) p.get("Dname");
			String url=(String) p.get("URL");
			String username=(String) p.get("Uname");
			String password=(String) p.get("Pswd");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter table name:");
			String table_name=sc.nextLine();
			
			Class.forName(dname);
			System.out.println("driver loaded..");
			
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("connection established...");
			String q="select * from "+table_name;
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(q);
			ResultSetMetaData md=rs.getMetaData();
			System.out.println("===================================");
			for(int i=1;i<=md.getColumnCount();i++) {
				System.out.print(md.getColumnName(i)+" ");
			}
			System.out.println("");
			while(rs.next()) {
			for(int j=1;j<=md.getColumnCount();j++) {
				System.out.print(rs.getString(j)+" ");
			}
			System.out.println(" ");
			}

		
		}
		catch(Exception e) {}
		

	}
	

}
