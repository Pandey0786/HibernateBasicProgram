package in.co.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQueryJoinsExample {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Query q = session.createQuery(
				"select q.question , q.questionId , a.answer from  Question1 as q INNER JOIN  q.answers as a");

		List<Object[]> list = q.getResultList();

		for (Object[] a : list) {

			System.out.println(Arrays.toString(a));

		}

		session.close();
		sf.close();

	}

}
