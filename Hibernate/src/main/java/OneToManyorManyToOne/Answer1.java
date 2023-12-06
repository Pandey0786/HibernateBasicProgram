package OneToManyorManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answer_ManyToOne")
public class Answer1 {

	@Id
	@Column(name = "answer_id")
	private int answerId;

	private String answer;

	@ManyToOne
	private Question1 question1;

	public Answer1() {

		super();

	}

	public Answer1(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question1 getQuestion() {
		return question1;
	}

	public void setQuestion(Question1 question) {
		this.question1 = question;
	}

}
