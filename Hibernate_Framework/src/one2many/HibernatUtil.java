package one2many;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
			
		SessionFactory factory=new Configuration().configure("mapping.cfg.xml").buildSessionFactory();
		return factory;
	}

}
