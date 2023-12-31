package OneToManyorManyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Question_OneToMany")
public class Question1 {

	@Id
	@Column(name = "question_id")
	private int questionId;

	private String question;

	// here now we have defined the fetch type or how to load the data
	@OneToMany(mappedBy = "question1", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Answer1> answers;

	public Question1() {
		super();

	}

	public Question1(int questionId, String question, List<Answer1> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}

}
