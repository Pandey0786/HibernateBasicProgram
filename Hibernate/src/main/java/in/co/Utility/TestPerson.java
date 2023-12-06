package in.co.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Person p = new Person(1, "Shashank", "UP");

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(p);

		tx.commit();
		session.close();
		sf.close();

	}

}
