package jdbc;
import java.sql.*;
import java.util.*;
class MysqlDataBase{
	public Connection createConnection() throws SQLException {

		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		 return connection;
	}
	public void insertData(Connection con) throws SQLException {
		String sql="insert into stud values ('mani',98567,'kkd')";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("inserted ....");
	}
	public void deleteData(Connection con) throws SQLException {
		String sql="delete from stud where id=98567";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("deleted....");
	}
	public void updateData(Connection con) throws SQLException {
		String sql="update stud set address='banglore' where id=28777 ";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("updated.....");
	}
	public void displayData(String table_name,Connection con) throws SQLException {
		String q="select * from "+table_name;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(q);
		ResultSetMetaData md=rs.getMetaData();
		System.out.println(table_name+"  table");
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

}

public class DatabaseOperations {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String table_name=sc.nextLine();
		MysqlDataBase m=new MysqlDataBase();
		Connection con=m.createConnection();
		//m.insertData(con);
		m.deleteData(con);
		m.updateData(con);
		m.displayData(table_name,con);

	}

}
