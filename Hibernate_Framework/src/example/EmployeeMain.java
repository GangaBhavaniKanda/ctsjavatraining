package example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmployeeMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		//insert
		Employee emp=new Employee();
		//emp.setEmp_id(43556);
		emp.setEmp_name("revati");
		emp.setCompany("infosys");
		session.save(emp);
		t.commit(); 
		
		//update
		Object obj=session.load(Employee.class, 1);
		Employee e=(Employee)obj;
		e.setCompany("altran");
		t.commit();
		
		//select
		Object o=session.load(Employee.class, 0);
		Employee e1=(Employee)o;
		System.out.println("details of the employee who empid is:"+e1.getEmp_id());
		System.out.println("name :"+e1.getEmp_name());
		System.out.println("company name: "+e1.getCompany());
		
		//delete
		Employee e2=new Employee();
		e2.setEmp_id(2);
		session.delete(e2);
		t.commit();
		session.close();
		factory.close();
	}

}
