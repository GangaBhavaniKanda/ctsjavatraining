package dao;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import dto.Account;

public class AccountDAO {
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
     
    public AccountDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    public static void connect() throws SQLException {
        jdbcConnection = DriverManager.getConnection(
                jdbcURL, jdbcUsername, jdbcPassword);
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
 
        }
    }
     
    public void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }

	public void deposit(String accno,float amount) throws SQLException {
		
		String query="update accounts set balace=balace + ? where acno=?";
		connect();
		PreparedStatement pst=jdbcConnection.prepareStatement(query);
		pst.setFloat(1, amount);
		pst.setString(2, accno);
		int c=pst.executeUpdate();
		System.out.println("amount deposited..");
	}
	public void withdraw(String accno,float amount) throws SQLException {
		
		String query="update accounts set balace=balace - ? where acno=?";
		connect();
		PreparedStatement pst=jdbcConnection.prepareStatement(query);
		pst.setFloat(1, amount);
		pst.setString(2, accno);
		int c=pst.executeUpdate();
		System.out.println("amount withdrawed..");
		
	}
	public void getBalance(String accnum) throws SQLException {
		connect();
		String query="select balace from accounts where acno=?";
		PreparedStatement pst=jdbcConnection.prepareStatement(query);
		pst.setString(1, accnum);
		ResultSet rs=pst.executeQuery();
		rs.next();
		System.out.println(rs.getFloat(1));
		
		
		
	}
}
