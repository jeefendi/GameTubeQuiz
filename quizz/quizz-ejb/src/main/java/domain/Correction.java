package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Correction
 *
 */
@Entity
public class Correction implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean choix;
	private CorrectionId correctionId;

	public Correction() {
		super();
	}

	public Boolean getChoix() {
		return choix;
	}

	public void setChoix(Boolean choix) {
		this.choix = choix;
	}

	@EmbeddedId
	public CorrectionId getCorrectionId() {
		return correctionId;
	}

	public void setCorrectionId(CorrectionId correctionId) {
		this.correctionId = correctionId;
	}

}
