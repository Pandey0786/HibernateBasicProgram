package in.co.Utility;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.Tables.*;

public class HibernateDataSource {

	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		// System.out.println(sf);
		// System.out.println(sf.isClosed());

		// Below Creating Object of Student Class

		Student s = new Student();

		s.setId(4);
		s.setName("Pandey");
		s.setCity("Indore");
		System.out.println(s);

		// Now Creating Object of Address Class

		Address a = new Address();
		a.setStreet("Bb_road");
		a.setCity("Indore");
		a.setIsopen(true);
		a.setAddedDate(new Date());
		a.setX(111.111);

		// For Reading Image

		FileInputStream f = new FileInputStream("src/main/java/Zoro.jpg");
		byte[] b = new byte[f.available()];
		f.read(b);

		a.setImage(b);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);
		session.save(a);

		tx.commit();

		session.close();

	}

}
