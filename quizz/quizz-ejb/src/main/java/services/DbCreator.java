package services;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Player;

/**
 * Session Bean implementation class DbCreator
 */
@Singleton
@Startup
public class DbCreator {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public DbCreator() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Player player1 = new Player("wassim", "wassim", "wassim");
		Player player2 = new Player("anis", "anis", "anis");
		Player player3 = new Player("moez", "moez", "moez");
		entityManager.persist(player1);
		entityManager.persist(player2);
		entityManager.persist(player3);

	}
}
