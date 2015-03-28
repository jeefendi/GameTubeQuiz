package domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LevelId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTheme;
	private Integer idPlayer;

	public Integer getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(Integer idTheme) {
		this.idTheme = idTheme;
	}

	public Integer getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(Integer idPlayer) {
		this.idPlayer = idPlayer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPlayer == null) ? 0 : idPlayer.hashCode());
		result = prime * result + ((idTheme == null) ? 0 : idTheme.hashCode());
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
		LevelId other = (LevelId) obj;
		if (idPlayer == null) {
			if (other.idPlayer != null)
				return false;
		} else if (!idPlayer.equals(other.idPlayer))
			return false;
		if (idTheme == null) {
			if (other.idTheme != null)
				return false;
		} else if (!idTheme.equals(other.idTheme))
			return false;
		return true;
	}

}
