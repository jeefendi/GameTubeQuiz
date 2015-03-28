package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: PassQuiz
 *
 */
@Entity
public class PassQuiz implements Serializable {

	private Integer score;
	private PassQuizId passQuizId;

	private static final long serialVersionUID = 1L;

	public PassQuiz() {
		super();
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@EmbeddedId
	public PassQuizId getPassQuizId() {
		return passQuizId;
	}

	public void setPassQuizId(PassQuizId passQuizId) {
		this.passQuizId = passQuizId;
	}

}
