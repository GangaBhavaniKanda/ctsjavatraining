package many2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class HibernateManyToManyMain {
	
	//Saving many-to-many where Cart is primary
	public static void main(String[] args) {
		
		ListofItems iphone = new ListofItems();
		iphone.setPrice(100); iphone.setDescription("iPhone");
		
		ListofItems ipod = new ListofItems();
		ipod.setPrice(50); ipod.setDescription("iPod");
		
		Set<ListofItems> items = new HashSet<ListofItems>();
		items.add(iphone); items.add(ipod);
		
		Add2Cart cart = new Add2Cart();
		cart.setItems(items);
		cart.setTotal(150);
		
		Add2Cart cart1 = new Add2Cart();
		Set<ListofItems> items1 = new HashSet<ListofItems>();
		items1.add(iphone);
		cart1.setItems(items1);
		cart1.setTotal(100);
		
		SessionFactory sessionFactory = null;
		try{
		sessionFactory = HibernatUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cart);
		session.save(cart1);
		System.out.println("Before committing transaction");
		tx.commit();
		sessionFactory.close();
		
		System.out.println("Cart ID="+cart.getId());
		System.out.println("Cart1 ID="+cart1.getId());
		System.out.println("Item1 ID="+iphone.getId());
		System.out.println("Item2 ID="+ipod.getId());
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sessionFactory != null && !sessionFactory.isClosed()) sessionFactory.close();
		}
		
	}

}
