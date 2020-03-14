public class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public Employee(){
        super();
    }
    public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getNetSalary() {
			return netSalary;
		}
		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}
		public void calculateNetSalary(int pfpercentage){
			
		    double pf=20000*(7/(double)100);
		    System.out.println(pf);
		    setNetSalary(salary-pf);
		    System.out.println("Id : "+employeeId);
		    System.out.println("Name : "+employeeName);
		    System.out.println("Salary : "+salary);
		    System.out.println("Net Salary : "+getNetSalary());
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
					+ ", netSalary=" + netSalary + "]";
		}
		  private int ticketid;
		   
			private int price;
		    private static int availableTickets;
}