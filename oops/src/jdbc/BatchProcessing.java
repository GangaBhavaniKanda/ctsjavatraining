package jdbc;
import java.sql.*;
public class BatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		connection.setAutoCommit(false);
		Statement st=connection.createStatement();
		st.addBatch("insert into stud values ('anitha',1256,'vannepudi')");
		st.addBatch("delete from stud where id=98866");
		st.addBatch("update stud set name='bhavani' where id=2445");
		int []res=st.executeBatch();
		for(int i=0;i<res.length;i++) {
			System.out.println("no of rows effected "+res[i]);
		}
		connection.commit();
		connection.close();

	}

}
