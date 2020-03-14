package DAO;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import data.Employee;

public class EmployeeDao {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
		return connection;
		
	}
	
	//insert
	public int insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		String query="insert into employee values (?,?,?,?,?)";
		PreparedStatement pst=getConnection().prepareStatement(query);
		pst.setString(1, emp.getEmp_id());
		pst.setString(2, emp.getEmp_name());
		pst.setString(3, emp.getDept());
		pst.setString(4, emp.getDesg());
		pst.setString(5, emp.getEmail());
		int res=pst.executeUpdate();
		return res;
		
	}
	//display all records
	public List<Employee> showEmployee() throws ClassNotFoundException, SQLException {
		Statement st=getConnection().createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		ArrayList<Employee>list=new ArrayList<Employee>();
		while(rs.next()) {
			Employee e=new Employee();
			e.setEmp_id(rs.getString(1));
			e.setEmp_name(rs.getString(2));
			e.setDept(rs.getString(3));
			e.setDesg(rs.getString(4));
			e.setEmail(rs.getString(5));
			list.add(e);
		}
		return list;
		
	}
	public Employee searchEmployee(String empid) throws ClassNotFoundException, SQLException {
		String sql="select * from employee where emp_id=?";
		PreparedStatement pst=getConnection().prepareStatement(sql);
		pst.setString(1, empid);
		ResultSet rs=pst.executeQuery();
		Employee e=new Employee();
		if(rs.next())
			e.setEmp_id(rs.getString(1));
			e.setEmp_name(rs.getString(2));
			e.setDept(rs.getString(3));
			e.setDesg(rs.getString(4));
			e.setEmail(rs.getString(5));
		
		return e;
		
	}
	public int deleteEmployee(String id) throws ClassNotFoundException, SQLException {
			PreparedStatement pst=getConnection().prepareStatement("delete from employee where emp_id=?");
			pst.setString(1, id);
			int res=pst.executeUpdate();
			return res;
		
	}
	
	public int updateEmployee(Employee emp) throws ClassNotFoundException, SQLException  {
		PreparedStatement pst=getConnection().prepareStatement("update employee set emp_name=?,dept=?,desg=?,email=? where emp_id=?");
		pst.setString(1,emp.getEmp_name());
		pst.setString(2,emp.getDept());
		pst.setString(3,emp.getDesg());
		pst.setString(4,emp.getEmail());
		pst.setString(5,emp.getEmp_id());
		int res=pst.executeUpdate();
		if(res==1) {
			return res;
		}
		else
			return 0;
	}


}
