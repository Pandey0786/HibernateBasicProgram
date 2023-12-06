package in.co.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import in.co.ObjectStates.Country;

public class HqlQueryExample {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		// HQL Query Search Example

		String query = "from Country where city='Bangalore'";

		Query q = session.createQuery(query);

		List<Country> list = q.list();

		for (Country c : list) {

			System.out.println(c.getStates());

		}

		// HQL Query Delete Example

		System.out.println("From Here Delete Query");

// Transaction handling is done from below because in search operation it is not required		

		Transaction tx = session.beginTransaction();

		Query q1 = session.createQuery("delete from Country a where a.city = :c"); // here we have uses Alias in our
																					// customize query

		q1.setParameter("c", "Indore");

		int a = q1.executeUpdate();

		System.out.println("Delete city" + a);

		// HQl Query Update Example

		Query q2 = session.createQuery("update Country set states = :s where city = :c");

		q2.setParameter("s", "Punjab");
		q2.setParameter("c", "Changigarh");

		int b = q2.executeUpdate(); // executeUpdate method will return no. of entities update or deleted

		System.out.println("Updated Rows " + b);

		tx.commit();
		session.close();
		sf.close();

	}

}
