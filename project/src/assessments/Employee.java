package assessments;

public class Employee {
	String name;
	int id;
	String dept;
	String company;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(String name, int id, String dept, String company, String email) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.company = company;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", company=" + company + ", email=" + email
				+ "]";
	}
	
}
