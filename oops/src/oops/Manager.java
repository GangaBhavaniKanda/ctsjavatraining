//InheritanceAssignment
package oops;

class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	double transportAllowance;

	Employee(long id,String name,String address,long phone)
	{ 
		employeeId=id;
	    employeeName=name;
	    employeeAddress=address;
		employeePhone=phone;
	}
	public void calculateTransportAllowance()
	{
		transportAllowance = 10*basicSalary/100;
		System.out.println(transportAllowance);

	}

	
}

class Manager extends Employee{
	 double salary;
	Manager(long id,String name,String address,long phone,double salary){
		super(id,name,address,phone);
		employeeId=id;
	    employeeName=name;
	    employeeAddress=address;
		employeePhone=phone;;
		basicSalary=salary;	
	}
	public void calculateSalary()
	{
		salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println(salary);
	}
	public void calculateTransportAllowance()
	{
		transportAllowance = 15*basicSalary/100;
		System.out.println(transportAllowance);
	}
	
}
class Trainee extends Employee{
	Trainee(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		employeeId=id;
	    employeeName=name;
	    employeeAddress=address;
		employeePhone=phone;;
		basicSalary=salary;	
	}
	public void calculateSalary()
	{
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println(salary);
	}
	
}
