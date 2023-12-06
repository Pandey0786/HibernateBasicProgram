package in.co.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.ObjectStates.Country;

public class FirstLevelCache {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session s = sf.openSession();

		Country c = s.get(Country.class, 2);
		System.out.println(c);

		Country c1 = s.get(Country.class, 2);
		System.out.println(c1);

		System.out.println(s.contains(c1)); // Here we will check by contains method that in cache c1 obj is present or
											// not

		s.close();
		sf.close();
	}
}
