package dao;
import java.sql.*;

import dto.Account;
import dto.Users;
public class UserDAo {
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
     
    public UserDAo(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
    
    public static void createCustomer(Account account,Users user) throws SQLException {
    	connect();
    	String sql1 = "insert into users values(?,?)";
    	String sql2 = "insert into Accounts values (?,?,?,?)";
    	PreparedStatement pst1 = jdbcConnection.prepareStatement(sql1);
    	PreparedStatement pst2 = jdbcConnection.prepareStatement(sql2);
    	pst1.setString(1, user.getUname());
    	pst1.setString(2, user.getPswd());
    	pst1.executeUpdate();
    	pst2.setString(1, account.getAcno());
    	pst2.setString(2, account.getAcktype());
    	pst2.setString(3, account.getName());
    	pst2.setFloat(4, account.getBalance());
    	pst2.executeUpdate();
    	
    	
    }
     public int checkUser(Users user) throws SQLException{
    	 String sql="select * from users";
    	 connect();
    	 boolean f=false;
    	 Statement st=jdbcConnection.createStatement();
    	 ResultSet rs=st.executeQuery(sql);
    	 while(rs.next()){
    		String uname=rs.getString(1);
    		String pswd=rs.getString(2);
    		if(uname.equals(user.getUname())) {
    			if(pswd.equals(user.getPswd())) {
    				f=true;
    			}
    		}
    	 }
    	 rs.close();
    	 st.close();
    	 if(f)
    		 return 1;
    	 else
    		 return -1;
    }

}
