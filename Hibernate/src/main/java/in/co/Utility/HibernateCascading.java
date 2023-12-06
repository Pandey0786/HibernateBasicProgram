package in.co.Utility;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OneToManyorManyToOne.Answer1;
import OneToManyorManyToOne.Question1;

public class HibernateCascading {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Question1 q = new Question1();

		q.setQuestionId(2);
		q.setQuestion("Family of Monkey D Luffy");

		Answer1 a = new Answer1(3, "GrandFather Garp");
		Answer1 a1 = new Answer1(4, "Father Dragon");

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a);
		list.add(a1);

		q.setAnswers(list);

		Transaction tx = session.beginTransaction();

		session.save(q);

		tx.commit();
		session.close();
		sf.close();

	}

}
