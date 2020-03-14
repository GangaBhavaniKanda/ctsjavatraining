package oops;


public class InheritanceAssignment {

	public static void main(String[] args) {
	           Manager m=new Manager(126534,"peter","chennai India",237844,65000);
	          m.calculateSalary();
	          Trainee t=new Trainee(29846,"jack","mumbai india",442085,45000);
	           t.calculateSalary();
	           m.calculateTransportAllowance();
	           t.calculateTransportAllowance();
	           
	}

}
