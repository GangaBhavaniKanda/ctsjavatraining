package assessments;
import java.util.*;
import java.sql.*;
public class InsertingValuesToEmp {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter department");
		String dept=sc.next();
		System.out.println("enter company name");
		String company=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		Employee e=new Employee(name,id,dept,company,email);
		//database connections
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		String query="insert into employee values (?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.setString(3, dept);
		ps.setString(4, company);
		ps.setString(5, email);
		int c=ps.executeUpdate();
		if(c!=0)
			System.out.println("record inserted...");
		else
			System.out.println("record insertion failed");
	}

}
