package in.co.Tables;

import javax.persistence.Embeddable;

/*Here This Class is used in student class and in student table we are going to define 
the attributes of this class as an column as we are representing an Example of 
Embeddable Annotation*/

@Embeddable
public class Certificate {

	private String course;
	private String duration;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
