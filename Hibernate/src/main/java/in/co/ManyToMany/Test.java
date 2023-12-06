package in.co.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Employee e = new Employee();

		Employee e1 = new Employee();

		e.setEmp_id(10);
		e.setEmp_name("Shashank");

		e1.setEmp_id(20);
		e1.setEmp_name("Shekhar");

		Project p = new Project();

		Project p1 = new Project();

		p.setProjectId(100);
		p.setProjectname("Student Management Portal");

		p1.setProjectId(200);
		p1.setProjectname("Faculty management Portal");

		List<Employee> l1 = new ArrayList<Employee>();

		List<Project> l2 = new ArrayList<Project>();

		l1.add(e);
		l1.add(e1);

		l2.add(p);
		l2.add(p1);

		e.setProjects(l2);

		p.setEmp(l1);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(e);
		session.save(e1);

		session.save(p);
		session.save(p1);

		tx.commit();
		session.close();
		sf.close();

	}

}
