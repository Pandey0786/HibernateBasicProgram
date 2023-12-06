package in.co.Utility;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import in.co.ObjectStates.Country;

// Here in this program we are going to fire the SQL query using Hibernate 
public class SQLusingHibernate {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		String s = "Select * from Country";

		NativeQuery n = session.createSQLQuery(s);

		List<Object[]> l = n.list();

		for (Object[] c : l) {

			System.out.println(Arrays.toString(c));
		}

		session.close();
		sf.close();
	}

}
