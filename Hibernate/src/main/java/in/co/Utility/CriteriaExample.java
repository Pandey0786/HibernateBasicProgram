package in.co.Utility;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import in.co.ObjectStates.Country;

public class CriteriaExample {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session s = sf.openSession();

		Criteria c = s.createCriteria(Country.class);

		c.add(Restrictions.eq("city", "Lucknow"));

		List<Country> l = c.list();

		for (Country c1 : l) {

			System.out.println(c1);
		}

		s.close();
		sf.close();

	}
}
