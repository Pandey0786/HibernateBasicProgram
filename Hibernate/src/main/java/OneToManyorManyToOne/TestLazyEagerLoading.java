package OneToManyorManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLazyEagerLoading {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();

		Question1 q = (Question1) s.get(Question1.class, 1);

		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		// Now calling Lazy Loading using method Size
		
	System.out.println(q.getAnswers().size());

		

		tx.commit();
		s.close();
		sf.close();
	}

}
