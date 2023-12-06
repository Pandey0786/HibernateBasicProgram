package OneToManyorManyToOne;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Creation Question Object

		Question1 q = new Question1();
		q.setQuestionId(1);
		q.setQuestion("Members of Straw Hats Crew");

		// Creating Answer Object

		Answer1 a = new Answer1();
		a.setAnswerId(1);
		a.setAnswer("Roronoa Zoro");
		a.setQuestion(q);

		Answer1 a1 = new Answer1();
		a1.setAnswerId(2);
		a1.setAnswer("Vinsmoke Sanji");
		a1.setQuestion(q);

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a);
		list.add(a1);

		q.setAnswers(list);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(q);
		session.save(a);
		session.save(a1);

		tx.commit();
		session.close();
		sf.close();

	}

}
