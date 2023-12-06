package in.co.ObjectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestObjectStates {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Now Creating Country class object

		Country c = new Country();
		c.setId(1);
		c.setStates("Madhya Pradesh");
		c.setCity("Indore");

		// Above country object is in Transient State

		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();

		s.save(c); // Now Country object is on Persistent State

		tx.commit();
		s.close(); // Now from here detached state
		sf.close();

	}
}
