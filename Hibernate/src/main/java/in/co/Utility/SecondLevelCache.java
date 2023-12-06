package in.co.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.ObjectStates.Country;

public class SecondLevelCache {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Country c = session.get(Country.class, 3);
		System.out.println(c);

		session.close();

		Session session1 = sf.openSession();

		Country c1 = session1.get(Country.class, 3);
		System.out.println(c1);

		session1.close();

		sf.close();

	}
}
