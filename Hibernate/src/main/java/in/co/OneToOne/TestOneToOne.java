package in.co.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Creation Question Object

		Question q = new Question();
		q.setQuestionId(3);
		q.setQuestion("What is the full Name of Sanji");

		// Creating Answer Object

		Answer a = new Answer();
		a.setAnswerId(3);
		a.setAnswer("Vinsmoke Sanji");
		a.setQuestion(q);

		q.setAnswer(a);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(q);
		session.save(a);

		tx.commit();
		session.close();
		sf.close();
	}
}
