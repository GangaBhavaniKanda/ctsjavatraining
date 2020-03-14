package example;

public class EmployeeDetails {
	private final String name;
	private final String domain;
	private final String company_name;
	private final int emmpId;
	public EmployeeDetails(String name, String domain, String company_name, int emmpId) {
		this.name = name;
		this.domain = domain;
		this.company_name = company_name;
		this.emmpId = emmpId;
	}
	public String getName() {
		return name;
	}
	public String getDomain() {
		return domain;
	}
	public String getCompany_name() {
		return company_name;
	}
	public int getEmmpId() {
		return emmpId;
	}
 public void showDetails()
 {
	 System.out.println(name+" "+domain+" "+company_name+" "+emmpId);
 }
	

}
