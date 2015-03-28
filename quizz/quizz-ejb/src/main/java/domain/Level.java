package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Level
 *
 */
@Entity
public class Level implements Serializable {

	private LevelId id;
	private Integer level;
	private static final long serialVersionUID = 1L;

	public Level() {
		super();
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@EmbeddedId
	public LevelId getId() {
		return id;
	}

	public void setId(LevelId id) {
		this.id = id;
	}

}
