package domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CorrectionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idResponse;
	private Integer idPassQuiz;

	public Integer getIdResponse() {
		return idResponse;
	}

	public void setIdResponse(Integer idResponse) {
		this.idResponse = idResponse;
	}

	public Integer getIdPassQuiz() {
		return idPassQuiz;
	}

	public void setIdPassQuiz(Integer idPassQuiz) {
		this.idPassQuiz = idPassQuiz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPassQuiz == null) ? 0 : idPassQuiz.hashCode());
		result = prime * result
				+ ((idResponse == null) ? 0 : idResponse.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorrectionId other = (CorrectionId) obj;
		if (idPassQuiz == null) {
			if (other.idPassQuiz != null)
				return false;
		} else if (!idPassQuiz.equals(other.idPassQuiz))
			return false;
		if (idResponse == null) {
			if (other.idResponse != null)
				return false;
		} else if (!idResponse.equals(other.idResponse))
			return false;
		return true;
	}

}
