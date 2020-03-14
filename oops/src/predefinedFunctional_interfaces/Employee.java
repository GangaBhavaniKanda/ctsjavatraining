package predefinedFunctional_interfaces;

public class Employee {
	String name;
	float salary;
	String desg;
	String city;
	Employee(String name,float salary,String desg,String city){
		this.name=name;
		this.salary=salary;
		this.desg=desg;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", desg=" + desg + ", city=" + city + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(name.equals(e.name) && salary==(e.salary) && desg.equals(e.desg) && city.equals(e.city))
			return true;
		else
			return false;
	
		
	}

}
