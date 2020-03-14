package one2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToManyMain {

	public static void main(String[] args) {
		
			Cart c=new Cart();
			c.setPname("NewCart");
			
			Items it1=new Items("I1",10,1,c);
			Items it2=new Items("I2",20,2,c);
			Set<Items>itemSet=new HashSet<Items>();
			itemSet.add(it1);
			itemSet.add(it2);
			c.setItems(itemSet);
			c.setTotal(10*1+20*2);
			
			SessionFactory factory=null;
			Session session=null;
			Transaction t=null;
			
			factory=HibernatUtil.getSessionFactory();
			session=factory.openSession();
			t=session.beginTransaction();
			
			session.save(c);
			session.save(it1);
			session.save(it2);
			t.commit();
			factory.close();
	}

}
