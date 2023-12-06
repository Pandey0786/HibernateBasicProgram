package in.co.HibMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.Tables.Student;

// Here in this program we are fetching data via using get/load method 
//and difference is written on notes copy 
public class FetchData {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		// Get method Below

		Student s = (Student) session.get(Student.class, 2);

		// Load Method Below

		Student s1 = (Student) session.load(Student.class, 1);

		System.out.println(s);
		System.out.println(s1);

		session.close();
		sf.close();
	}

}
