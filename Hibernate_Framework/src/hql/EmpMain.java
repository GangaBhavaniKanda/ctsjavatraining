package hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmpMain {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		/*Emp e=new Emp();
		e.setEmpid("104");
		e.setEmpname("bindhu");
		e.setDept_no("30");
		e.setDesg("fullstack");
		e.setSalary(40000);
		session.save(e);
		t.commit();
		session.close();*/
		String hql="select sum(e.salary),e.dept_no from Emp e group by e.dept_no";
		Query q=session.createQuery(hql);
	}

}
