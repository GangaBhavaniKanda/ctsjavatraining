package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
	public static Connection establishConnection() throws ClassNotFoundException,IOException{
	
		Connection con=null;
		FileInputStream fis=new FileInputStream("D:/db.properties");
		Properties properties=new Properties();
		properties.load(fis);
		String dname=(String)properties.get("dname");
		String url=(String)properties.get("url");
		String username=(String)properties.get("username");
		String password=(String)properties.get("pswd");
		Class.forName(dname);
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
		
	}
	
	
}
