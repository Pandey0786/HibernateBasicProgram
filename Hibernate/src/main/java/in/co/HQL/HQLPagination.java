package in.co.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import in.co.ObjectStates.Country;

public class HQLPagination {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Query<Country> q = session.createQuery("from Country", Country.class);

		// Now Using Pagination via Hibernate

		q.setFirstResult(2);
		q.setMaxResults(3);

		List<Country> l = q.list();

		for (Country c : l) {

			System.out.println(c.getCity());
		}

		session.close();
		sf.close();

	}

}
