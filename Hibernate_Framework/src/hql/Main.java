package hql;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		//selecting all records from table
		String hql="from Student";
		Query query=session.createQuery(hql);
		List<Student> list=query.list();
		for(Student s:list)
			System.out.println(s.getId()+"  "+s.getName()+" "+s.getMarks());
		
		// select only few cols
		String hql1="select st.name from Student st";
		Query query1=session.createQuery(hql1);
		List<String> list1=query1.list();
		for(String s1:list1)
			System.out.println(s1);
		
		// select only few cols based on condition
				String hql2="select st.name from Student st where st.id<=844445";
				Query query2=session.createQuery(hql2);
				List<String> list2=query2.list();
				for(String s2:list2)
					System.out.println(s2);
		
		/*// insertion
		Student st=new Student();
		//st.setId(844342);
		st.setName("aki");
		st.setMarks(100);
		session.save(st);
		t.commit();
		session.close();
		sf.close();*/
	}

}
