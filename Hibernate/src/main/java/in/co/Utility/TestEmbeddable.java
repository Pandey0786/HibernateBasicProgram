package in.co.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.Tables.*;

public class TestEmbeddable {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Student s = new Student();

		s.setId(5);
		s.setName("Luffy");
		s.setCity("OnePiece");

		Certificate c = new Certificate();

		c.setCourse(" Becoming Captain");
		c.setDuration("6 Months");

		s.setCerti(c);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);

		tx.commit();
		session.close();
		sf.close();

	}

}
